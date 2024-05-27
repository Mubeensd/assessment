package teq.assessment.dto;

import lombok.Data;

import java.util.List;
@Data
public class QuestionDto {
    private String id;
    private String qusetion;
    private List<String> options;
    private String correctAnswer;

}
