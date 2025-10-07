import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        System.out.println("Dime tu sueldo bruto ");
        Scanner sc = new Scanner(System.in);
        int sueldoBruto = sc.nextInt();
        double irpf = 0.15;
         double sueldoNeto = sueldoBruto * irpf;
         System.out.println("Tu sueldo neto es " + sueldoNeto);
    }
}