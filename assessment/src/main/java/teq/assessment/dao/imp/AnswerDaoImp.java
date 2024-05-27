package teq.assessment.dao.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teq.assessment.dao.AnswerDao;
import teq.assessment.models.AnswerEntity;
import teq.assessment.repository.AnswerRepository;

@Service
@RequiredArgsConstructor
public class AnswerDaoImp implements AnswerDao {

    private  final AnswerRepository answerRepository;
    @Override
    public void storeAnswer(AnswerEntity answersPaper) {
        answerRepository.save(answersPaper);
    }

    @Override
    public AnswerEntity findAnswerPaper(String anwerPaperId) {
       return answerRepository.findById(anwerPaperId).orElse(null);
    }

    @Override
    public AnswerEntity evaluate(String userId) {
        return answerRepository.findById(userId).orElse(null);
    }
}
