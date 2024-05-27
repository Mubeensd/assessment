package teq.assessment.service.imp;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import teq.assessment.dao.AnswerDao;
import teq.assessment.dao.QuestionDao;
import teq.assessment.dao.UserDao;
import teq.assessment.dto.AnswerDto;
import teq.assessment.dto.ApiResponse;
import teq.assessment.models.AnswerEntity;
import teq.assessment.models.QuestionEntity;
import teq.assessment.models.UserEntity;
import teq.assessment.service.AnswerService;
import teq.assessment.util.CommomConstants;
import teq.assessment.util.ResponseUtil;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnswerServiceImp implements AnswerService {

    private final AnswerDao answerDao;

    private final QuestionDao questionDao;

    private final UserDao userDao;

    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<ApiResponse> storeAnswerPaper(AnswerDto answerDto) {
        answerDto.setId(UUID.randomUUID().toString());
        AnswerEntity answerEntity = modelMapper.map(answerDto, AnswerEntity.class);
        answerEntity.setCreatedDateTime();
        answerEntity.setModifiedDateTime();
        UserEntity user = userDao.getUser(answerEntity.getUserId());
        user.setAnswerId(answerEntity.getId());
        userDao.saveUser(user);
        answerDao.storeAnswer(answerEntity);

        return ResponseUtil.getCreatedResponse(answerEntity);
    }

    @Override
    public ResponseEntity<ApiResponse> evaluate(String userID) {
        UserEntity user = userDao.getUser(userID);

        AnswerEntity answerEntity = answerDao.evaluate(user.getAnswerId());

        Map<String, String> userAnswers = answerEntity.getUserAnswers();
        List<QuestionEntity> questions = questionDao.getAllQuestions();

        double score =CommomConstants.DEFAULT_VALUE;
        for (QuestionEntity question : questions) {

            if (userAnswers.get(question.getId()).equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
            }else{
                user.getWrongAnswers().put(question.getId(),question.getQusetion());
                user.getWrongAnswers().put(CommomConstants.CORRECT_ANSWER+question.getCorrectAnswer(),CommomConstants.YOUR_ANSWER+userAnswers.get(question.getId()));



            }
        }
        user.setTotalMarks(questions.size());
        user.setOptainMarks(score);
        user.setPercentage(score/questions.size()*100);
        userDao.saveUser(user);
        return ResponseUtil.getOkResponse(user);
    }

}
