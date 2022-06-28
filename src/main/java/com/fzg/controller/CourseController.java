package com.fzg.controller;

import com.fzg.entity.Course;
import com.fzg.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/save")
    public String save(Course course){
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        courseRepository.deleteById(id);
        return "redirect:/course/findAll";
    }

    @GetMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",courseRepository.findAll());
        return modelAndView;
    }
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("course", courseRepository.findById(id));
        return modelAndView;
    }
    @PutMapping("/update")
    public String update(Course course){
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }
}
