package io;

import java.io.Serializable;

public class Person implements Serializable { // 여기서 클래스명에 노란줄 뜨는데, 버전ID 붙이라고 함

	private static final long serialVersionUID = -2806855282281182967L;
	// private static final long serialVersionUID = 1L;
	// 없어도 되긴 한데 직렬화 했던 객체를 원래대로 읽어오는 역직렬화에 필요 (같은 객체를 복원하는 게 맞는 지 확인)
	
	private String name;
	// private String job;
	transient String job; // 해당 필드를 직렬화시키지 않는다는 것
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
}
