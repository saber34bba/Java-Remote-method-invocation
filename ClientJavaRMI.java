/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class ClientJavaRMI{
   static double n1,n2,n3;
    
    public static void main(String args[]) throws NotBoundException, MalformedURLException, RemoteException
    {
               Service service=(Service)    Naming.lookup("rmi://localhost:1099/obj");
            Scanner in=new Scanner(System.in);
            n1=in.nextDouble();
            n2=in.nextDouble();
            n3=in.nextDouble();
            
            service.moyenne(n1, n2, n3);
                   
    }
}
