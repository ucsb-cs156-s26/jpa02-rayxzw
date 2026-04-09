package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Raymond Xu";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "rayxzw";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s26-07");
        team.addMember("EMERSON JIANYI");
        team.addMember("RAYMOND");
        team.addMember("WYATT");
        team.addMember("DAVID HOING");
        team.addMember("ALEXANDER");
        team.addMember("HANSON");
        return team;
    }
}
