package com.moz.ates.traffic.common.util;

import org.springframework.stereotype.Component;

import com.moz.ates.traffic.common.enums.NtcTypeCd;

@Component
public class SmsSendContentUtils {

	/**
	 * 
	 * @brief
	 * @author KY.LEE
	 * @date 2024. 4. 11.
	 * @method 
	 */
	public static String fineNoticeSmsContent(String receiver, String url , NtcTypeCd ntcTy , String sender,String tfcEnfId) {
		String result = "";
		//TODO:: SMS내용 받아서 고치기
		switch(ntcTy) {
			case FIRST_NOTICE:
				result = String.format(
					    "%s, uma notificação de infração foi enviada. Por favor, verifique suas informações pessoais através do link abaixo e confira os dados da notificação.\r\n"
					    + "(Você será classificado como um destinatário de segunda notificação após 15 dias da data de envio.)\r\n"
					    + "Número da infração de trânsito: %s \r\n" 
					    + "MOZ-ATES-PORTAL : %s",
					    receiver, tfcEnfId ,url);
//				result = String.format(""
//						+ "%s 님, 단속 고지서가 발송되었습니다. 아래 링크를 통해 개인정보 확인 후 고지서 정보를 확인해 주세요.\r\n"
//						+ "(발송일 기준 15일이 지나면 2차 고지 대상자로 분류됩니다.)\r\n"
//						+ "교통 단속 번호 : %s", receiver , tfcEnfId);
				break;
			case SECOND_NOTICE:
				result = String.format(
					    "%s, a notificação de infração (segunda via) foi enviada. Por favor, verifique suas informações pessoais através do link abaixo e confira os dados da notificação.\r\n"
					    + "(Após 15 dias da data de envio, você será classificado como sujeito a ação administrativa.)\r\n"
					    + "Número da infração de trânsito: %s\r\n"
					    + "PORTAL INATRO: %s", receiver, tfcEnfId, url);
//				result = String.format(
//						"%s 님, 단속 고지서(2차)가 발송되었습니다. 아래 링크를 통해 개인정보 확인 후 고지서 정보를 확인해 주세요.\r\n"
//						+ "(발송일 기준 15일이 지나면 행정처분 대상자로 분류됩니다.)\r\n"
//						+ "교통 단속 번호 : %s\r\n"
//						+ "INATRO PORTAL : %s", receiver,tfcEnfId,url);
				break;
			case ADMINISTRATIVE_ACTION:
				result = String.format(
					    "%s, você foi classificado como um destinatário de ação administrativa devido ao não pagamento do valor indicado na segunda notificação. Os procedimentos subsequentes serão realizados por telefone pelo responsável.\r\n"
					    + "Número da infração de trânsito: %s \r\n"
					    + "Número para contato: %s", receiver, tfcEnfId, sender);
//				result = String.format(
//						"%s 님, 2차 고지서에 기재된 납부 금액 체납으로 인해 행정처분 대상자로 분류되었습니다. 이후 절차는 담당자 유선 전화로 진행됩니다.\r\n"
//						+ "교통 단속 번호 : %s \r\n"
//						+ "문의 전화 번호 : %s", receiver, tfcEnfId, sender);
				break;
			case DELETE_NOTICE:
				result = String.format("A notificação referente ao número de infração %s de %s foi cancelada.", tfcEnfId, receiver);
//				result = String.format("%s님의 단속번호 %s에 관한 고지서는 폐지 되었습니다.", receiver,tfcEnfId);
				break;
		}
		return result;
	}
	
	
	/**
	 * 
	 * @brief
	 * @author KY.LEE
	 * @date 2024. 4. 11.
	 * @method 
	 */
	public static String findPassword(String receiver, String tmpPassword) {
		return String.format("A senha temporária de %s é %s. Por favor, faça login e redefina sua senha.", receiver, tmpPassword);
//		return String.format("%s님의 임시 비밀번호는 %s 입니다. 로그인후 비밀번호를 재설정하세요.", receiver , tmpPassword);
	}
}
