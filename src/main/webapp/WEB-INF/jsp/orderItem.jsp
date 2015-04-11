<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html">
<html ng-app="orderItemService">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/framework/angularjs/angular.js"></script>
<script type="text/javascript" src="/js/framework/angularjs/angular-resource.js"></script>
<script type="text/javascript" src="/js/commons/orderItem.js"></script>

</head>
<body ng-controller="orderItemController">
   <div align="center">
      <table border="1">
         <tr>
            <th>
               Order No
            </th>
            <th>
               Order Desc
            </th>
            <th>
               Order Address
            </th>
            <th>
               Order Phone
            </th>
         </tr>
         <tr ng-repeat="orderItem in orderItemList">
            <td>
                {{orderItem.orderNo}}
            </td>
            <td>
                {{orderItem.orderDesc}}
            </td>
            <td>
                {{orderItem.orderAddress}}
            </td>
            <td>
                {{orderItem.orderPhone}}
            </td>
         </tr>
      </table>
   </div>
</body>
</html>