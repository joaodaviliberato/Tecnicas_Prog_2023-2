class C extends Planetas{
	
    public C(String nome) {
        super("C", 9, 16, 10, 0.1, 10, 17, 16);
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