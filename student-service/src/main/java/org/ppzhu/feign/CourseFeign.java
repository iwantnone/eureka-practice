package org.ppzhu.feign;

import org.ppzhu.pojo.AjaxResult;
import org.ppzhu.pojo.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
@FeignClient("course-service")
public interface CourseFeign {

    @PostMapping("/course")
    public AjaxResult addCourse(@RequestBody Course course);
}
