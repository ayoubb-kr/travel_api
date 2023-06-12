package com.vermeg.travel.restcontrollers;
import com.vermeg.travel.entities.MissionRequest;

import com.vermeg.travel.service.MissionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missionReq")
@CrossOrigin("*")
public class MissionRequestRestController {
    @Autowired
    private MissionRequestService missionReq;

    @GetMapping("/all")
    public List<MissionRequest> getAllMissionRequests() {
        return missionReq.getAllMissionRequests();
    }

    @GetMapping("/{id}")
    public MissionRequest getMissionRequestById(@PathVariable Long id) {
        return missionReq.getMissionRequestById(id);
    }

    @PostMapping
    public MissionRequest createMissionRequest(@RequestBody MissionRequest missionRequest) {
        return missionReq.createMissionRequest(missionRequest);
    }
    @PutMapping()
    public MissionRequest updateMissionRequest(@RequestBody MissionRequest missionRequest) {
        return missionReq.updateMissionRequest(missionRequest);
    }
    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMissionRequest(@PathVariable Long id) {
        missionReq.deleteMissionRequest(id);
    }
}
