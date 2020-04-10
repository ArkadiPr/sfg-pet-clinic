package guru.springframework.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.time.LocalDate;
import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
