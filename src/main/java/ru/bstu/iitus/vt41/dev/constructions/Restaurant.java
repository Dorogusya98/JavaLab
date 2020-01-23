package ru.bstu.iitus.vt41.dev.constructions;

import lombok.Data;
import ru.bstu.iitus.vt41.dev.constructions.Building;

import java.util.Scanner;

@Data
public class Restaurant extends Building {
    int seatsCount;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.print("Введите количество столов: ");
        seatsCount = scanner.nextInt();
    }

    @Override
    public String ToString() {
        return "Ресторан\n" + super.ToString()
                + "\n Количество столов: " + seatsCount + "\n";
    }
}
