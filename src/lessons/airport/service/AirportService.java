package lessons.airport.service;

import lessons.airport.model.Plane;

import java.util.Scanner;

public class AirportService {
    public Plane createPlane(){
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter release year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Is Military plane ? Y/N");
        plane.setMilitary(s.next().charAt(0) == 'Y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() +
                ", " + plane.getReleaseYear());
    }
}
