package Day2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Abcd99{
static void met(int x)
{
System.out.println(x);
}

static void met(String x) {
System.out.println(x);
}
}
public class Assignment2 {




public static void main(String[] args)
{
List<Integer> list = Arrays.asList(3, 4, 15, 6, 12, 20);

Predicate<Integer> gtTen = (i) -> i > 10;
Predicate<Integer> ltTwenty = (i) -> i < 21;
System.out.println("Numbers Greater Than Ten:");
list.stream().filter(gtTen.and(ltTwenty)).forEach(Abcd99::met);
System.out.println();

System.out.println("Numbers Less Than Ten:");
list.stream().filter(gtTen.and(ltTwenty).negate()).forEach(Abcd99::met);
System.out.println();

List<String> list1 = Arrays.asList("shubham", "pratik", "Pravin", "Tushar", "Amol", "Zen");
Predicate<String> nameA = p -> p.contains("A");
Predicate<String> letterA = Predicate.isEqual("A");
System.out.println("Names with A:");
list1.stream().filter(nameA.or(letterA)).forEach(Abcd99::met);
System.out.println();

}
}