package teq.assessment.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document
public class AnswerEntity extends BaseEnity{
   @Id
    private String id;
    Map<String, String> userAnswers;
    private String userId;

}
