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
    private Long dptManagerId;

    public Department(Long dptManagerId, String dptName, Long dptNumber) {
        this.dptManagerId = dptManagerId;
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

    public Long getDptManager() {
        return dptManagerId;
    }

    public void setDptManager(Long dptManagerId) {
        this.dptManagerId = dptManagerId;
    }
}
