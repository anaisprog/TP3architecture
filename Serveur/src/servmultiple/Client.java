package servmultiple;

import java.rmi.registry.*;
import java.util.Scanner;

//import commun.*;

public class Client 
{
	
	public static void main(String[] args) 
	{
		try 
		{	
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			Object h = (Object) registry.lookup ("UnStore");	
			Scanner sc = new Scanner(System.in);	
		}catch (Exception e) 
		{
			System.out.print(e.getMessage());
		}
	}
}