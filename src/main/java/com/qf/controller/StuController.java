package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Auth RuanHao
 * @Time 2019/11/28 13:44
 **/
@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> studentList = stuService.list();
        model.addAttribute("studentList",studentList);
        return "stuList";
    }

    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/addStu")
    public String addStu(Student student,String birthday1) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=dateFormat.parse(birthday1);
        student.setBirthday(date);
        stuService.save(student);
        return "redirect:/stu/list";
    }
}
