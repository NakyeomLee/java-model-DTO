package ex01.dto;

// 2번 문제(App1의 main 참고)

import lombok.Data;
import ex01.model.ProductOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDetailDTO {

    private int productId;
    private String productName;

    private List<ProductOptionDTO> options = new ArrayList<>();

    // 생성자
    public ProductDetailDTO(List<ProductOption> options) {
        this.productId = options.get(0).getProduct().getId();
        this.productName = options.get(0).getProduct().getName();
        
        // for-each문으로 순회
        // models(ProductOption)를 dtos에 옮기기
        for (ProductOption option : options) {
            this.options.add(new ProductOptionDTO(option));
        }
    }

    @Data
    class ProductOptionDTO {
        private int id; // 옵션 id
        private String name; // 옵션명
        private int price; // 가격
        private int qty; // 수량(qantity)

        // 생성자
        // ProductOption의 정보를 통째로 가져옴 (생성자의 파라미터)
        public ProductOptionDTO(ProductOption option) {
            this.id = option.getId();
            this.name = option.getName();
            this.price = option.getPrice();
            this.qty = option.getQty();
        }
    }
}