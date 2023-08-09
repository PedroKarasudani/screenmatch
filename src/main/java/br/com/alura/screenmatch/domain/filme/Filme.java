package br.com.alura.screenmatch.domain.filme;

public class Filme {

    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    
    
    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.ge;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }
    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", duracaoEmMinutos=" + duracaoEmMinutos + ", anoLancamento=" + anoLancamento
                + ", genero=" + genero + "]";
    }
    

    
}
