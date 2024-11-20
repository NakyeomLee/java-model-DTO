package ex02;

// 입력 없이 값을 반환(return)
// 입력이 없으니 매개변수도 없음 => 반환은 해야하니까 generic 필요
@FunctionalInterface
public interface MySupplier<T> {
    T get();
}