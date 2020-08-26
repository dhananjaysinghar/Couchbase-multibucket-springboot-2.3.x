package com.cb.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Getter
@Setter
public class User {

    @Id
    private Integer id;

    private String userName;

    private String email;
}
