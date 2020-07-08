package com.example.ea_system.service;

import com.example.ea_system.bean.Company;

public interface ICompanyService {
    void addAndUpdate(Company company) throws RuntimeException;
    void deleteByID(int id) throws RuntimeException;
}
