import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
    int num1=0, total=0;
    for(int i= 1;i<=10;i++){
    Scanner captura= new Scanner(System.in);
    System.out.println("Digite un numero a sumar.");
    num1=captura.nextInt();
    total=total+num1;
    }
        System.out.println("Su total es " + total);
    }
}
