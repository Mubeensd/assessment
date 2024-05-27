package teq.assessment.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssessmentConfiguration {
    @Bean
    public ModelMapper getMoldelMapper(){
        return new ModelMapper();
    }
}
