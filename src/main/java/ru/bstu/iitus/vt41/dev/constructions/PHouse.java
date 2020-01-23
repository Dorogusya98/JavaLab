package ru.bstu.iitus.vt41.dev.constructions;

import lombok.Data;
import ru.bstu.iitus.vt41.dev.constructions.House;

import java.util.Scanner;

@Data
public class PHouse extends House {
    boolean hasGarden;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите true, если есть сад, иначе false:");
        hasGarden = scanner.hasNextBoolean();
    }

    @Override
    public String ToString() {
        return "Частный дом\n" + super.ToString()
                + "\n Наличие сада: " + hasGarden + "\n";
    }
}
