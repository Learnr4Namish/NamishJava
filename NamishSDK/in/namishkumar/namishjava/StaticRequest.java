package NamishSDK.in.namishkumar.namishjava;

import RequestsHTTP.ParameterStringBuilder;

public class StaticRequest {
    String URL;

    public static void main(String[] args) {

    }

    public static void sendRequest(int RequestType, String Headers, Map<String, String> URL_Parameters) {
        URL MainURL = new URL(URL.toString());
        HttpURLConnection HTTP_Connection = (HttpURLConnection) MainURL.openConnection();
        if (RequestType == 8586) {
            /* This is for GET request */
            HTTP_Connection.setRequestMethod("GET");
            HTTP_Connection.setDoOutput(true);
            /* For getting the output */
            DataOutputStream HTTP_Output = new DataOutputStream(HTTP_Connection.getOutputStream());
            HTTP_Output.writeBytes(ParameterStringBuilder.getParamsString(URL_Parameters));
            HTTP_Output.flush();
            HTTP_Output.close();
            /* Parsing the parameters into a single String */
        }
    }
}
