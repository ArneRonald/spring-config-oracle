package com.config.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "APPLICATION_PROPERTIES")
public class PropertyEntity {

    @Id
    @Column(name = "PROPERTY_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "prop_seq")
    @SequenceGenerator(name = "prop_seq", sequenceName = "prop_sequence", allocationSize = 1)
    private Long id;

    @Column(name="PROPERTY_KEY")
    private String propertyKey;

    @Column(name="PROPERTY_VALUE")
    private String propertyValue;

    @Column(name = "PROPERTY_APPLICATION")
    private int propertyApplication;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public int getPropertyApplication() {
        return propertyApplication;
    }

    public void setPropertyApplication(int propertyApplication) {
        this.propertyApplication = propertyApplication;
    }
}
