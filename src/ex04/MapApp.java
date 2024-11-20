package ex04;

import java.util.Arrays;
import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        // 1. map (가공)
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 3글자 이상의 이름을 소문자로 바꿔보기
        // stream() : 데이터 뿌림
        // map(Funtion) : 가공 / 파라미터 안에 function 형태니까 입력을 받아서 결과를 반환
        // filter() : 중간 연산 => 무한으로 할 수 있음
        // toList()로 받아서 List<String>으로 설정
        List<String> newNames = names.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.length() > 3)
                .toList();
        System.out.println(newNames);
    }
}