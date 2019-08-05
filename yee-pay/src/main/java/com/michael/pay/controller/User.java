package com.michael.pay.controller;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class User {

    private String username;

    private Integer age;

    private int sex;

    private List<Teacher> teachers = new ArrayList<>();

}
