layui.use(['form','layer','laydate','table','laytpl'],function() {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laydate = layui.laydate,
        laytpl = layui.laytpl,
        table = layui.table;
})
    form.on('submit(changePwd)',function () {
        $.ajax({
            elem: '#changePwd',
            url:'/changePassword',
            type:'post',
            dataType:'text',
            contentType: 'application/json',
            data:JSON.stringify(data),
            timeout:2000,
            beforeSend:function (xhr) {
                xhr.setRequestHeader(header,token);
            },
            success:function(data){
                console.log(data);
                if(data == 'success'){
                    layer.msg("密码修改成功");
                    location.href = "/user/loginpage"
                }else{
                    layer.msg("密码修改失败")
                }
            },
            error:function () {
                layer.msg("密码修改失败")
            }
        })
    })