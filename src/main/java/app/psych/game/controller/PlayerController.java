package app.psych.game.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.psych.game.model.Player;
import app.psych.game.repository.PlayerRepository;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    // @GetMapping("/players")
    // public List<Player> getAllPlayers() {
    //     return playerRepository.findAll();
    // }

    // @PostMapping("/players")
    // public Player createPlayer(@Valid @RequestBody Player player) {
    //     return playerRepository.save(player);
    // }

    // @GetMapping("/players/{id}")
    // public Player getPlayerById(@PathVariable(value = "id") Long id) throws Exception {
    //     return playerRepository.findById(id).orElseThrow(() -> new Exception("something went wrong!"));
    // }

    // @PutMapping("players/{id}")
    // public Player updatePlayer(@PathVariable(value = "id") Long id, @Valid @RequestBody Player player) throws Exception {
    //     Player p = playerRepository.findById(id).orElseThrow(() -> new Exception("Something went wrong!"));
    //     p.setName(player.getName());
    //     return playerRepository.save(p);
    // }

    // @DeleteMapping("/players/{id}")
    // public ResponseEntity<?> deletePlayer(@PathVariable(value = "id") Long id) throws Exception {
    //     Player p = playerRepository.findById(id).orElseThrow(() -> new Exception("Something went wrong!"));
    //     playerRepository.delete(p);
    //     return ResponseEntity.ok().build();
    // }
}
