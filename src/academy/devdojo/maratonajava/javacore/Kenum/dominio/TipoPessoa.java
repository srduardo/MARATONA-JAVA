package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPessoa {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private final String NOME_RELATORIO;

    TipoPessoa(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public static TipoPessoa tipoPessoaPorNomeRelatorio(String nomeRelatorio) {
        for (TipoPessoa tipo : values()) {
            if (tipo.getNOME_RELATORIO().equals(nomeRelatorio)) {
                return tipo;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
