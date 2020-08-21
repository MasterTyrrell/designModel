package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnerInvocationHander implements InvocationHandler {

    private PersonBean personBean;

    public NotOwnerInvocationHander(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if(methodName.startsWith("get")||"setHotOrNotRating".equals(methodName)){
            return method.invoke(personBean,args);
        }else if(methodName.startsWith("set")){
            throw new IllegalAccessException();
        }
        return null;
    }
}
