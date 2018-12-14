package com.bit.day16.test;

import java.util.ArrayList;

import com.bit.day16.model.Emp02Dao;
import com.bit.day16.model.Emp02Dto;

public class TestDao {
	
	public static void main(String[] args) {
		try{
		Emp02Dao dao = new Emp02Dao();
//		dao.selectAll();
		System.out.println("�����׽�Ʈ");
		System.out.println("selectAll�޼��� �׽�Ʈ...");
		System.out.println(dao.selectAll()!=null);
		System.out.println(dao.selectAll().size()>0);
		////////////////////////////////////////
		System.out.println("selectOne�޼��� �׽�Ʈ...");
		System.out.println(dao.selectOne(1)!=null);
		System.out.println(dao.selectOne(1).getSabun()==1);
		////////////////////////////////////////
		System.out.println("insertOne�޼��� �׽�Ʈ...");
		int num=dao.selectAll().size();
		dao.insertOne("test", 1000);
		System.out.println(dao.selectAll().size()==num+1);
		System.out.println(dao.insertOne("test", 1000)>0);
		////////////////////////////////////////
		System.out.println("�Է¼������� �׽�Ʈ...");
		Emp02Dto bean= new Emp02Dto();
		bean.setName("test");
		bean.setPay(1000);
		bean.setCnt(0);
		
		dao.insertOne(bean.getName(), bean.getPay());
		
		ArrayList<Emp02Dto> list = dao.selectAll();
		
		Emp02Dto last=null;
		for(int i=0; i<list.size(); i++){
			last=list.get(i);
		}
		bean.setSabun(last.getSabun());
		
		System.out.println(last.equals(bean));
		
		bean.setName("edit");
		
		dao.updateOne(bean.getName(), bean.getPay(), bean.getSabun());
		
		System.out.println("����:"+(dao.selectOne(bean.getSabun()).equals(bean)));
		System.out.println(dao.delOne(bean.getSabun())>0);
		System.out.println("����:"+(dao.selectOne(bean.getSabun()).equals(new Emp02Dto())));
		}catch(Exception e){
			System.out.println("failure");
		}
	}

}



































