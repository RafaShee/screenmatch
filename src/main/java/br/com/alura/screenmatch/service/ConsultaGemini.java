package br.com.alura.screenmatch.service;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGemini {
    public static String obterTraducao(String texto) {

        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey("AIzaSyByiC82U89rncm26USgLrmDwg1hHkfvVFI")
                .modelName("gemini-1.5-flash")
                .build();

        String response = gemini.generate("Traduza para português o texto: " + texto);
        return response;
    }
}
