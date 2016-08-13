package co.com.uni5d.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.uni5d.anotaciones.AcmeService;
import co.com.uni5d.dao.UserDao;
import co.com.uni5d.domain.User;

@AcmeService
public class ImpUserService implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public User consultarUsuario(long id) {

		User u = userDao.buscarUsuarioById();

		return u;
	}

}
