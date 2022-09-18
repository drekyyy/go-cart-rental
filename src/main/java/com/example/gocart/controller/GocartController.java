package com.example.gocart.controller;

import com.example.gocart.model.Gocart;
import com.example.gocart.repository.GocartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gocarts")
public class GocartController {
    @Autowired
    GocartRepository gocartRepository;

    @GetMapping()
    public List<Gocart> getAll(){
        return gocartRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Gocart> getById(@PathVariable("id") Integer id){
        return gocartRepository.findById(id);
    }
    @PostMapping("/add")
   // @RequestMapping(value="/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, method=RequestMethod.POST)
    public Gocart addGocart( @RequestParam("seatCount") int seats, @RequestParam("gocartColor") String color, Gocart gocart){
        gocart.setSeats(seats);
        gocart.setColor(color);
        return gocartRepository.save(gocart);
    }
}
