import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class DriverMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee e1 = new Employee();
        if(e1.getClass().isAnnotationPresent(sam.class)){
            e1.getClass().getMethod("display").invoke(e1);
        }

        Employee e2 = new Employee("saptarshi","12",29);

        System.out.println(Arrays.stream(e1.getClass().getMethods()).filter(s->s.isAnnotationPresent(samInMethod.class))
                .findAny().get().invoke(e2));
    }
}
