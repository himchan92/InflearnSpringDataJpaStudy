package study.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //예제를 위해 설정했으니 실무에서는 외부에서 값변경허용해주면 안좋으니 권장하지 않음
@Entity
public class Member {

    @Id
    @GeneratedValue // JPA 자동 시퀀스 부여
    private Long id;
    private String username;

    //기본생성자 있어야되는데 private 로 하면 프록시 등 기술구현접근이 안되어 protected 까지 허용해야함
    protected Member() {}

    public Member(String username) {
        this.username = username;
    }
}
