package com.w.springboot.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {
    private Long id;
    private String userId;
    private String name;
    private String openDate;

}
