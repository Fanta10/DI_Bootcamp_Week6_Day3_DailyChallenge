package exercicedailychallenge;

import java.util.Scanner;

public class EerciceDailyChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("entrer un nombre : ");
        int nombreUser = sc.nextInt();
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(nombreUser + "x" + i + "=" + nombreUser*i);
        }
        //factoriel
        int factoriel = nombreUser;
        int i = 1;
        while(i<nombreUser) {
            if(nombreUser == 0 || nombreUser == 1) {
                factoriel = 1;
                break;
            }
            factoriel = factoriel * (nombreUser - i);
            i++;
        }
        
        System.out.println(nombreUser +"! = " + factoriel);
        
        //fibonacci
        i = 1;
        int fibo = 0;
        do{
            System.out.println(fibo);
            fibo += i;
            i++;
        }while(i<nombreUser);

	}

}
