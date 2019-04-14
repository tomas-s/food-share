package sk.hilo.database.repository

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import sk.hilo.database.entity.User


@RunWith(SpringRunner::class)
@DataJpaTest
class UserRepositoryTest {
    @Autowired
    lateinit var userRepository: UserRepository

    var user = User(0,"email")
    @Test
    fun addUser() {

        Assert.assertEquals(userRepository.count(),0)
        userRepository.save(user)
        Assert.assertEquals(userRepository.count(),1)
        Assert.assertNotNull(userRepository.findById(user.id).get())

    }
}

