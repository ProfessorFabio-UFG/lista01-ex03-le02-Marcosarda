package poo1.exercicio3;

public class MoradorEncapsulado {
    private static int contador = 1;
    private int codigoSequencial;
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;

    public MoradorEncapsulado() {
        this.codigoSequencial = contador++;
    }

    public int getCodigoSequencial() {
        return codigoSequencial;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public void mostrarDados() {
        System.out.printf(
            "Código: %d | Nome: %s | CPF: %s | Cel: %s | Nasc.: %s | Sexo: %s | Bloco: %s | Apt: %s | Cód Acesso: %s%n",
            codigoSequencial,
            nome, cpf, celular,
            dataNascimento, sexo,
            bloco, apartamento,
            codigoAcesso
        );
    }
}
