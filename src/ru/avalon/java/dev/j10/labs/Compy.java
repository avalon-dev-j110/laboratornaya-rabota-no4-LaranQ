/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author halya
 */
public class Compy implements Comparator<String>{
    public int compare (String t, String t1){
        return t.length()-t1.length();
    }
}
