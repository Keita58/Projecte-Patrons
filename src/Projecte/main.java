package Projecte;
import java.util.*;
import java.sql.*;


public class main {
    public static void main(String[] args) throws SQLException {

        //Punt 1
        Queue<Nau> llistaNaus = new LinkedList<>();

        NauFactory nFactory = new NauFactory();
        RecolectorPunts recolectorPunts = new RecolectorPunts(); //Observer de les naus

        //Creem les naus amb la factory.
        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau lleugera", 10.0, "Llança de la llibertat", 1000));
        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau pesada", 50.0, "Escut de la democràcia", 10000));
        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau exploració", 5.0, "Mapa de les estrelles", 500));

        Iterator<Nau> itNaus = llistaNaus.iterator();
        while(itNaus.hasNext()) {
            Nau nau = itNaus.next();
            System.out.println(nau);
        }

        Iterator<Nau> it = llistaNaus.iterator();
        Nau aux = it.next();

        //Punt 2
        JocFactory jocFactory;


        //Creem un objecte de cada amb l'abstract factory.
        jocFactory = FactoryProvider.getFactory("Enemic");
        Enemic naucombat = (Enemic) jocFactory.create("Enemic", "Nau de combat");
        
        jocFactory = FactoryProvider.getFactory("Recurs");
        Recurs kebab = (Recurs) jocFactory.create("Recurs", "Kebab");
        
        jocFactory = FactoryProvider.getFactory("Equipament");
        Equipament escut = (Equipament) jocFactory.create("Equipament", "Escut protector");

        jocFactory = FactoryProvider.getFactory("Bonus");
        Bonus robot = (Bonus) jocFactory.create("Bonus", "Robot reparador");
        
        jocFactory = FactoryProvider.getFactory("Galàxia");
        Galaxia espiral = (Galaxia) jocFactory.create("Galàxia", "Espiral");
        
        String resultat = "Nau " + naucombat + ", Kebab: " + kebab + ", escut: " + escut + ", robot: " + robot + ", espiral: " + espiral;
        System.out.println(resultat);

        //Punt 3
        System.out.println("Punts del kebab: " + kebab.puntsASumar());
        System.out.println("Punts abans: " + aux.getPunts());

        //La nau es troba amb un recurs (un kebab)
        ObjecteCapturat objc = new ObjecteCapturat(aux, kebab);
        recolectorPunts.setPunts(objc);

        System.out.println("Punts despres: " + aux.getPunts());
        //La nau es troba amb un enemic (una nau de combat)
        ObjecteCapturat objc0 = new ObjecteCapturat(aux, naucombat);
        recolectorPunts.setPunts(objc0);
        System.out.println("Punts despres: " + aux.getPunts());

        //Desubscribim les naus de l'observer.
        for(Nau nau : llistaNaus) {
            if(nau instanceof NauExploracio) {
                recolectorPunts.removePropertyChangeListener((NauExploracio)nau);
            }
            else if(nau instanceof NauLleugera) {
                recolectorPunts.removePropertyChangeListener((NauLleugera)nau);
            }
            else if(nau instanceof NauPesada) {
                recolectorPunts.removePropertyChangeListener((NauPesada)nau);
            }
        }

        //Punt 4 i 5
        //Creem un observer nou per la nau que crearem a continuació.
        //Necessitem un de nou perquè si no estaríem cridant a la nau anterior
        RecolectorPunts recolectorPunts2 = new RecolectorPunts();
        Nau aux1 = nFactory.crearNau(recolectorPunts2, "Nau exploracio", 5.0, "Mincron", 100);
        jocFactory = FactoryProvider.getFactory("Equipament");
        Equipament canon = (Equipament) jocFactory.create("Equipament", "Cano");
        Equipament escut1 = (Equipament) jocFactory.create("Equipament", "Escut protector");

        //Afegim decorators a una nau
        Nau n2 = new EquipamentDecorator(aux1, escut1);
        Nau n3 = new Color(n2, ColorEnum.AQUA);
        Nau n4 = new EquipamentDecorator(n3, canon);
        System.out.println(n4.getDescripcio());

        //La nau amb decorators es troba amb un enemic (nau de combat)
        ObjecteCapturat objc1 = new ObjecteCapturat(n4, naucombat);
        recolectorPunts2.setPunts(objc1);

        //Punt 6

        //Creem diferents naus amb decorators i les afegim a una cua.

        Nau aux2 = nFactory.crearNau(recolectorPunts2, "Nau pesada", 500.0, "Rocinante", 80);
        Galaxia lenticular = (Galaxia) jocFactory.create("Galàxia", "Lenticular");
        Nau n5 = new GalaxiaDecorator(aux2, espiral);
        Nau n6 = new EquipamentDecorator(n5, canon);
        Nau n7 = new Color(n6, ColorEnum.HOTPINK);

        Nau aux3 = nFactory.crearNau(recolectorPunts2, "Nau lleugera", 10.0, "Urithiru", 10);
        Nau n8 = new Color(aux3, ColorEnum.FUCHSIA);
        Nau n9 = new EquipamentDecorator(n8, escut1);
        Nau n10 = new GalaxiaDecorator(n9, lenticular);
        Queue<Nau> llistaNausDecorator = new LinkedList<>();

        llistaNausDecorator.add(n4);
        llistaNausDecorator.add(n7);
        llistaNausDecorator.add(n10);

        Connection conn;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/videojocjdbc?" + "user=root&password=super3");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM jugador");
            boolean trobat = false;

            for (Nau nau: llistaNausDecorator) {
                while(rs.next()) {

                    //Mirem que la nau no estigui ja posada a la base de dades.

                    if (nau instanceof EquipamentDecorator){
                        if (!rs.getString("nom").equals(nau.getNau().getNom())) {
                            trobat = true;
                            break;
                        }
                    }
                    else if (nau instanceof GalaxiaDecorator) {
                        if (!rs.getString("nom").equals(nau.getNau().getNom())) {
                            trobat = true;
                            break;
                        }
                    }
                    else if (nau instanceof Color){
                        if (!rs.getString("nom").equals(nau.getNau().getNom())) {
                            trobat = true;
                            break;
                        }
                    }
                }

                //Si la nau no és a la bd, l'afegim amb un insert.

                if(!trobat) {
                    String sqlInsertar="INSERT INTO jugador (nom, punts, saldo) VALUES (?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(sqlInsertar);
                    if(nau instanceof EquipamentDecorator) {
                        ps.setString(1, nau.getNau().getNom());
                        ps.setDouble(2, 0);
                        ps.setDouble(3, nau.getNau().getSaldoRecursos());
                    }
                    else if(nau instanceof GalaxiaDecorator) {
                        ps.setString(1, nau.getNau().getNom());
                        ps.setDouble(2, 0);
                        ps.setDouble(3, nau.getNau().getSaldoRecursos());
                    }
                    else if(nau instanceof Color) {
                        ps.setString(1, nau.getNau().getNom());
                        ps.setDouble(2, 0);
                        ps.setDouble(3, nau.getNau().getSaldoRecursos());
                    }
                    ps.executeUpdate();
                }
                trobat = false;
            }

            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM jugador");

            //Imprimim el resultat del select.
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("idjugador"));
                System.out.println("Nom: " + rs.getString("nom"));
                System.out.println("Saldo: " + rs.getString("saldo"));
                System.out.println("Punts: " + rs.getString("punts"));
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { }
                rs = null;
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException sqlEx) { }
                st = null;
            }

        }

        jocFactory = FactoryProvider.getFactory("Enemic");
        Enemic meteorit = (Enemic) jocFactory.create("Enemic", "Meteorit");

        //Funció per variar el número de punts de les naus i que funcioni la funció de la base de dades següent

        for(Nau nau : llistaNausDecorator) {
            ObjecteCapturat objc2 = new ObjecteCapturat(nau, kebab);
            recolectorPunts2.setPunts(objc2);
            ObjecteCapturat objc3 = new ObjecteCapturat(nau, naucombat);
            recolectorPunts2.setPunts(objc3);
            ObjecteCapturat objc4 = new ObjecteCapturat(nau, meteorit);
            recolectorPunts2.setPunts(objc4);
            ObjecteCapturat objc5 = new ObjecteCapturat(nau, robot);
            recolectorPunts2.setPunts(objc5);
        }

        Iterator<Nau> it2 = llistaNausDecorator.iterator();

        while(it2.hasNext()) {
            Nau nau = it2.next();
            String nauborrar = "";

            //Mirem si els punts de la nau són més petits de 400 i si ho són fem un delete de la nau.
            if (nau.getNau().getPunts() < 400){
                nauborrar = nau.getNau().getNom();
                it2.remove();
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/videojocjdbc?" + "user=root&password=super3");

                    String borrarSql ="DELETE FROM jugador WHERE nom = ?";
                    PreparedStatement ps = conn.prepareStatement(borrarSql);
                    ps.setString(1, nauborrar);
                    ps.executeUpdate();

                    st = conn.createStatement();
                    rs = st.executeQuery("SELECT * FROM jugador");
                    System.out.println("Naus després del delete: ");
                    while(rs.next()){
                        System.out.println("ID: " + rs.getInt("idjugador"));
                        System.out.println("Nom: " + rs.getString("nom"));
                        System.out.println("Saldo: " + rs.getString("saldo"));
                        System.out.println("Punts: " + rs.getString("punts"));
                    }
                }
                catch(SQLException ex){
                    // handle any errors
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                }
                finally {
                    if (rs != null) {
                        try {
                            rs.close();
                        } catch (SQLException sqlEx) { } // ignore
                        rs = null;
                    }
                    if (st != null) {
                        try {
                            st.close();
                        } catch (SQLException sqlEx) { } // ignore
                        st = null;
                    }
                }
            }
        }

        //Afegim una nau nova amb molts punts i amb la lletra A per si quedés alguna nau després d'haver realitzat
        //el delete anterior poder comprovar si es fa l'ordenació tant de punts com de nom correctament.

        Nau patata = nFactory.crearNau(recolectorPunts2, "Nau lleugera", 8000, "A", 10);
        llistaNausDecorator.add(patata);
        //Utilitzem un SortedSet per a que els compareTo de les classes de les naus funcionin i s'ordenin les naus pel seu nom
        SortedSet<Nau> naves= new TreeSet<>();
        naves.addAll(llistaNausDecorator);

        System.out.println("-------------------------------------");
        System.out.println("Ordenació per nom:");

        //Mostrem les naus ordenades per nom.
        for(Nau nau : naves) {
            System.out.println("Nau: "+nau.getNom()+", Punts: "+nau.getPunts());
        }

        //Ho posem tot en un SortedSet per poder utilitzar la classe PuntsComparator i es compari per número el SortedSet
        //ordenat anteriorment
        SortedSet<Nau> naves2 = new TreeSet<>(new PuntsComparator());
        naves2.addAll(naves);

        System.out.println("-------------------------------------");
        System.out.println("Ordenació per punts:");

        //Mostrem les naus ordenades per punts i per nom.
        for(Nau nau : naves2) {
            System.out.println("Nau: "+nau.getNom()+", Punts: "+nau.getPunts());
        }
    }
}
