package com.example.gocart.controller;

import com.example.gocart.model.Gocart;
import com.example.gocart.repository.GocartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GocartController {
    @Autowired
    GocartRepository gocartRepository;

    public List<Gocart> getAll(){
        return gocartRepository.findAll();
    }
}
