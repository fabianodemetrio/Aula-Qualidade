package qualidade.aula;

import org.junit.Assert;

public class TesteItinerario {
	Metodos chamaMetodosWeb = new Metodos();
	
	public void clicaItinerario(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraElemento("userName", "teste");
		chamaMetodosWeb.procuraElemento("password", "teste");
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		chamaMetodosWeb.clicaBotaoXPath("//a[@href='mercuryitinerary.php']");
		String itinerario = chamaMetodosWeb.procuraProxPagina();
		Assert.assertEquals(itinerario,"http://newtours.demoaut.com/mercuryitinerary.php");
		chamaMetodosWeb.encerraConfig();
	}	
}