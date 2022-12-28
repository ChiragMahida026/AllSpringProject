/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chirag.springprojects;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
/**
 *
 * @author admin
 */
@RestController 
public class HelloWorldController {
    
    @RequestMapping("/")  
    public String hello()   
    {  
    return "Hello javaTpoint";  
    }  
}
