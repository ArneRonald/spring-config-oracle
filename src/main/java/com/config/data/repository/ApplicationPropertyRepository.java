package com.config.data.repository;

import com.config.data.entity.ApplicationPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationPropertyRepository extends JpaRepository<ApplicationPropertyEntity, Long> {

    public List<ApplicationPropertyEntity> findApplicationPropertyEntityByApplicationPropertyApp(String application);
}
