package Stream;

import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        Character[] chars = {'D', 'B', 'A', 'C'};
        System.out.println(Stream.of(chars).sorted().findFirst().get());

        System.out.println(Stream.of(chars).sorted(java.util.Comparator.reverseOrder()).findFirst().get());

        System.out.println(Stream.of(chars).limit(2).sorted().findFirst().get());

        System.out.println(Stream.of(chars).distinct().skip(2).filter(e -> e > 'A').findFirst().get());

        System.out.println(Stream.of(chars).max(Character::compareTo).get());

        System.out.println(Stream.of(chars).max(java.util.Comparator.reverseOrder()).get());

        System.out.println(Stream.of(chars).filter(e -> e > 'A').findFirst().get());

        System.out.println(Stream.of(chars).allMatch(e -> e >= 'A'));

        System.out.println(Stream.of(chars).anyMatch(e -> e > 'F'));

        System.out.println(Stream.of(chars).noneMatch(e -> e > 'F'));

        Stream.of(chars).map(e -> e + "").map(e -> e.toLowerCase()).forEach(System.out::println);
    }
}
