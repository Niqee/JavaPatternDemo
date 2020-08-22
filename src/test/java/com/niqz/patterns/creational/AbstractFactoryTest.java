package com.niqz.patterns.creational;

import com.niqz.patterns.creational.abstract_factory.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    enum TestCase {
        Basketball(BasketballFactory.class, BasketballBall.class, BasketballSneakers.class),
        Football(FootballFactory.class, FootballBall.class, FootballSneakers.class);

        Class<? extends Factory> factoryClass;
        Class<? extends Ball> ballClass;
        Class<? extends Sneakers> sneakersClass;

        TestCase(Class<? extends Factory> factoryClass,
                 Class<? extends Ball> ballClass,
                 Class<? extends Sneakers> sneakersClass) {
            this.factoryClass = factoryClass;
            this.ballClass = ballClass;
            this.sneakersClass = sneakersClass;
        }
    }

    @ParameterizedTest
    @EnumSource(value = TestCase.class)
    public void test(TestCase testCase) {
        try {
            Factory factory = testCase.factoryClass.newInstance();
            Ball ball = factory.createBall();
            Sneakers sneakers = factory.createSneakers();

            assertSame(ball.getClass(), testCase.ballClass);
            assertSame(sneakers.getClass(), testCase.sneakersClass);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
