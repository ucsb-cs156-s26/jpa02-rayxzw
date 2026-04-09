package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_same_ref() {
        assert(team.equals(team));
    }

    @Test
    public void equals_returns_false_diff_class() {
	String s = "adsf";
        assert(!team.equals(s));
    }
    
    @Test
    public void equals_returns_true_same_name_and_members() {
	Team t2 = new Team("test-team");
        assert(team.equals(t2));
    }

    @Test
    public void equals_returns_false_same_name_diff_members() {
	Team t2 = new Team("test-team");
	t2.addMember("asdf");
        assert(!team.equals(t2));
    }

    @Test
    public void equals_returns_false_diff_name_diff_members() {
	Team t2 = new Team("asdf");
	t2.addMember("1234");
        assert(!team.equals(t2));
    }

    @Test
    public void hashCode_eq_same_teams() {
	Team t2 = new Team("test-team");
        assertEquals(team.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_eq_mutate_bypass() {
	Team t = new Team();
	int result = t.hashCode();
	int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
}
