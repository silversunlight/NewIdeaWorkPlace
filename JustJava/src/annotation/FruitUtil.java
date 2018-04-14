package annotation;


import java.lang.reflect.Field;

public class FruitUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "水果名称： ";
        String strFruitProvider = "供应商信息： ";

        Field[] fields=clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider="供应商编号："+fruitProvider.id()+"供应商名： "+
                        fruitProvider.name()+"供应商地址： "+fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
