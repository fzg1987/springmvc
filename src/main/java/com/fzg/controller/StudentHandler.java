package com.fzg.controller;

import com.fzg.entity.Address;
import com.fzg.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentHandler {

    @RequestMapping("/get")
    public String get(Model model){
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(24);
        student.setPassword("123123");
        student.setGender("男");
        Address address = new Address();
        address.setCode(1);
        address.setValue("北京市");
        student.setAddress(address);
        student.setFlag(true);
        student.setHobby(Arrays.asList("读书","看电影","听音乐","打游戏","旅游"));
        student.setSelectHobby(Arrays.asList("读书","看电影","旅游"));
        student.setRadioId(1);
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"一年级");
        map.put(2,"二年级");
        map.put(3,"三年级");
        map.put(4,"四年级");
        map.put(5,"五年级");
        map.put(6,"六年级");
        student.setGradeMap(map);
        student.setSelectGrade(3);
        Map<Integer,String> cityMap = new HashMap<>();
        cityMap.put(1,"北京");
        cityMap.put(2,"上海");
        cityMap.put(3,"广州");
        cityMap.put(4,"深圳");
        student.setCityMap(cityMap);
        student.setSelectCity(2);

        model.addAttribute("student",student);
        return "student2";
    }

    @PostMapping("/update")
    public String update(Student student){
        System.out.println(student);
        return "student2";
    }
}
