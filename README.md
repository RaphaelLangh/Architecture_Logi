# Architecture_Logi

Notre projet (dans le repertoire Archi_Log/tp1) est composé de : 


Une interface File qui définit une file comme implémentant les méthodes : 

boolean estvide()
T head() qui retourne le tête de la file 
Iterator iteration() qui retourne un itérateur sur la liste
T pull() qui enlève la tête de la file et la retourne 
push(T e) qui ajoute l’élément e à la queue de la file


D’une classe abstraite ServiceFileSurObjet qui implémente l’interface File et nous permet de factoriser les méthodes toString() et equals(File f) qui ne peuvent être des méthodes « default »


D’une interface ServiceFile étendant File qui contient les méthodes par défaut size() et contient().


Les 4 méthodes toString(), equals(File f), size() et contient(T e) ont une complexité linéaire (elle parcourt la file à l’aide de l’itérateur). 

 
