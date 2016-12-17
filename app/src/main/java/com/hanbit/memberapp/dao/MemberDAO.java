package com.hanbit.memberapp.dao;

import com.hanbit.memberapp.domain.MemberBeen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2017 on 2016-12-17.
 */

public class MemberDAO {
    public MemberBeen detail(String id){
        MemberBeen member = new MemberBeen();
        return member;
    }
    public List<MemberBeen> find(String keyword){
        List<MemberBeen> list = new ArrayList<MemberBeen>();
        return list;
    }
    public void join(MemberBeen param){}
    public List<MemberBeen> list(){
        List<MemberBeen> list = new ArrayList<MemberBeen>();
        return list;
    }
    public boolean login(MemberBeen param){
        boolean flag = false;
        return flag;
    }
    public void update(MemberBeen param){}
    public void delete(String id){}
    public int count(){
        int count =0;
        return count;
    }
}
