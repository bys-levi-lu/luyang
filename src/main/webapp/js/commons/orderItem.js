/**
 * 
 */
var orderItemService = angular.module("orderItemService", ["ngResource"], angular.noop);
orderItemService.controller("orderItemController", function($scope, $resource)
{
	var projectName = '/' + window.location.pathname.split('/')[1];
	var orderItemUrl =
	{
		"queryUrl" : projectName + "/query/:desc",
		"queryJsonUrl" : projectName + "/queryjson/:desc/mydata.json"
	};
	/**var orderItem = $resource(orderItemUrl.queryUrl,{desc:"iphone"}, {'get':  {method:'GET', isArray:true},});
	var orderList = orderItem.get(function(data){
		$scope.orderItemList = data;
	});*/
	debugger;
	var jsonOrderList= $resource(orderItemUrl.queryJsonUrl,{desc:"galaxy"}, {'get':  {method:'GET', isArray:true},});
	var orderList = jsonOrderList.get(function(data){
		$scope.orderItemList = data;
	});
	
	
});

/**var projectName = '/' + window.location.pathname.split('/')[1];
var userUrl = {
    'addUrl' : projectName + '/orderItem/add',
    'deleteUrl' : projectName + '/orderItem/delete',
    'updateUrl' : projectName + '/orderItem/update',
    'queryUrl' : projectName + '/orderItem/orderlist/desc'
};
var orderItemModule = angular.module('orderItemSerivce', [ 'ngResource' ], angular.noop);
orderItemModule.controller('orderItemController', function($scope, $resource) {
    var actions = {
        'add' : {
            method : 'PUT',
            isArray : true,
            headers : {
                'Content-Type' : 'application/json'
            }
        },
        'delete' : {
            method : 'DELETE',
            isArray : true
        },
        'query' : {
            method : 'GET',
            isArray : true
        },
        'update' : {
            method : 'POST',
            isArray : true,
            headers : {
                'Content-Type' : 'application/json'
            }
        }
    };
    var getUserList = $resource(userUrl.queryUrl, {
        page : 1,
        pageSize : 20
    }, actions);
    getUserList.query({}, function(data) {
        subobj = data;
        $scope.orderItemList = data;
    });
    var userAdd = $resource(userUrl.addUrl, {
        page : 1,
        pageSize : 20
    }, actions);
    $scope.addUserClick = function() {
        userAdd.add($scope.saveUser, function(data) {
            subobj = data;
            $scope.mydata = data;
        });
    };
    var userUpdate = $resource(userUrl.updateUrl, {
        page : 1,
        pageSize : 20
    }, actions);
    $scope.updateUserClick = function() {
        userUpdate.update($scope.modifyUser, function(data) {
            subobj = data;
            $scope.mydata = data;
        });
    };
    var userDelete = $resource(userUrl.deleteUrl, {
        page : 1,
        pageSize : 20,
        id : ':id'
    }, actions);
    $scope.deleteUser = function(user) {
        userDelete['delete']({
            id : user.id
        }, {}, function(data) {
            subobj = data;
            $scope.mydata = data;
        });
    };
    $scope.updateUser = function(user) {
        $scope.modifyUser = user;
    };
});
**/