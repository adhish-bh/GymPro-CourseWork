/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import Model.*;


/**
 *
 * @author adhish
 */
public class SampleData {
    public static void loadSampleData() {

        // Exercises
        DataStore.exercises.add(new Exercise( "Bench Press", "Chest", "Hard", "Barbell"));
        DataStore.exercises.add(new Exercise("Squats", "Legs", "Medium", "Barbell"));
        DataStore.exercises.add(new Exercise("Push Ups", "Chest", "Easy", "Bodyweight"));

        // Sessions
        DataStore.sessions.add(new Session( "Morning Cardio", "John", "Cardio", "6:00 AM", 20));
        DataStore.sessions.add(new Session("Strength Training", "Mike", "Strength", "5:00 PM", 15));

        // Facilities
        DataStore.facilities.add(new Facility( "Swimming Pool", "Swimming", "Available", 30));
        DataStore.facilities.add(new Facility("Sauna", "Relaxation", "Available", 10));

        // Products
        DataStore.products.add(new Product( "Protein Powder", "Supplement", 2500, 20, "Available"));
        DataStore.products.add(new Product("Gym Gloves", "Accessory", 800, 50, "Available"));
        
        System.out.println("Exercises loaded: " + DataStore.exercises.size());
        System.out.println("Products loaded: " + DataStore.products.size());
        System.out.println("Sessions loaded: " + DataStore.sessions.size());
        System.out.println("Facilities loaded: " + DataStore.facilities.size());
    }
    
}
