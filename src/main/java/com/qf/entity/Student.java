package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
//@TableName("student" ) 实体类和表名不对应的时候,这里括号里写的是表名
public class Student{
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
//    @TableField("age") 属性名不一样时
    private Integer age;
    private Date birthday;

}
