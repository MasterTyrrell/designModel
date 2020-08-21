package proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmoteServer {

    public static void main(String[] args) {
        try {
            MyRemote remote = new MyRemoteImpl();
            String serverIp = "localhost";
            int listenPort = 12345;
            String serverUrl = serverIp+":"+listenPort;
            Registry registry = LocateRegistry.createRegistry(listenPort);

            registry.bind("MyHello",remote);
            System.out.println("sever启动成功");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
