public class Aluno {

    private String nome;
    private int matricula;
    private float nota;

    public String getNome() {
        return nome;
    }

    public Aluno(String nome){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=nota;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    public void exibirInfo(){
        System.out.println("nome: "+ getNome());
        System.out.println("matricula:"+ getMatricula());
        System.out.println("nota:"+ getNota());
    }

}
