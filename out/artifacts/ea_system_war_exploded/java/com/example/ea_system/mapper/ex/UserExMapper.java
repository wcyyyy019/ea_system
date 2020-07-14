package com.example.ea_system.mapper.ex;

import com.example.ea_system.bean.ex.UserEx;
import org.springframework.stereotype.Repository;

@Repository

public interface UserExMapper {
        UserEx checkStatus(int userid);
}
