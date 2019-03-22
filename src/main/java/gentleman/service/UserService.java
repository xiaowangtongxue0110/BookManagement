package gentleman.service;

import gentleman.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    void addUser(User user);

    User selectLogin(String name);

    User selectLoginemail(String email);

    User selectUserPhone(String phone);

    User selectLoginUserAndPassword (String username,String password);

    List<User> selectUser();

    void updateUser(User user);

    User selectUserById(int id);

    void deleteUserById(int id) throws Exception;

    User findPassword(@Param("username") String username, @Param("phone")String phone);

    void updateFindPassword(@Param("username") String username,@Param("password")String password);

    void insertuserandpassword(@Param("username") String username,@Param("password")String password);


}
