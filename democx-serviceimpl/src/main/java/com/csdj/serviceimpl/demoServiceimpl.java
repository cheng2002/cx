package com.csdj.serviceimpl;

import com.csdj.mapper.demoMapper;
import com.csdj.pojo.Books;
import com.csdj.service.demoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class demoServiceimpl implements  demoService  {

   @Autowired
   demoMapper mapper;


    @Override
    public List<Books> getBooks() {
        return mapper.selectAll();
    }
}
