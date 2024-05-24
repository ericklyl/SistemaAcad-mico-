package Notas;

/**
 * Classe principal
 * @author Hilario Seibel Junior
 */
public class Main {
    public static void main(String[] args) {
        Entrada io = new Entrada();
        Sistema s = new Sistema();

        int op = io.menu1();

        while (op != 0) {
            if (op == 1) {
                
                io.cadProf(s);
            }
            if (op == 2) {
                
                io.cadAluno(s);
            }
            if (op == 3) {
                
                Turma t = io.cadTurma(s);
                t.medias();
            }

            op = io.menu1();
        }
    }
}