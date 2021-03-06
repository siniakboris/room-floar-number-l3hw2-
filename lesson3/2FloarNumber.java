
package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Room number
		Scanner sc = new Scanner(System.in);

		System.out.println("Пожалуйста, введите номер квартиры.");

		int room = sc.nextInt();
		int entranceNumber = 4;
		int floarNumber = 9;
		int floarRoom = 4;

		int nre = floarRoom * floarNumber;
		int maxRoom = nre * entranceNumber;

		int entrance = (room - 1) / nre + 1;
		int floar = (room - 1) % nre / 4 + 1;

		if ((room > maxRoom) | (room <= 0)) {
			System.out.println("Ошибка, такой комнаты в доме нет");
		}

		else {
			System.out.println("Подьезд: " + entrance + "\n" + "Этаж: " + floar);
		}
	}

}
