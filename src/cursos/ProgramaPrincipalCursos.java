package cursos;

public class ProgramaPrincipalCursos {

	public static void main(String[] args) {
		
		
		
		Cidade cg =  new Cidade();
		cg.setNome("Campo Grande");
		cg.getEstado().setNome("Mato Grosso do Sul");
		cg.getEstado().setUf("MS");
		
		Aluno jao = new Aluno();
		jao.setNome("Jão da Silva");
		jao.setCpf("909099");
		jao.setRg("88888");
		jao.setCidade(cg);
		
	
		Aluno ze = new Aluno();
		ze.setNome("Zé da Silva");
		ze.setCpf("43434");
		ze.setRg("65656565");
		ze.setCidade(cg);
		
		
		Curso javaoo = new Curso();
		javaoo.setNome("Java Orientação a Objetos");
		javaoo.setValor(100);
		javaoo.setCargaHoraria(32);
		
		
		Turma t15 =  new Turma (2);
		t15.adicionarAluno(jao);
		t15.adicionarAluno(ze);
		
		Aluno aluno1 = t15.getAluno(0);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getCpf());
		System.out.println(aluno1.getRg());
		System.out.println(aluno1.getCidade().getNome());
		System.out.println(aluno1.getCidade().getEstado().getNome());
		System.out.println(aluno1.getCidade().getEstado().getUf());	
		
		
		Aluno aluno2 = t15.getAluno(1);
		
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getCpf());
		System.out.println(aluno2.getRg());
		System.out.println(aluno2.getCidade().getNome());
		System.out.println(aluno2.getCidade().getEstado().getNome());
		System.out.println(aluno2.getCidade().getEstado().getUf());	
		
		
	}

}
