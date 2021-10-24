package com.example.demo.controllers;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RefreshScope
@RequestMapping(path = "/api/v1/orders")
@Slf4j
public class OrderController {

}
