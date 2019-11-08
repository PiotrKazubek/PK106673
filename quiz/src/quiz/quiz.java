package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quiz
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		int Numer = 0;
		File Plik_txt = new File("pytania.txt");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(Plik_txt);
		
		Numer = 1;
		
		int pkt = 0;
		
		System.out.println("Sprawdz swoja wiedze z Gwiezdnych wojen, odpowiedz uzywajac a b c lub d\n\n");
			while (scanner.hasNext())
			{
				
				System.out.println("pytanie " + Numer );
				String pytanie = scanner.nextLine();
				System.out.println(pytanie);
				
				String a = scanner.nextLine();
				System.out.print("a - ");
				System.out.println(a);
				
				String b = scanner.nextLine();
				System.out.print("b - ");
				System.out.println(b);
		
				String c = scanner.nextLine();
				System.out.print("c - ");
				System.out.println(c);
				
				String d = scanner.nextLine();
				System.out.print("d - ");
				System.out.println(d);
				
				String sukces = scanner.nextLine();
				
				System.out.println("Twoja odpowiedz: ");
				
		
				String odp = scan.nextLine();
		
				if (odp.equals(sukces))
				{
					System.out.println("Odpowiedz poprawna\n\n");
					pkt++;
				}
				else
				{
					System.out.println("Niestety, prawidlowa odpowiedz to " + sukces + "\n\n");
					
				}Numer++;
			}
			

			
			System.out.println("Dziekuje za wziecie udzialu w quizie \n udalo Ci sie odpowiedziec na " + pkt+" pytan/pytania \n zagraj jeszcze raz!" );
		
	}

}