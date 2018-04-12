import DynamicProgramming.MemorySearch;
import DynamicProgramming.ViolentSearch;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 1};
        int aim = 1000;
        MemorySearch ms = new MemorySearch();
        System.out.println(ms.coins(arr, aim));
//        ViolentSearch vs=new ViolentSearch();
//        System.out.println(vs.coins(arr, aim));
    }
}
