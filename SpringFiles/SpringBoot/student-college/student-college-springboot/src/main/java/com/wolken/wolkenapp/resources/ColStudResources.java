package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;
import com.wolken.wolkenapp.dto.ColStudDTO;
import com.wolken.wolkenapp.entity.CollegeEntity;
import com.wolken.wolkenapp.entity.StudentEntity;
import com.wolken.wolkenapp.service.ColStudService;

@RestController
@RequestMapping("/")
public class ColStudResources {
	
	@Autowired
	ColStudService colStudService;
	
//	@GetMapping("/getWelcomeMsg")
//	public String getWelcomeMsg() {
//		return "Welcome !";
//	}
	
	//works
	@GetMapping("/findAllStudents")
	public List<StudentEntity> findAllStudents() {
		return colStudService.validateAndFindAllStudents();
	}
	
	//works
	@GetMapping("/findAllStudentsByStudAge/{studAge}")
	public List<StudentEntity> findAllStudentsByStudAge(@PathVariable int studAge){
		return colStudService.validateAndFindAllStudentsByStudAge(studAge);
	}
	
	//fix /""/email
//	@RequestMapping(value = {"/findAllByNameOrEmail/{studEmail}", "/findAllByNameOrEmail/{studName}", "/findAllByNameOrEmail/{studName}/{studEmail}"}, method = RequestMethod.GET)
	@GetMapping("/findAllByNameOrEmail/{studName}/{studEmail}")
	public List<StudentEntity> findAllByNameOrAreaOrEmail(@PathVariable String studName, String studEmail) {
		return colStudService.validateAndFindAllByNameOrEmail(studName, studEmail);
	}
	
	//fix
	@GetMapping("/findAllByNameOrEmailOrDOBOrContact/{studName}/{studEmail}/{studDOB}/{studContact}")
	public List<StudentEntity> findAllByNameOrEmailOrDOBOrContact(String studName, String studEmail, String studDOB, long studContact) {
		return colStudService.validateAndFindAllByNameOrEmailOrDOBOrContact(studName, studEmail, studDOB, studContact);
	}
	
	//works
	@PostMapping("/addNewCollege")
	public String addNewCollege(@RequestBody CollegeEntity collegeEntity) {
		CollegeEntity ce = colStudService.validateAndAddNewCollege(collegeEntity);
		if(ce != null) {
			return "data added.Check database";
		}
		else {
			return "data could not be added to database";
		}
	}
	
	//works
	@PostMapping("/addNewStudent")
	public String addNewStudent(@RequestBody ColStudDTO colStudDTO) {
		
		StudentEntity se = colStudService.validateAndAddNewStudent(colStudDTO);
		
		if(se !=null) {
			return "data added. Check database";
		}
		else {
			return "data could not be added to database";
		}
	}
	
	//works
	@PostMapping("/addStudentList")
	public String addStudentList(@RequestBody ColStudDTO[] colStudDTOs) {
		
		List<StudentEntity> studEntityList = colStudService.validateAndAddStudentList(colStudDTOs);
		
		if(studEntityList.isEmpty()) {
			return "data could not be added to database";
		}
		else {
			return "data added. Check db";
		}
	}
	
	//fix
	@PutMapping("/updateZipByArea/{colArea}/{colZip}")
	public String updateZipByArea(@PathVariable String colArea, int colZip) {
		CollegeEntity ce = colStudService.validateAndUpdateZipByArea(colArea, colZip);
		return "data updated !!";
	}
	
	
//	@PutMapping("/updateContactAndDOBAndEmailByName")
//	@PutMapping("/updateNameByEmail")
}
