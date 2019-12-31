package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "players")
public class Player extends Auditable {
    @Getter
    @Setter
    @NotBlank
    private String name;
}
