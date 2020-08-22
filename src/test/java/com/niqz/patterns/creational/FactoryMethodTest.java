package com.niqz.patterns.creational;

import com.niqz.patterns.creational.factory_method.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {

    enum Pair {
        Basketball(BasketballTeam.class, BasketballPlayer.class),
        Football(FootballTeam.class, FootballPlayer.class);

        Class<? extends Team> teamClass;
        Class<? extends Player> playerClass;

        Pair(Class<? extends Team> teamClass, Class<? extends Player> playerClass) {
            this.teamClass = teamClass;
            this.playerClass = playerClass;
        }
    }

    @ParameterizedTest
    @EnumSource(value = Pair.class)
    public void test(Pair pair) {
        try {
            Team team = pair.teamClass.newInstance();
            Player player = team.generateNewPlayer();
            assertSame(player.getClass(), pair.playerClass);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
