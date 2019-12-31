package app.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.psych.game.model.Question;

/**
 * QuestionRepository
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}