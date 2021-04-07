package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.custom.CameraException;
import com.wolken.wolkenapp.custom.MemoryException;
import com.wolken.wolkenapp.custom.PriceException;

public class MobileServiceImpl implements MobileService {

	@Override
	public boolean validate(MobileDTO mobileDTO) {
		
		int flag[] = {0,0,0};
		
			try {
				if(mobileDTO.getMobPrice() <=0 || mobileDTO.getMobPrice() >= 500000) {
					throw new PriceException();
				}
			}
			
			catch(PriceException e) {
				System.out.println(e.toString());
//				return false;
				flag[0]=1;
			}
			
			try {
				if(mobileDTO.getMobMemory() < 512 && mobileDTO.getMobMemory() >=5) {
					if(mobileDTO.getMobMemory() != 32 && mobileDTO.getMobMemory() != 64 && mobileDTO.getMobMemory() != 128 && mobileDTO.getMobMemory() != 256 && mobileDTO.getMobMemory() != 512) {
						throw new MemoryException(mobileDTO.getMobMemory());
					}
				}
			}
			
			catch(MemoryException e) {
				System.out.println(e.toString());
//				return false;
				flag[1]=1;
			}
			
			try {
				
				if(mobileDTO.getMobNoOfCams() > 5 || mobileDTO.getMobNoOfCams() <=0 ) {
					throw new CameraException(mobileDTO.getMobNoOfCams());
				}
			}
			
		catch(CameraException e) {
			System.out.println(e.toString());
//			return false;
			flag[2]=1;
		}
			
		for(int i=0; i<3; i++) {
			if(flag[i]==1)
				return false;
		}
		return true;
	}
	
	

}
