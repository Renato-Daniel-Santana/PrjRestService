package br.fatec.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * CountryService.java
 */

@Path("/CountryService")
public class CountryService {
	private String codigo;
	private String nome;
	private String capital;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCountryDetails(){
		this.setCodigo("BR");
		String countryDetails;
		countryDetails = "Código: ";
		countryDetails = countryDetails + codigo + "\n";
		countryDetails = countryDetails + "País: ";
		countryDetails = countryDetails + nome + "\n";
		countryDetails = countryDetails + "Capital: ";
		countryDetails = countryDetails + capital + "\n";
		return countryDetails;
	}
	
	public boolean setCountryDetails(String codigo){
		if (codigo.toUpperCase().equals("BR")){
			this.codigo = codigo;
			this.nome = "Brasil";
			this.capital = "Brasília";
			return true;
		}
		else if (codigo.toUpperCase().equals("FR")){
			this.codigo = codigo;
			this.nome = "França";
			this.capital = "Paris";
			return true;
		}
		else if (codigo.toUpperCase().equals("PT")){
			this.codigo = codigo;
			this.nome = "Portugal";
			this.capital = "Lisboa";
			return true;
		}
		else if (codigo.toUpperCase().equals("ES")){
			this.codigo = codigo;
			this.nome = "Espanha";
			this.capital = "Madrid";
			return true;
		}
		else
			return false;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
		this.setCountryDetails(this.codigo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}