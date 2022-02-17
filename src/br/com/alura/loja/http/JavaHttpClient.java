package br.com.alura.loja.http;

import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            var openConnection = urlDaApi.openConnection();
            openConnection.connect();
        }
        catch(Exception e) {
            throw new RuntimeException("Erro ao enviar requisição http",e);
        }

    }
}
