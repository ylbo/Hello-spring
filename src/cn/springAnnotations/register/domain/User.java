package cn.springAnnotations.register.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter@Setter@ToString
@Component
public class User {

    private Long id;
    @Value("test")
    private String name;
    @Value("18")
    private int age;

}
