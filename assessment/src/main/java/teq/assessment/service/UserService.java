package teq.assessment.service;

import org.springframework.http.ResponseEntity;
import teq.assessment.dto.ApiResponse;
import teq.assessment.dto.UserDto;

public interface UserService {
    ResponseEntity<ApiResponse> createUser(UserDto userDto);
}
