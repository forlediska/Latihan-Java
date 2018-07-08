/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_operasi_matrik;

import java.util.Scanner;

/**
 *
 * @Rachel_FASP
 */
public class Menu_Operasi_Matrik {

 static Scanner scan = new Scanner(System.in);
        static int barisa = 10;
    	static int koloma = 10;
    	static int barisb = 10;
    	static int kolomb = 10;
    	static int [][] a = new int [barisa][koloma];
    	static int [][] b = new int [barisb][kolomb];
		
    public static void main (String[] args){
    
    	int menu;
    	System.out.println("MENU OPERASI MATRIK");
        System.out.println("=================================================");
    	System.out.println("  1. PENJUMLAHAN MATRIK ");
    	System.out.println("  2. PENGURANGAN MATRIK ");
    	System.out.println("  3. PERKALIAN MATRIK ");
        System.out.println("=================================================");
        System.out.print("\nMasukan Pilihan = ");
       
        menu = scan.nextInt();
     switch (menu) {
         case 1:
             penjumlahan();
             break;
         case 2:
             pengurangan();
             break;
         case 3:
             perkalian();
             break;
         default:
             System.out.println(" Pilihan salah");
             break;
     }
	}
    
	static void ordo (){	
	System.out.println();
    	System.out.println("Masukkan Ordo matriks A");
    	System.out.print("Baris =  ");
    	barisa = scan.nextInt();
    	System.out.print("Kolom =  ");
    	koloma = scan.nextInt();
    	System.out.println("Masukkan Ordo matriks B");
    	System.out.print("Baris =  ");
    	barisb = scan.nextInt();
    	System.out.print("Kolom =  ");
    	kolomb = scan.nextInt();
    }
	
	static  void matriks(){
		
		System.out.println();
    	System.out.println("Masukkan Nilai Matriks A");
        System.out.println("=================================================");
        for(int i=0; i<barisa ;i++) {
            for(int j=0; j<koloma ;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                a[i][j]=scan.nextInt();
            }
        }
         System.out.print("\n");
           for(int t=0;t<barisa ;t++){
            	for(int y=0;y<koloma ;y++){
           			System.out.print(a[t][y] +" ");
            	}
           System.out.println(" ");
           }
           
        System.out.println();   
      	System.out.println("Masukkan Nilai Matriks B");
        System.out.println("=================================================");
        for(int i=0; i<barisb ;i++) {
            for(int j=0; j<kolomb ;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                b[i][j]=scan.nextInt();
            }
        }
         System.out.print("\n");
           for(int t=0;t<barisb ;t++){
            	for(int y=0;y<kolomb ;y++){
           			System.out.print(b[t][y] +" ");
            	}
           System.out.println(" ");
           }
	}
	
	
	static  void penjumlahan(){   
		ordo ();	
			System.out.println();
    	boolean hasil = ( barisa == barisb ) && (kolomb == koloma );
    	if ( hasil == true ) {
    		System.out.println("Dapat Dilakukan Penjumlahan ");
    		matriks();
    	
           int [][] c = new int [barisa][koloma];
           for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
            	c [i][j]= a [i][j] +b [i][j] ;
            }
           }
        	System.out.println("\nHasil Penjumlahan Matriks A dan B");
	        System.out.println("=========================================");
	        for(int i=0;i<barisa;i++) {
	            for(int j=0;j<koloma;j++) {
	                System.out.print(c[i][j] +" ");
	            }
	        System.out.println(" ");
	        }
	    }
    	else{
    			System.out.println("Tidak Dapat Dilakukan Penjumlahan ");
    	}
	}
	
	static  void pengurangan(){   
		ordo ();	
			System.out.println();
    	boolean hasil = ( barisa == barisb ) && (kolomb == koloma );
    	if ( hasil == true ) {
    		System.out.println("Dapat Dilakukan Pengurangan ");
    	matriks();
    	 int [][] c = new int [barisa][koloma];
           for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
            	c [i][j]= a [i][j] - b [i][j] ;
            }
        }
        
        System.out.println("\nHasil Pengurangan Matriks A dan B");
        System.out.println("=================================================");
        for(int i=0;i<barisa;i++) {
            for(int j=0;j<koloma;j++) {
                System.out.print(c[i][j] +" ");
            }
        System.out.println(" ");
        }
    	}
    	else{
    			System.out.println("Tidak Dapat Dilakukan Pengurangan ");
    		}
		
    	  	
	}
	static  void perkalian(){   
		ordo ();	
		System.out.println();
    	if (koloma == barisb) {
    		System.out.println("Dapat Dilakukan Perkalian ");
    	
    	matriks();
    	
    	int [][] hasilkl = new int  [barisa][kolomb];
    	for (int i = 0; i < barisa; i++) {
            for (int j = 0; j < kolomb; j++) {
                int x = 0;
                for (int k = 0; k < barisb; k++) {
                    x += a [i][k] * b [k][j];
                }
                hasilkl[i][j] = x;
            }
        }		
         
        System.out.print("\n"); 
        System.out.println("Hasil Perkalian Matriks A dan B");
        System.out.println("=================================================");
	        for(int i=0;i<barisa;i++){
	            for(int j=0;j<barisa;j++){
	                System.out.print(hasilkl[i][j] +" ");
	            }
	            System.out.println(" ");
	        }
  	  	}
		else{
    		System.out.println("Tidak Dapat Dilakukan Perkalian ");
    	}
	}
}