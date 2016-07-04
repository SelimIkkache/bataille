# bataille
programme d'apprentissage de java: un simple jeu de bataille

Nous nous appuierons sur les règles de la bataille que l’on peut trouver sur Wikipédia : https://fr.wikipedia.org/wiki/Bataille_(jeu).

Règle actuelle
On distribue l'ensemble d'un (ou plusieurs) jeu de cartes (54 ou 32) aux joueurs, qui n'en prennent pas connaissance. À chaque tour, chaque joueur retourne la carte du haut de sa main (ou son tas). Celui qui a la carte de la plus haute valeur — selon la hiérarchie du bridge : As, Roi, Dame, Valet, dix… jusqu'au deux — fait la levée, qu'il place sous son tas.

En cas d'égalité de valeurs — cas appelé bataille — les joueurs en ballotage disent « bataille ! », et commencent par placer une première carte face cachée puis une seconde carte face visible pour décider qui fera la levée. En cas de nouvelle égalité, la procédure est répétée. La bataille est parfois l'occasion d'acquérir une grosse carte et c'est l'unique manière de gagner un as. Sans bataille et à moins qu'un joueur ne possède tous les as, il serait impossible de terminer une partie de bataille. La partie se termine et le gagnant est déterminé lorsque ce dernier a en sa possession toutes les cartes du jeu.

Avec ces règles, il est possible de calculer le nombre moyen de plis nécessaires pour terminer une partie à deux joueurs. Une simulation numérique donne une moyenne de 480 plis et une médiane de 360 plis. Un coup moyen durant typiquement 10 secondes, 50% des parties durent 1h ou plus. Toujours par simulation numérique on peut estimer à 90% de chance de victoire pour une main initiale contenant les 4 as et à 70% de chance de victoire pour une main initiale n'en contenant que 3. L'avantage pour des mains contenant les 4 rois est bien plus faible car cela donne une probabilité de victoire de 56% uniquement. 
