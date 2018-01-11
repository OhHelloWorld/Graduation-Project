package com.gp.medical.repository;

import com.gp.medical.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserRepository extends JpaRepository<User,Long>{

    User findByUsername(String username);
}
