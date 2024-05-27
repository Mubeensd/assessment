package teq.assessment.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@Document
public class UserEntity {
    @Id
    private String id;
    private String email;
    private String answerId;
    private int totalMarks;
    private double optainMarks;
    private double percentage;
    private  Map<String, String> wrongAnswers=new LinkedHashMap<>();


}
