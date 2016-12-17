package com.hanbit.memberapp.service;

import com.hanbit.memberapp.domain.MemberBeen;

import java.util.List;

/**
 * Created by hb2017 on 2016-12-17.
 */

public interface MemberService {

    public MemberBeen detail(String id);
    public List<MemberBeen> find(String keyword);
    public void join(MemberBeen param);
    public List<MemberBeen> list();
    public boolean login(MemberBeen param);
    public void update(MemberBeen param);
    public void delete(String id);
    public int count();

}
