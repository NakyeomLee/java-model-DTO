package ex01.dto;

// 3번 문제(App1의 main 참고)
// 4번 문제(App1의 main 참고)

import lombok.Data;
import ex01.model.OrderOption;

import java.util.*;

@Data
public class OrderDetailDTO {

    private int orderId;
    private List<OrderProductDTO> products = new ArrayList<>();
    private int sumPrice;

    // 생성자
    public OrderDetailDTO(List<OrderOption> options) {

        // 1. orderId
        this.orderId = options.get(0).getOrder().getId();

        // 2. sumPrice
        // options의 크기만큼 OrderOption 순회해서 정보 가져와서 합연산
        for (OrderOption option : options) {
            this.sumPrice += option.getTotalPrice();
        }

        // 3. products
        // 3-1. 주문 옵션들 productId [1,1,2] -> [1,2] 2개 만들기
        Set<Integer> ids = new HashSet<>(); // Set은 중복을 알아서 제거해줌
        for (OrderOption option : options) {
            ids.add(option.getProduct().getId()); // [1,2]를 들고있게됨
        }

        // 3-2. 중복된 상품의 크기만큼 반복하면서 주문 옵션 추가하기
        // ids의 크기(이 경우 2)만큼 순회
        for (Integer id : ids) {
            List<OrderOption> temp = new ArrayList<>();

            for (OrderOption option : options) {
                // if문의 중괄호 생략하고 간소화
                if (id == option.getProduct().getId()) temp.add(option);
            }

            OrderProductDTO product = new OrderProductDTO(temp);
            products.add(product);
        }
    }

    @Data
    class OrderProductDTO {
        private int productId;
        private List<OrderOptionDTO> options = new ArrayList<>();

        public OrderProductDTO(List<OrderOption> options) {
            this.productId = options.get(0).getProduct().getId(); // OrderOprion의 fk인 Product의 id
            
            // options의 크기만큼 OrderOption 순회해서 정보 가져옴
            for (OrderOption option : options) {
                this.options.add(new OrderOptionDTO(option));
            }
        }

        @Data
        class OrderOptionDTO {
            private int id; // 주문 옵션 id
            private String optionName; // 주문 옵션명
            private int qty; // 주문량
            private int totalPrice; // 주문 금액

            public OrderOptionDTO(OrderOption option) {
                this.id = option.getId();
                this.optionName = option.getOptionName();
                this.qty = option.getQty();
                this.totalPrice = option.getTotalPrice();
            }
        }
    }
}