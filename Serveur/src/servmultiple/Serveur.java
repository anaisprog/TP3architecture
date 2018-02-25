package servmultiple;

import java.rmi.server.*;

import java.rmi.registry.*;
//import commun.*;

/* Classe Serveur a completer*/


public class Serveur 
{
	public static void main(String[] args) 
	{

		try 
		{
			//On crée le magasin
			//Object h = ObjectImpl.getInstance();

			//Object stub = (Object) UnicastRemoteObject.exportObject(h, 0);
			//Registry registry = LocateRegistry.createRegistry(1099);
			Registry registry = LocateRegistry.getRegistry(1099);
			//registry.rebind("UnStore", stub);
			System.out.println("Serveur OK");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
