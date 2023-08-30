package lessons.airport;

import lessons.airport.model.Plane;
import lessons.airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        System.out.println(plane.getName());
        System.out.println(plane.getHoursInAir());
        System.out.println(plane.getReleaseYear());
        System.out.println(plane.isMilitary());

    }
}
