package Oct18Maps.Projects;
// PROGRAMMER: Guido Asbun

import java.util.Map;
import java.util.TreeMap;

public class EmailRecipients {
    // INSTANCE VARIABLES
    private Map<String, String> recipient = new TreeMap<String, String>();

    // CONSTRUCTORS
    public EmailRecipients() {
    }

    // INSTANCE METHODS
    public void addRecipient(String email, String name) {
        recipient.put(email, name);
    }

    public void removeRecipient(String email) {
        recipient.remove(email);
    }

    public int displayRecipients() {
        recipient.forEach((email, name) ->
        {
            System.out.println(name + " (" + email + ")");
        });
        return recipient.size();
    }
}
