package model;

import java.util.Scanner;

public class FigureModel {
    public Figure inputFigure(Scanner sc){
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input position: ");
        String position = sc.nextLine();

        return new Figure(name, position);
    }
}
