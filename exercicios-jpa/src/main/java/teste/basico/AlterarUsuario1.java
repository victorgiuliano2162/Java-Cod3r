
package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		System.out.println(usuario.getNome());
		usuario.setNome("Luiz");
		usuario.setEmail("luiz@gmail.com");
		
		//Depois de encontrado o Usuário no banco de dados podemos acessar e reescrever seus atributos da mesma forma que faríamos com um objeto.
		
		em.merge(usuario);
		//Contudo, para fazer as alterações subirem da memória do computador para o BD é preciso fazer uso do método merge
		//Quando criámos um novo usuário usamos do método persist() para subí-lo ao BD, aqui queremos que uma alteração seja somada a um usuário já existente
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
