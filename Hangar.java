package fr.java06.heritage;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

    public static void main(String[] args) {

    	// J'instancie mes classes :

	Boat boat = new Boat("Péniche " , 20000);
	Car car = new Car("Tesla" ,  10000);
	Car newCar = new Car(" Citroen" , 300000 );
	Boat barque = new Boat("barque" ,  0);

	// Je créer une liste et ajoute mes instances :

	List<Vehicule> vehiculeList = new ArrayList<>();

		vehiculeList.add(boat);
		vehiculeList.add(car);
		vehiculeList.add(newCar);
		vehiculeList.add(barque);

		// J'affiche mon résultat :

	System.out.println("Récap' de mes véhicules : ");

		for ( Vehicule vehicule : vehiculeList) {

			System.out.println(vehicule.doStuff());
		}

    }
}
