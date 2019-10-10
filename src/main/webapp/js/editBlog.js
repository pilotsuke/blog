$(function(){
	
	$("#subEditBlog").click(function(){
		$.ajax({
			type:"post",
			url:"editBlog",
			data:$("#formEditBlog").serialize(),
			dataType:"json",
			success:function(data){
				alert(data);
				if(data=="success"){
					alert("发送到控制器成功");
				}else{
					
					alert("发送失败");
				}
			}
			
		})
	})
	
	
})