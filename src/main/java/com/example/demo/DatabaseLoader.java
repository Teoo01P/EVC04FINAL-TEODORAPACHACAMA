package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repositoryI;
	private final VentaRepository repositoryB;
	private final DetalleVentaRepository repositoryN;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repositoryI,
		VentaRepository repositoryB,
		DetalleVentaRepository repositoryN
		) {
		this.repositoryI = repositoryI;
		this.repositoryB = repositoryB;
		this.repositoryN = repositoryN;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repositoryI.save(new Producto("Refrigerador", 1500.00));
this.repositoryI.save(new Producto("Lavadora", 1200.00));
this.repositoryI.save(new Producto("Televisor", 800.00));
this.repositoryI.save(new Producto("Microondas", 300.00));
this.repositoryI.save(new Producto("Aspiradora", 200.00));

Producto electro1 = new Producto("Licuadora", 100.00);
this.repositoryI.save(electro1);

Producto electro2 = new Producto("Horno eléctrico", 250.00);
this.repositoryI.save(electro2);

Producto electro3 = new Producto("Secadora", 700.00);
this.repositoryI.save(electro3);

Producto electro4 = new Producto("Cafetera", 70.00);
this.repositoryI.save(electro4);

Venta dia1 = new Venta("Lunes");
this.repositoryB.save(dia1);

this.repositoryN.save(new DetalleVenta(dia1, electro1, 2));
this.repositoryN.save(new DetalleVenta(dia1, electro2, 1));

Venta dia2 = new Venta("Martes");
this.repositoryB.save(dia2);

this.repositoryN.save(new DetalleVenta(dia2, electro2, 3));
this.repositoryN.save(new DetalleVenta(dia2, electro3, 2));

Venta dia3 = new Venta("Miércoles");
this.repositoryB.save(dia3);

this.repositoryN.save(new DetalleVenta(dia3, electro4, 2));
this.repositoryN.save(new DetalleVenta(dia3, electro1, 1));

Venta dia4 = new Venta("Jueves");
this.repositoryB.save(dia4);

this.repositoryN.save(new DetalleVenta(dia4, electro4, 2));
this.repositoryN.save(new DetalleVenta(dia4, electro1, 1));

Venta dia5 = new Venta("Viernes");
this.repositoryB.save(dia5);

this.repositoryN.save(new DetalleVenta(dia5, electro4, 2));
this.repositoryN.save(new DetalleVenta(dia5, electro1, 1));

Venta dia6 = new Venta("Sábado");
this.repositoryB.save(dia6);

this.repositoryN.save(new DetalleVenta(dia6, electro4, 2));
this.repositoryN.save(new DetalleVenta(dia6, electro1, 1));


	}
}