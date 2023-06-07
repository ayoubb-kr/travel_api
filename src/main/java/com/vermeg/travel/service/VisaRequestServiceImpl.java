package com.vermeg.travel.service;


import com.vermeg.travel.entities.VisaRequest;
import com.vermeg.travel.repos.VisaRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class VisaRequestServiceImpl implements VisaRequestService{

    @Autowired
    VisaRequestRepository reqRep;

    @Override
    public List<VisaRequest> getAllReq() {
        return reqRep.findAll();
    }
    @Override
    public VisaRequest saveReq (VisaRequest req) {
        return reqRep.save(req);
    }
    @Override
     public VisaRequest updateReq (VisaRequest req) {
        return reqRep.save(req);
   }
    @Override
    public void deleteReqById(Long id) {
        reqRep.deleteById(id);
    }
}
