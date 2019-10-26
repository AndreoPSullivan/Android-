package com.example.p1;


import java.util.ArrayList;

public class DatabaseQuestions {

    ArrayList<Question> questionArrayList;

    public ArrayList<Question> initEasyMode(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question(R.drawable.bellaybestia, "¿Dónde se desarrolla \" La Bella y La Bestia\"?",
                "Reino Unido", "Francia", "Japón", "Alemania", "Francia"));
        questionArrayList.add(new Question(R.drawable.mulan, "¿Cómo se llama la mascota dragón de Mulán?",
                "Drako", "Koi", "Meshi", "Mushu", "Mushu"));
        questionArrayList.add(new Question(R.drawable.tristeza,"¿Cuántos sentidos protagonizan la película \"Del Revés\"?",
                "3", "6", "4", "5", "5"));
        questionArrayList.add(new Question(R.drawable.scar,"¿Cómo se llama el malo de \" El Rey León\"?",
                "Simba", "Scar", "Nala", "Mufasa", "Scar"));
        questionArrayList.add(new Question(R.drawable.maleficent,"¿Cuál de estas actrices hizo de Maléfica en \"Maléfica\"?" ,
                "Angelina Jolie", "Miley Cyrus", "Lindsay Lohan", "Emma Watson", "Angelina Jolie"));
        questionArrayList.add(new Question(R.drawable.sully,"¿Cómo llama Boo a Sully en \"Monstruos S.A.\"?",
                "Azulito", "Sully", "Gatito", "Peludo", "Gatito"));
        questionArrayList.add(new Question(R.drawable.bh6,"¿De qué color es Baymax en \"Big Hero Six\"?" ,
                "Blanco", "Azul", "Negro", "Rosa", "Blanco"));
        questionArrayList.add(new Question(R.drawable.ts4, "¿De qué está hecho Forky en  \"Toy Story 4\"?" ,
                "De una cucharilla", "De un tenedor de plástico", "De pajitas", "De papel", "De un tenedor de plástico"));
        questionArrayList.add(new Question(R.drawable.aladdin,"¿Sobre qué vuelan Aladdin y Jazmín en \"Aladdin\"?",
                "Un caballo", "Una silla", "Una alfombra", "Un mantel", "Una alfombra"));
        questionArrayList.add(new Question(R.drawable.ts,"¿Qué nombre aparece escrito bajo la bota de Woody en \"Toy Story\"?",
                "Woody", "Andy", "Jamie", "Buzz", "Andy"));
        questionArrayList.add(new Question(R.drawable.pocahontas,"¿Qué animal acompaña a Pocahontas?",
                "Un mapache", "Un león", "Una mariposa", "Un perro", "Un mapache"));
        questionArrayList.add(new Question(R.drawable.cenicienta, "¿A qué película se correponde este fotograma?",
                "La Bella Durmiente", "Cenicienta", "La Bella y La Bestia", "Fantasía", "Cenicienta"));
        questionArrayList.add(new Question(R.drawable.brave, "¿De qué color tiene el pelo Mérida, la protagonista de la película \"Indomable\"?",
                "Pelirrojo", "Castaño", "Rubio", "Moreno", "Pelirrojo"));
        questionArrayList.add(new Question(R.drawable.coco, "¿Qué instrumento toca Miguel, el protagonista de \"Coco\"?",
                "El tambor", "La flauta", "La guitarra", "El piano", "La guitarra"));


        return questionArrayList;
    }

    public ArrayList<Question> initMediumMode(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question(R.drawable.nemo, "En la película Buscando a Nemo, ¿en qué ciudad acaba Nemo?",
                "Ontario", "Sydney", "Melbourne", "Rio de Janeiro", "Sydney"));
        questionArrayList.add(new Question(R.drawable.pixar,"¿Cuál de estas películas no ha sido producida por Pixar Animation Studios?",
                "Toy Story", "Indomable", "¡Rompe Ralph!", "Coco", "¡Rompe Ralph!"));
        questionArrayList.add(new Question(R.drawable.disney,"¿Cuál de estas películas no tiene segunda parte?",
                "Ratatouille", "Cars", "Buscando a Nemo", "Toy Story", "Ratatouille"));
        questionArrayList.add(new Question(R.drawable.tangled, "¿De qué color es el pelo de Rapunzel después de tener que cortárselo en \"Enredados\"?",
                "Moreno", "Castaño", "Rubio", "Pelirrojo", "Castaño"));
        questionArrayList.add(new Question(R.drawable.bh6,"¿Dónde se desarrolla la película \"Big Hero Six\"?",
                "Nueva Tokyo", "San Tokyo",  "San Fransokyo", "Tokyo York", "San Fransokyo"));
        questionArrayList.add(new Question(R.drawable.frozen,"¿En qué año se estrenó la película \"Frozen\"?",
                "2012", "2010", "2013", "2015", "2013"));
        questionArrayList.add(new Question(R.drawable.dwarfs,"¿Cuál de estos no es un enanito en \"Blancanieves y los Siete Enanitos\"?" ,
                "Mudito", "Simpático", "Sabio", "Gruñón", "Simpático"));
        questionArrayList.add(new Question(R.drawable.tambor, "¿Cómo se llama el conejo que aparece en \"Bambi\"?",
                "Tambor", "Faline", "Flor", "Césped", "Tampor"));
        questionArrayList.add(new Question(R.drawable.marypoppins, "¿Con qué animales bailan Bert, \"El deshonillador\", y Mary Poppins en la película \"Mary Poppins\"?",
                "Gatos", "Pájaros", "Pingüinos", "Perros", "Pingüinos"));
        questionArrayList.add(new Question(R.drawable.jorobado_escena, "¿En qué ciudad se desarrolla la historia de la película \"El Jorobado de Notre Dame\"?",
                "París", "Lyon", "Praga", "Roma", "París"));
        questionArrayList.add(new Question(R.drawable.up, "¿Cómo se llama el perro hablador de \"Up\"?",
                "Russell", "Dug", "Tom", "Gamma", "Dug"));
        questionArrayList.add(new Question(R.drawable.ratatouille, "¿Dónde se esconde Remy para ayudar a cocinar a Linguini sin ser descubierto en \"Ratatouille\"?",
                "En un armario", "En una manga de la chaqueta", "En el gorro", "En un bote", "En el gorro"));
        questionArrayList.add(new Question(R.drawable.walle, "¿Para qué destinan a WALL-E a la Tierra?", "Para conocer a EVE", "Para restaurar y limpiar el planeta",
                "Para buscar objetos preciosos", "Para descubrir nueva vida", "Para restaurar y limpiar el planeta" ));
        questionArrayList.add(new Question(R.drawable.ralph2, "¿A cuál de estas princesas no entienden las demás en \"Ralph Rompe Internet\"?",
                "Vanellope Von Schweetz", "Pocahontas", "Mérida", "Tiana", "Mérida"));


        return questionArrayList;
    }

    public ArrayList<Question> initHardMode(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question(R.drawable.disney, "¿Cuál de estas películas es más antigua?",
                "Dumbo", "Pinocho", "Frozen", "Aladdin", "Pinocho"));
        questionArrayList.add(new Question(R.drawable.jorobado_escena, "¿A qué película pertenece esta escena?",
                "La Dama y el Vagabundo", "El Jorobado de Notre Dame", "Tiana y el Sapo", "Enredados",
                "El Jorobado de Notre Dame"));
        questionArrayList.add(new Question(R.drawable.sally,"¿Cómo se llama esta compañera de Rayo McQueen en \"Cars\"?",
                "Mate", "Sally Carrera", "Lizzie", "Chick Hicks", "Sally Carrera"));
        questionArrayList.add(new Question(R.drawable.pixar, "¿En qué año se realizó la primera película animada en 3D por Pixar Animation Studios",
                "1990", "1997", "2000", "1995", "1995"));
        questionArrayList.add(new Question(R.drawable.boo, "¿Cómo se llama realmente Boo en \"Monstruos S.A.\"?",
                "Anne", "Jules", "Mary", "Zoe", "Mary"));
        questionArrayList.add(new Question(R.drawable.monsters, "¿Cuál de éstos, no es un equipo en \"Monstruos University\"?",
                "Roar Omega Roar", "Ops Black Panther", "Python Nu Kappa", "Oozma Kappa", "Ops Black Panther"));
        questionArrayList.add(new Question(R.drawable.marypoppins, "¿De cuál de estos colores no es uno de los caballitos de tiovivo donde se montan los personajes de \"Mary Poppins\"?",
                "Lila", "Azul", "Rosa", "Verde", "Verde"));
        questionArrayList.add(new Question(R.drawable.zootopia, "¿Qué artista pone voz a la canción \"Try Everything\"cantada por Gazelle en \"Zootrópolis\"?",
                "Demi Lovato", "Miley Cyrus", "Beyoncé", "Shakira", "Shakira"));
        questionArrayList.add(new Question(R.drawable.ts1, "Al final de la película,¿qué regalo recibe Andy por navidad en \"Toy Story\"?",
                "Un muñeco de acción", "Un perro", "Un coche teledirigido", "Un ordenador", "Un perro"));
        questionArrayList.add(new Question(R.drawable.tortuga, "¿Cuántos años tiene \"Crush\", la tortuga marina que aparece en \"Buscando a Nemo\"?",
                "150", "50", "30", "100", "150"));
        questionArrayList.add(new Question(R.drawable.ts2, "¿De qué color es la maleta en la que viajan los juguetes en el sistema de transporte de cintas del aeropuerto en \"Toy Story 2\"?",
                "Roja", "Azul", "Marrón", "Verde", "Verde"));
        questionArrayList.add(new Question(R.drawable.lilo, "¿Cómo se llama la hermana mayor de Lilo en \"Lilo & Stitch\"?",
                "Nani", "Wendy", "Annie", "Sophie", "Nani"));
        questionArrayList.add(new Question(R.drawable.ralph, "¿Cómo se llama el personaje que arregla los cristales en el videojuego de Ralph de \"¡Rompe Ralph!\"?",
                "Fix-It Felix","Fix-It Felix Jr.", "Fix-It Felix Sr.", "Felix", "Fix-It Felix Jr."));


        return questionArrayList;
    }


    public ArrayList<Question> initEasyModeImages(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question("¿Cuál de estas imágenes se corresponde con \"Buscando a Nemo\"?",
                R.drawable.nemo, R.drawable.bellaybestia, R.drawable.disney, R.drawable.jorobado_escena, R.drawable.nemo));
        questionArrayList.add(new Question("¿Cuál de estas películas se desarrolla en Asia?", R.drawable.nemo,
                R.drawable.mulan, R.drawable.bellaybestia, R.drawable.jorobado_escena, R.drawable.mulan));
        questionArrayList.add(new Question("¿Cuál de estos personajes representa a Tristeza en \"Del Revés\"?",
                R.drawable.joy, R.drawable.disgust, R.drawable.tristeza2, R.drawable.fear, R.drawable.tristeza));
        questionArrayList.add(new Question("¿Cuál de estas películas se desarrolla en México?",
                R.drawable.dwarfs, R.drawable.ratatouille, R.drawable.nemo, R.drawable.coco2, R.drawable.coco2));
        questionArrayList.add(new Question("¿Cuál de estas escenas pertence a \"Tarzán\"?",
                R.drawable.tarzan, R.drawable.brave, R.drawable.jorobado_escena, R.drawable.pp2, R.drawable.tarzan));


        return questionArrayList;
    }

    public ArrayList<Question> initMediumModeImages(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question("¿Cuál de estas películas no pertenece a Disney?",
                R.drawable.novia, R.drawable.nightmare, R.drawable.alice, R.drawable.incredibles, R.drawable.novia));
        questionArrayList.add(new Question("¿Cuál de estas películas no pertenece a Pixar Animation Studios?",
                R.drawable.incredibles, R.drawable.monsters, R.drawable.coco2, R.drawable.frozen, R.drawable.frozen));
        questionArrayList.add(new Question("¿En cuál de estas películas aparece Nick Wilde?",
                R.drawable.incredibles, R.drawable.zootopia2, R.drawable.frozen, R.drawable.nemo, R.drawable.zootopia2));
        questionArrayList.add(new Question("¿En cuál de estas películas no aparece un perro como personaje relevante?",
                R.drawable.ts2, R.drawable.up, R.drawable.coco, R.drawable.pocahontas, R.drawable.pocahontas));
        questionArrayList.add(new Question("¿Cuál de estas películas no se desarrolla en Francia?",
                R.drawable.ratatouille, R.drawable.jorobado, R.drawable.brave2, R.drawable.bellaybestia, R.drawable.brave2));
        return questionArrayList;
    }

    public ArrayList<Question> initHardModeImages(){
        questionArrayList = new ArrayList<Question>();

        questionArrayList.add(new Question("¿Cuál de estas imágenes no es una escena de la película \"Peter Pan\"?",
                R.drawable.pp2, R.drawable.atlantis, R.drawable.pp3, R.drawable.pp1, R.drawable.atlantis));
        questionArrayList.add(new Question("¿En cuál de estas películas aparece un dragón?",
                R.drawable.nemo, R.drawable.monsters, R.drawable.bellaybestia, R.drawable.frozen, R.drawable.monsters));
        questionArrayList.add(new Question("¿Cuál de estas películas es más reciente?",
                R.drawable.incredibles, R.drawable.ts4, R.drawable.coco2, R.drawable.ralph2, R.drawable.ts4));
        questionArrayList.add(new Question("¿En cuál de estas películas aparece un \"semi-Dios\"?",
                R.drawable.coco2, R.drawable.aladdin, R.drawable.moana, R.drawable.hercules, R.drawable.moana));
        questionArrayList.add(new Question("¿Cuál de estas películas no pertenece a Pixar Animation Studios",
                R.drawable.bichos, R.drawable.libro, R.drawable.brave2, R.drawable.dinosaur, R.drawable.libro));

        return questionArrayList;
    }




}
