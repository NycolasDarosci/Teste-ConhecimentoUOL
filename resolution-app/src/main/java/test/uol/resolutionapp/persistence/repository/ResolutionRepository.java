package test.uol.resolutionapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.uol.resolutionapp.persistence.entity.Resolution;

public interface ResolutionRepository extends JpaRepository<Resolution, Long> {
    
}
