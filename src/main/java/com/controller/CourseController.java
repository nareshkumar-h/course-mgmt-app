package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.model.Course;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(value = "/api/courses", description = "Courses Controller")
@Path("/courses")
public class CourseController {

	@ApiOperation(value = "get all the students")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK")})
	@GET
	@Path(value="/")
	public List<Course> index(){
		
		System.out.println("Index API");		
		List<Course> list = new ArrayList<Course>();
		list.add(new Course(1L,"Java"));
		
		return list;
	}
}
