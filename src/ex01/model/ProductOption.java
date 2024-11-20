package ex01.model;

public class ProductOption {
    private int id; // 옵션 id
    private String name; // 옵션명
    private int price; // 가격
    private int qty; // 수량(qantity)

    private Product product; // DB에서는 product_id가 될것(fk)

    // 생성자
    public ProductOption(int id, String name, int price, int qty, Product product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.product = product;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}