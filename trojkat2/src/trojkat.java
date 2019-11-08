import java.util.Scanner;

public class trojkat
{
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	
	{		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Prosze podaj dlugosc pierwszego odcinka w cm ");
        
        double a = scan.nextDouble();
        
        System.out.println("Prosze podaj dlugosc drugiego odcinka w cm ");
        
        double b = scan.nextDouble();
        
        System.out.println("Prosze podaj dlugosc trzeciego odcinka w cm ");
        
        double c = scan.nextDouble();
		
        
        if (a+b>c && a+c>b && b+c>a)
        {
        	
        	System.out.println("\nz podanych odcinkow mozna zbudowac trojkat");
        	
        	double p = a+b+c/2;
        	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        	System.out.println("\npole danego trojkata wynosi "+ pole);
        
        	
        	
        	
        	
        	if ((a*a+b*b==c*c) || b*b+c*c==a*a || c*c+a*a==b*b)
        	{
        		System.out.println("trojkat powstaly z podanych odcinkow jest trojkatem prostokatnym");
        	}
        	else
        	{
        		System.out.println("trojkat powstaly z podanych odcinkow nie jest trojkatem prostokatnym");
        	}
        	
        	
        	
        }
        else
        {
        	
        	System.out.println("z podanych odcinkow nie mozna zbudowac trojkata");
        }
	}

}