package teq.assessment.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@Document
public class QuestionEntity extends BaseEnity {
    @Id
    private String id;
    private String qusetion;
    private List<String> options;
    private String correctAnswer;

}
