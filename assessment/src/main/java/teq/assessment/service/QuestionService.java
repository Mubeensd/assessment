package teq.assessment.service;

import org.springframework.http.ResponseEntity;
import teq.assessment.dto.ApiResponse;
import teq.assessment.dto.QuestionDto;

public interface QuestionService {
    ResponseEntity<ApiResponse>createQuestionPaper(QuestionDto questionDto);

    ResponseEntity<ApiResponse> getAllQuestionsPaper();

}
