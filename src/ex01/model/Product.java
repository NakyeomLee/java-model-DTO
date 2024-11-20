package ex01.model;

public class Product {
    private int id; // 제품 id
    private String name; // 제품명(바지, 티)

    // 생성자
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}