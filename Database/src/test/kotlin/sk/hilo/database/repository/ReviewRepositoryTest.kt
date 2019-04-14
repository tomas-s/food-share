package sk.hilo.database.repository

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import sk.hilo.database.entity.Review


@RunWith(SpringRunner::class)
@DataJpaTest
class ReviewRepositoryTest {
    @Autowired
    lateinit var reviewRepository: ReviewRepository

    var review = Review(0,5,"very good")
    @Test
    fun addUser() {

        Assert.assertEquals(reviewRepository.count(),0)
        reviewRepository.save(review)
        Assert.assertEquals(reviewRepository.count(),1)
        Assert.assertNotNull(reviewRepository.findById(review.id).get())

    }
}

