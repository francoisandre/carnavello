package fr.carnavello.administration.commons.security.impl.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.carnavello.administration.commons.Application;
import fr.carnavello.administration.commons.security.api.SecuritySystemException;
import fr.carnavello.administration.commons.security.api.User;
import fr.carnavello.administration.commons.security.api.dao.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/applicationContext-test.xml"})
public class TestSpringDAOFactory {
	
	@Test
	public void testContextLoading() throws SecuritySystemException 
	{
		UserDAO userDAO = (UserDAO) Application.getInstance().getBeanFactory().getBeanByName("userDAO");
		Assert.assertNotNull("Le DAO doit être trouvé", userDAO);
		List<User> allUsers = userDAO.findAll();
		Assert.assertEquals("Il doit y avoir deux utilisateurs", 2, allUsers.size());
		Assert.assertNull("Le user inexistant doit être absent", userDAO.findUserByLogin("inexistant"));
		User adminUser = userDAO.findUserByLogin("adminUser");
		Assert.assertNotNull("Le user adminUser doit être présent", adminUser);
		Assert.assertTrue("le user adminUser doit avoir la permission deleteUser", adminUser.hasPermission("deleteUser", null));
		User readerUser = userDAO.findUserByLogin("readerUser");
		Assert.assertNotNull("Le user readerUser doit être présent", readerUser);
		Assert.assertFalse("le user admin doit avoir la permission deleteUser", readerUser.hasPermission("deleteUser", null));
		Assert.assertTrue("le user adminUser doit avoir la permission consultUser", readerUser.hasPermission("consultUser", null));
	}
}
