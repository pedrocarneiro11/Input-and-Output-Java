package br.com.dio.java.io;

import java.lang.*;
import java.io.*;

// import static br.com.dio.java.io.Main.ExemploIoData.IncluirProduto;

public class Exercicios {
    /* <--------------------- EXERCICIO 6 ----------------> */
    /*
    public static class Gato implements Serializable {

        private static final long serialVersionUID = 2L;
        private String nome;
        private Integer idade;
        private String cor;
        private boolean castrado;
        private transient boolean ronrona;

        public Gato(String nome, Integer idade, String cor, boolean castrado, boolean ronrona) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
            this.castrado = castrado;
            this.ronrona = ronrona;
        }

        public Gato() { }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public boolean getCastrado() {
            return castrado;
        }

        public boolean isCastrado(boolean castrado) {
            return this.castrado = castrado;
        }

        public boolean isRonrona() {
            return ronrona;
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    ", castrado=" + castrado +
                    ", ronrona=" + ronrona +
                    '}';
        }

        public static void Serealizacao() throws IOException {
            File file = new File("C:\\Users\\Pedro Carneiro_\\Desktop\\Cursos\\15-Bootcamp Java Developer\\11-Entrada-e-Saída-de-Arquivos-em-Java\\aula\\gato.bin");

            Gato gato = new Gato("Simba",6,"cinza",true,false);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getName()));

            oos.writeObject(gato);

            PrintStream ps = new PrintStream(System.out);
            ps.printf("Arquivo " + file.getName() + " criado com sucesso! Com o tamanho de " + file.length()%2d + " bytes");

            oos.close();
            ps.close();
        }

        public static void Desserealizacao(String arquivo) throws IOException, ClassNotFoundException {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
            Gato objectGato = (Gato) ois.readObject();

            System.out.printf("\nNome.............: " + objectGato.getNome() + "\n");
            System.out.printf("\nCor.............: " + objectGato.getCor() + "\n");
            System.out.printf("\nidade.............: " + objectGato.getIdade() +"\n");
            System.out.println("\nCastrado.............: " + objectGato.isCastrado(objectGato.castrado) +"\n");
            System.out.println("\nRonrona.............: " + objectGato.isCastrado(objectGato.ronrona) +"\n");

            System.out.println(objectGato);

            ois.close();
        }
    }
    */

    /* <--------------------- EXERCICIO 5 ----------------> */

    /*
    public class ExemploIoData{
        public static void IncluirProduto() throws IOException {

            File file = new File("C:\\Users\\Pedro Carneiro_\\Desktop\\Cursos\\15-Bootcamp Java Developer\\11-Entrada-e-Saída-de-Arquivos-em-Java\\aula\\arquivosExercicio5\\PecaDeRoupa\\peca-de-roupa.bin");


            PrintStream ps = new PrintStream(System.out);
            ps.flush();

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file.getPath()));

            Scanner scan = new Scanner(System.in);

            ps.print("Nome da peca: ");
            String nome = scan.nextLine();

            dos.writeUTF(nome);

            ps.print("Tamanho da peca (P/M/G/U): ");
            char tamanho = (char) System.in.read();
            dos.writeChar(tamanho);

            ps.print("Quantidade: ");
            int quantidade = scan.nextInt();
            dos.writeInt(quantidade);

            ps.print("Preco unitario: ");
            double preco = scan.nextDouble();
            dos.writeDouble(preco);

            ps.print("Peca registrada: " + nome + " de tamanho " + tamanho + ", quantidade disponivel: " + quantidade + " unidades, com o preco unitario de R$" + preco);
            ps.print("\n");
            ps.print("Arquivo "+  file.getName() +" criado com sucesso! " +" No diretorio "+ file.getPath() + " Com o tamanho de " + file.length() + " bytes");

            lerProduto(file.getPath());

            dos.close();
            scan.close();
            ps.close();

        }
        public static void lerProduto(String caminhoArquivo) throws FileNotFoundException, IOException {

            File f = new File(caminhoArquivo);

            DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

            String nome = dis.readUTF();
            char tamanho = dis.readChar();
            int quantidade = dis.readInt();
            double preco = dis.readDouble();

            System.out.printf("\nNome.............: " + nome + "\n");
            System.out.printf("\nTamanho.............: " + tamanho + "\n");
            System.out.printf("\nQuantidade.............: " + quantidade +"\n");
            System.out.printf("\nPreco.............: " + preco + "\n");
            System.out.printf("\nTotal do valor das pecas.............: " + preco*quantidade);

            dis.close();
        }
    }
    */


    /* <--------------------- EXERCICIO 4 ----------------> */
    /*
    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\Pedro Carneiro_\\Desktop\\Cursos\\15-Bootcamp Java Developer\\11-Entrada-e-Saída-de-Arquivos-em-Java\\aula\\recomendacoes-copy.txt");
        String nomeArquivo = file.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0,nomeArquivo.indexOf("-")).concat("-copy2txt");
        File fileCopy = new File(nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy.getName()));

        int line = 0;
        while((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.print("Arquivo "+  file.getName() +" copiado com sucesso! Com o tamanho de " + fileCopy.length()%2d );

    }
    */
    /* <--------------------- EXERCICIO 3 ----------------> */
    /*
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\Pedro Carneiro_\\Desktop\\Cursos\\15-Bootcamp Java Developer\\11-Entrada-e-Saída-de-Arquivos-em-Java\\aula\\recomendacoes.txt");
        String nomeArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
        File fileCopy = new File(nomeArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!(line == null));

        System.out.printf("Arquivo "+  f.getName() +" copiado com sucesso! Com o tamanho de " + f.length()%2d );
        System.out.printf("\n" + "Arquivo "+  fileCopy.getName() +" criado com sucesso! Com o tamanho de " + fileCopy.length()%2d );

        PrintWriter pw = new PrintWriter(System.out);

        pw.println("\n " + "Recomende 3 livros: ");
        pw.flush();

        AdicionarInfoNoArquivo(fileCopy.getName());

        pw.println("Arquivo copiado, tamanho: " + fileCopy.length() + " bytes");

        br.close();
        bw.close();
        pw.close();
    }

    public static void AdicionarInfoNoArquivo(String Arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(Arquivo,true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();

    }  */

    /* <--------------------- EXERCICIO 2 ----------------> */
    /*

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
    public static void lerTecladoEscreverDocumento() throws IOException {


        PrintWriter pw = new PrintWriter(System.out);

        pw.println("Digite 3 recomendacoes de filmes: ");
        pw.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File filme = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(filme.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scanner.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo \"%s\" foi criado com sucesso", filme.getName());

        pw.close();
        scanner.close();
        bw.close();
        */

    /* <--------------------- EXERCICIO 1 ----------------> */

        /* Scanner scanner = new Scanner(System.in);

        //File filmes = new File(\\aula\\out)

        System.out.println("Escreva o primeiro filme: ");
        String primeiro = scanner.nextLine();

        System.out.println("Escreva o segundo filme: ");
        String segundo = scanner.nextLine();

        System.out.println("Escreva o terceiro filme: ");
        String terceiro = scanner.nextLine();

        System.out.println("Os filmes sao: " + primeiro + ", " + segundo + ", " + terceiro );

     }
*/
}
