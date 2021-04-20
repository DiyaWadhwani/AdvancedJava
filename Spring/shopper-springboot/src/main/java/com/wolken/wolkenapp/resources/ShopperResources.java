package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.entity.ShopperEntity;
import com.wolken.wolkenapp.service.ShopperService;

@RestController
@RequestMapping("/")
//@Transactional
public class ShopperResources {

//	@Autowired
//	ShopperRepo shopperRepo;
	
	@Autowired
	ShopperService shopperService;

	@GetMapping("/getWelcomeMsg")
	public String getWelcomeMsg() {
		return "Have a nice day";
	}

	@GetMapping("/getShopperList")
	public List<ShopperEntity> getShopperList() {
		return shopperService.validateAndFindAll();
	}

	@GetMapping("/getShopperByAge")
	public List<ShopperEntity> getShopperByAge(@RequestBody ShopperEntity shopperEntity) {
		return shopperService.validateAndFindByShopperAge(shopperEntity.getShopperAge());
	}
	
	@GetMapping("/getShopperByName")
	public ShopperEntity getShopperByName(@RequestBody ShopperEntity shopperEntity) {
		return shopperService.validateAndFindByShopperName(shopperEntity.getShopperName());
	}

	@PostMapping("/addNewShopper")
	public String addNewShopper(@RequestBody ShopperEntity shopperEntity) {
		return shopperService.validateAndAddNewShopper(shopperEntity);
	}
	
	@PutMapping("/updateShopper")
	public String updateContactByEmail(@RequestBody ShopperEntity shopperEntity) {
		return shopperService.validateAndUpdateShopperContactByEmail(shopperEntity.getShopperContact(), shopperEntity.getShopperEmail());
	}

	//Delete by name using json
	@DeleteMapping("/deleteShopperByName")
	public String deleteShopperByName(@RequestBody ShopperEntity shopperEntity) {
		return shopperService.validateAndDeleteShopperByName(shopperEntity.getShopperName());
	}

	// Delete by ID directly from path
	@DeleteMapping("/deleteShopperByID/{shopperID}")
	public String deleteShopperByID(@PathVariable int shopperID) {
		return shopperService.validateAndDeleteByID(shopperID);
	}

	// Delete by name directly from path
	@DeleteMapping("/deleteShopperByName/{shopperName}")
	public String deleteShopperByName(@PathVariable String shopperName) {
		shopperService.validateAndDeleteShopperByName(shopperName);
		return "Shopper " + shopperName + " does not exist in the List";
	}

}
