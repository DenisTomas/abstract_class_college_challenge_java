public abstract class Colaborador {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected int idade;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String cidade;
    protected String uf;
    protected String telefone;
    protected String email;
    protected String disciplinas;

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", CPF: " + this.cpf + ", RG: " + this.rg + ", Idade: " + this.idade +
        ", Logradouro: " + this.logradouro + ", Número: " + this.numero + ", Bairro: " + this.bairro +
        ", Cidade: " + this.cidade + ", UF: " + this.uf + ", Telefone: " + this.telefone + ", Email: " + this.email +
        ", Disciplinas: " + this.disciplinas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

}