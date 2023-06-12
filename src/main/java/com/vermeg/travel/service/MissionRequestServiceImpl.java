package com.vermeg.travel.service;

import com.vermeg.travel.entities.MissionRequest;

import com.vermeg.travel.repos.MissionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionRequestServiceImpl implements MissionRequestService {

    @Autowired
    private MissionRequestRepository repmission;

    @Override
    public List<MissionRequest> getAllMissionRequests() {
        return repmission.findAll();
    }

    @Override
    public MissionRequest getMissionRequestById(Long id) {
        return repmission.findById(id).orElse(null);
    }

    @Override
    public MissionRequest createMissionRequest(MissionRequest missionRequest) {
        return repmission.save(missionRequest);
    }

    @Override
    public MissionRequest updateMissionRequest( MissionRequest missionReq) {
        return repmission.save(missionReq);
    }

    @Override
    public void deleteMissionRequest(Long id) {
        repmission.deleteById(id);
    }
}