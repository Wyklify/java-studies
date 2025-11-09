package verificar_triangulos;

public class VerificarTriangulo {

    String verificarTrianguloDireito(int a, int b, int c) {

        if ((a * a) + (b * b) == (c * c))
            return "Pode ser triangulo";

        return "Nao pode ser triangulo";
    }

    String verificarTriangulo(int a, int b, int c) {

        if (a + b > c && a + c > b && b + c > a) {

            return "Pode ser triangulo";

        }

        return "Nao pode ser triangulo";
    }

    public static void main(String[] args) {

        VerificarTriangulo a = new VerificarTriangulo();

        System.out.println(a.verificarTrianguloDireito(2, 2, 5));

        System.out.println(a.verificarTriangulo(2, 2, 5));
    }
}
