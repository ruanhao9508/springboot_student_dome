package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auth RuanHao
 * @Time 2019/11/28 14:38
 **/
@Mapper
public interface StuMapper extends BaseMapper<Student> {
}
