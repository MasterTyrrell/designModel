package singleton;

/**
 * 双重检查锁
 */
public class VolatileSinleton {
    private static volatile VolatileSinleton instance;

    private VolatileSinleton(){

    }

    public static VolatileSinleton getInstance(){
        if(instance==null){
            synchronized (VolatileSinleton.class){
                if(instance==null){
                    instance = new VolatileSinleton();
                }
            }
        }
        return instance;
    }
}
