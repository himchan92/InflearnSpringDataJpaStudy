package study.datajpa.repository;

import java.util.List;
import study.datajpa.entity.Member;

//사용자 정의 커스텀 JPA 인터페이스 : QueryDSL 많이 사용
public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
