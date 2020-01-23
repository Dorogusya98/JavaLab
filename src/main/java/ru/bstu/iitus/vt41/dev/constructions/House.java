package ru.bstu.iitus.vt41.dev.constructions;

import lombok.Data;
import ru.bstu.iitus.vt41.dev.Construction;

import java.util.Scanner;

@Data
public class House extends Construction {
    int floorCount;
    int peopleCount;

    public House() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }
    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите адресс:");
        addressConstruction = scanner.next();

        System.out.print("Введите стоимость возведения сооружения:");
        constructionCost = scanner.nextInt();

        System.out.print("Введите количество этажей:");
        floorCount = scanner.nextInt();

        System.out.print("Введите количество жильцов:");
        peopleCount = scanner.nextInt();
    }

    @Override
    public int getConstructionCost() {
        return constructionCost;
    }

    @Override
    public String ToString() {
        return " Адресс возведения здания: " + addressConstruction +
                "\n Стоимость возведения здания: " + constructionCost +
                "\n Количество этажей: " + floorCount + "\n";
    }
}
