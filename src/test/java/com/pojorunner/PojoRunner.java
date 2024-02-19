package com.pojorunner;

import com.pojo.Pojo;

public class PojoRunner extends Pojo {

	public static void main(String[] args) {

		Pojo p = new Pojo();

//		p.setName("Selenium");
//		p.setAge(23);
		System.out.println(p.getName() + "=" + p.getAge());
	}

}
