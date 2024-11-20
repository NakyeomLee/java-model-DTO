package ex03;

// 옵셔널 : null 처리 (null 체크를 간결하게 작성하고, 안전한 코드를 만들 수 있음)

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        String data1 = null;
        // ofNullable : null이 가능한
        Optional<String> op1 = Optional.ofNullable(data1);

        // isPresent : 값이 존재하는지 확인
        if (op1.isPresent()) {
            // get() : 옵셔널에 있는 값 반환, 값이 없으면 NoSuchElementException 발생
            // isPresent 있을때만 쓸 수 있음
            String r1 = op1.get();
            System.out.println("r1" + r1);
        }

        String data2 = null;
        // null이면 무엇을 공급해주는가? => "없음"
        // orElseGet(Supplier) : 값이 존재하지 않을 때 Supplier에서 값 반환받음(값 없을 때만 계산)
        // orElseGet() 안의 람다식(() -> {})의 ()안에 매개변수가 없는 이유?
        // => supplier이기 때문 (입력 없이 값 반환해줌, 입력이 없으니 매개변수가 없음)
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "없음");
        System.out.println("r2" + r2);

        String data3 = null;
        // orElseThrow(Supplier) : 값이 없을 때 지정된 예외 발생
        // 이 경우 RuntimeException이 일어나도록 설계(예외발생시 출력될 메세지 설정 가능)
        String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("값이 없음. 조심."));
        System.out.println("r3" + r3);
    }
}