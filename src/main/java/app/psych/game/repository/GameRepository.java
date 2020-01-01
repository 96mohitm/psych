package app.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.psych.game.model.Game;

/**
 * GameRepository
 */
public interface GameRepository extends JpaRepository<Game, Long> {
}
