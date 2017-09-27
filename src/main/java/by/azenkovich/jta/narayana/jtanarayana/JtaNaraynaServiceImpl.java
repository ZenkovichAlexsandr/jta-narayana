package by.azenkovich.jta.narayana.jtanarayana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
@Service
public class JtaNaraynaServiceImpl implements JtaNarayanaService {
    @Autowired
    private JtaNarayanaRepository repository;
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public List<JtaNarayanaEntity> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public JtaNarayanaEntity save(final JtaNarayanaEntity entity) {
        jmsTemplate.convertAndSend(JtaNarayanaListener.DESTINATION, entity);
        return repository.save(entity);
    }
}
