package com.hanbit.memberapp.service;

import com.hanbit.memberapp.domain.MemberBeen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2017 on 2016-12-17.
 */

public class MemberServiceImpl implements MemberService {
    @Override
    public MemberBeen detail(String id) {
        MemberBeen member = new MemberBeen();
        return member;
    }

    @Override
    public List<MemberBeen> find(String keyword) {
        List<MemberBeen> list = new ArrayList<MemberBeen>();
        return list;
    }

    @Override
    public void join(MemberBeen param) {

    }

    @Override
    public List<MemberBeen> list() {
        List<MemberBeen> list = new ArrayList<MemberBeen>();
        return list;
    }

    @Override
    public boolean login(MemberBeen param) {
        boolean flag = false;
        return false;
    }

    @Override
    public void update(MemberBeen param) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int count() {
        return 0;
    }
}
