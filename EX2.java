/*Exercice 2. 
Ecrire un programme en Java qui permet de saisir et permuter les contenus de deux variables.

Solution 2.*/
//----Code Java ----------//
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez x: ");
        int x = scanner.nextInt();

        System.out.print("Entrez y: ");
        int y = scanner.nextInt();

        System.out.println("Avant permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("Après permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}