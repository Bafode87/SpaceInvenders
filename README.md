# SpaceInvenders
I – Introduction

L’objectif de ce projet est de reproduire un mini-jeu qui se nomme « Space Invenders ». Space Invenders est un jeu de tire spatial fixe en deux dimensions. Le joueur contrôle un canon laser qu'il peut déplacer horizontalement, au bas de l'écran. Dans les airs, des rangées d'aliens se déplacent latéralement tout en se rapprochant progressivement du sol et en lançant des missiles. L'objectif est de détruire avec le canon laser une vague ennemie, qui se compose de cinq rangées de onze aliens chacune, avant qu'elle n'atteigne le bas de l'écran. Le joueur gagne des points à chaque fois qu'il détruit un envahisseur. Le jeu n'autorise qu'un tir à la fois et permet d'annuler ceux des ennemis en tirant dessus. La vitesse et la musique s'accélèrent au fur et à mesure que le nombre d'aliens diminue. L'élimination totale de ces derniers amène une nouvelle vague ennemie plus difficile, et ce indéfiniment. Le jeu ne se termine que lorsque le joueur perd, ce qui en fait le premier jeu sans fin. Pour ce faire, nous devons développer en TDD (Test Driven Devlopment), c’est-à-dire que nous devons écrire les tests avant d’écrire le code source.

II – Glossaire

•	Vaisseau : véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.
•	Envahisseur : ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.
•	Missile : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire







III – Semaine n°1 : du 26 au 30 avril

Cette semaine, j’ai développé les deux premières stories de la première fonctionnalité, déplacer le vaisseau dans l’espace jeu : la première stories est la création de l’espace jeu et la deuxième stories et le positionnement du vaisseau dans l’espace jeu. Je n’ai pas rencontré de difficultés particulières, mise à part que j’ai perdu beaucoup de temps car je n’arrivais pas à passer un test au vert. Pour la prochaine séance, mon objectif et de finir la première fonctionnalité et de si possible finir les fonctionnalités 2, 3 et 4.
1.	Fonctionnalité n°1 : Déplacer le vaisseau dans l’espace jeu

Dans la première stories « Création d’un espace jeu », il n’y a qu’un seul critère d’acceptance : un espace de jeu vide aux dimensions données (2D). Puis dans la deuxième stories « Positionnement du vaisseau dans l’espace jeu », il y a deux critères d’acceptance : Un nouveau vaisseau est créé et le vaisseau est positionné aux coordonnées transmises. On peut ajouter à ces critères d’acceptance des contraintes, en effet, par exemple, on considère que le coin supérieur gauche de l'espace jeu (point en haut à gauche) a pour coordonnées (0,0). 
IV – Diagramme de classes

<img src="../Image/DiagrammeDeClasse">
 
V – Nuage de mots

