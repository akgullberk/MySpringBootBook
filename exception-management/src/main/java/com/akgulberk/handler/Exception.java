package com.akgulberk.handler;

import lombok.Data;

import java.util.Date;

@Data
public class Exception<E> {

    private String hostName;

    private String path;

    private Date createTime;

    private E message;
}
