package CrazyJava.lambda;

public class CommandTest2 {
    public static void main(String[] args) {
        ProcessArray pa=new ProcessArray();
        int[] array = {3, -4, 6, 4};
        pa.process(array,(int[] target)->{
            int sum=0;
            for (int tmp : target) {
                sum+=tmp;
            }
            System.out.println(sum);
        });
    }
}
