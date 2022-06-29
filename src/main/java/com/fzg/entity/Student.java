package com.fzg.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Student {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private String gender;
    private Address address;
    private Boolean flag;
    private List<String> hobby;
    private List<String> selectHobby;
    private Integer radioId;
    private Map<Integer,String> gradeMap;
    private Integer selectGrade;
    private Map<Integer,String> cityMap;
    private Integer selectCity;
}
