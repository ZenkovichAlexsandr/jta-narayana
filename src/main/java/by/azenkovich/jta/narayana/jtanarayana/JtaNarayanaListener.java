package by.azenkovich.jta.narayana.jtanarayana;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
@Component
public class JtaNarayanaListener {
    public static final String DESTINATION = "JtaNarayana";

    @JmsListener(destination = DESTINATION)
    public void onMessage(final JtaNarayanaEntity entity) {
        System.out.println(entity);
        throw new RuntimeException("Generated exception");
    }
}
