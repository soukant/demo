*********** @PathVariable :
L'annotation @PathVariable dans Spring est utilisée pour extraire des valeurs de l'URI de la requête. Elle permet de définir des espaces réservés dans l'URL de votre mapping de requête et de lier 
ces espaces réservés à des paramètres de méthode. Cette annotation est particulièrement utile pour créer des services web RESTful où des parties de l'URL sont dynamiques.

********** ENUM:
En Java, une énumération (ou enum) est un type de classe spécial qui représente un nombre fixe de valeurs distinctes. Les énumérations sont utilisées pour définir un ensemble de constantes nommées.
Exemple : public enum Couleur {

    ROUGE, VERT , BLUE, NOIR
}

******** @Entity :
@Entity est une annotation qui marque une classe Java comme une entité, qui est un objet de domaine de persistance léger. En d'autres termes, c'est une classe Java qui représente une table dans une base de données.

******* @NoArgsConstructor : 
L'annotation @NoArgsConstructor est utilisée pour générer un constructeur sans argument pour la classe à laquelle elle est appliquée. Cela signifie que Lombok créera automatiquement un constructeur sans paramètres pour la classe.

Exemple : 
public User() {
    // Constructeur sans argument
}

******* @AllArgsConstructor :

L'annotation @AllArgsConstructor fait partie de la bibliothèque Lombok en Java. Lombok est une bibliothèque populaire qui aide à réduire le code boilerplate dans les projets Java.
Exemple :

public User(String nom , int age) {
    this.nom = nom;
    this.age = age;
}

****** @Builder

Voici une explication détaillée de ce que fait l'annotation @Builder :

Elle génère une classe de construction pour la classe annotée, ce qui permet de créer des objets de manière plus lisible et flexible.
Elle fournit une façon de définir les propriétés de l'objet de manière étape par étape, plutôt que de devoir passer toutes les propriétés dans un seul appel de constructeur.
Elle génère également une méthode build() qui retourne l'objet final.


******** @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
En résumé, ce code est utilisé pour annoter un champ comme clé primaire d'une entité et pour spécifier que la valeur de la clé primaire doit être générée automatiquement par la base de données en utilisant une stratégie d'auto-incrémentation.



