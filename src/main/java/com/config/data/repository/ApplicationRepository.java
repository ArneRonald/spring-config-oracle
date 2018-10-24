package com.config.data.repository;

import com.config.data.entities.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Long> {

    public ApplicationEntity findOneApplicationNameByApplicationName(String applicationName);

}
