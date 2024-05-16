package com.moz.ates.traffic.common.component.api.moj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moz.ates.traffic.common.entity.api.MojApiAccessToken;
import com.moz.ates.traffic.common.entity.common.ApiDriverInfoDTO;
import com.moz.ates.traffic.common.support.exception.CommonException;
import com.moz.ates.traffic.common.support.exception.ErrorCode;
import com.moz.ates.traffic.common.util.MozatesCommonUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class MojApiComponent {
	
    /**
     * @brief AccessToken 발급
     * @author KY.LEE
     * @date 2024. 4. 30.
     * @method getBearerToken
     */
    public MojApiAccessToken getBearerToken(String username, String password,String grantType,String getTokenUrl) throws IOException {
        String credentials = username + ":" + password;
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());

        URL url = new URL(getTokenUrl);
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Basic " + encodedCredentials);
        connection.setRequestProperty("Content-Type", "text/plain");
        connection.setDoOutput(true);

        String data = "grant_type=" + grantType + "&username=" + username + "&password=" + password;

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(data.getBytes());
        outputStream.flush();

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

        	while ((inputLine = in.readLine()) != null) {
        		response.append(inputLine);
        	}
        	in.close();
            
            String jsonResponse = response.toString();

            ObjectMapper mapper = new ObjectMapper();
            MojApiAccessToken responseObj= mapper.readValue(jsonResponse, MojApiAccessToken.class);
            
            log.debug("API 토큰 발급:" + jsonResponse);
            
            return responseObj;
        } else {
            log.debug("Failed to get bearer token: " + connection.getResponseMessage());
            return null;
        }
    }

    /**
     * @brief 자동차 이름 검색
     * @author KY.LEE
     * @date 2024. 5. 2.
     * @method searchVehicleNo
     */
	public String searchVehicleNo(ApiDriverInfoDTO apiDriverInfoDTO) throws IOException {
		if(MozatesCommonUtils.isNull(apiDriverInfoDTO.getApiToken())) {
			new CommonException(ErrorCode.NOT_FOUND_API_TOKEN);
		}
		
		String urlStr = String.format("https://www.srn.gov.mz/srnapi/api/inatroprop/%s",apiDriverInfoDTO.getSearchValue());
		
		URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + apiDriverInfoDTO.getApiToken());

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            log.debug("API 통신 성공:" + connection.getResponseMessage());

            return response.toString();
        } else {
        	log.debug("API 호출 실패: " + connection.getResponseMessage());
            return null;
        }
	}

}
