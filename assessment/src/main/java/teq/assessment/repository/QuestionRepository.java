package teq.assessment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import teq.assessment.models.QuestionEntity;

public interface QuestionRepository extends MongoRepository<QuestionEntity,String> {

}
