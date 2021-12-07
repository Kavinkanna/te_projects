package com.te.springh2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springh2.EmployeeBean;
import com.te.springh2.repo.EmployeeRepo;

@RestController
public class SpringContoller {

	@Autowired
	private EmployeeRepo repo;

	@PostMapping(path = "/add", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })

	public boolean addEmployee(@RequestBody EmployeeBean info) {
		Optional<EmployeeBean> optional = repo.findById(info.getId());
		System.out.println(optional);
		if (optional.isEmpty()) {
			EmployeeBean bean = repo.save(info);
			if (bean != null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}// end of add

	@GetMapping("/get/{id}")
	public EmployeeBean getData(@PathVariable int id) {
		System.out.println(repo.findByIdAndName(100, "Kiran"));
		return repo.findById(id).get();
	}

	@GetMapping("/all")
	public List<EmployeeBean> getAll() {
		List<EmployeeBean> beans = new ArrayList<>();

		Iterable<EmployeeBean> iterable = repo.findAll();
		for (EmployeeBean employeeBean : iterable) {
			beans.add(employeeBean);
		}
		return beans;
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable int id) {
		
		if (!repo.findById(id).isEmpty()) {
			repo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	@PutMapping("/update")
	public boolean updateRecord(@RequestBody EmployeeBean employeeBean) {
		Optional<EmployeeBean> optional = repo.findById(employeeBean.getId());
		if (!optional.isEmpty()) {
			repo.save(employeeBean);
			return true;
		} else {
			return false;
		}
	}
}
