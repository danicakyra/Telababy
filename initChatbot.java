    private void initChatBot(){
        final AIconfiguration config = new AIConfiguration(4a21aa7cae0da8b38ea8d5d9ed423cc1f04f074f "<Client Access Code>"),
                AIConfiguration.SupportLaguages.English,
                AIConfiguration.recognitionEnginer.System);
        aiDataService = new AIDataService(context this , config);
        customAIServicecontext = AIServiceContextBuilder.buildFromSessionId(unid);
        aiRequest = newAIRequest():
