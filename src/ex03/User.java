package ex03;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // 풀 생성자
@Data // getter setter 등 다 포함
public class User {
    private int id;
    private String userName;
}