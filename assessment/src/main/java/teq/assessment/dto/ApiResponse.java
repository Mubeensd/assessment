package teq.assessment.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {
    private Object response;
    private HttpStatus status;
    private int statusCode;
}

