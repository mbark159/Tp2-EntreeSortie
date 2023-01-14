package org.example.metier;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>, Serializable {
    private List<Produit> listProduits =new ArrayList<>();
    File file=new File("Produits.dat");

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void add(Produit o) {
        listProduits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return listProduits;
    }


    @Override
    public Produit findById(long id)  {
//        Produit p = new Produit();
        for (Produit oo: this.getAll()) {
            if (oo.getId()==id) {
                return oo;
            }
        }

        return null;
    }


    @Override
    public void delete(long id) {
        for (Produit p:listProduits) {
            if (p.getId() == id) {
                listProduits.remove(p);
                break;
            }else {System.out.println("Product not existe");}
        }
    }


}
