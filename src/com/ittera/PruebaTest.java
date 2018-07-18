package com.ittera;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PruebaTest {

	public static void main(String[] args) {

		try {
			    //Se envia de manera estatica los parametros Codigo Camara y Matricula
			    Document index = Jsoup.connect("http://versionanterior.rues.org.co/RUES_Web/Consultas/DetalleRM").data("codigo_camara", "48", "matricula", "0000003547").get();
    		    System.out.println(index);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

				

	}

}
