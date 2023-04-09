package serasa.ExerciciosPOO;

import java.util.ArrayList;

public class Ex1 {
    
    public class Pais {
        private String codigoISO;
        private String nome;
        private double populacao;
        private double dimensao;
        private ArrayList<Pais> fronteiras;

        public Pais(String codigoISO, String nome, double populacao, double dimensao) {
            this.codigoISO = codigoISO;
            this.nome = nome;
            this.populacao = populacao;
            this.dimensao = dimensao;
            this.fronteiras = new ArrayList<Pais>();
        }

        public String getCodigoISO() {
            return codigoISO;
        }

        public void setCodigoISO(String codigoISO) {
            this.codigoISO = codigoISO;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPopulacao() {
            return populacao;
        }

        public void setPopulacao(double populacao) {
            this.populacao = populacao;
        }

        public double getDimensao() {
            return dimensao;
        }

        public void setDimensao(double dimensao) {
            this.dimensao = dimensao;
        }

        public ArrayList<Pais> getFronteiras() {
            return fronteiras;
        }

        public void setFronteiras(ArrayList<Pais> fronteiras) {
            this.fronteiras = fronteiras;
        }

        public boolean equals(Pais outroPais) {
            if (this.codigoISO.equals(outroPais.getCodigoISO())) {
                return true;
            } else {
                return false;
            }
        }

        public boolean ehLimitrofe(Pais outroPais) {
            if (this.fronteiras.contains(outroPais)) {
                return true;
            } else {
                return false;
            }
        }

        public double densidadePopulacional() {
            return this.populacao / this.dimensao;
        }

        public ArrayList<Pais> vizinhosComuns(Pais outroPais) {
            ArrayList<Pais> vizinhosComuns = new ArrayList<Pais>();
            for (Pais pais : this.fronteiras) {
                if (outroPais.ehLimitrofe(pais)) {
                    vizinhosComuns.add(pais);
                }
            }
            return vizinhosComuns;
        }
    }
        
}
