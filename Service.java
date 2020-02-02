/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Sofiane
 */
public interface Service extends Remote{
    
    //public void calc(double d,) throws RemoteException ;
    
    public double moyenne(double d1,double d2,double d3) throws RemoteException;
    
}
