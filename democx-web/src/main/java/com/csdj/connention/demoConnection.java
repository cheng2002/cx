package com.csdj.connention;

import com.csdj.pojo.Books;
import com.csdj.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class demoConnection {
    @Autowired
    demoService service;

    @GetMapping("show")
    public List<Books> show(){
        return  service.getBooks();
    }

}
