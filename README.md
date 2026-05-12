# NavigationDrawerDemo

https://github.com/user-attachments/assets/6ac11313-e326-43d1-a021-73b2d0672844


## Objectif

Le but de ce TP est de créer une application Android qui utilise un Navigation Drawer et des fragments.

## Concepts étudiés

- Navigation Drawer
- DrawerLayout
- NavigationView
- Fragment
- FragmentTransaction
- ListFragment
- Menu items

## Structure du projet

- MainActivity.java
- BlankFragment.java
- BlankFragment2.java
- FragmentList.java
- activity_main_drawer.xml
- content_main.xml
- fragment_blank.xml
- fragment_blank2.xml

## Description des étapes

### Étape 1 : Création du projet

Le projet a été créé dans Android Studio avec le template Navigation Drawer Activity, le langage Java et un Min SDK 24.

### Étape 2 : Modification du menu

Le menu du drawer a été modifié dans activity_main_drawer.xml avec trois éléments : Fragment 1, Fragment 2 et Fragment List.

### Étape 3 : Création des fragments

Deux fragments simples ont été créés avec des couleurs de fond différentes.

### Étape 4 : Création du conteneur

Un FrameLayout nommé contenu a été ajouté dans content_main.xml pour afficher les fragments dynamiquement.

### Étape 5 : Gestion des clics du menu

La méthode onNavigationItemSelected() détecte l'élément sélectionné dans le menu et remplace le fragment affiché.

### Étape 6 : Ajout de la liste

FragmentList hérite de ListFragment et affiche 10 éléments simples avec un ArrayAdapter.

### Étape 7 : Test de l’application

- Fragment 1 affiche un fond rose.
- Fragment 2 affiche un fond bleu.
- Fragment List affiche une liste d'éléments.



## Conclusion

Ce TP montre comment utiliser un Navigation Drawer pour passer dynamiquement entre plusieurs fragments dans une application Android.
