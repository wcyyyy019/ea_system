package com.example.ea_system.mapper.ex;

import com.example.ea_system.bean.Company;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyExMapper {
    void init(int userid);
}
