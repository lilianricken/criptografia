import algoritmos.AES;
import algoritmos.RSA;

public class Execucao {
    public static void main(String[] args) throws Exception {
        String textoOriginal = "alg.RSA é um algoritmo que deve o seu nome a três professores do MIT: " +
                "Ronald Rivest, Adi Shamir e Leonard Adleman";
        String chaveAes = "bigdataanalytics"; //tamanho: 16

        System.out.println("Texto original: " + textoOriginal + "\nPerformance:");

        System.out.println("\na. Utilizando o algoritmo alg.RSA com chave pública de 1024 bits.");
        RSA.RSAPub(1024, textoOriginal);

        System.out.println("\nb. Utilizando o algoritmo alg.RSA com chave privada de 1024 bits.");
        RSA.RSApvt(1024, textoOriginal);

        System.out.println("\nc. Utilizando o algoritmo alg.RSA com chave pública de 2048 bits.");
        RSA.RSAPub(2048, textoOriginal);

        System.out.println("\nd. Utilizando o algoritmo alg.RSA com chave privada de 2048 bits.");
        RSA.RSApvt(2048, textoOriginal);

        System.out.println("\ne. Utilizando o algoritmo alg.RSA com chave pública de 4096 bits.");
        RSA.RSAPub(4096, textoOriginal);

        System.out.println("\nf. Utilizando o algoritmo alg.RSA com chave privada de 4096 bits.");
        RSA.RSApvt(4096, textoOriginal);

        System.out.println("\ng. Utilizando o algoritmo alg.RSA com chave pública de 8192 bits.");
        RSA.RSAPub(8192, textoOriginal);

        System.out.println("\nh. Utilizando o algoritmo alg.RSA com chave privada de 8192 bits.");
        RSA.RSApvt(8192, textoOriginal);

        System.out.println("\ni. Utilizando o algoritmo alg.AES com chave de 16 bytes.");
        AES.AES_(chaveAes, textoOriginal);

        System.out.println("\ncifre o texto utilizando o algoritmo RSA com chave de 512 bits.");
        RSA.RSApvt(512, textoOriginal);

    }
}
