public abstract class Planetas implements Posicionavel {
	
	private String nome;
    protected int posX;
    protected int posY;
    protected int largura;
    protected int altura;
    protected double velocidadeTranslacao;
    protected double velocidadeRotacao;
	
    public Planetas(String nome, int posX, int posY, double velocidadeTranslacao, double velocidadeRotacao, int deslocamento, int largura, int altura) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
        this.velocidadeTranslacao = velocidadeTranslacao;
        this.velocidadeRotacao = velocidadeRotacao;
        this.altura = altura;
        this.largura = largura;
    }
    
    public String getNome() {
        return nome;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public double getVelocidadeTranslacao() {
        return velocidadeTranslacao;
    }

    public abstract void setPosX(int posX);
    
    public abstract void setPosY(int posY);
    
    public abstract void setVelocidadeTranslacao(double velocidadeTranslacao);

    public int getLargura() {
		return this.largura;
	}
    
    public int getAltura() {
		return this.altura;
	}
}
