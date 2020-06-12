package inttoeng;

import static org.junit.Assert.*;

import org.junit.Test;import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.Matcher;


public class IntToEngTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void test5toEng() {
		IntToEng ite = new IntToEng();
		String expect = "five";
		String actual = ite.print1(5);
		assertThat(actual, is(expect));
	}
	
	@Test
	public void test15toEng() {
		IntToEng ite = new IntToEng();
		String expect = "fifteen";
		String actual = ite.printTeen(15);
		assertThat(actual, is(expect));
	}
	@Test
	public void test25toEng() {
		IntToEng ite = new IntToEng();
		String expect = "twenty";
		String actual = ite.print2(25);
		assertThat(actual, is(expect));
	}	

}
