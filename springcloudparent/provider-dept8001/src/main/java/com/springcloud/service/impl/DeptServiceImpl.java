package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.Dept;
import com.springcloud.mapper.DeptMapper;
import com.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public boolean add(Dept dept) {
		boolean addDept = deptMapper.addDept(dept);
		return addDept;
	}

	@Override
	public Dept get(Long id) {
		Dept findById = deptMapper.findById(id);
		return findById;
	}

	@Override
	public List<Dept> list() {
		List<Dept> findAll = deptMapper.findAll();
		
		return findAll;
	}

}
