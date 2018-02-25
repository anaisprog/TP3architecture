package client;

import java.rmi.server.*;

/* Classe Client contenant un main pour le telechargement, 
 * l'instanciation et le lancement du client 
 */

public class Client 
{
	public static void main(String[] args)
	{
		try 
		{
			// SecurityManager
			System.setSecurityManager(new SecurityManager());
			// téléchargement de la classe du client
			Class c = RMIClassLoader.loadClass("http://localhost:8000/bin/" ,"serveur.Client");
			// instanciation du client
			Runnable r = (Runnable)c.newInstance();
			// lancement du ’véritable’ client
			r.run();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
