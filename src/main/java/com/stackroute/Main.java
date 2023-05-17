package com.stackroute;

import com.stackroute.Domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie mov= xmlBeanFactory.getBean("movie1", Movie.class);
        System.out.println("heroes" + mov);






        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = applicationContext.getBean("movie1", Movie.class);

        System.out.println("heroes" + movie);

    }


}
