package teq.assessment.service;

import org.springframework.http.ResponseEntity;
import teq.assessment.dto.AnswerDto;
import teq.assessment.dto.ApiResponse;

public interface AnswerService {


    ResponseEntity<ApiResponse> storeAnswerPaper(AnswerDto answerPaperDto);

    ResponseEntity<ApiResponse> evaluate(String userId);
}
