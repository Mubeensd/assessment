package teq.assessment.service.imp;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import teq.assessment.dao.QuestionDao;
import teq.assessment.dto.ApiResponse;
import teq.assessment.dto.QuestionDto;
import teq.assessment.models.QuestionEntity;
import teq.assessment.service.QuestionService;
import teq.assessment.util.ResponseUtil;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImp implements QuestionService {

    private  final QuestionDao questionDao;

    private  final ModelMapper modelMapper;


    @Override
    public ResponseEntity<ApiResponse> createQuestionPaper(QuestionDto questionDto) {
              QuestionEntity qustionPaperEntity =modelMapper.map(questionDto, QuestionEntity.class);
              qustionPaperEntity.setCreatedDateTime();
              qustionPaperEntity.setModifiedDateTime();
              questionDao.savePaper(qustionPaperEntity);
             return  ResponseUtil.getOkResponse(qustionPaperEntity);

    }

    @Override
    public ResponseEntity<ApiResponse> getAllQuestionsPaper() {
        List<QuestionEntity> questions = questionDao.getAllQuestions();
        return ResponseUtil.getOkResponse(questions);
    }




}
