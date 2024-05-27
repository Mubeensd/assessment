package teq.assessment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teq.assessment.dto.AnswerDto;
import teq.assessment.dto.ApiResponse;
import teq.assessment.service.AnswerService;

@RestController
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerCotroller {

    private final AnswerService answerService;

    @PostMapping
    public ResponseEntity<ApiResponse> storeAnswerPaper(@RequestBody AnswerDto answerDto){
        return answerService.storeAnswerPaper(answerDto);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ApiResponse> evaluate(@PathVariable String userId){
        return answerService.evaluate(userId);
    }


}
