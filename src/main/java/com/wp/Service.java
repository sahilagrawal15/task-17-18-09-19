package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Service {

	public static String insert(ModelClass model) {
		Session session = Conn.getSF().openSession();
		Transaction tr = session.beginTransaction();
		session.save(model);
		tr.commit();
		session.close();
		return "success";

	}

	public static ModelClass delete(ModelClass model) {

		Session session = Conn.getSF().openSession();
		Transaction tr = session.beginTransaction();
		ModelClass mc = session.get(ModelClass.class, model.getId());
		model.setId(mc.getId());
		model.setName(mc.getName());
		model.setCity(mc.getCity());
		model.setMobile(mc.getMobile());
		session.delete(mc);
		tr.commit();
		return mc;

	}

	public static ModelClass search(ModelClass model) {
		Session session = Conn.getSF().openSession();
		Transaction tr = session.beginTransaction();
		ModelClass mc = session.get(ModelClass.class, model.getId());
		model.setId(mc.getId());
		model.setName(mc.getName());
		model.setCity(mc.getCity());
		model.setMobile(mc.getMobile());
		tr.commit();

		return mc;

	}

	public static ModelClass update(ModelClass model) {
		Session session = Conn.getSF().openSession();
		Transaction tr = session.beginTransaction();
		ModelClass mc = session.get(ModelClass.class, model.getId());
		model.setId(mc.getId());
		model.setName(mc.getName());
		model.setCity(mc.getCity());
		model.setMobile(mc.getMobile());
		session.update(mc);
		tr.commit();
		return mc;

	}

	public static List<ModelClass> view() {
		Session session = Conn.getSF().openSession();
		Transaction tr = session.beginTransaction();
		Criteria cr = session.createCriteria(ModelClass.class);

		List<ModelClass> list = cr.list();

		session.close();
		return list;
		

	}
}
