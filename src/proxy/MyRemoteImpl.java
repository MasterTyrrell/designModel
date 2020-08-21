package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException{

    }

    public String sayHello() throws RemoteException {
        return "Hello,client";
    }

    public static void main(String[] args) {
        try{
            MyRemote remote = new MyRemoteImpl();
            Naming.bind("RemoteHello",remote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
