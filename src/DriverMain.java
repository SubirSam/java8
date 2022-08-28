import java.lang.reflect.InvocationTargetException;

public class DriverMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee e1 = new Employee();
        if(e1.getClass().isAnnotationPresent(sam.class)){
            e1.getClass().getMethod("display").invoke(e1);
        }
    }
}
