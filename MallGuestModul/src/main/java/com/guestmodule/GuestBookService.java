import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.guestbook.model.GuestBookEntry;
import com.example.guestbook.repository.GuestBookRepository;

@Service
public class GuestBookService {
    @Autowired
    private GuestBookRepository repository;

    public List<GuestBookEntry> getAllEntries() {
        return repository.findAll();
    }

    public GuestBookEntry addEntry(GuestBookEntry entry) {
        return repository.save(entry);
    }

    public GuestBookEntry getEntryById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Guest Book Entry Not Found"));
    }

    public void deleteEntry(Long id) {
        repository.deleteById(id);
    }
}