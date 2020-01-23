package ru.bstu.iitus.vt41.dev.util;


import ru.bstu.iitus.vt41.dev.Construction;

import java.util.LinkedList;
import java.util.Scanner;

public class ConstructionUtil {

    public static void bubleSort(LinkedList<Construction> arr) {
        for(int i = arr.size()-1; i > 0; i--)
            for(int j = 0; j < i; j++){
                if( arr.get(i).getConstructionCost() > arr.get(j + 1).getConstructionCost() ){
                    Construction tmp = arr.get(i);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
    }

    public static int readInt (Scanner scanner) {
        while (!scanner.hasNextInt ()) {
            scanner.next ();
            System.out.println ("Введите целое число!");
        }
        return scanner.nextInt ();
    }
}
