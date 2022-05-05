import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
    int num1=0, ini=0, total=0;
    do{
    Scanner captura= new Scanner(System.in);
    System.out.println("Digite un numero a sumar.");
    num1=captura.nextInt();
    total=total+num1;
    ini=ini+1;
    }while(ini!=10);
        System.out.println("Su total es " + total);
    }
}
