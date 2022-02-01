package fr.miage.fsgbd;

import javax.swing.tree.DefaultMutableTreeNode;


/**
 * @author Galli Gregory, Mopolo Moke Gabriel
 * 
 */
public class BTreePlus implements java.io.Serializable {
    private Noeud racine;

    public BTreePlus(int u, Executable e) {
        racine = new Noeud(u, e, null);
    }

    public void afficheArbre() {
        racine.afficheNoeud(true, 0);
    }

    /**
     * Méthode récursive permettant de récupérer tous les noeuds
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode bArbreToJTree() {
        return bArbreToJTree(racine);
    }

    private DefaultMutableTreeNode bArbreToJTree(Noeud root) {
        StringBuilder txt = new StringBuilder();
        for (Integer key : root.keys)
            txt.append(key.toString()).append(" ");

        DefaultMutableTreeNode racine2 = new DefaultMutableTreeNode(txt.toString(), true);
        for (Noeud fil : root.fils)
            racine2.add(bArbreToJTree(fil));

        return racine2;
    }


    public boolean addValeur(String valeur) {
        System.out.println("Ajout de la valeur : " + valeur.toString());
        if (racine.contient(Integer.parseInt(valeur.split(",")[1])) == null) {
            Noeud newRacine = racine.addValeur(valeur);
            if (racine != newRacine)
                racine = newRacine;
            return true;
        }
        return false;
    }


    public void removeValeur(Integer valeur) {
        System.out.println("Retrait de la valeur : " + valeur.toString());
        if (racine.contient(valeur) != null) {
            Noeud newRacine = racine.removeValeur(valeur, false);
            if (racine != newRacine)
                racine = newRacine;
        }
    }

    public Noeud rechercheValeur(Integer valeur) {
        return racine.contient(valeur);
    }
}
