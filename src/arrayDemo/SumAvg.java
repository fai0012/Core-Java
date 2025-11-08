package arrayDemo;

public class SumAvg {
   
public static void main(String[] args) {
        int[] a = {2,4,6,8};
        int sum = 0;
        for (int v : a) sum += v;
        double avg = (double) sum / a.length;
        System.out.println("Sum=" + sum + " Avg=" + avg);
    }
}
