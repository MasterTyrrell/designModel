package singleton;

/**
 * 同步法（synchronized）单例模式
 */
public class SynchronizedSinleton {

    private static SynchronizedSinleton instance;

    private SynchronizedSinleton(){

    }

    public static synchronized SynchronizedSinleton  getInstance(){
        if(instance==null ){
            instance= new SynchronizedSinleton();
        }
        return instance;
    }
}
