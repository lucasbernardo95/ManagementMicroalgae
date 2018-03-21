/*
 * Classe que representa um nó da rede (NodeMcu ou arduino).
 */
package com.tads.model;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Node {

    private Integer id;
    private String regiao;
    private List<Sensor> sensores;
    private Double energia;

    public Node() {
    }

    public Node(Integer id, String regiao, List<Sensor> sensores, Double energia) {
        this.id = id;
        this.regiao = regiao;
        this.sensores = sensores;
        this.energia = energia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Node{" + "id=" + id + ", regiao=" + regiao + ", sensores=" + sensores + ", energia=" + energia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
