package ch.noseryoung.blj;

public class Starter {
    public static void main(String[] args) throws Exception {
        FileIOHandler.ReadScript();
        TextFileAnalyzer.writeEvaluationFile();
    }
}