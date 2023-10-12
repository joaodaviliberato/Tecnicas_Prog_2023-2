class Csharp extends Planetas {
    public Csharp(String nome) {
        super("Csharp", 9, 14, 1, 4, 1, 13, 12);
    }
    
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void setVelocidadeTranslacao(double velocidadeTranslacao) {
		this.velocidadeTranslacao = velocidadeTranslacao;
	}

}