package servmultiple;

import java.rmi.registry.*;
import java.util.Scanner;

import commun.*;

public class Client 
{
	
	public static void main(String[] args) 
	{
		
		int nombreServeurs=0; 
		 // On créé un tableau de serveurs de taille statique 
		Registry[] registry=new Registry[nombreServeurs];;                 
		//On parcourt l'ensemble des serveurs disponibles
		for (int i=0;  i<nombreServeurs; i++){
			try 
			{	
				registry[i] = LocateRegistry.getRegistry("localhost", 1099);
				/* TODO : Remplacer Object par l'interface*/
				InterfaceMoteurTraitementRMI h = (InterfaceMoteurTraitementRMI) registry[i].lookup ("UnStore");	
				Scanner sc = new Scanner(System.in);	
			}catch (Exception e) 
			{
				System.out.print(e.getMessage());
			}
		}
		
	}
}