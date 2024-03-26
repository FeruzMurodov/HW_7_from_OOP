package viewer;
import java.util.Scanner;

public class View {
    public Scanner iscanner = new Scanner(System.in);
    public Double getValue(){
        System.out.println("Введите число: ");
        return Double.parseDouble(iscanner.next());
    }
    public String getOperation(){
        System.out.println("Введите знак операции '+', '*', '/': ");
        return iscanner.next();
    }
    public void print(Double result){
        System.out.println("Oтвет: " + result);
    }
    public Boolean askToContinue(){
        System.out.println("Нажмите 'q' для выхода или 'w' чтобы продолжать...");
        if (iscanner.next().equals("q")){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
