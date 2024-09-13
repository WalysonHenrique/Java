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
		System.out.println("Nome da especie : " + objAnimal.especie + " \n" + "Idade do animal : " + objAnimal.idade);
	}
}