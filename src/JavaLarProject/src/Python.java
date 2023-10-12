class Python extends Planetas {
    public Python(String nome) {
        super("Python", 9, 10, 4, 24, 4, 5, 4);
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