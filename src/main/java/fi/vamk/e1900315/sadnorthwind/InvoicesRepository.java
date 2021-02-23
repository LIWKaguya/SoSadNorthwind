package fi.vamk.e1900315.sadnorthwind;

import org.springframework.data.repository.CrudRepository;

public interface InvoicesRepository extends CrudRepository<Invoices, Integer> {
}