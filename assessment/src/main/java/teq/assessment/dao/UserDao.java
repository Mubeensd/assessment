package teq.assessment.dao;

import teq.assessment.models.UserEntity;

public interface UserDao {
   void createUser(UserEntity userEntity);

   UserEntity getUser(String id);

   void saveUser(UserEntity user);

}
