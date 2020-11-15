/*Exercice 5. 
Ecrire un programme en Java qui trie un tableau de nombres.

Solution 5.*/
//----Code Java ----------//
class EX5 {
    public static void main(String[] args) 
	{
        double Tab[]={10,3.2,25,36.56,0,159,12,52,8,89,15,10}, S=0;
		double tmp;
		
		//Affichage du tableau avant le tri
		System.out.println("Tableau avant le tri :");
		System.out.print("Tab=(");
		for(int i=0;i<Tab.length; i++) System.out.print(" "+Tab[i]);
		System.out.print(" )\n");
		//--------------------------------------------------
		
        for(int i=0;i<Tab.length; i++)
			for(int j=i+1;j<Tab.length; j++)
				if (Tab[i]>Tab[j])
				{
					tmp=Tab[i];
					Tab[i]=Tab[j];
					Tab[j]=tmp;
				}
		
		//Affichage du tableau après le tri
		System.out.println("Tableau après le tri :");
		System.out.print("Tab=(");
		for(int i=0;i<Tab.length; i++) System.out.print(" "+Tab[i]);
		System.out.print(" )\n");
		//--------------
    }
}
