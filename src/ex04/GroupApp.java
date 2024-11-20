package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupApp {
    public static void main(String[] args) {
        // 1. group
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // Map<Character, List<String>> : 그룹의 이름(key값), 컬렉션(리스트, 맵 등)
        // => var로 바꿀 수 있음
        // map() : 가공
        // collect(Collectors.groupingBy()) : 수집, 같은 항목끼리 구분함
        // 이 경우 문자열을 대문자로 바꿔서 첫 글자가 같은 것끼리 구분함
        var groupData = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupData);

        System.out.println(groupData.get('A'));

    }
}