package ex04;

import java.util.Arrays;
import java.util.List;

public class CountApp {
    public static void main(String[] args) {
        // 1. count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // stream() : 데이터 뿌림
        // filter(Predicate) : 중간 연산(주로 검색과 삭제 수행)
        // => 파라미터 안에 Predicate 형태니까 입력을 받아 논리값(boolean)을 반환
        // toList()로 받아서 List<String>으로 설정
        List<String> r1 = names.stream()
                .filter(name -> name.length() > 3)
                .toList();

        // forEach(Consumer) :
        // => 파라미터 안에 Consumer 형태니까
        r1.forEach(s -> System.out.println(s));

        // count() : long타입을 리턴
        long r2 = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println(r2);
    }
}