package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHander implements InvocationHandler {

    private PersonBean personBean;

    public OwnerInvocationHander(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if(methodName.startsWith("get")){
            return method.invoke(personBean,args);
        }else if("setHotOrNotRating".equals(methodName)){
            throw new IllegalAccessException();
        }else if(methodName.startsWith("set")){
            return method.invoke(personBean,args);
        }
        return null;
    }
}
