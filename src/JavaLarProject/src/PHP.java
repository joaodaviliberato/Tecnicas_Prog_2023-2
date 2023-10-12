class PHP extends Planetas {
    public PHP(String nome) {
        super("PHP", 9, 13, 2, 60, 2, 11, 10);
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
