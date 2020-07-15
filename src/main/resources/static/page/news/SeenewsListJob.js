layui.use(['form','layer','laydate','table','laytpl'],function(){
    var form = layui.form,
        $ = layui.jquery,
        laydate = layui.laydate,
        laytpl = layui.laytpl,
        table = layui.table;
    //新闻列表
    var tableIns = table.render({
		  elem: '#newsList',
		  url : '/Job/getAllJob',
		  cellMinWidth : 95,
		  page : true,
		  //toolbar: '#toolbarDemo', //开启头部工具栏，并为其绑定左侧模板
		  defaultToolbar: ['filter', 'exports', 'print'],
		  limit : 20,
		  limits : [10,15,20,25],
		  id : "newsListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'jobid', title: 'ID', width:60, align:"center" ,fixed:"left"},
            {field: 'jobname', title: '职位名称', width:250},
            {field: 'number', title: '招聘人数', width:250},
            {field: 'salary', title: '薪资', width:250},
            {field: 'address', title: '工作地点', width:250},
            {title: '操作', width:130, templet:'#newsListBar',fixed:"right",align:"center"}
        ]],
		done: function(res, curr, count) {
			//图片放大预览
			var ids;
			for (var j in res.data) {
				ids = res.data[j].newsId;
				layer.photos({
					photos: '.thumbnailImages'+ids 
				});
			}
		}
    });
    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("newsListTable",{
                url:'/Job/selectByTitle',
                type:'get',
                success:function(){
                    layer.msg("查询成功");
                },
                error:function () {
                    layer.msg("查询失败")
                },
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    search: $(".searchVal").val()  //搜索的关键字
                }
            })
        }else{
            layer.msg("请输入搜索的内容");
        }
    });
    //添加文章
    function addNews(edit){
        var index = layui.layer.open({
            title : "查看职位",
            type : 2,
            area: ['90%', '90%'],
            fixed: false, //不固定
            maxmin: true,
            content : "giveJob1.html",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".jobname").val(edit.jobname);
                    body.find(".requirement").val(edit.requirement);
                    body.find(".address").val(edit.address);
                    body.find(".salary").val(edit.salary);
                    body.find(".number").val(edit.number);
                    body.find(".otherpay").val(edit.otherpay);
                    body.find(".closedate").val(edit.closedate);
                    body.find(".described").val(edit.described);
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回工作经历列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            }
        })
    }
    $(".addNews_btn").click(function(){
        addNews();
    })
    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('newsListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].newsId);
            }
            layer.confirm('确定删除选中的工作经历？', {icon: 3, title: '提示信息'}, function (index) {
                // $.get("删除简历接口",{
                //     newsId : newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                tableIns.reload();
                layer.close(index);
                // })
            })
        }else{
            layer.msg("请选择需要删除的工作经历");
        }
    })
    //列表操作
    table.on('tool(newsList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;
			console.log(obj)
        if(layEvent === 'edit'){ //编辑
            addNews(data);
        } else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除此工作经历？',{icon:3, title:'提示信息'},function(index){
                // $.get("删除简历接口",{
                //     newsId : data.newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                    tableIns.reload();
                    layer.close(index);
                // })
            });
        } 
    });
})