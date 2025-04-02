public class Aluno {
    private String nome;
    private double somaDasNotas;
    private int quantidadeDeNotas;

    public Aluno(String nome) {
        this.nome = nome;
        this.somaDasNotas = 0;
        this.quantidadeDeNotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        if (quantidadeDeNotas == 0) {
            return 0;
        }
        return somaDasNotas / quantidadeDeNotas;
    }

    public int getQuantidadeDeNotas() {
        return quantidadeDeNotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Insira um valor entre 0 e 10.");
            return;
        }
        this.somaDasNotas += nota;
        this.quantidadeDeNotas++;
    }

    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Quantidade de notas: " + quantidadeDeNotas);
        System.out.println("Média: " + String.format("%.2f", getMedia()));
    }
}

