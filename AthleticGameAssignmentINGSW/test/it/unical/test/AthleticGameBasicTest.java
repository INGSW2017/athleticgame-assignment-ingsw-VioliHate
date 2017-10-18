package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	AthleticGame atletica=new AthleticGame("salto lungo");
	
//	aggiungere un test per testare il metodo 
//	addArrival(String participant, Instant arrival).
//	In questo test verificare che, aggiungendo un nuovo arrivo,
//	la taglia della mappa arrivals diventi pari ad 1
	@Test
	public void testAddArrival() {
		atletica.addArrival("Domenico Violi", Instant.now());
		assertEquals(1,atletica.getArrivals().size());
	}

//	aggiungere un test per verificare che 
//	getParecipiantTime(String participant) 
//	lanci un'eccezione in caso di partecipante non valido
	@Test(expected=IllegalArgumentException.class)
	public void testGetPartecipante() {
		atletica.getParecipiantTime("vuoto");
	}

}
