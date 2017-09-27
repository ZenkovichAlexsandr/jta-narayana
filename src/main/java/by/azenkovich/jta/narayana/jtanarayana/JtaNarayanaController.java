package by.azenkovich.jta.narayana.jtanarayana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
@RestController
public class JtaNarayanaController {
    @Autowired
    private JtaNarayanaService service;

    @GetMapping
    public List<JtaNarayanaEntity> findAll() {
        return service.findAll();
    }

    @PostMapping
    public JtaNarayanaEntity save(@RequestBody final JtaNarayanaEntity entity) {
        return service.save(entity);
    }
}
