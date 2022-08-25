package com.bridgelabz.lmsspringbatch.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Candidates {
//    @Id
//    private Long id;
//    private String cicId;
//    private String fullName;
//    private String email;
//    private String mobileNum;
//    private String hiredDate;
//    private String degree;
//    private String aggregatePercentage;
//    private String city;
//    private String state;
//    private String status;
//    private String passedOutYear;
//    private String candidateStatus;
//    private String preferredJobLocation;
@Id
@Column(name = "id")
private long id;
    @Column(name = "cicId")
    private String cicId;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobleNum")
    private String mobileNum;
    @Column(name = "hiredDate")
    private String hiredDate;
    @Column(name = "degree")
    private String degree;
    @Column(name = "aggrPer")
    private String aggrPer;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "preferredJobLocation")
    private String preferredJobLocation;
    @Column(name = "ststus")
    private String status;
    @Column(name = "passedOutYear")
    private String passedOutYear;
    @Column(name = "creatorUser")
    private String creatorUser;
    @Column(name = "candidateStatus")
    private String candidateStatus;

    public Candidates() {
    }
}