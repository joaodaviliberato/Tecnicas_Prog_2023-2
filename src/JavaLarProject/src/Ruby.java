class Ruby extends Planetas {
    public Ruby(String nome) {
        super("Ruby", 9, 12, 2, 48, 3, 9, 8);
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
