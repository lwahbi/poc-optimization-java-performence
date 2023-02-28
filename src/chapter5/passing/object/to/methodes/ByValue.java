package chapter5.passing.object.to.methodes;

public class ByValue {
    public static void calculate(int calcValue){
        // in java in methode passing by value; not possible by reference
        calcValue = calcValue *100;
    }
    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue);
        System.out.println(localValue);
    }
}
