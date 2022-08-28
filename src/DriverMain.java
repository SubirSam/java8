import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class DriverMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee e1 = new Employee();
        if(e1.getClass().isAnnotationPresent(sam.class)){
            e1.getClass().getMethod("display").invoke(e1);
        }

        Employee e2 = new Employee("saptarshi","12",30);

        System.out.println(Arrays.stream(e1.getClass().getMethods()).filter(s->s.isAnnotationPresent(samInMethod.class))
                .findAny().get().invoke(e2));

        /*if(Arrays.stream(e1.getClass().getDeclaredFields()).filter(s->s.isAnnotationPresent(samInField.class))
                .findAny().get().getInt(e2) > 30){
            throw new RuntimeException();
        }else{
            int value = Arrays.stream(e1.getClass().getDeclaredFields()).filter(s->s.isAnnotationPresent(samInField.class))
                    .findAny().get().getInt(e2);
            System.out.println(value);
        }*/

        int count = Arrays.stream(e1.getClass().getDeclaredFields()).filter(s->s.isAnnotationPresent(samInField.class))
                .findAny().get().getAnnotation(samInField.class).value();
        for(int i=0;i<count;i++){
            System.out.println(Arrays.stream(e1.getClass().getDeclaredFields()).filter(s->s.isAnnotationPresent(samInField.class))
                    .findAny().get().getInt(e2));
        }
    }
}
