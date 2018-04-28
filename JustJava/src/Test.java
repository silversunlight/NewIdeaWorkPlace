public class Test {
    public static int aMethod(int i) throws Exception {
        try {
            return 10/i;
        } catch (Exception ex) {
            throw new Exception("exception in a method");
        }finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        boolean flag=true;
        if (flag = true) {
            System.out.println("can run");
        }
        }
}
