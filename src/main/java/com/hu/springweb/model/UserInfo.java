package com.hu.springweb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@JsonFormat
@Data
public class UserInfo {
    private int id;
    private String userName;
    private String password;
    private int logNumber;
    private String lastLogDatetime;
}
