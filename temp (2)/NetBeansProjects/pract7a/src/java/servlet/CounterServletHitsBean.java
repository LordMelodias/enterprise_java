/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package servlet;

/**
 *
 * @author Rohit
 */
import jakarta.ejb.Singleton;


@Singleton
public class CounterServletHitsBean {
    private int hitcount;

    public int incrementAndGetHitCount()
        {
            return hitcount++;
    }
   
}
