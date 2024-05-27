package teq.assessment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import teq.assessment.models.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity,String> {
}
