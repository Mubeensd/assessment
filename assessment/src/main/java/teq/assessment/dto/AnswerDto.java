package teq.assessment.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Map;

@Data
public class AnswerDto {
    @Id
    private String id;
    Map<String, String> userAnswers;
    private String userId;

}
