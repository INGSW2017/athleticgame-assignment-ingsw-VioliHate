package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Clock;
import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame atletica;
	
//	utilizzare @BeforeClass per istanziare 
//	un campo privato statico di tipo 
//	AthleticGame su cui effettuare i test
	@BeforeClass 
	static public void init() {
		atletica=new AthleticGame("atletica test");
	}
	@After 
	public void reset(){
		atletica.reset();
	}
	@Before
	public void start() {
		atletica.start();
	}
	@Test
	public void primoTest() {
		Clock c = null;
		c=Clock.systemDefaultZone();
		atletica.addArrival("Partecipante1",c.instant().plusMillis(0));
		atletica.addArrival("Partecipante2",c.instant().plusMillis(10));
		atletica.addArrival("Partecipante3",c.instant().plusMillis(20));
		atletica.addArrival("Partecipante4",c.instant().plusMillis(30));
		atletica.addArrival("Partecipante5",c.instant().plusMillis(40));
		assertEquals("Partecipante1",atletica.getWinner());
	}
	@Test
	public void secondoTest() {
		if(atletica.getArrivals().isEmpty()) {
			assertEquals(null,atletica.getWinner());
		}
	}
}
