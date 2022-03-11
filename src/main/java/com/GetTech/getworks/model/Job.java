package com.GetTech.getworks.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("job")
public class Job {
    @Id
    private Long id;
    private String company;
    private String position;
    private String url;

}
