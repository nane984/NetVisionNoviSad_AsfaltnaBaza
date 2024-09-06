package db;

import db.Sarza;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-24T00:37:34")
@StaticMetamodel(Otprema.class)
public class Otprema_ { 

    public static volatile SingularAttribute<Otprema, Date> datum;
    public static volatile SingularAttribute<Otprema, Integer> izdatokg;
    public static volatile SingularAttribute<Otprema, String> vozac;
    public static volatile CollectionAttribute<Otprema, Sarza> sarzaCollection;
    public static volatile SingularAttribute<Otprema, String> kupac;
    public static volatile SingularAttribute<Otprema, Integer> zadatokg;
    public static volatile SingularAttribute<Otprema, String> receptura;
    public static volatile SingularAttribute<Otprema, String> vozilo;
    public static volatile SingularAttribute<Otprema, Long> id;
    public static volatile SingularAttribute<Otprema, String> gradiliste;
    public static volatile SingularAttribute<Otprema, Integer> povrat;

}