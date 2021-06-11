package app;

import java.time.LocalDate;

public abstract class PasseStandard extends Epass{
	private Titular titular;
		private int pontos = 0;
		private int numeroViagens = 0;
		private String chaveValida;


		public PasseStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,String codigoDoc,DocumentoID docId, String nome, LocalDate ddn, String email) {
			super(saldo, precoViagem, dataCarrega, dataValida, dataEmissaoDateTime);
			
			this.titular=new Titular(docId,nome,ddn,email);

			StringBuilder nomeTitular=new StringBuilder(this.titular.getNome());
			LocalDate ddnTitular = this.titular.getDdn(); 
			Long codigo=this.getCodigo();
	
			StringBuilder primeiroNome=new StringBuilder(nomeTitular.substring(0, 5));
			primeiroNome=primeiroNome.reverse();
	
			StringBuilder lastName=new StringBuilder(nomeTitular.reverse().substring(0, 5));
			
			String chaveValidacao=(primeiroNome+""+lastName+ddnTitular+codigo).toUpperCase();

			this.setChaveValida(chaveValidacao);
		}

		public PasseStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,DocumentoID docId, String nome, LocalDate ddn, String email) {
			super(saldo, precoViagem, dataCarrega, dataValida, dataEmissaoDateTime);
			
			this.titular=new Titular(docId,nome,ddn,email);

			StringBuilder nomeTitular=new StringBuilder(this.titular.getNome());
			LocalDate ddnTitular = this.titular.getDdn(); 
			Long codigo=this.getCodigo();
	
			StringBuilder primeiroNome=new StringBuilder(nomeTitular.substring(0, 5));
			primeiroNome=primeiroNome.reverse();
	
			StringBuilder lastName=new StringBuilder(nomeTitular.reverse().substring(0, 5));
			
			String chaveValidacao=(primeiroNome+""+lastName+ddnTitular+codigo).toUpperCase();

			this.setChaveValida(chaveValidacao);
		}

		public PasseStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,DocumentoID docId, String nome, LocalDate ddn, String morada, String email, int telemovel) {
			super(saldo, precoViagem, dataCarrega, dataValida, dataEmissaoDateTime);

			this.titular=new Titular(docId,nome,ddn,email);

			StringBuilder nomeTitular=new StringBuilder(this.titular.getNome());
			LocalDate ddnTitular = this.titular.getDdn(); 
			Long codigo=this.getCodigo();
	
			StringBuilder primeiroNome=new StringBuilder(nomeTitular.substring(0, 5));
			primeiroNome=primeiroNome.reverse();
	
			StringBuilder lastName=new StringBuilder(nomeTitular.reverse().substring(0, 5));
			
			String chaveValidacao=(primeiroNome+""+lastName+ddnTitular+codigo).toUpperCase();

			this.setChaveValida(chaveValidacao);
		}

		public Titular getTitular() {
			return titular;
		}

		public int getPontos() {
			return pontos;
		}



		public void setPontos(int pontos) {
			this.pontos = pontos;
		}

		public String getChaveValida() {
			return this.chaveValida;
		}

		public void setChaveValida(String chaveValida) {
			this.chaveValida = chaveValida;
		}

		public int pagarViagemComPontos(int pontosViagem){
			
			return pontos;
		}

		public void setNome(String nome){
			return;
		}

		
		public int getNumeroViagens() {
			return numeroViagens;
		}

		public void setNumeroViagens(int numeroViagens) {
			this.numeroViagens = numeroViagens;
		}


		

		


		
		
	
	
	
	
	}	
