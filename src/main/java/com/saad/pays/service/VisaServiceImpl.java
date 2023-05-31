package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.saad.pays.entities.Visa;
import com.saad.pays.repos.PassportRepository;
import com.saad.pays.repos.VisaRepository;


@Service
public class VisaServiceImpl implements VisaService {
	@Autowired
	VisaRepository visaRepository;
	
	@Autowired
	PassportRepository passportRepository;


	@Override
	public List<Visa> getAllVisa() {
		return visaRepository.findAll();
	}
	@Override
	public Visa saveVisa(Visa v) {
		return visaRepository.save(v);
	}
	@Override
	public Visa getVisa(String idVisa) {
		return visaRepository.findById(idVisa).get();
	}
	@Override
	public Visa updateVisa(Visa v) {
		return visaRepository.save(v);
	}
	@Override
	public void deleteVisaById(String idVisa) {
		visaRepository.deleteById(idVisa);
	}




	@Override
	public void deleteVisa(Visa v) {
		visaRepository.delete(v);
	}





	//

	@Override
	public List<Passport> getAllPassport() {
		return passportRepository.findAll() ;
	}
	@Override
	public Passport getPassport(String id) {
		// TODO Auto-generated method stub
		return passportRepository.findById(id).get();
	}
	@Override
	public Passport getPassportByUserId(Long userId) {
		return passportRepository.findByUser_Id(userId);
	}
	@Override
	public Passport savePassport(Passport p) {
		// TODO Auto-generated method stub
		return passportRepository.save(p);
	}

	@Override
	public Passport updatePassport(Passport p) {
		// TODO Auto-generated method stub
		return passportRepository.save(p);
	}
	@Override
	public void deletePassportById(String id) {
		// TODO Auto-generated method stub
		passportRepository.deleteById(id);
	}








	@Override
	public void deletePassport(Passport p) {
		// TODO Auto-generated method stub
		passportRepository.delete(p);
	}


}
