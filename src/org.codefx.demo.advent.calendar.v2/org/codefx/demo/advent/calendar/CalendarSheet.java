package org.codefx.demo.advent.calendar;

import org.codefx.demo.advent.surprise.Surprise;

import static java.lang.String.format;

class CalendarSheet {

	private final int dayOfDecember;
	private final Surprise surprise;

	public CalendarSheet(int dayOfDecember, Surprise surprise) {
		this.dayOfDecember = dayOfDecember;
		this.surprise = surprise;
	}

	public String asText() {
		return format("%2d: %s", dayOfDecember, surprise.asText());
	}

}
