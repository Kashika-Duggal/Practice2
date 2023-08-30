package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.StudentInfo;


@Repository
@RequestMapping("/StudentInfo")
public interface StudentInfoRepository extends CrudRepository<StudentInfo, String> {

}
