class JavaScript extends Planetas {
    public JavaScript(String nome) {
        super("JavaScript", 9, 11, 3, 10, 3, 7, 6);
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