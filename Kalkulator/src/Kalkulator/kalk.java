package Kalkulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class kalk {

  public static void main(String[] args) throws IOException {
	 
	System.out.println("Witaj w programie kalkulator \n\nAby przeprowadzić działanie podaj proszę dwie liczby, a następnie wybierz operację:\n[+] dodawanie\n[-] odejmowanie\n[*] mnożenie\n[/] dzielenie\n");
    kalk calculator = new kalk();

    
    
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Podaj proszę pierwszą liczbę");
    String aValue = consoleReader.readLine();
    
    double x = Double.parseDouble(aValue);

    System.out.println("Podaj proszę drugą liczbę");
    String bValue = consoleReader.readLine();
    
    double y = Double.parseDouble(bValue);

    System.out.println("Podaj proszę symbol operacji z menu + - * lub /");
    String operation = consoleReader.readLine();

    	if ("+".equals(operation)) {
    		System.out.println("Wynik dodawania wynosi " + calculator.sum(x, y));
    		} else if ("-".equals(operation)) {
    		System.out.println("Wynik odejmowania wynosi " + calculator.subtract(x, y));
    		} else if ("*".equals(operation)) {
    		System.out.println("Wynik mnożenia wynosi " + calculator.multiply(x, y));
    		} else if ("/".equals(operation)) {
    		System.out.println("Wynik dzielenia wynosi " + calculator.divide(x, y));
    		}
  		}


  private double sum(double x, double y) {
    return x + y;
  }

  private double subtract(double x, double y) {
    return x - y;
  }

  private double multiply(double x, double y) {
    return x * y;
  }

  private double divide(double x, double y) {
    return x / y;
  }
}