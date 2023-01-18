package br.com.dio.desafio.domínio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRÃO * cargaHoraria;
    }


    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}

