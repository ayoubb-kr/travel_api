package com.vermeg.travel.service;

import java.util.List;
import java.util.Optional;

import com.vermeg.travel.entities.Passport;
import com.vermeg.travel.entities.Visa;
import com.vermeg.travel.repos.PassportRepository;
import com.vermeg.travel.repos.VisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	public List<Visa> getVisaByIdpass(String idPass) {
		return visaRepository.findByPassport_IdPass(idPass);
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
	public Optional<Visa> getVisaById(String id) {
		return visaRepository.findById(id);
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
