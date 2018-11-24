import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {
	Web w0,w1,w2,w3,w4,w5;
	Graph g1,g2;
	@Before
	public void setUp() throws Exception {
		w0=new Web("youtube.com",0);
		w1=new Web("gmail.com",1);
		w2=new Web("ebay.com",2);
		w3=new Web("amazon.com",3);
		w4=new Web("booking.com",4);
		ArrayList<Integer> enlW1=new ArrayList<Integer>();
		enlW1.add(3);
		enlW1.add(4);
		w0.anadirEnlaces(enlW1);
		
		ArrayList<Integer> enlW2=new ArrayList<Integer>();
		enlW2.add(2);
		w1.anadirEnlaces(enlW2);
		
		ArrayList<Integer> enlW3=new ArrayList<Integer>();
		enlW3.add(3);
		w2.anadirEnlaces(enlW3);
		
		ArrayList<Integer> enlW4=new ArrayList<Integer>();
		enlW4.add(4);
		w3.anadirEnlaces(enlW4);
		
		ArrayList<Integer> enlW5=new ArrayList<Integer>();
		enlW5.add(4);
		enlW5.add(3);
		w4.anadirEnlaces(enlW5);
		
		ListaWebs.getListaWebs().resetear();
		ListaWebs.getListaWebs().anadirWeb(w0);
		ListaWebs.getListaWebs().anadirWeb(w1);
		ListaWebs.getListaWebs().anadirWeb(w2);
		ListaWebs.getListaWebs().anadirWeb(w3);
		ListaWebs.getListaWebs().anadirWeb(w4);
		
		//ListaWebs.getListaWebs().imprimir();
		g1=new Graph();
		g1.crearGrafo(ListaWebs.getListaWebs());
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		ListaWebs.getListaWebs().resetear();
		w1=null;
		w2=null;
		w3=null;
		w4=null;
		w5=null;
		g1=new Graph();
	}

	@Test
	public void testCrearGrafo() {
		g2=new Graph();
		g2.crearGrafo(ListaWebs.getListaWebs());
		assertNotNull(g2);
	}

	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstanConectados() {
		assertFalse(g1.estanConectados("youtube.com", "gmail.com"));
		assertTrue(g1.estanConectados("youtube.com", "amazon.com"));
		assertFalse(g1.estanConectados("youtube.com", "ebay.com"));
		assertTrue(g1.estanConectados("gmail.com", "booking.com"));
		assertFalse(g1.estanConectados("booking.com", "ebay.com"));
		assertTrue(g1.estanConectados("amazon.com", "amazon.com"));
		assertTrue(g1.estanConectados("gmail.com", "gmail.com"));
//		
//		ListaWebs.getListaWebs().resetear();
//		ListaWebs.getListaWebs().cargarLista("index.txt", "pld-arcs-1-N.txt");
//		g2=new Graph();
//		g2.crearGrafo(ListaWebs.getListaWebs());
//		
//		int cont=0;
//		Random aleatorio1=new Random(ListaWebs.getListaWebs().getLength());
//		Random aleatorio2=new Random(ListaWebs.getListaWebs().getLength());
//		while(cont<100){
//			
//			Integer w1=aleatorio1.nextInt(ListaWebs.getListaWebs().getLength());
//			Integer w2=aleatorio2.nextInt(ListaWebs.getListaWebs().getLength()/2);
//
//			String web1=ListaWebs.getListaWebs().id2String(w1);
//			String web2=ListaWebs.getListaWebs().id2String(w2);
//			
//			System.out.println(g2.estanConectados(web1,web2));
//			cont++;
//		}
	}

	@Test
	public void testHayCamino() {
		System.out.println(g1.hayCamino("youtube.com", "gmail.com"));
		System.out.println(g1.hayCamino("youtube.com", "amazon.com"));
		System.out.println(g1.hayCamino("youtube.com", "ebay.com"));
		System.out.println(g1.hayCamino("gmail.com", "booking.com"));
		System.out.println(g1.hayCamino("amazon.com", "amazon.com"));
		System.out.println(g1.hayCamino("booking.com", "booking.com"));
		System.out.println(g1.hayCamino("gmail.com", "gmail.com"));
		
//		ListaWebs.getListaWebs().resetear();
//		ListaWebs.getListaWebs().cargarLista("index.txt", "pld-arcs-1-N.txt");
//		g2=new Graph();
//		g2.crearGrafo(ListaWebs.getListaWebs());
//		
//		int cont=0;
//		Random aleatorio1=new Random(ListaWebs.getListaWebs().getLength());
//		Random aleatorio2=new Random(ListaWebs.getListaWebs().getLength());
//		while(cont<100){
//			Integer w1=aleatorio1.nextInt(ListaWebs.getListaWebs().getLength());
//			Integer w2=aleatorio2.nextInt(ListaWebs.getListaWebs().getLength()/2);
//
//			String web1=ListaWebs.getListaWebs().id2String(w1);
//			String web2=ListaWebs.getListaWebs().id2String(w2);
//			
//			System.out.println(g2.hayCamino(web1,web2));
//			cont++;
//		}
		
	}

}
