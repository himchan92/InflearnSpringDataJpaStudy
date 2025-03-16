package study.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter //예제를 위해 설정했으니 실무에서는 외부에서 값변경허용해주면 안좋으니 권장하지 않음
@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본생성자 protected 범위까지 생성(private로 하면 접근이 안되어 구현 힘듬)
//@ToString(of = {"id", "username", "age"})
public class Member {

    @Id
    @GeneratedValue // JPA 자동 시퀀스 부여
    @Column(name = "member_id") //테이블은 관례상 언더바(_) 넣어서 설정함
    private Long id;

    private String username;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY) //실무에서 모든 연관관게는 LAZY로 설정 권장
    @JoinColumn(name = "team_id")
    private Team team;

    public Member(String username, int age) {
        this.username = username;
    }

    public Member(String username) {
        this.username = username;
    }

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if(team != null) {
            changeTeam(team);
        }
    }

    public void changeTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }
}