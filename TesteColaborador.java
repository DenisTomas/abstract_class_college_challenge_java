public class TesteColaborador {

    public static void main(String[] args) {
        ColaboradorFisico cf = new ColaboradorFisico();
        cf.setNome("João");
        cf.setCpf("123.456.789-00");
        cf.setRg("12.345.678-9");
        cf.setIdade(30);
        cf.setLogradouro("Rua 123");
        cf.setNumero("456");
        cf.setBairro("Centro");
        cf.setCidade("São Paulo");
        cf.setUf("SP");
        cf.setTelefone("11 1234-5678");
        cf.setEmail("joao@email.com");
        cf.setDisciplinas("Matemática, Física");
        cf.setTitulacao("Mestre");

        ColaboradorJuridico cj = new ColaboradorJuridico();
        cj.setNome("Empresa XYZ");
        cj.setCpf("123.456.789-00");
        cj.setRg("12.345.678-9");
        cj.setIdade(30);
        cj.setLogradouro("Avenida 789");
        cj.setNumero("123");
        cj.setBairro("Jardim");
        cj.setCidade("Rio de Janeiro");
        cj.setUf("RJ");
        cj.setTelefone("21 9876-5432");
        cj.setEmail("contato@empresa.com");
        cj.setDisciplinas("Português, História");
        cj.setRazaoSocial("Empresa XYZ");
        cj.setNomeFantasia("XYZ");
        cj.setInscricaoMuncipal("123456");
        cj.setInscricaoEstadual("7891011");
        cj.setCnpj("12.345.678/0001-90");
        cj.setWebSite("www.empresa.com");

        System.out.println(cf);
        
        System.out.println(cj);
    }
}