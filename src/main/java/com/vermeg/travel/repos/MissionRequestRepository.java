package com.vermeg.travel.repos;

import com.vermeg.travel.entities.MissionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionRequestRepository extends JpaRepository<MissionRequest, Long> {
    List<MissionRequest> findByPassport_IdPass(String idPass);
}