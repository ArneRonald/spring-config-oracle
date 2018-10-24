package com.config.data.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "APPLICATIONS")
public class ApplicationEntity {
    
    @Id
    @Column(name = "APPLICATION_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "app_seq")
    @SequenceGenerator(name = "app_seq", sequenceName = "app_sequence", allocationSize = 1)
    private Long applicationId;

    @Column(name = "APPLICATION_NAME")
    private String applicationName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROPERTY_APPLICATION")
    private List<PropertyEntity> propertyEntities;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public List<PropertyEntity> getPropertyEntities() {
        return propertyEntities;
    }

    public void setPropertyEntities(List<PropertyEntity> propertyEntities) {
        this.propertyEntities = propertyEntities;
    }
}
