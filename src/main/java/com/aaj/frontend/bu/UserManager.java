/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aaj.frontend.bu;

import com.aaj.frontend.domain.User; 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import org.springframework.stereotype.Service;


/**
 *
 * @author luisb
 */
@Service
public class UserManager{   
    
    public void save(User user){ 
        System.out.println("Saving user...");
    }   
    
    public User getById(Integer id){ 
        return getUsers().get(id);
    }   
    
    public List<User> getAll(){ 
        
        List<User> users = (new ArrayList<User>(getUsers().values()));
        
        return users; 
    } 
    
    public void delete(Integer id){ 
        System.out.println("Deleting user...");
    } 
    
    
    private Map<Integer,User> getUsers(){
        
        Map<Integer,User> users = new HashMap<Integer,User>();
        
        users.put(1,new User("Luis",40));
        users.put(2,new User("Jorge",38));
        users.put(3,new User("Lauta",35));
        users.put(4,new User("Fede",37));
        
        return users;
    }
}
