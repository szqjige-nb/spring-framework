package org.springframework.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *@Author:szq
 *@Date:2020/5/2122:19
 *Des:
 */
@Configuration
public class Main {

	@Bean("person")
	public Person person() {
		return new Person("Hello",30);
	}

	public static void main(String[] args) {
		// 先解读一下 容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		System.out.println((Person) context.getBean("person"));
	}

}
class  Person{
	private   String name;
	private   int age;

	public  Person(String name , int age){
		this.name  = name;
		this.age  = age;
	}

	// TODO: 2020/5/21
	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\''+"age='"+ age+
				'}';
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
