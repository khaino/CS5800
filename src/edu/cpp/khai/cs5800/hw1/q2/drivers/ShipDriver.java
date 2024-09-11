package edu.cpp.khai.cs5800.hw1.q2.drivers;

import edu.cpp.khai.cs5800.hw1.q2.models.CargoShip;
import edu.cpp.khai.cs5800.hw1.q2.models.CruiseShip;
import edu.cpp.khai.cs5800.hw1.q2.models.Ship;

public class ShipDriver {
    public static void main(String[] args) {
        Ship[] ships = createShips();
        printShips(ships);
    }

    private static Ship[] createShips() {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("The Horizon Star", "1990");
        ships[1] = new CruiseShip("Ocean Voyager", "1995", 500);
        ships[2] = new CargoShip("Ocean Carrier", "1999", 1000);

        return ships;
    }

    private static void printShips(Ship[] ships) {
        System.out.println("------------------All Ships------------------");
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
