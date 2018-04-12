package CrazyJava.lambda;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa=new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        System.out.println("-------------------");
        pa.process(target, new AddCommand());
    }

    private static class PrintCommand implements Command {

        @Override
        public void process(int[] target) {
            for (int tmp : target) {
                System.out.println(tmp+" ");
            }
        }
    }

    private static class AddCommand implements Command {
        @Override
        public void process(int[] target) {
            int sum=0;
            for (int tmp : target) {
                sum+=tmp;
            }
            System.out.println(sum);
        }
    }
}
