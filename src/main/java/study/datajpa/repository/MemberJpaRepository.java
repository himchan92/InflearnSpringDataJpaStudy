package study.datajpa.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    //저장
    public Member save(Member member) {
        em.persist(member); //영속성 저장, 실제 DB 반영은 COMMIT 처리 필요
        return member;
    }

    // ID 기준 조회
    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
