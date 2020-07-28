package com.ymym.repository;

import com.ymym.entity.User;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-26 14:58
 * @since
 */
public interface UserRepository {
        public int save(User User);
        public int updata(User User);
        public int deletById( long id);
        public List<User> findAll();
        public User findById(long id);


}
