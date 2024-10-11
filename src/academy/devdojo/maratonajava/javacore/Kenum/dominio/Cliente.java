package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {


    private String nome;
    private TipoPessoa tipoPessoa;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoPessoa tipoPessoa, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPessoa=" + tipoPessoa.getNOME_RELATORIO() +
                ", tipoPessoaInt=" + tipoPessoa.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
