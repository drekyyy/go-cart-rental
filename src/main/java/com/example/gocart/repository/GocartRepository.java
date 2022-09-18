package com.example.gocart.repository;

import com.example.gocart.model.Gocart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GocartRepository extends CrudRepository<Gocart, Integer> {
    List<Gocart> findAll();

    }

