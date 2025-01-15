package br.com.alura.screenmatch.exercicios1;

public enum CodigoErro {
    NOT_FOUND(404, "Página não encontrada"),
    BAD_REQUEST(400, "Requisição inválida"),
    INTERNAL_SERVER_ERROR(500, "Erro no servidor");

    private final int codigo;
    private final String descricao;

    CodigoErro(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;

    }
    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
