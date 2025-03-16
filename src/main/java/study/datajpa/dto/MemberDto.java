package study.datajpa.dto;

import lombok.Data;

@Data //실무에서는 setter 까지 포함하기에 비추
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
