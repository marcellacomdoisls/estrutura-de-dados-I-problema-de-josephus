import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pessoa {
  private int numero;
  private String nome;
  private String telefone;
  private String endereco;
  private String cpf;

  public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
    this.numero = numero;
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    this.cpf = cpf;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "numero=" + numero +
        ", nome='" + nome + '\'' +
        ", telefone='" + telefone + '\'' +
        ", endereco='" + endereco + '\'' +
        ", cpf='" + cpf + '\'' +
        '}';
  }
}

public class ProblemaJosephus {
  public static void main(String[] args) {
    int numPessoas = 20;
    int m = 3;

    List<Pessoa> rodaPessoas = new ArrayList<>();
    for (int i = 1; i <= numPessoas; i++) {
      Pessoa pessoa = new Pessoa(i, "Pessoa " + i, "Telefone " + i, "Endereço " + i, "CPF " + i);
      rodaPessoas.add(pessoa);
    }

    Random random = new Random();
    int indice = 0;
    while (rodaPessoas.size() > 1) {
      indice = (indice + m - 1) % rodaPessoas.size();
      Pessoa pessoaEliminada = rodaPessoas.remove(indice);
      System.out.println("Pessoa eliminada: " + pessoaEliminada);

      if (indice == rodaPessoas.size()) {
        indice = 0;
      }
    }

    Pessoa pessoaSobrevivente = rodaPessoas.get(0);
    System.out.println("Pessoa sobrevivente: " + pessoaSobrevivente);
  }
}
