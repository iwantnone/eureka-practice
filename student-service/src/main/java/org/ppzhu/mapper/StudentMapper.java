package org.ppzhu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ppzhu.pojo.Student;

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
@Mapper
public interface StudentMapper {

    int insert(Student student);
}
