package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;
import java.time.LocalDate;

public class BaseEntity implements Serializable {
     private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
