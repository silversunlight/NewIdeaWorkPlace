package annotation;

public class Apple {
    @FruitName("Apple")
    private String appleName;
@FruitProvider(id=1,name="�����츻ʿ����",address = "����۴��������·")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;

    }

    public void displayName() {
        System.out.println("ˮ���������ǣ� ƻ��");
    }
}
