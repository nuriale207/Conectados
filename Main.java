
public class Main {
	public static void main (String [ ] args) {
		
		ListaWebs.getListaWebs().resetear();
		ListaWebs.getListaWebs().cargarLista("smallindex.txt", "smallpld-arcs-1-N.txt");
		Graph prueba=new Graph();
		prueba.crearGrafo(ListaWebs.getListaWebs());
		prueba.print();
		
		System.out.println(prueba.estanConectados("01gtyjrz.com", "0103media.co.uk"));
		System.out.println(prueba.estanConectados2("01gtyjrz.com", "0103media.co.uk"));
		System.out.println(prueba.estanConectados("013pk.com", "0086k.com"));
		System.out.println(prueba.estanConectados2("013pk.com", "0086k.com"));
		System.out.println(prueba.estanConectados("0-3ani.ro", "005tourdial.com"));
		System.out.println(prueba.estanConectados2("0-3ani.ro", "005tourdial.com"));
		
		ListaWebs.getListaWebs().resetear();
		ListaWebs.getListaWebs().cargarLista("prueba.txt", "pruebaEnlaces.txt");
		
		Graph prueba2=new Graph();
		prueba2.crearGrafo(ListaWebs.getListaWebs());
		prueba2.print();
		System.out.println(prueba2.estanConectados("0-3ani.ro", "0086k.com"));
	}
}
