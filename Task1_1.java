import java.util.Scanner;
/**
 * InnerTask1_1
 */
public interface calculator1 {
    void add();
    void sub();
}
class calculator {
    private int a;
    private int b;
    public void calculator(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
public class Task1_1{
    
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        calculator1 calc=new calculator();
        calc.add();
        calc.sub();
    }
}