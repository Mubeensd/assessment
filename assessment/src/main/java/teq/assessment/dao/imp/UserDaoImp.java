package teq.assessment.dao.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teq.assessment.dao.UserDao;
import teq.assessment.models.UserEntity;
import teq.assessment.repository.UserRepository;
import teq.assessment.util.CommomConstants;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserDaoImp implements UserDao {

    private final UserRepository userRepository;


    @Override
    public void createUser(UserEntity userEntity) {
         userRepository.save(userEntity);
    }


    @Override
    public UserEntity getUser(String id) {
        return userRepository.findById(id).orElseThrow(()->new NoSuchElementException(CommomConstants.USER_NOT_FOUND));
    }

    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }


}
