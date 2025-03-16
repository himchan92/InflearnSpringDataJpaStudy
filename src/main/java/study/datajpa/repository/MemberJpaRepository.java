package study.datajpa.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    /*
        Spring Data Jpa 인터페이스에는 아래 메소드를 기본 제공하고 있다.
        제공되는 함수를 그냥 쓰면 원리를 이해못하니 직접 순수 JPA 메소드로 구현
     */
    //저장
    public Member save(Member member) {
        em.persist(member); //영속성 저장, 실제 DB 반영은 COMMIT 처리 필요
        return member;
    }

    //삭제
    public void delete(Member member) {
        em.remove(member);
    }

    public List<Member> findAll() {
        // JPQL : 엔티티 테이블 대상 SQL
        return em.createQuery("select m from Member m", Member.class)
            .getResultList(); //여러건 조회
    }

    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member); //null 체크
    }

    public long count() {
        return em.createQuery("select count(m) from Member m", Long.class)
            .getSingleResult(); //단건 조회 시
    }

    // ID 기준 조회
    public Member find(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findByUsernameAndAgeGreaterThan(String username, int age) {
        return em.createQuery("select m from Member m where m.username = :username and m.age > :age")
                .setParameter("username", username)
                .setParameter("age", age)
                .getResultList();
    }
}
