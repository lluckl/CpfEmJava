public class matematicoCamadaDeVerificadorDeCpf{
     public long cpfComMaisUm;
     public long cpf;
     private String stringNumeroDeCpf;
     private byte primeiroNumeroCpf;
     private byte segundoNumeroCpf;
     private byte terceiroNumeroCpf;
     private byte quartoNumeroCpf;
     private byte quintoNumeroCpf;
     private byte sextoNumeroCpf;
     private byte setimoNumeroCpf;
     private byte oitavoNumeroCpf;
     private byte nonoNumeroCpf;
     private byte decimoNumeroCpf;
     private byte decimoPrimeiroNumeroCpf;
     private boolean primeiroVerificadorDeCpf;
     private boolean segundoVerificadorDeCpf;
     private boolean terceiroVerificadorDeCpf;
     private boolean quartoVerificadorDeCpf;



    public boolean isPrimeiroVerificadorDeCpf() {
        return primeiroVerificadorDeCpf;
    }

    public void setPrimeiroVerificadorDeCpf(boolean primeiroVerificadorDeCpf) {
        this.primeiroVerificadorDeCpf = primeiroVerificadorDeCpf;
    }

    public boolean isSegundoVerificadorDeCpf() {
        return segundoVerificadorDeCpf;
    }

    public void setSegundoVerificadorDeCpf(boolean segundoVerificadorDeCpf) {
        this.segundoVerificadorDeCpf = segundoVerificadorDeCpf;
    }

    public boolean isTerceiroVerificadorDeCpf() {
        return terceiroVerificadorDeCpf;
    }

    public void setTerceiroVerificadorDeCpf(boolean terceiroVerificadorDeCpf) {
        this.terceiroVerificadorDeCpf = terceiroVerificadorDeCpf;
    }

    public boolean isQuartoVerificadorDeCpf() {
        return quartoVerificadorDeCpf;
    }

    public void setQuartoVerificadorDeCpf(boolean quartoVerificadorDeCpf) {
        this.quartoVerificadorDeCpf = quartoVerificadorDeCpf;
    }

    public void status(){
        System.out.println("Primeiro verificador:"+isPrimeiroVerificadorDeCpf());
        System.out.println("Segundo verificador:"+isSegundoVerificadorDeCpf());
        System.out.println("Terceiro verificador:"+isTerceiroVerificadorDeCpf());
        System.out.println("Quarto verificador:"+isQuartoVerificadorDeCpf());
    }

    public matematicoCamadaDeVerificadorDeCpf(long cpf) {
        this.cpf = cpf;
    }

    public void regraDoTamanhoDoCpf(){
        if (this.cpfComMaisUm >= 1_000_000_000_00f && this.cpfComMaisUm <= 1_999_999_999_99f) {
            setPrimeiroVerificadorDeCpf(true);
            System.out.println(this.cpf);
        } else {
            setPrimeiroVerificadorDeCpf(false);
            System.out.println(this.cpf);
        }
    }

        public void digitoCpf(){

         this.cpfComMaisUm = 100000000000l+this.cpf;

         char primeiroCaracteresNumero       = stringNumeroDeCpf.charAt(1);
         char segundoCaracteresNumero        = stringNumeroDeCpf.charAt(2);
         char terceiroCaracteresNumero       = stringNumeroDeCpf.charAt(3);
         char quartoCaracteresNumero         = stringNumeroDeCpf.charAt(4);
         char quintoCaracteresNumero         = stringNumeroDeCpf.charAt(5);
         char sextoCaracteresNumero          = stringNumeroDeCpf.charAt(6);
         char setimoCaracteresNumero         = stringNumeroDeCpf.charAt(7);
         char oitavoCaracteresNumero         = stringNumeroDeCpf.charAt(8);
         char nonoCaracteresNumero           = stringNumeroDeCpf.charAt(9);
         char decimoCaracteresNumero         = stringNumeroDeCpf.charAt(10);
         char decimoPrimeiroCaracteresNumero = stringNumeroDeCpf.charAt(11);


         primeiroNumeroCpf       = (byte) primeiroCaracteresNumero;
         segundoNumeroCpf        = (byte) segundoCaracteresNumero;
         terceiroNumeroCpf       = (byte) terceiroCaracteresNumero;
         quartoNumeroCpf         = (byte) quartoCaracteresNumero;
         quintoNumeroCpf         = (byte) quintoCaracteresNumero;
         sextoNumeroCpf          = (byte) sextoCaracteresNumero;
         setimoNumeroCpf         = (byte) setimoCaracteresNumero;
         oitavoNumeroCpf         = (byte) oitavoCaracteresNumero;
         nonoNumeroCpf           = (byte) nonoCaracteresNumero;
         decimoNumeroCpf         = (byte) decimoCaracteresNumero;
         decimoPrimeiroNumeroCpf = (byte) decimoPrimeiroCaracteresNumero;

     }
     public void regraQueNoPodeRepitir() {
        switch (stringNumeroDeCpf) {
            case "100000000000", "111111111111", "122222222222", "133333333333", "144444444444",
                     "155555555555", "166666666666","177777777777", "188888888888", "199999999999":
                setSegundoVerificadorDeCpf(false);
            break;

            default:
                setSegundoVerificadorDeCpf(true);
        }
    }
        public void primeiroCalculo() {

         int umcpf01 = primeiroNumeroCpf * 10;
         int umcpf02 = segundoNumeroCpf  * 9;
         int umcpf03 = terceiroNumeroCpf * 8;
         int umcpf04 = quartoNumeroCpf   * 7;
         int umcpf05 = quintoNumeroCpf   * 6;
         int umcpf06 = sextoNumeroCpf    * 5;
         int umcpf07 = setimoNumeroCpf   * 4;
         int umcpf08 = oitavoNumeroCpf   * 3;
         int umcpf09 = nonoNumeroCpf     * 2;

         int soma01 = umcpf01 + umcpf02 + umcpf03 + umcpf04 + umcpf05 + umcpf06 + umcpf07 + umcpf08 + umcpf09;
         int divisaoQuociente1 = soma01 / 11;
         int divisaoResto1 = soma01 % 11;
         int cpf10;
         if (divisaoResto1<2){
             cpf10 = 0;
         }else {
             cpf10 = divisaoResto1 - 11;
         }

         if (cpf10 == decimoNumeroCpf){
             setTerceiroVerificadorDeCpf(true);
         }else {
             setTerceiroVerificadorDeCpf(false);
         }
        }
        public void segundoCalculo() {
         int doiscpf01 = primeiroNumeroCpf * 11;
         int doiscpf02 = segundoNumeroCpf * 10;
         int doiscpf03 = terceiroNumeroCpf * 9;
         int doiscpf04 = quartoNumeroCpf * 8;
         int doiscpf05 = quintoNumeroCpf * 7;
         int doiscpf06 = sextoNumeroCpf * 6;
         int doiscpf07 = setimoNumeroCpf * 5;
         int doiscpf08 = oitavoNumeroCpf * 4;
         int doiscpf09 = nonoNumeroCpf *3 ;
         int doiscpf10 = decimoNumeroCpf * 2;
         int soma02 = doiscpf01 + doiscpf02 + doiscpf03 + doiscpf04
                 + doiscpf05 + doiscpf06 + doiscpf07 + doiscpf08 + doiscpf09 + doiscpf10;
         int divisaoResto02 = soma02 % 11;
            int cpf11;
         if (divisaoResto02<2){
             cpf11 = 0;
         }else {
             cpf11 = divisaoResto02 - 11;
         }

         if (cpf11 == decimoPrimeiroNumeroCpf){
             setQuartoVerificadorDeCpf(true);
         }else {
             setQuartoVerificadorDeCpf(false);
         }
     }

}