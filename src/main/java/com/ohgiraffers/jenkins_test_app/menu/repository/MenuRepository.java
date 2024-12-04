package com.ohgiraffers.jenkins_test_app.menu.repository;

import com.ohgiraffers.jenkins_test_app.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> { //Menu : Entity, Integer(기본키 자료형)

//    public List<Menu> selectAllMenu(){
//
//        List<Menu> menuList =  menuRepository.findAll();
//        if(menuList.isEmpty()){
//            return null;
//        }
//        return menuList;
//    }

}
