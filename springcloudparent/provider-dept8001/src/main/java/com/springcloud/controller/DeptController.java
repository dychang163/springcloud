package com.springcloud.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.Dept;
import com.springcloud.R;
import com.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/dept/list")
	public R list(){
		List<Dept> list = deptService.list();		
		return R.ok().data("items", list);
	}
	
	@PostMapping("/dept/add")
	public R addDept(@RequestBody Dept dept){
		System.out.println("dept="+dept);
		boolean add = deptService.add(dept);
		if(add) {
			return R.ok();
		}else {
			return R.error();
		}
		
	}
	@GetMapping("/dept/{id}")
	public R getDept(@PathVariable Long id){
		
		Dept dept = deptService.get(id);
		return R.ok().data("item", dept);
	}
}
