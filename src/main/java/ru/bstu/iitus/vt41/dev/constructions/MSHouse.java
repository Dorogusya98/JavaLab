package ru.bstu.iitus.vt41.dev.constructions;

import lombok.Data;
import ru.bstu.iitus.vt41.dev.constructions.House;

import java.util.Scanner;

@Data
public class MSHouse extends House {

    boolean hasElevator;
    boolean hasParking;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите true, если есть лифт, иначе false:");
        hasElevator = scanner.hasNextBoolean();

        System.out.print("Введите true, если есть парковка, иначе false:");
        hasParking = scanner.hasNextBoolean();
    }

    @Override
    public String ToString() {
        return "Многоэтажный дом\n" + super.ToString()
                + "\n Наличие лифта: " + hasElevator
                + "\n Наличие парковки: " + hasParking + "\n";
    }
}
