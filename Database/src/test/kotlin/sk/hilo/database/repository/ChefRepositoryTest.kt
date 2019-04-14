package sk.hilo.database.repository

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import sk.hilo.database.entity.Chef


@RunWith(SpringRunner::class)
@DataJpaTest
class ChefRepositoryTest {
    @Autowired
    lateinit var chefRepository: ChefRepository

    var chef = Chef(0,"Jozko","Mrkvicka","rad varim")
    @Test
    fun addUser() {

        Assert.assertEquals(chefRepository.count(),0)
        chefRepository.save(chef)
        Assert.assertEquals(chefRepository.count(),1)
        Assert.assertNotNull(chefRepository.findById(chef.id).get())

    }
}

