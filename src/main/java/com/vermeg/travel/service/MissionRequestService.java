package com.vermeg.travel.service;

import com.vermeg.travel.entities.MissionRequest;

import java.util.List;

public interface MissionRequestService {
    List<MissionRequest> getAllMissionRequests();
    MissionRequest getMissionRequestById(Long id);
    MissionRequest createMissionRequest(MissionRequest missionRequest);
    MissionRequest updateMissionRequest( MissionRequest missionRequest);
    void deleteMissionRequest(Long id);
}