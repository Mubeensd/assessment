package teq.assessment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import teq.assessment.models.AnswerEntity;

public interface AnswerRepository extends MongoRepository<AnswerEntity,String> {
}
