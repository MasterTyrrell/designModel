package singleton;

/**
 * 初始化中创建单例
 */
public class EarlySingleton {
    private static EarlySingleton instance = new EarlySingleton();

    private EarlySingleton(){

    }

    public static EarlySingleton getInstance(){
        return instance;
    }
}
