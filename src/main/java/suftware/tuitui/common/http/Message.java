package suftware.tuitui.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
    private HttpStatus status;
    private String message;
    private String code;
    private Object data;

    public Message(){
        this.status = null;
        this.message = null;
        this.code = null;
        this.data = null;
    }

    public Message(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }
}
