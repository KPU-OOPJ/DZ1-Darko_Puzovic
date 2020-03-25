package zadatak1.java;
import java.util.Scanner;

public class zadatak1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("n(kvadratna matrica) ");
        
        int n = input.nextInt ();
        int niz [][] = new int [n][n];
        
        System.out.print("Unesi clanove");
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++){
                System.out.print("X[" +i+ "," +j +"]"+ "-->");
                
        niz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println();
            for (int j = 0; j < niz[i].length; j++) {
                System.out.print(niz[i][j] + " ");
            }
        }
            
        System.out.println();
        int min = niz[0][0];
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                if (min > niz[i][j])
                    min = niz[i][j];
            }
        }
        System.out.print("Najmanji clan matrice: " + min);
            }
        }