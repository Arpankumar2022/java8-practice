package com.java8.practice;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeZoneId {
	public static void main(String[] args) {
		// create a Zone Id for Europe/Paris
		ZoneId zoneId = ZoneId.of("Asia/Kolkata");

		// create Clock Object by passing zoneID
		Clock clock = Clock.system(zoneId);

		// get Instant Object of Clock
		// object using instant() method
		Instant instantObj = clock.instant();
        Instant nowInstant = Instant.now();
		// get ZonedDateTime object from
		// instantObj to get zonal date time
		ZonedDateTime time = instantObj.atZone(clock.getZone());

		// print details of Instant Object
		System.out.println("Instant for class " + clock + " is " + time.toString() +nowInstant);
	}
}
