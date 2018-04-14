package annotation;

public class Apple {
    @FruitName("Apple")
    private String appleName;
@FruitProvider(id=1,name="陕西红富士集团",address = "宁波鄞州区江南路")
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
        System.out.println("水果的名字是： 苹果");
    }
}
