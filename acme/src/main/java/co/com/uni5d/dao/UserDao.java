package co.com.uni5d.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import co.com.uni5d.anotaciones.AcmeDao;
import co.com.uni5d.domain.User;

@AcmeDao
public class UserDao {

	@Autowired
	MongoTemplate mongoTemplate;

	public User buscarUsuarioById() {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is("usuario DB"));
		return mongoTemplate.findOne(query, User.class);
	}

}
