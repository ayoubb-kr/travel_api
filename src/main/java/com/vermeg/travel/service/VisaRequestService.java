package com.vermeg.travel.service;

import com.vermeg.travel.entities.User;
import com.vermeg.travel.entities.VisaRequest;

import java.util.List;

public interface VisaRequestService {

    List<VisaRequest> getAllReq();
    VisaRequest saveReq (VisaRequest req);
    VisaRequest updateReq (VisaRequest req);
    void deleteReqById(Long id);
}
