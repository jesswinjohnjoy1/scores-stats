package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ssModel;
import com.example.demo.Service.ssService;

@RestController
@RequestMapping("/SS")
public class ssControl {
	@Autowired
	ssService ss_service;
	@PostMapping(" ")
	public String create(@RequestBody ssModel ss_model)
	{
		return ss_service.addSS(ss_model);
	}
	@GetMapping(" ")
	public List<ssModel> read()
	{
		return ss_service.getSS();
	}
	@GetMapping("/{sign_no}")
	public Optional<ssModel> readById(@PathVariable int sign_no)
	{
		return ss_service.getSSById(sign_no);
	}
	@PutMapping("/update_ss")
	public String update(@RequestBody ssModel ss_model) 
	{
		return ss_service.updateSS(ss_model);
	}
	@DeleteMapping("/delete_ss")
	public String delete(@RequestParam ("num") int sign_no)
	{
		return ss_service.deleteByRequestParamId(sign_no);
	}
}
