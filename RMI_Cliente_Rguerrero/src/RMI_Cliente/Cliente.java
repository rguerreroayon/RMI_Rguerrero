/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author lv1013
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import rmi.RMI;
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException {
        
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",1000);
            RMI rmi = (RMI) registry.lookup("ServerMachine");
            System.out.println(rmi.saluda("Roberto"));
            System.out.println(rmi.suma(5, 5));
            
        }catch(RemoteException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
