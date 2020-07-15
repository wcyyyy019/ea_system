package com.example.ea_system.service;


import com.example.ea_system.bean.Company;
import com.example.ea_system.bean.Job;

import java.util.List;

public interface ICompanyService {
    void addAndUpdate(Company company) throws RuntimeException;
    void deleteByID(int id) throws RuntimeException;
    void init(int userid) throws RuntimeException;
    List<Company> selectAll() throws RuntimeException;
    List<Job> selectBycompany(int id) throws RuntimeException;
}
