import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass1 {

    public static void main(String[] args) {

        List<String> num = Arrays.asList("mike", "adam", "mike", "stallin");
        List<String> data1 = num.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        List<String> data2 = num.stream().filter(s -> s.equals("mike")).collect(Collectors.toList());
        List<String> data3 = num.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }

    }


