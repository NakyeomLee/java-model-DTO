package ex01.dto;

// 1번 문제(App1의 main 참고)

import lombok.Data;
import ex01.model.Product;

@Data // getter setter toString 다 포함
public class ProductDTO {
    private int id; // 제품 id
    private String name; // 제품명(바지, 티)

    // 생성자
    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }
}