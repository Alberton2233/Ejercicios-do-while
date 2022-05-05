import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
    int opci=0, dia=0, mes=0, año=0;
    Scanner captura= new Scanner(System.in);
    while(opci<3){
    System.out.println("Si desea cambiar la fecha digite 1 para los dias, 2 para los meses y 3 para los años, o digite 4 para terminar el programa.");
    opci=captura.nextInt();
    switch(opci){
        case 1:
            System.out.println("Digite el dia.");
            dia=captura.nextInt();
            break;
            
        case 2:
            System.out.println("Digite el mes.");
            mes=captura.nextInt();
            break;
        case 3:
            System.out.println("Digite e año.");
            año=captura.nextInt();
            break;
        default:
            break;
            
    }
    }while(opci<3);
        System.out.println("Seleccionaste " + dia + " dias " + mes + " meses " + año + " años.");
    }
        
}
