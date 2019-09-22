package carrera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Carrera {
	
	private int cuadrasCiudad;
	private int maxDiferenciaSocios;
	private int maxCantNeutrales;
	
	
	
	public Carrera(int cuadrasCiudad, int maxDiferenciaSocios, int maxCantNeutrales) {
		this.cuadrasCiudad = cuadrasCiudad;
		this.maxDiferenciaSocios = maxDiferenciaSocios;
		this.maxCantNeutrales = maxCantNeutrales;
	}
	
	public int getCuadrasCiudad() {
		return this.cuadrasCiudad;
	}
	
	public int getMaxCantNeutrales() {
		return this.maxCantNeutrales;
	}
	
	public int getMaxDiferenciaSocios() {
		return this.maxDiferenciaSocios;
	}

	public static void main(String[] args)  {
		String pathEntrada = "C:\\Users\\Diego\\eclipse-workspace\\CarreraOIA\\";
		String pathSalida = "C:\\Users\\Diego\\eclipse-workspace\\CarreraOIA\\";
		Scanner sc = null;
		PrintWriter pw = null;
		try {
			sc = new Scanner(new File(pathEntrada+"carrera.in"));
			sc.useLocale(Locale.ENGLISH);
			pw = new PrintWriter(new File(pathSalida+"carrera.out"));
			int cantCuadrasCarrera = calcularCantCuadrasCarrera(sc);
			pw.print(cantCuadrasCarrera);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sc.close();
			pw.close();
		}
	}

	private static int calcularCantCuadrasCarrera(Scanner sc) {
		int cuadrasCarrera=0;
		int cantCallesCiudad = sc.nextInt();
		int maxDiferenciaSociosPorCalle = sc.nextInt();
		int maxCantNeutralesPorCalle = sc.nextInt();
		Carrera carrera = new Carrera(cantCallesCiudad, maxDiferenciaSociosPorCalle, maxCantNeutralesPorCalle);
		List<Cuadra> listaCuadras = new ArrayList<Cuadra>(carrera.getCuadrasCiudad());
		while(sc.hasNext()) {
			listaCuadras.add(new Cuadra(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		for (Cuadra cuadra : listaCuadras) {
			if(cuadra.getNeutrales()<=maxCantNeutralesPorCalle && Math.abs(cuadra.getSociosA()-cuadra.getSociosB())<=maxDiferenciaSociosPorCalle) {
				cuadrasCarrera++;
			}
		}
		
		return cuadrasCarrera;
	}
	

}
