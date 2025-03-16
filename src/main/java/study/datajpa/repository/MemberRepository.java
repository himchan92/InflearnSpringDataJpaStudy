package study.datajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

// <엔티티, PK 속성 파라미터>
// JPA CRUD 기본 제공
// CrudRepository ( CRUD ), JpaRepository ( CRUD + PAGING )
public interface MemberRepository extends JpaRepository<Member, Long> {
    //쿼리 메소드 기능 제공으로 자동 쿼리 지원하는데 문법이 맞아야 한다(자세한건 Spring Data Jpa 메뉴얼 사이트 참고) : findBy필드명And필드명GreaterThan
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);
}