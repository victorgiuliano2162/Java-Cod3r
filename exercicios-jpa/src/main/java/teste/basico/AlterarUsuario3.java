package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7l);
		em.detach(usuario);
		//Através do método detach() desacoplamos nossas alterações e linhas de códigos que poderiam provocar mudanças no mysql
		usuario.setNome("Carlos Mariguella");
		
//		em.merge();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
