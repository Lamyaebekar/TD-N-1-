/*Exercice 3. 
Ecrire un programme en Java qui résoud l'équation ax2+bx+c=0, avec a, b et c des réels à saisir (à la ligne de commande).

Solution 3.*/
//----Code Java ----------//
import java.util.Scanner;
public class EX3 {
    double a,b,c;
    public static void main(String[] args) 
	{
        double D,x1,x2;
	
           Scanner scanner = new Scanner(System.in);     
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                
		
		System.out.println("La solution de l'équation :"+a+"x2+"+b+"x+"+c+"=0 dans R :");
		
        if (a==0)
			if (b==0)
				if (c==0)
					System.out.println("S=R=tous les nombres réels");
				else
					System.out.println("S=Ensemble vide=pas de solution");
			else 
				System.out.println("S={x="+(-c/b)+"}");
		else
			{
				D=b*b-4*a*c;
				if (D>=0)
					{
						x1=(-b+Math.sqrt(D))/(2*a);
						x2=(-b-Math.sqrt(D))/(2*a);
						System.out.println("S={x1="+x1+", x2="+x2+"}");
					}
				else
					System.out.println("S=Ensemble vide=pas de solution dans R");
            }
	}
}
