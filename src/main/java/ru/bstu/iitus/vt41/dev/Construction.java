package ru.bstu.iitus.vt41.dev;

import java.util.Scanner;

public abstract class Construction {
    protected int constructionCost;
    protected String addressConstruction;

    public abstract void init(Scanner scanner);
    public abstract int getConstructionCost();
    public abstract String ToString();
}
