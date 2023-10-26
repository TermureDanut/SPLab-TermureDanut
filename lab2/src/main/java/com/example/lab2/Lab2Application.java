package com.example.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lab2.classes.*;

//@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Lab2Application.class, args);
		Book discoTitanic = new Book("Disco Titanic");
		Author author = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(author);
		int indexChapterOne = discoTitanic.addChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.addSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		Element element = new Element();
		element.addParagraph("Paragraph 1");
		element.addParagraph("Paragraph 2");
		element.addParagraph("Paragraph 3");
		element.addParagraph("Paragraph 4");
		element.addParagraph("Paragraph 5");
		element.addImage("Image 1");
		element.addTable("Table 1");
		scOneOne.addElement(element);

		int indexSubChapterOneTwo = chp1.addSubChapter("Subcapitolul 1.2");
		SubChapter scOneTwo = chp1.getSubChapter(indexSubChapterOneTwo);
		Element elementOneTwo = new Element();
		elementOneTwo.addParagraph("Paragraph 1?");
		elementOneTwo.addParagraph("Paragraph 2?");
		elementOneTwo.addParagraph("Paragraph 3?");
		elementOneTwo.addParagraph("Paragraph 4?");
		elementOneTwo.addParagraph("Paragraph 5?");
		elementOneTwo.addImage("Image 1?");
		elementOneTwo.addTable("Table 1?");
		scOneTwo.addElement(elementOneTwo);
		discoTitanic.print();
	}

}
