package com.vermeg.travel.repos;

import com.vermeg.travel.entities.MissionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRequestRepository extends JpaRepository<MissionRequest, Long> {
}