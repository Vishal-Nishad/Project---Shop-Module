import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.guestbook.model.GuestBookEntry;
import com.example.guestbook.service.GuestBookService;

@RestController
public class GuestBookController {
    @Autowired
    private GuestBookService service;

    @GetMapping("/entries")
    public ResponseEntity<List<GuestBookEntry>> getAllEntries() {
        return new ResponseEntity<>(service.getAllEntries(), HttpStatus.OK);
    }

    @PostMapping("/entries")
    public ResponseEntity<GuestBookEntry> addEntry(@RequestBody GuestBookEntry entry) {
        return new ResponseEntity<>(service.addEntry(entry), HttpStatus.CREATED);
    }

    @GetMapping("/entries/{id}")
    public ResponseEntity<GuestBookEntry> getEntryById(@PathVariable Long id) {
        GuestBookEntry entry = service.getEntryById(id);
        return new ResponseEntity<>(entry, HttpStatus.OK);
    }

    @DeleteMapping("/entries/{id}")
    public ResponseEntity<Void> deleteEntry(@PathVariable Long id) {
        service.deleteEntry(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}