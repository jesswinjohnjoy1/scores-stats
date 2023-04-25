package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ssModel;
import com.example.demo.Repository.ssRepo;

@Service
public class ssService {
	@Autowired
	ssRepo ss_repo;
	public String addSS(ssModel ss_model)
	{
		ss_repo.save(ss_model);
		return "Added!";
	}
	public List<ssModel> getSS()
	{
		return ss_repo.findAll();
	}
	public Optional<ssModel> getSSById(int id)
	{
		return ss_repo.findById(id);
	}
	public String updateSS(ssModel ss_model)
	{
		ss_repo.save(ss_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int sign_no)
	{
		ss_repo.deleteById(sign_no);
		return "Deleted!";
	}
}