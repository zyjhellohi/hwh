package com.hwh.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class HwhMembers implements Serializable {
    private Integer id;
    private String memberId;
    private String phoneNumber;
    private String wxNumber;
    private String userName;
    private Date createdTime;
    private Date modifiedTime;
}
