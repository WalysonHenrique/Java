public final class  PessoaFisica extends Cliente {
  String CPF, Name;


  public PessoaFisica(String CPF, String Name, Integer numberAccount, String agence, Float balance, Float credit ){
    super(numberAccount, agence, balance, credit);
    this.CPF = CPF;
    this.Name = Name;
   
  }


  public String getCPF(){return "a";}

  public String getName(){return"a";}



}
