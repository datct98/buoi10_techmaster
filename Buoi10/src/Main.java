import model.Figure;
import model.FigureModel;
import model.SummonRift;
import model.Team;
import modelTech.TechMasterModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FigureModel model = new FigureModel();
        Scanner sc = new Scanner(System.in);
        TechMasterModel techMasterModel = new TechMasterModel();
        techMasterModel.inputTechMaster(sc);



        /*ArrayList<Figure> figures = new ArrayList<>();
        ArrayList<Figure> figures2 = new ArrayList<>();

        //System.out.println(figure);
        for (int i=0; i<2; i++){
            Figure figure= model.inputFigure(sc);
            figures.add(figure);
        }
        for (int i=0; i<1; i++){
            Figure figure= model.inputFigure(sc);
            figures2.add(figure);
        }
        Team team1 = new Team();
        team1.setFigures(figures);
        Team team2 = new Team();
        team2.setFigures(figures2);
        ArrayList<Team> teams = new ArrayList<>(Arrays.asList(team1,team2));
        System.out.println("Mời b nhập thời gian bắt đầu: ");
        String time = sc.nextLine();
        SummonRift summonRift = new SummonRift(time, teams);
        System.out.println(summonRift.toString());*/

    }
}
