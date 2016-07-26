// 下拉列表
$(document).ready(function(){
	$.navlevel2 = function(level1,dytime) { 
	  $(level1).mouseenter(function(){
		  varthis = $(this);
		  delytime=setTimeout(function(){			
			varthis.find('ul').slideDown();
		},dytime);
		
	  });
	  $(level1).mouseleave(function(){
		 clearTimeout(delytime);
		 $(this).find('ul').slideUp();
	  });
	  
	};
  $.navlevel2("li.mainlevel",200);
});
//弹出密码修改窗口
function openwin() {  
        window.open("modifypwd.html", "", "width=400,height=200,top=250,left=250,toolbar=no,menubar=no,scrollbars=no,resizable=yes,location=no,status=no")  
    } 
//弹出老化时间设置窗口
function openwin2() {  
        window.open("laohseting.html", "", "width=500,height=300,top=250,left=250,toolbar=no,menubar=no,scrollbars=no,resizable=yes,location=no,status=no")  
    }
//弹出出入库窗口	
function openwin3() {  
        window.open("datasum.html", "", "width=850,height=400,top=250,left=250,toolbar=no,menubar=no,scrollbars=no,resizable=yes,location=no,status=no")  
    }
//时钟
setInterval(function(){
	var date = new Date();
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();
	var h = date.getHours();
	var i = date.getMinutes();
	var s = date.getSeconds();
	document.getElementById("showTime").innerHTML = y + '年' + (m<10?'0' + m:m) + '月' + (d<10?'0' + d:d) + '日 ' + (h<12?'上午':'下午') + ((h=h%12)<10?'0' + h:h) + ':' + (i<10?'0' + i:i) + ':' + (s<10?'0' + s:s);
},500);
//切换表格
$(document).ready(function(e) {
	$(".nav2 a:nth-child(1)");
	$(".left span:nth-child(1)").show().siblings().hide();
	
    var $sct_a = $(".nav2 a");
	$sct_a.click(function(){
		$(this).siblings();
		var index = $sct_a.index(this);
			$sct_rgt = $(".left span");
			$sct_rgt.eq(index).show().siblings().hide();
		});

});
//单元格产生随机颜色
onload=function(){        
                var table = document.querySelector(".tableindex");
                var rows = table.tBodies[0].rows;
			
                for(var i = 1; i < rows.length; i++){
                    var tds = rows[i].cells;
                    for(var j = 1; j < tds.length; j++){
                        var td = tds[j];
                       					   
            var a=Math.floor(Math.random()*4);
			  switch(a){
			    case 0:
				   td.style.backgroundColor = "rgb(" + 0 + "," + 0  + "," + 0  + ")";
				   break;
				case 1:
				   td.style.backgroundColor = "rgb(" + 255 + "," + 0  + "," + 0  + ")";
				   break;
				case 2:
				   td.style.backgroundColor = "rgb(" + 0 + "," + 255  + "," + 0  + ")";
				   break;
				case 3:
				   td.style.backgroundColor = "rgb(" + 0 + "," + 0  + "," + 255  + ")";
				   break;
			          }
                    }
                }
			  
            }



