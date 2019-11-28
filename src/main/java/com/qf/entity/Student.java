package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Auth RuanHao
 * @Time 2019/11/28 13:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student{
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;

}
