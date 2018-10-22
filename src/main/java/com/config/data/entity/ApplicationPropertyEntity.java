package com.config.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATIONPROPERTIES")
public class ApplicationPropertyEntity {

    @Id
    @Column(name = "ID")
    private Long ID;

    @Column(name="APPLICATION_PROPERTY_KEY")
    private String applicationPropertyKey;

    @Column(name="APPLICATION_PROPERTY_VALUE")
    private String applicationPropertyValue;

    @Column(name="APPLICATION_PROPERTY_APP")
    private String applicationPropertyApp;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getApplicationPropertyKey() {
        return applicationPropertyKey;
    }

    public void setApplicationPropertyKey(String applicationPropertyKey) {
        this.applicationPropertyKey = applicationPropertyKey;
    }

    public String getApplicationPropertyValue() {
        return applicationPropertyValue;
    }

    public void setApplicationPropertyValue(String applicationPropertyValue) {
        this.applicationPropertyValue = applicationPropertyValue;
    }

    public String getApplicationPropertyApp() {
        return applicationPropertyApp;
    }

    public void setApplicationPropertyApp(String applicationPropertyApp) {
        this.applicationPropertyApp = applicationPropertyApp;
    }
}
