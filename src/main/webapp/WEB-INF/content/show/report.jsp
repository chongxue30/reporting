<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>showreporting</title>
<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="../js/highcharts.js"></script>
<script type="text/javascript" src="../js/exporting.js"></script>
<script type="text/javascript" src="../js/highcharts-zh_CN.js"></script>
<script type="text/javascript" src="../js/chart.js"></script>
<link href="../css/my.css" rel="stylesheet" type="text/css"/>

<script language="javascript"  > 
$(function () { 
 	var list1 = ${indexList };
 	var list2 = ${laIndexList };
 
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '投诉率'
        },
        subtitle: { 
			enabled: false
        },
        xAxis: {
            categories: [
                '一月',
                '二月',
                '三月',
                '四月',
                '五月',
                '六月',
                '七月',
                '八月',
                '九月',
                '十月',
                '十一月',
                '十二月'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                enabled: false
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.1f} %</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: '上年',
            data: list1
        }, {
            name: '本年',
            data: list2
        }], 
        credits: { 
            enabled: false
        }, 
        exporting: { 
            enabled: false
        }
    });
}) ; 
</script>  

 
</head>
<body>
 
 
<div id="main">

	<div id="title">
		<input id="dates" type="text" name="dates" value="2017-8-28" class="sang_Calender" />
	</div>
	<div id="reminds" >
	
			<div id="results" >
				<font color="#3399FF"> <strong> 投诉处理及时率 </strong> </font> <strong>趋势分析</strong> 
				<span style=" float:right; ">
				
				   <button id="button1" style="background-color:#3399FF" onclick="buttonone()"><font id="font1" color="#FFFFFF"> 图形 </font></button><button id="button2" style="background-color:#999999" onclick="buttontwo()"><font id="font2" > 报表 </font></button>
				
				</span>
				<br/><br/>
				${results}
			 	</div> 
	
	</div>
	
	<!-- 显示统计图 -->
	<div id="charts" > 
  		<div id="container" style="min-width:400px;height:400px"></div>
  		<input type="hidden" id="dataList1" value="${indexList }" />
  		<input type="hidden" id="dataList2" value="${laIndexList }" />
  
    </div>
	
	
	
	<!-- 显示报表 -->
  <div id="tables" style="display:none; height:250px; margin-top:20px; margin-left:10px; margin-right:10px; ">
    <table cellspacing="0" cellpadding="0" width="968" height="122" border="1">
      <tr style="background-color:#33CCFF">
        <td>&nbsp;</td>
        <td>1月</td> <td>2月</td> <td>3月</td>
        <td>4月</td> <td>5月</td> <td>6月</td>
        <td>7月</td> <td>8月</td> <td>9月</td>
        <td>10月</td> <td>11月</td>  <td>12月</td>
      </tr>
      <tr>
        <td>上年</td>
		<c:forEach items="${laIndexList}" var="list1" varStatus="k">
			<c:if test="${k.index<=11}">
				<td>${list1}%</td>
			</c:if>
			
		</c:forEach>
      </tr>
      <tr>
        <td>本年</td>
        <c:forEach items="${indexList}" var="list2" varStatus="k">
        	<c:if test="${k.index<=11}">
			<td>${list2}%</td></c:if>
		</c:forEach>
      </tr>
    </table>
  </div>

</div>
  
<script type="text/javascript" src="../js/datetime.js"></script>

</body>
</html>