package by.azenkovich.jta.narayana.jtanarayana;

import java.util.List;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
public interface JtaNarayanaService {
    List<JtaNarayanaEntity> findAll();
    JtaNarayanaEntity save(JtaNarayanaEntity entity);
}
