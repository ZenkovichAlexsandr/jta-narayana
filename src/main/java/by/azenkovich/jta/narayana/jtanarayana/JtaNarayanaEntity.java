package by.azenkovich.jta.narayana.jtanarayana;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class JtaNarayanaEntity implements Serializable {
    @Id
    @GeneratedValue
    public Long id;

    public String value;
}
