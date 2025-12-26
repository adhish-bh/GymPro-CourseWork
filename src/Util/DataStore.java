/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.LinkedList;
import Model.*;

/**
 *
 * @author adhish
 */
public class DataStore {
    public static LinkedList<Exercise> exercises = new LinkedList<>();
    public static LinkedList<Session> sessions = new LinkedList<>();
    public static LinkedList<Facility> facilities = new LinkedList<>();
    public static LinkedList<Product> products = new LinkedList<>();
    public static LinkedList<Workout> workouts = new LinkedList<>();

    private DataStore() {
        
    }
    
}
