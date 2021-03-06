package gentleman.service;

import gentleman.bean.User;
import gentleman.dao.Userdao;
import gentleman.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class serviceimpl implements UserService {

    @Autowired
    private Userdao userdao;

    @Override
    public void addUser(User user) {
        userdao.addUser(user);
    }

    @Override
    public User selectLogin(String name) {
        return userdao.selectLogin(name);
    }

    @Override
    public User selectLoginemail(String email) {
        return userdao.selectLoginemail(email);
    }

    @Override
    public User selectUserPhone(String phone) {
        return userdao.selectUserPhone(phone);
    }

    @Override
    public User selectLoginUserAndPassword(String username, String password) {

        return userdao.selectLoginUserAndPassword(username,password);
    }

    @Override
    public List<User> selectUser() {
        return userdao.selectUser();
    }

    @Override
    public void updateUser(User user) {
        userdao.updateUser(user);
    }

    @Override
    public User selectUserById(int id) {
        return userdao.selectUserById(id);
    }

    @Override
    public void deleteUserById(int id){
        userdao.deleteUserById(id);
    }

    @Override
    public User findPassword(String username, String phone) {
        return userdao.findPassword(username,phone);
    }

    @Override
    public void updateFindPassword(String username, String password) {
           userdao.updateFindPassword(username,password);
    }

    @Override
    public void insertuserandpassword(String username, String password) throws Exception {
        String newpassword = MD5Util.MD5Encode(password, "utf-8");
        userdao.insertuserandpassword(username,newpassword);
    }
}
