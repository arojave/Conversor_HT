

public class TasaActual{
	
	/*
	 * public void actionPerformed(ActionEvent e) { try { double monto =
	 * Double.parseDouble(textField1.getText().replace(".", "")); String conversion
	 * = (String) comboBox.getSelectedItem(); double tasa; String formatLenguage[] =
	 * {"es","en","ja","ko"}; String formatCountry[] =
	 * {"ES","US","JP","KR","GB","CO","MX","PE"}; String formatOutLen = null; String
	 * formatOutCou = null;
	 * 
	 * 
	 * 
	 * URL url = new URL(API_URL + "?apikey=" + API_KEY +
	 * "&base=COP&symbols=USD%2CEUR%2CGBP%2CJPY%2CKRW%2CMXN"); HttpURLConnection con
	 * = (HttpURLConnection) url.openConnection(); con.setRequestMethod("GET");
	 * BufferedReader in = new BufferedReader(new
	 * InputStreamReader(con.getInputStream())); String inputLine; StringBuffer
	 * content = new StringBuffer(); while ((inputLine = in.readLine()) != null) {
	 * content.append(inputLine); } in.close();
	 * 
	 * String json = content.toString();
	 * 
	 * int start = json.indexOf("USD") + 5; int end = json.indexOf(",", start);
	 * double usd = Double.parseDouble(json.substring(start, end));
	 * 
	 * start = json.indexOf("EUR") + 5; end = json.indexOf(",", start); double eur =
	 * Double.parseDouble(json.substring(start, end));
	 * 
	 * start = json.indexOf("GBP") + 5; end = json.indexOf(",", start); double gbp =
	 * Double.parseDouble(json.substring(start, end));
	 * 
	 * start = json.indexOf("JPY") + 5; end = json.indexOf(",", start); double jpy =
	 * Double.parseDouble(json.substring(start, end));
	 * 
	 * start = json.indexOf("KRW") + 5; end = json.indexOf(",", start); double krw =
	 * Double.parseDouble(json.substring(start, end));
	 * 
	 * start = json.indexOf("MXN") + 5; end = json.indexOf("}", start); double mxn =
	 * Double.parseDouble(json.substring(start, end));
	 * 
	 * 
	 * 
	 * switch (conversion) { case "Pesos Colombianos a Dólares": tasa = usd;
	 * formatOutLen= formatLenguage[1]; formatOutCou= formatCountry[1]; break; case
	 * "Pesos Colombianos a Euros": tasa = eur; formatOutLen= formatLenguage[0];
	 * formatOutCou= formatCountry[0]; break; case
	 * "Pesos Colombianos a Libras Esterlinas": tasa = gbp; formatOutLen=
	 * formatLenguage[1]; formatOutCou= formatCountry[4]; break; case
	 * "Pesos Colombianos a Yen": tasa = jpy; formatOutLen= formatLenguage[2];
	 * formatOutCou= formatCountry[2]; break; case "Pesos Colombianos a Won Kr":
	 * tasa = krw; formatOutLen= formatLenguage[3]; formatOutCou= formatCountry[3];
	 * break; case "Pesos Colombianos a Pesos Mexicanos": tasa = mxn; formatOutLen=
	 * formatLenguage[0]; formatOutCou= formatCountry[6]; break; case
	 * "Dólares a Pesos Colombianos": tasa = 1 / usd; formatOutLen=
	 * formatLenguage[0]; formatOutCou= formatCountry[5]; break; case
	 * "Euros a Pesos Colombianos": tasa = 1 / eur; formatOutLen= formatLenguage[0];
	 * formatOutCou= formatCountry[5]; break; case
	 * "Libras Esterlinas a Pesos Colombianos": tasa = 1 / gbp; formatOutLen=
	 * formatLenguage[0]; formatOutCou= formatCountry[5]; break; case
	 * "Yen a Pesos Colombianos": tasa = 1 / jpy; formatOutLen= formatLenguage[0];
	 * formatOutCou= formatCountry[5]; break; case "Won Kr a Pesos Colombianos":
	 * tasa = 1 / krw; formatOutLen= formatLenguage[0]; formatOutCou=
	 * formatCountry[5]; break; case "Pesos Mexicanos a Pesos Colombianos": tasa = 1
	 * / mxn; formatOutLen= formatLenguage[0]; formatOutCou= formatCountry[5];
	 * break; default: tasa = 0; break; }
	 * 
	 * double resultado = monto * tasa; NumberFormat formatoMoneda =
	 * NumberFormat.getCurrencyInstance(new Locale(formatOutLen, formatOutCou));
	 * textField2.setText(formatoMoneda.format(resultado));
	 * //textField2.setText(String.format("%.2f", resultado)); } catch
	 * (NumberFormatException ex) { JOptionPane.showMessageDialog(this,
	 * "Por favor, introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
	 * } catch (IOException ex) { JOptionPane.showMessageDialog(this,
	 * "Se produjo un error al conectar con la API de tasas de cambio", "Error",
	 * JOptionPane.ERROR_MESSAGE); } }
	 */
	

}
