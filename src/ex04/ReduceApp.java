package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        // 1. reduce (조인)
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        // stream() : 데이터 뿌림
        // mapToInt() : 가공 / 이 경우 똑같이 돌면서 int 타입으로 반환
        int sum = nums.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);

        // 5는 초기값 
        int sum2 = nums.stream()
                .reduce(5, (prev, next) -> {
                    System.out.println("prev: " + prev);
                    System.out.println("next: " + next);
                    System.out.println("========================");
                    return prev + next;
                });
        System.out.println(sum2);
        
        // reduce() 안의 람다식에 중괄호{} 제외한 버전
        // 중괄호 제외하면 반환값에 return 붙을 필요 없음
        int sum3 = nums.stream()
                .reduce(5, (prev, next) -> prev + next);
        System.out.println(sum3);

    }
}