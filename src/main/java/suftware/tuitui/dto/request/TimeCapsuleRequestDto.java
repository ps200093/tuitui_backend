package suftware.tuitui.dto.request;

import lombok.*;
import suftware.tuitui.domain.Profile;
import suftware.tuitui.domain.TimeCapsule;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TimeCapsuleRequestDto {
    String writeUser;
    String content;
    String location;
    Integer remindDate;

    //  캡슐 생성에 사용
    public static TimeCapsule toEntity(TimeCapsuleRequestDto timeCapsuleRequestDto, Profile profile) {
        return TimeCapsule.builder()
                .profile(profile)
                .writeAt(new Timestamp(System.currentTimeMillis()))
                .updateAt(new Timestamp(System.currentTimeMillis()))
                .content(timeCapsuleRequestDto.getContent())
                .location(timeCapsuleRequestDto.getLocation())
                .remindDate(timeCapsuleRequestDto.getRemindDate())
                .build();
    }

    //  캡슐 업데이트에 사용
    public static TimeCapsule toEntity(TimeCapsuleRequestDto timeCapsuleRequestDto, Profile profile, Timestamp updateAt) {
        return TimeCapsule.builder()
                .profile(profile)
                .updateAt(updateAt)
                .content(timeCapsuleRequestDto.getContent())
                .location(timeCapsuleRequestDto.getLocation())
                .remindDate(timeCapsuleRequestDto.getRemindDate())
                .build();
    }
}
