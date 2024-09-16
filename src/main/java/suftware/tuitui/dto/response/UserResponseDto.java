package suftware.tuitui.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import suftware.tuitui.domain.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseDto {
    Integer userId;
    String account;
    //  String role;
    String snsType;
    //  String password;
    //  String phone;
    //  String name;
    String accountCreatedDate;

    public static UserResponseDto toDTO(User user){
        return UserResponseDto.builder()
                .userId(user.getUserId())
                //  .role(user.getRole().getValue())
                .snsType(user.getSnsType())
                .account(user.getAccount())
                //  .password(user.getPassword())
                //  .phone(user.getPhone())
                //  .name(user.getName())
                .accountCreatedDate(user.getCreatedAt().toString())
                .build();
    }
}
