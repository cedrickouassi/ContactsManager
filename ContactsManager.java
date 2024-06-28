public class ContactsManager {
    // Attributs
    Contact[] myFriends;
    int friendsCount;

    // Constructeur par défaut
    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact
    public void addContact(Contact contact) {
        if (friendsCount < 500) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        } else {
            System.out.println("Impossible d'ajouter plus de contacts. Le tableau est plein.");
        }
    }

    // Méthode pour rechercher un contact par nom
    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null; // Retourne null si le contact n'est pas trouvé
    }

    // Méthode main pour tester le fonctionnement
    public static void main(String[] args) {
        // Création d'un objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Ajout de quelques contacts
        Contact friend1 = new Contact("Alice", "1234567890");
        myContactsManager.addContact(friend1);

        Contact friend2 = new Contact("Bob", "9876543210");
        myContactsManager.addContact(friend2);

        Contact friend3 = new Contact("Charlie", "5678901234");
        myContactsManager.addContact(friend3);

        Contact friend4 = new Contact("David", "4567890123");
        myContactsManager.addContact(friend4);

        Contact friend5 = new Contact("Eve", "6789012345");
        myContactsManager.addContact(friend5);

        // Recherche d'un contact par nom
        String searchName = "Charlie";
        Contact foundContact = myContactsManager.searchContact(searchName);

        if (foundContact != null) {
            System.out.println("Le numéro de téléphone de " + searchName + " est : " + foundContact.phoneNumber);
        } else {
            System.out.println("Le contact " + searchName + " n'a pas été trouvé.");
        }
    }
}
