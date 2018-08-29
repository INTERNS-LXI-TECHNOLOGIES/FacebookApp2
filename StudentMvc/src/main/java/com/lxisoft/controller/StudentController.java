/*
* Copyright 2002-2016 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.lxisoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lxisoft.model.Student;

/**
* TODO Provide a detailed description here 
* @author Prasad
* , 
*/
@Controller

public class StudentController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String user( Model model) {
		System.out.println("index Page Requested");

		return "index";
	}
	@RequestMapping(value = "/student",method = RequestMethod.POST)
	public String user(@Validated Student student, Model model) {
		System.out.println("home Page Requested");
		System.out.println(student.getStudentName());
		model.addAttribute("studentName", student.getStudentName());
		return "home";
	}
}
