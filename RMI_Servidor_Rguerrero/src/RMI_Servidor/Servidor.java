/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author lv1013
 */
public class Servidor extends UnicastRemoteObject implements rmi.RMI{

    public Servidor() throws RemoteException{
        super();
    }
    
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("ServerMachine", new Servidor());
            System.out.println("Servidor iniciado");

        }catch(RemoteException e){
            System.out.println(e.getMessage());
        }
        
    }
    
   

    @Override
    public String saluda(String nombre) throws RemoteException {
        return "hola "+nombre+" !saludoitos desde el server RMI";
    }

    @Override
    public String suma(int valor1, int valor2) throws RemoteException {
        return String.valueOf(valor1+valor2);
    }
    
}
