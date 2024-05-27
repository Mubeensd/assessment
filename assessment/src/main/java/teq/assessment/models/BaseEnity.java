package teq.assessment.models;


import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data

public class BaseEnity {

    private  String createdDateTime;
    private  String modefiedDateTime;

    public void setCreatedDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        createdDateTime=simpleDateFormat.format(new Date());
    }

    public void setModifiedDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        modefiedDateTime=simpleDateFormat.format(new Date());

    }

    public String getModefiedDateTime() {

        return modefiedDateTime.toString();
    }

    public String getCreatedDateTime() {

        return createdDateTime.toString();
    }



}
