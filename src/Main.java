import controller.Controller;
import model.CalcModel;
import model.SumModel;
import viewer.View;

import java.awt.geom.Arc2D;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Controller c1 = new Controller(new View(), new CalcModel());
        Boolean switcher = Boolean.TRUE;
        while (switcher == Boolean.TRUE){
            c1.startProgram();
            switcher = c1.askToContinue();
        }
    }
}