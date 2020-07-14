layui.use(['form','layer','layedit','laydate','upload'],function(){
	var form = layui.form
	layer = parent.layer === undefined ? layui.layer : top.layer,
		laypage = layui.laypage,
		upload = layui.upload,
		layedit = layui.layedit,
		laydate = layui.laydate,
		$ = layui.jquery;


	form.verify({
		jobName1 : function(val){
			if(val == ''){
				return "文章标题不能为空";
			}
		}
	})
	form.on("submit(addJob)",function(data){
		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
		$.ajax({
			url:'/Job/add',
			type:'post',
			data:data.field,
			dataType:'JSON',
			success:function(){
				layer.msg("操作成功");
			},
			error:function () {
				layer.msg("操作失败")
			}
		})
		setTimeout(function(){
			top.layer.close(index);
			top.layer.msg("职位发布成功！");
			layer.closeAll("iframe");
			//刷新父页面
			parent.location.reload();
		},500);
		return false;
	})




})