package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1013
 */
public interface RMI extends Remote{
    public String saluda(String nombre) throws RemoteException;
    public String suma(int val1,int val2) throws RemoteException;
}
