package ex01.model;

public class Order {
    private int id; // 주문 번호(id)

    // 생성자
    public Order(int id) {
        this.id = id;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}