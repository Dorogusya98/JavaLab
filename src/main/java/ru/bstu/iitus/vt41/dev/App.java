package ru.bstu.iitus.vt41.dev;


import lombok.extern.log4j.Log4j2;
import ru.bstu.iitus.vt41.dev.constructions.*;
import ru.bstu.iitus.vt41.dev.util.ConstructionUtil;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.ErrorManager;

@Log4j2
public class App {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int constructionCount, constructionType;
        System.out.print("Введите количество сооружений: ");
        constructionCount = ConstructionUtil.readInt(scanner);

        LinkedList<Construction> constructionsList = new LinkedList<Construction> ();
        String tmp = "";

        for(int i = 0; i < constructionCount; i++) {
            System.out.print("* Наименование сооружения: ");
            tmp = scanner.next();
            try {
                constructionsList.add(ConstructionType.valueOf(tmp).factoryMethod());
                //constructionsList.getLast().init(scanner);
            } catch (Exception e) {
                System.out.print("Неверное наименование сооружения.\n");
                log.error("Введено неверное наименование сооружения: " + tmp);
            }
        }
        ConstructionUtil.bubleSort(constructionsList);
        for(Construction construction : constructionsList){
            System.out.println(construction.ToString());
        }
    }
}
