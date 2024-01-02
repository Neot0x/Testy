package tests;

import java.util.Scanner;


public class UnitTesting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Prosty kalkulator");
        boolean flag = true;
        while(flag) {
        System.out.println("\nOpcje do wyboru:");
        System.out.println("\n1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Potegowanie");
        System.out.println("6. Pierwiastek kwadratowy");
        System.out.println("7. Sinus liczby");
        System.out.println("8. Koniec");

        System.out.print("\nCo chcesz zrobic?: ");
        int choice = scan.nextInt();
        System.out.println();
        
        float nOne; float nTwo;
        switch(choice) {
        	case 1: 
        			System.out.println("Podaj pierwsza liczbe: ");
        			nOne = scan.nextFloat();
        			
        			System.out.println("Podaj druga liczbe: ");
        	        nTwo = scan.nextFloat();
        	        
        			System.out.println("Wynik: " + performAddition(nOne, nTwo));
        			break;
        	case 2: 
        			System.out.println("Podaj pierwsza liczbe: ");
            		nOne = scan.nextFloat();

            		System.out.println("Podaj druga liczbe: ");
            		nTwo = scan.nextFloat();
        			System.out.println("Wynik: " + performSubtraction(nOne, nTwo));
        			break;
        	case 3: 
        			System.out.println("Podaj pierwsza liczbe: ");
        			nOne = scan.nextFloat();
			
        			System.out.println("Podaj druga liczbe: ");
        			nTwo = scan.nextFloat();
	        
        			System.out.println("Wynik: " + performMultiplication(nOne, nTwo));
        			break;
        	case 4: 
        			System.out.println("Podaj pierwsza liczbe: ");
        			nOne = scan.nextFloat();
		
        			System.out.println("Podaj druga liczbe: ");
        			nTwo = scan.nextFloat();
        
        			System.out.println("Wynik: " + performDivision(nOne, nTwo));
        			break;
        	case 5:
        			System.out.println("Podaj podstawe: ");
        			nOne = scan.nextFloat();
	
        			System.out.println("Podaj wykladnik: ");
        			nTwo = scan.nextFloat();
        			
        			System.out.println("Wynik: " + performPower(nOne, nTwo));
        			break;
        	case 6:
        			System.out.println("Podaj liczbe: ");
        			nOne = scan.nextFloat();
        			
        			System.out.println("Wynik: " + performRoot(nOne));
    				break;
        	case 7:
        			System.out.println("Podaj liczbe: ");
        			nOne = scan.nextFloat();
    			
        			System.out.println("Wynik: " + performSinus(nOne));
        			break;
        	case 8:
    				flag = false;
    				break;
        	default:
        			break;
        
        	}
        }
        //System.out.println();
        scan.close();
    }

    public static float performAddition(float nOne, float nTwo){
        return nOne + nTwo; 
    }

    public static float performSubtraction(float nOne, float nTwo){
    	return nOne - nTwo;
    }

    public static float performMultiplication(float nOne, float nTwo){
    	return nOne * nTwo;
    }

    public static float performDivision(float nOne, float nTwo){
    	if(nTwo == 0) {
    		return 0;
    	}else {
    		return nOne / nTwo;
    	}
    }
    
    public static float performPower(float nOne, float nTwo) {
    	return (float) Math.pow(nOne, nTwo);
    }
    
    public static float performRoot(float nOne) {
    	if(nOne < 0) {
    		return 0;
    	}else {
    	return (float) Math.sqrt(nOne);
    	}
    }
    
    public static float performSinus(float nOne) {
    	return (float) Math.sin(nOne);
    } 
}