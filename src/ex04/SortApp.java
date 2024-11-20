package ex04;

import java.util.Arrays;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        // 1. Sort (정렬), distinct (중복 제거)
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2, 5);

        // stream() : 데이터 뿌림
        // sorted() : 정렬
        // distinct() : 중복제거
        nums.stream()
                .sorted()
                .distinct()
                .forEach(integer -> System.out.println(integer));

    }
}