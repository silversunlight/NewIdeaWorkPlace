package annotation;


import java.lang.reflect.Field;

public class FruitUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "ˮ�����ƣ� ";
        String strFruitProvider = "��Ӧ����Ϣ�� ";

        Field[] fields=clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider="��Ӧ�̱�ţ�"+fruitProvider.id()+"��Ӧ������ "+
                        fruitProvider.name()+"��Ӧ�̵�ַ�� "+fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
