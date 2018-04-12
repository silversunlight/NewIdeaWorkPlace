package CrazyJava.lambda;

interface Eatable {
    void taste();
}

interface Flyable{
    void fly(String weather);
}
interface Addable{
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f) {
        System.out.println("i'm driving: " + f);
        f.fly("sunny day");
    }

    public void test(Addable add) {
        System.out.println("5 plus 3 result is : " + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq=new LambdaQs();
        lq.eat(() -> System.out.println("apple tastes good!"));
        lq.drive(weather -> {
            System.out.println("today's weather is: " + weather);
            System.out.println("helicopter flies well");
        });
        lq.test((a,b)->a+b);
    }
}
