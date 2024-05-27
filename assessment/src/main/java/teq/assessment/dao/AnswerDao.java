package teq.assessment.dao;


import teq.assessment.models.AnswerEntity;

public interface AnswerDao {
    void storeAnswer(AnswerEntity answersPaper);

    AnswerEntity findAnswerPaper(String anwerPaperId);

    AnswerEntity evaluate(String userId);
}
