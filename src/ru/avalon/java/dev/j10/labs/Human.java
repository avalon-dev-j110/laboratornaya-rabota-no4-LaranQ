/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author halya
 */
public class Human implements Person{
    private String name;
    private Date birthDate;
    
    public Human(String name, Date birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public Date getBirthDate(){
        return birthDate;
    }
    
    @Override
    public int compareTo(Human h) {

        int result = name.compareTo(h.name);

        if (result == 0) {
            result = birthDate.compareTo(h.birthDate);
        }
        return result;
    }
    
}
