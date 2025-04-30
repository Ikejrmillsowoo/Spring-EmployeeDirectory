package io.zipcoder.persistenceapp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DPT_NUMBER")
    private Long dptNumber;
    @Column(name = "DPT_NAME")
    private String dptName;
    @Column(name = "DPT_MANAGER")
    private String dptManager;

    public Department(String dptManager, String dptName, Long dptNumber) {
        this.dptManager = dptManager;
        this.dptName = dptName;
        this.dptNumber = dptNumber;
    }

    public Long getDptNumber() {
        return dptNumber;
    }

    public void setDptNumber(Long dptNumber) {
        this.dptNumber = dptNumber;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getDptManager() {
        return dptManager;
    }

    public void setDptManager(String dptManager) {
        this.dptManager = dptManager;
    }
}
