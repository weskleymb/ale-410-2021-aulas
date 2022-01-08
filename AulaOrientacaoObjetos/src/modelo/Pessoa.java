package modelo;

public class Pessoa {

    // atributos
    private String nome;
    private Integer idade;
    private Sexo sexo;

    // construtores
    public Pessoa(String nome, Integer idade, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // metodos
    public String getNome() {
        return nome.toUpperCase();
    }

    public Integer getIdade() {
        return idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }

}
