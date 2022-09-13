package Questao1;

public class Lista {
	
	 private Senha primeiraSenha;
	 private Senha ultimaSenha;
	 private int tamanho;
	    
	 public void ListaLigada(){
	        this.tamanho = 0;
	 }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(int tamanho) {
	        this.tamanho = tamanho;
	    }
	    
	    public void adicionar(int novaSenha){
	    	Senha novoElemento = new Senha(novaSenha);
	        if (this.primeiraSenha == null && this.ultimaSenha == null){
	            this.primeiraSenha = novoElemento;
	            this.ultimaSenha = novoElemento;            
	        }else{
	            this.ultimaSenha.setProximo(novoElemento);
	            this.ultimaSenha = novoElemento;            
	        }
	        this.tamanho++;
	    }
	    
	    public void remover(int valorProcurado){
	    	Senha anterior = null;
	    	Senha atual = this.primeiraSenha;
	        for(int i=0; i < this.getTamanho(); i++){            
	            if (atual.getSenha()==valorProcurado){
	                if (this.tamanho == 1){
	                    this.primeiraSenha = null;
	                    this.ultimaSenha = null;
	                }else if (atual == primeiraSenha){
	                    this.primeiraSenha = atual.getProximo();
	                    atual.setProximo(null);
	                }else if (atual == ultimaSenha){
	                    this.ultimaSenha = anterior;
	                    anterior.setProximo(null);
	                }else{
	                    anterior.setProximo(atual.getProximo());
	                    atual = null;
	                }
	                this.tamanho--;
	                break;
	            }
	            anterior = atual;
	            atual = atual.getProximo();
	        }
	    }
	    
	    public Senha get(int posicao){
	    	Senha atual = this.primeiraSenha;
	        for(int i=0; i < posicao; i++){
	            if (atual.getProximo() != null){
	                atual = atual.getProximo();
	            }
	        }
	        return atual;
	    }

}