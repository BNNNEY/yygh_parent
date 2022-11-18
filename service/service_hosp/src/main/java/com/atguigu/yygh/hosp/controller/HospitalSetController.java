package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;


    //查询医院设置表的所有信息
    @GetMapping("findAll")
    //调用service方法
    public List<HospitalSet> findAllHospitalSet(){
        //调用service方法
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id){
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }
}
