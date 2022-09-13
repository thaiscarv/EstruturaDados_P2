package Questao1;

public class Senha {
	
		private int senha;
		private Senha proximo;
	
			public Senha(int novaSenha){
					this.senha = novaSenha;
	}
			
	public int getSenha() {
        return senha;
    }

		public void setSenha(int senha) {
			this.senha = senha;
    }

    	public Senha getProximo() {
    		return proximo;
    }

    	public void setProximo(Senha proximo) {
    		this.proximo = proximo;
    }
}