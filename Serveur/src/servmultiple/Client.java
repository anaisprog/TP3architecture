package servmultiple;

import java.rmi.registry.*;
import java.util.Scanner;

import commun.*;

public class Client 
{
	
	public static void main(String[] args) 
	{
		
		int nombreServeurs=200; 
		 // On créé un tableau de serveurs de taille statique 
		Registry[] registry=new Registry[nombreServeurs];
		
		//On parcourt l'ensemble des serveurs disponibles
		for (int i=0;  i<nombreServeurs; i++){
			try 
			{	
				registry[i] = LocateRegistry.getRegistry("localhost", 1099);
				InterfaceMoteurTraitementRMI h = (InterfaceMoteurTraitementRMI) registry[i].lookup ("InterfaceServeurClient");	
				Scanner sc = new Scanner(System.in);	
			}catch (Exception e) 
			{
				System.out.print(e.getMessage());
			}
		}
		
	}
}