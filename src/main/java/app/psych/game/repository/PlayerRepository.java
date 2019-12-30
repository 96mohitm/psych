package app.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.psych.game.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}