

    //Exercice 1. 
/*Ecrire un programme en Java qui test si un entier positif est pair ou impair.
Solution 1.*/
//----Code Java ----------//
import java.util.Scanner;
public class EX1 {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
	{Scanner scanner = new Scanner(System.in);
		// Saisir un nombre entier
        System.out.print("Tapez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        if (nombre < 0){
            System.out.println("Le nombre saisi est négatif, veuillez taper un autre nombre positif ...)");}
        else
            if (nombre % 2 == 0) {
                System.out.println("Le nombre "+nombre+" est pair !");}
                else 
                System.out.println("Le nombre "+nombre+" est impair !");         
    }
}
//---- Fin du Code Java ----------//
    
