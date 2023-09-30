package hello.capstone.exception.car;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OwnerMismatchException extends  RuntimeException{

    private String message;

    public OwnerMismatchException(String message) {
        super(message);
        this.message = message;
    }
}
