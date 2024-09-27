package org.ppzhu.controller;

import org.ppzhu.pojo.AjaxResult;
import org.ppzhu.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ppzhu.service.CourseService;

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
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public AjaxResult addCourse(@RequestBody Course course) {
        int i = courseService.addCourse(course);
        return i > 0 ? AjaxResult.success(i):AjaxResult.error(400,"error");
    }

}
