package com.moz.ates.traffic.common.entity.common;

import lombok.Data;

@Data
public class ChartDTO {
	//단속 통계
	private EnforcementCircularGraph enforcementCircularGraph = new EnforcementCircularGraph();
	private EnforcementChartGraph enforcementChartGraph = new EnforcementChartGraph();
	//사고 통계
	private AccidentCircularGraph accidentCircularGraph = new AccidentCircularGraph();
	private AccidentChartGraph accidentChartGraph = new AccidentChartGraph();
	//결제 통계
	private PaymentCircularGraph paymentCircularGraph = new PaymentCircularGraph();
	private PaymentChartGraph paymentChartGraph = new PaymentChartGraph();

	@Data
	public static class EnforcementCircularGraph {
		//카메라 단속 개수
		private int cameraEnfCnt = 0;
		//경찰 단속 개수
		private int policeEnfCnt = 0;
	}
	
	@Data
	public static class EnforcementChartGraph {
		//단속 년 월  
		private String enfDtList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(속도위반)
		private String speedCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(신호위반)
		private String signalCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(음주)
		private String drunkCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(무면허)
		private String noneLicenseCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(중앙선 침범)
		private String centerLineCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(횡단보도 사고)
		private String crosswalkCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//유형(인도 침범)
		private String sidewalkCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
	}
	
	@Data
	public static class AccidentCircularGraph {
		//Pedestrian crossing
		private int crsng = 0;
		//Pedestrian crossing roadway
		private int crsngRoadway = 0;
		//Pedestrian crossing road edge zone
		private int crsngRoadEdgeZone = 0;
		//Pedestrian crossing sidewalk
		private int crsngSidewalk = 0;
		//Vehicle-to-vehicle frontal collision
		private int frtCollision = 0;
		//Vehicle-to-vehicle side collision
		private int sideCollision = 0;
		//Vehicle-to-vehicle reverse collision
		private int revCollision = 0;
		//Vehicle-to-vehicle collision
		private int collision = 0;
	}
	
	@Data
	public static class AccidentChartGraph {
		//결제 년 월  
		private String acdntDtList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Pedestrian crossing
		private String crsngList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Pedestrian crossing roadway
		private String crsngRoadwayList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Pedestrian crossing road edge zone
		private String crsngRoadEdgeZoneList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Pedestrian crossing sidewalk
		private String crsngSidewalkList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Vehicle-to-vehicle frontal collision
		private String frtCollisionList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Vehicle-to-vehicle side collision
		private String sideCollisionList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Vehicle-to-vehicle reverse collision
		private String revCollisionList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//Vehicle-to-vehicle collision
		private String collisionList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
	}
	
	@Data
	public static class PaymentChartGraph {
		//결제 년 월  
		private String payDtList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//결제 완료 총 개수
		private String payTotalCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		//미결제 총 개수
		private String nonePayTotalCntList = "[0,0,0,0,0,0,0,0,0,0,0,0]";
		
	}
	
	@Data
	public static class PaymentCircularGraph {
		//결제 완료 총 개수
		private int payTotalCnt = 0;
		//미결제 총 개수
		private int nonePayTotalCnt = 0;
	}
	
	
}
