package proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicProxy {


    public static void main(String[] args) {

    }

    /**
     * 获取非本人的代理对象
     * @param personBean
     * @return
     */
    public PersonBean getNotOwenerProxy(PersonBean personBean){
        return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),new NotOwnerInvocationHander(personBean));
    }

    /**
     * 获取本人的代理对象
     * @param personBean
     * @return
     */
    public PersonBean getOwenerProxy(PersonBean personBean){
        return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),new OwnerInvocationHander(personBean));
    }
}
