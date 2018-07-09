package com.siri.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate extends Date {

	public String toString() {
		Date date = new Date();
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss" + "\n" + "MM/dd/yyyy hh-mm-ss" + "\n"
				+ "dd//MM//yyyy hh_mm_ss" + "\n" + "yyyy-MM-dd hh*mm*ss" + "\n" + "YY_MM_dd hh.mm.ss" + "\n"
				+ "\"EEE, MMM d, ''yy K:mm a, z" + "\n" + "yyyy-MM-dd' T 'HH:mm:ss" + "\n"
				+ "yyyy.MM.dd G 'at' HH:mm:ss z" + "\n" + "yyyy.MMMMM.dd GGG hh:mm aaa" + "\n"
				+ "EEE, d MMM yyyy hh 'o''clock' a, zzzz" + "\n" + "EEEE, MMMM d, yyyy kk:mm:ss" + "\n"
				+ "EEEEE MMMMM yyyy HH:mm:ss.SSSZ" + "\n" + "dd-MM-yy HH:mm:ss.SSS");
		return formatter.format(date);

	}

}