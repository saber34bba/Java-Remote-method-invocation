/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Sofiane
 */
public class JavaRMI extends UnicastRemoteObject implements Service{

    @Override
    public double moyenne(double d1, double d2, double d3) throws RemoteException {
        double moy=(d1+d2+d3)/3;
                    System.out.print("moyenne is "+moy);

        return moy;
    } 
    
    
    public JavaRMI() throws RemoteException
    {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        
            JavaRMI server=new JavaRMI();
            LocateRegistry.createRegistry(1099);
           Naming.bind("rmi://localhost:1099/obj", server);

    
    }

  
    
}
