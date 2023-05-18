public class ConversaoDeUnidadesDeArea {
    // 1 metro quadrado = 10.76 pés quadrados
    public static double metrosParaPesQuadrados(double metros) {
        return metros * 10.76;
    }

    // 1 pé quadrado = 929 centímetros quadrados
    public static double pesParaCentimetrosQuadrados(double pes) {
        return pes * 929;
    }

    // 1 milha quadrada = 640 acres
    public static double milhasParaAcres(double milhas) {
        return milhas * 640;
    }

    // 1 acre = 43.560 pés quadrados
    public static double acresParaPesQuadrados(double acres) {
        return acres * 43560;
    }
    //teste
    public static void main(String[] args) {
        double metros = 10;
        double pes = ConversaoDeUnidadesDeArea.metrosParaPesQuadrados(metros);
        System.out.println(metros + " metros quadrados equivalem a " + pes + " pés quadrados.");
        
        double acres = 5;
        double pesQuadrados = ConversaoDeUnidadesDeArea.acresParaPesQuadrados(acres);
        System.out.println(acres + " acres equivalem a " + pesQuadrados + " pés quadrados.");        
    }
}
