package proxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {

    public static void main(String[] args) {
//        new MyRemoteClient().go();
         new MyRemoteClient().go2();

    }

    public void go(){
        try {
            MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void go2(){
        try {
            String serverIp = "localhost";
            int listenPort = 12345;
            String serverUrl = serverIp+":"+listenPort;
            Registry registry = LocateRegistry.getRegistry(serverIp,listenPort);
            MyRemote remote = (MyRemote)registry.lookup("MyHello");
            System.out.println(remote.sayHello());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
