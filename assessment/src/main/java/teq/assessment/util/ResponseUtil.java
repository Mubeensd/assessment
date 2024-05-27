package teq.assessment.util;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import teq.assessment.dto.ApiResponse;

@Component
@RequiredArgsConstructor
public class ResponseUtil {

    private  static ApiResponse initialize(){
        return new ApiResponse();
    }

    public static ResponseEntity<ApiResponse> getOkResponse(Object object){
        ApiResponse apiResponse=initialize();
        apiResponse.setResponse(object);
        apiResponse.setStatus(HttpStatus.OK);
        apiResponse.setStatusCode(HttpStatus.OK.value());
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

    }

    public static ResponseEntity<ApiResponse> getBadRequest(Object object){
        ApiResponse apiResponse=initialize();
        apiResponse.setResponse(object);
        apiResponse.setStatus(HttpStatus.BAD_REQUEST);
        apiResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

    }

    public static ResponseEntity<ApiResponse> getCreatedResponse(Object object){
        ApiResponse apiResponse=initialize();
        apiResponse.setResponse(object);
        apiResponse.setStatus(HttpStatus.CREATED);
        apiResponse.setStatusCode(HttpStatus.CREATED.value());
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);

    }

}
