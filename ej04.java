import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        System.out.println("Dime dos números que quieras sumar");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("El resultado de los numeros seleccionados es " + suma);
    }
}