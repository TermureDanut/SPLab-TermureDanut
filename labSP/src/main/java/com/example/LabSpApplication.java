package com.example;

import com.example.Classes.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LabSpApplication {
	public static void createTableOfContent() {
		Book b = new Book("The book");
		Section cap1 = new Section("Chapter 1");
		Section cap11 = new Section("Subchapter 1.1");
		Section cap2 = new Section("Chapter 2");
		cap1.add(new Paragraph("Paragraph 1"));
		cap1.add(new Paragraph("Paragraph 2"));
		cap1.add(new Paragraph("Paragraph 3"));

		cap11.add(new ImageProxy("ImageOne"));
		cap11.add(new Image("ImageTwo"));

		cap2.add(new Paragraph("Paragraph 4"));
		cap1.add(cap11);
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		b.addContent(cap1);
		b.addContent(cap2);

		TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
		b.accept(tocUpdate);
		System.out.println("______________");
		tocUpdate.getToC().accept(new com.example.Classes.service.implementation.RenderContentVisitor());
	}
	public static void main(String[] args) {

		ApplicationContext context = (ApplicationContext) SpringApplication.run(LabSpApplication.class, args);
		com.example.Classes.difexample.TransientComponent transientBean = context.getBean(com.example.Classes.difexample.TransientComponent.class);
		transientBean.operation();
		transientBean = context.getBean(com.example.Classes.difexample.TransientComponent.class);
		transientBean.operation();
		com.example.Classes.difexample.SingletonComponent singletonBean = context.getBean(com.example.Classes.difexample.SingletonComponent.class);
		singletonBean.operation();
		singletonBean = context.getBean(com.example.Classes.difexample.SingletonComponent.class);
		singletonBean.operation();
		com.example.Classes.difexample.ClientComponent c = context.getBean(com.example.Classes.difexample.ClientComponent.class);
		c.operation();
		c = (com.example.Classes.difexample.ClientComponent) context.getBean("clientComponent");
		c.operation();

		createTableOfContent();
	}
}
