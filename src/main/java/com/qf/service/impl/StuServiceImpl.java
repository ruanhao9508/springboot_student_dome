package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.stereotype.Service;

/**
 * @Auth RuanHao
 * @Time 2019/11/28 13:47
 **/
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements IStuService {
}
