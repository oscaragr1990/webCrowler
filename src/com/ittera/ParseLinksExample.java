package com.ittera;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseLinksExample {
	
	  public static void main(String[] args) {

		    Document doc;
		    try {

		        //doc = Jsoup.connect("http://www.vogella.com").get();
		        doc = Jsoup.connect("http://versionanterior.rues.org.co/Rues_Web").get();

		        // get title of the page
		        String title = doc.title();
		        System.out.println("Title Page: " + title);

		        // get all elementos Por Class
		        Elements Class = doc.getElementsByClass("block block-block");
		        
		        // get all elementos Por Class
		        Elements Tag = doc.getElementsByTag("form");
		        
		       
		        for (Element link : Class) {

		            // get the value from href attribute
		            //System.out.println("\nLink : " + link.attr("href"));
		            System.out.println("Text Class (block block-block): " + link.text());
		        }
		        
		        for (Element link : Tag) {

		            // get the value from href attribute
		            //System.out.println("\nLink : " + link.attr("href"));
		            System.out.println("Tag (strong): " + link.text());
		        }

		    } catch (IOException e) {
		        e.printStackTrace();
		    }

		  }

}
