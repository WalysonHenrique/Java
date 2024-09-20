class Animal{
	public String especie;
	private String sexo;
	private Float peso;
	public Integer idade;
	private Integer id;

	public Animal(){

	}

	
	public Animal(String especie, Integer idade){
	this.especie = especie;
	this.idade = idade;
	}

	public void comer(Animal objAnimal){
		System.out.println("Animal " + objAnimal.especie + " " +  "comendo" + "   " + this);
	}
	
	public Float defecar(){
		return 0.0f;
	}

	public void exibirInformacoes(Animal objAnimal){
		//System.out.println("Nome da especie : " + objAnimal.especie + " \n" + "Idade do animal : " + objAnimal.idade);
		System.out.printf("Nome da especie : %s   Idade do animal : %d", objAnimal.especie, objAnimal.idade);
	}
	public void exibirInformacoes(Felino objAnimal){
		//System.out.println("Nome da especie : " + objAnimal.especie + " \n" + "Idade do animal : " + objAnimal.idade);
		System.out.printf("Nome da especie : %s   Idade do animal : %d, garra do animal %.2f", objAnimal.especie, objAnimal.idade, objAnimal.garra);
	}
}