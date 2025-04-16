import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        
       // List<Integer> nums = Arrays.asList(4,5,6,7,8);

       // Consumer<Integer> con = n ->  System.out.println(n);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));
        
        // int result = nums.stream()
        //             .filter(n -> n%2==0)
        //             .map(n ->n*2)
        //             .reduce(0,(c,e) -> c+e);

        int size = 10000;
        List<Integer> num1 = new ArrayList<>(size);

        Random ran = new Random();
        for(int i=1;i<=size;i++){
            num1.add(ran.nextInt(100));
        }

        long startseq = System.currentTimeMillis();
        int sum1 = num1.stream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum2 = num1.parallelStream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        long endPara = System.currentTimeMillis();

        System.out.println("seq: " + (endSeq - startseq));
        System.out.println("seq: " + (endPara - startPara));
       // nums.forEach( n ->  System.out.println(n));
    }
}
