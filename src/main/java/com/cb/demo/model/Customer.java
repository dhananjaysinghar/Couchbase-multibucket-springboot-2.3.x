package com.cb.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Setter
@Getter
@Document
public class Customer {

    @Id
    private Integer cId;

    private String cName;

    private String contactNumber;
}
