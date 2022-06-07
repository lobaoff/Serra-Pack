package com.serrapack.services;

import com.serrapack.enums.Status;

public class OrcamentoService {

    public Status verificaStatus(String status) {
        switch (status) {
            case "Amostra Pendente" : return Status.AMOSTRA_PENDENTE;
            case "Amostra Entrega" : return Status.AMOSTRA_ENTREGA;
            case "Buscar Amostra" : return Status.BUSCAR_AMOSTRA;
            case "Aprovado" : return Status.APROVADO;
            default:
                break;

        }
        return null;
    }
}
