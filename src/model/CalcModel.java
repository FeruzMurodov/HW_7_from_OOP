package model;

public class CalcModel implements SumModel, MultiplyModel, DivideModel{
    public Double a;
    public Double b;
    public String operation;

    public void setA(Double a) {
        this.a = a;
    }
    public void setB(Double b) {
        this.b = b;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }
    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }
    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }
    public Double calculate(){
        if (operation.equals("+")){
            return sum(a, b);
        } else if (operation.equals("*")) {
            return multiply(a, b);
        } else if (operation.equals("/")) {
            return divide(a, b);
        }
        return null;
    }
}
