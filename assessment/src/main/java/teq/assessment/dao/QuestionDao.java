package teq.assessment.dao;

import teq.assessment.models.QuestionEntity;

import java.util.List;

public interface QuestionDao {


    void savePaper(QuestionEntity paper);

    List<QuestionEntity> getAllQuestions();


}
