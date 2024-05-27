package teq.assessment.dao.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teq.assessment.dao.QuestionDao;
import teq.assessment.models.QuestionEntity;
import teq.assessment.repository.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionDaoImp implements QuestionDao {

    private final QuestionRepository questionRepository;


    @Override
    public void savePaper(QuestionEntity  questionEntity) {
         questionRepository.save(questionEntity);
    }

    @Override
    public List<QuestionEntity> getAllQuestions() {
     return  questionRepository.findAll();
    }




}
