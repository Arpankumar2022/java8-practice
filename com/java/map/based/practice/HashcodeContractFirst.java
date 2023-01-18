package com.java.map.based.practice;

import java.util.HashMap;
import java.util.Map;

public class HashcodeContractFirst {

	public static void main(String[] args) {

		Map<Team, String> leaders = new HashMap<>();
		Team my = new Team("New York", "development");
		leaders.put(new Team("New York", "development"), "Anne");
		leaders.put(new Team("Boston", "development"), "Brian");
		leaders.put(new Team("Boston", "marketing"), "Charlie");

		//Team myTeam = new Team("New York", "development");
		String myTeamLeader = leaders.get(my);

		System.out.println(myTeamLeader);
	}

}
