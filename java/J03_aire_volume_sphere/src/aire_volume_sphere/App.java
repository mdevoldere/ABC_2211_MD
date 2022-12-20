package aire_volume_sphere;

import java.util.Scanner;

/*
  VARIABLES
  R est un entier
  Aire est un reel double
  Volume est un reel double
 DEBUT PROGRAMME
   Ecrire « Veuillez écrire la valeur du rayon R » 
   Lire R
   Aire4 π R²
   Volume 4/3 π R3    	
   Ecrire « l’aire de la sphère est » +Aire
   Ecrire  « Le volume de la sphère est de » +Volume
FIN PROGRAMME
 */

public class App {
	
	public static void main(String[] args) {
		
		double pi = Math.PI; // utilisation de l'objet pi de la classe Java
		
		int rayon = 0;
		
		double aire; 
		
		double volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcul de l'aire et du volume d'une sphère");
		
		System.out.println("Saisir la valeur du rayon");
		
		rayon = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + rayon);
		
		aire = 4 * pi * Math.pow(rayon, 2); // utilisation de l'objet pow (puissance) de la classe Math (1er paramètre : la variable 1er nombre, le 2ème l'exposant)
		
		volume = 4/3d * pi * Math.pow(rayon, 3);
		
		System.out.println("L'air de la sphère est " + aire + ". Son volume est " + volume);
		
	}
	
}
