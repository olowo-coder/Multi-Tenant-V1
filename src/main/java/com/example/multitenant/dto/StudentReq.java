package com.example.multitenant.dto;

import lombok.Data;

@Data
public class StudentReq {
    private String name;
    private String tenantId;
}
