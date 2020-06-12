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
		String expect = "twenty five";
		String actual = ite.print10th(25);
		assertThat(actual, is(expect));
	}	
	@Test
	public void test134toEng() {
		IntToEng ite = new IntToEng();
		String expect = "one hundred thirty four";
		String actual = ite.print100th(134);
		assertThat(actual, is(expect));
	}	
	@Test
	public void test1124toEng() {
		IntToEng ite = new IntToEng();
		String expect = "one thousand one hundred twenty four";
		String actual = ite.print1000th(1124);
		assertThat(actual, is(expect));
	}

}
