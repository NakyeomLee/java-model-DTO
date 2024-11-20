package ex02;

// 1. 람다는 인터페이스로 만듦
// 2. 인터페이스에서는 메소드가 하나만 존재해야 함
// 3. 메소드가 인터페이스를 매개변수로 받고 있으면, 행위를 주세요!!
// 4. 람다에서는 매개변수에 타입을 생략 가능
// 5. @FunctionalInterface(런타임 실행) 표시 가능

public class App {
    public static void main(String[] args) {
        // 람다식 : () -> {}
        // 4-1. ()안은 매개변수인데 괄호를 해도 되고 안해도 되고
        // 물론 값(매개변수)이 없으면 괄호 있어야함
        MyConsumer<Integer> r1 = (data) -> {
            System.out.println("소비할 데이터 : " + data);
        };
        r1.accept(1);

        // 람다표현식 : 표현식은 무조건 반환(return)이 됨
        MySupplier<String> r2 = () -> {
            return "good";
        };
        // 람다표현식은 중괄호와 return을 생략해도 자동 반환(return)이 됨
        MySupplier<String> r3 = () -> "good";
        String msg = r3.get();
        System.out.println(msg);
    }
}