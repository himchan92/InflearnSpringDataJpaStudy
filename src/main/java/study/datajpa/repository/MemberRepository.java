package study.datajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

// <엔티티, PK 속성 파라미터>
// JPA CRUD 기본 제공
// CrudRepository ( CRUD ), JpaRepository ( CRUD + PAGING )
public interface MemberRepository extends JpaRepository<Member, Long> {
    //쿼리 메소드 기능 제공으로 자동 쿼리 지원하는데 문법이 맞아야 한다(자세한건 Spring Data Jpa 메뉴얼 사이트 참고) : findBy필드명And필드명GreaterThan
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    // @Query 이용해서 쿼리 바로 작성가능하여 실무에서 자주 사용
    // 서버 실행 시 철자, 문법 오타 있는경우 에러체크 뱉어주는 장점
    // 복잡한 쿼리문은 QueryDsl 필요
    @Query("select m from Member m where m.username = :username and m.age = :age")
    List<Member> findUser(@Param("username") String username, @Param("age") int age);
}