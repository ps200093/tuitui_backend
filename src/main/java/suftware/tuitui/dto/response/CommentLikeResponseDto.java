package suftware.tuitui.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import suftware.tuitui.domain.CommentLike;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentLikeResponseDto {
    Integer commentLikeId;
    Integer profileId;
    Integer commentId;

    public static CommentLikeResponseDto toDto(CommentLike commentLike){
        return CommentLikeResponseDto.builder()
                .commentLikeId(commentLike.getCommentLikeId())
                .commentId(commentLike.getComment().getCommentId())
                .profileId(commentLike.getProfile().getProfileId())
                .build();
    }
}
