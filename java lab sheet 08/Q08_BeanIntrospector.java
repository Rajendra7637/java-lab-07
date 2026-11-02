import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class Q08_BeanIntrospector {
    public static void main(String[] args) {
        System.out.println("=== Q08: Introspector on StudentBean ===");
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(StudentBean.class, Object.class);

            System.out.println("\n--- Properties of StudentBean ---");
            for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property: " + pd.getName() 
                    + " | Type: " + pd.getPropertyType().getSimpleName()
                    + " | Getter: " + (pd.getReadMethod() != null ? pd.getReadMethod().getName() : "none")
                    + " | Setter: " + (pd.getWriteMethod() != null ? pd.getWriteMethod().getName() : "none"));
            }

            System.out.println("\n--- Methods of StudentBean ---");
            for (MethodDescriptor md : beanInfo.getMethodDescriptors()) {
                System.out.println("Method: " + md.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
