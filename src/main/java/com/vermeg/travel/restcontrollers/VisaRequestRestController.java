package com.vermeg.travel.restcontrollers;

import com.vermeg.travel.entities.Visa;
import com.vermeg.travel.entities.VisaRequest;
import com.vermeg.travel.repos.VisaRequestRepository;
import com.vermeg.travel.service.VisaRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/req")
@CrossOrigin("*")
public class VisaRequestRestController {
    @Autowired
    VisaRequestService visareqService;
    @Autowired
    VisaRequestRepository reqRep;

    //show
    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<VisaRequest> getAllReq() {
        return reqRep.findAll();
    }

    //add
    @PostMapping
    public VisaRequest createVisaRequest(@RequestBody VisaRequest visaRequest) {
        return visareqService.saveReq(visaRequest);
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteVisareq(@PathVariable Long id) {
        visareqService.deleteReqById(id);
    }

    //update
    @RequestMapping(method = RequestMethod.PUT)
    public VisaRequest updateVisa (@RequestBody VisaRequest visareq) {
        return visareqService.updateReq(visareq);
    }

}
