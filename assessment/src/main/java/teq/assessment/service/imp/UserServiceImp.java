package teq.assessment.service.imp;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import teq.assessment.dao.UserDao;
import teq.assessment.dto.ApiResponse;
import teq.assessment.dto.UserDto;
import teq.assessment.models.UserEntity;
import teq.assessment.service.UserService;
import teq.assessment.util.CommomConstants;
import teq.assessment.util.ResponseUtil;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

   private final UserDao userDao;

  private final ModelMapper modelMapper;
   
    @Override
    public ResponseEntity<ApiResponse> createUser(UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        userDao.createUser(userEntity);
        return ResponseUtil.getCreatedResponse(CommomConstants.USER_GENRATED);
    }
}
