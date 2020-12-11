package com.tylerj.javazoos.services;

import com.tylerj.javazoos.models.Zoo;

import java.util.List;

public interface ZooServices {

    List<Zoo> findAllZoos();

    Zoo findZooById(long id);
}
