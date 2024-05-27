package teq.assessment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teq.assessment.dto.ApiResponse;
import teq.assessment.dto.QuestionDto;
import teq.assessment.service.QuestionService;

@RestController
@RequestMapping("/questionpaper")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionPapeService;

    @PostMapping
    public ResponseEntity<ApiResponse> createQuestionPaper(@RequestBody QuestionDto questionDtopaperDto){
        return  questionPapeService.createQuestionPaper(questionDtopaperDto);
    }

   @GetMapping
    public ResponseEntity<ApiResponse> getAllQuestionsPaper(){
        return  questionPapeService.getAllQuestionsPaper();
    }

}
