package commun;
import java.rmi.Remote;
import java.rmi.RemoteException;

import input_output.Input;
import input_output.Output;



public interface InterfaceMoteurTraitementRMI extends Remote
{
	//Catalogue
	public Output compute(Input data) throws RemoteException;
	
}
