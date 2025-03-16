package study.datajpa.repository;

import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import study.datajpa.entity.Member;

@RequiredArgsConstructor //final 필드 대상 DI 지원(실무에서 권장)
public class MemberRepositoryImpl implements MemberRepositoryCustom { //레포지토리명Impl 명명규칙만 지켜줘야 사용자정의로직 연동적용되니 참고!!

    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m")
            .getResultList(); //여러 건 조회
    }
}
