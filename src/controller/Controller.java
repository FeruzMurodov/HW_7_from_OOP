package controller;
import model.CalcModel;
import viewer.View;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Controller {
    View view;
    CalcModel calcModel;

    public Controller(View view, CalcModel calcModel) {
        this.view = view;
        this.calcModel = calcModel;
    }
    public void startProgram() throws IOException {
        Logger logger = Logger.getLogger(Controller.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.setLevel(Level.INFO);
        logger.addHandler(fh);
        SimpleFormatter sformatter = new SimpleFormatter();
        fh.setFormatter(sformatter);
        Double a = view.getValue();
        String operation = view.getOperation();
        Double b = view.getValue();
        calcModel.setA(a);
        calcModel.setB(b);
        calcModel.setOperation(operation);
        Double result = calcModel.calculate();
        view.print(result);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" ").append(operation).append(" ").append(b).append(" = ").append(result);
        logger.info(stringBuilder.toString());
    }
    public Boolean askToContinue(){
        return view.askToContinue();
    }
}

