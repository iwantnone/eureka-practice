package org.ppzhu.service.impl;

import org.ppzhu.feign.CourseFeign;
import org.ppzhu.mapper.StudentMapper;
import org.ppzhu.pojo.AjaxResult;
import org.ppzhu.pojo.Course;
import org.ppzhu.pojo.Student;
import org.ppzhu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ppzhu
 * @Date: 2024/9/27
 * @Description: Describe the purpose or functionality of the class here.
 * You can provide detailed explanations, usage examples, etc.
 * @Modification History:
 * Date         Author          Description
 * -----------  --------------  -----------------------------------
 * 2024/9/27      ppzhu         Initial version
 * @Copyright: Copyright 2024, ppzhu.
 * All rights reserved.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private CourseFeign courseFeign;


    @Override
    public int addStudent(Student student,Course course) {
        AjaxResult ajaxResult = courseFeign.addCourse(course);
        int si = studentMapper.insert(student);
        if (ajaxResult.getCode()==200){
            if (si > 0){
                return 1;
            }
        }

        return 0;
    }

}
