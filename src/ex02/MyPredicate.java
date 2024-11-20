package ex02;

// 입력을 받아 논리값(boolean)을 반환
// generic(T)(boolean) 반환
public interface MyPredicate<T> {
    boolean test(T t);
}