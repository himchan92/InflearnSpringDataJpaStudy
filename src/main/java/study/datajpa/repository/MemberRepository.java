package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

// 엔티티, PK 속성 파라미터
// JPA CRUD 기본 제공
public interface MemberRepository extends JpaRepository<Member, Long> {

}
