package ex02;

// 입력을 받아서 결과를 반환
// 입력과 결과 다 필요하니까 generic 2개
public interface MyFunction<T,R> {
    R apply(T t);
}