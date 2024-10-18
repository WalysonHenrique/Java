public final class PessoaJuridica extends Cliente {
  

  private Integer CNPJ;
  private String razaoSocial, naturezaJuridica;

  public PessoaJuridica(){}

  public PessoaJuridica(Integer CNPJ, String razaoSocial, String naturezaJuridica, Integer numberAccount, String agence, Float balance, Float credit){
    super(numberAccount, agence, balance, credit);
    this.CNPJ = CNPJ;
    this.razaoSocial = razaoSocial;
    this.naturezaJuridica = naturezaJuridica;


  }

  public Integer getCNPJ(){return 0;}

  public String getRazaoSocial(){return "a";}

  public String getNaturezaJuridica(){return "a";}

  public void setNaturezaJuridica(String naturezaJuridica){}

  





}
