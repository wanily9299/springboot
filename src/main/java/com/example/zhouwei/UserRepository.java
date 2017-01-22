package com.example.zhouwei;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhouwei on 2017/1/12.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
