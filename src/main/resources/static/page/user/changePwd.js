layui.use(['form','layer'],function() {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery;

    form.on('submit(changePwd)',function (data) {
        $.ajax({
            url:'/changePassword',
            type:'post',
            data:data.field,
            dataType:'JSON',
            timeout:2000,
            success:function(data){
                console.log(data);
                if(data == 'success'){
                    layer.msg("密码修改成功");

                }else{
                    layer.msg("密码修改失败")
                }
            },
            error:function () {
                layer.msg("密码修改失败")
            }
        })
    })
})
