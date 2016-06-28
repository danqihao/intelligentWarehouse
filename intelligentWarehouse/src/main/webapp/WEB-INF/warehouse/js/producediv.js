function test() {
	alert('div A 被点击了')

}



function calculateColor(color_target, color_src, colorValue, batteryCount, type) {
	var origin_source = parseInt(color_src);
	var origin_target = parseInt(color_target);
	var current_color = parseInt(colorValue);

	var step = Math.floor((origin_target - origin_source) / batteryCount);
	var color16 = 0;
	if (type == 0) {
		var toColor = current_color + step;
		var to16Color = toColor.toString(16);
		if (to16Color.length > 5) {
			color16 = "#" + toColor.toString(16);
		} else {
			color16 = "#0" + toColor.toString(16);
		}
		// color16="#"+toColor.toString(16);

	} else if (type == 1) {
		var toColor = current_color - step;
		if (toColor <= origin_source) {
			return '#00FF00'
		};

		var to16Color = toColor.toString(16);
		if (to16Color.length > 5) {
			color16 = "#" + toColor.toString(16);
		} else {
			color16 = "#0" + toColor.toString(16);
		}
		// color16="#"+toColor.toString(16);
	};

	// console.log("colorValue: " + colorValue);
	// console.log("ToColorValue: " + color16);
	return color16;

}

$.fn.getHexBackgroundColor = function(id, property) {
	var rgb = $(id).css(property);

	rgb = rgb.match(/^rgb\((\d+),\s*(\d+),\s*(\d+)\)$/);

	function hex(x) {
		return ("0" + parseInt(x).toString(16)).slice(-2);
	}
	rgb = "0x" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]);
	return rgb;
}



$(function() {
	// // obj.onclick=function(){test()};
	// obj.setAttribute("onclick",function(){ console.log("click is load")});
	// alert('函数加载了');
	// dblclick()
	var TimeFn = null;
	var batteryCount = 15;
	$('#block2').find('.shelf_block').each(function(index, el) {
		$(this).attr('id', $(this).parent().attr('id')+"_"+$(this).attr('id'));
		// console.log($(this).attr('id'));
	});

	$('#block1').find('.shelf_block').each(function(index, el) {
		$(this).attr('id', $(this).parent().attr('id')+"_"+$(this).attr('id'));
		// console.log($(this).attr('id'));
	});

	$(".shelf_block").click(function(event) {
		/* Act on the event */
		var selectedId = $(this).attr('id');

		// console.log($(this).parent().attr('id'));
		// if (selectedId.substr(0,5)!="block") {selectedId=$(this).parent().attr('id')+"_"+selectedId;};
		
		// $(this).attr('id', selectedId);
		// console.log($(this).attr('id'));
		// console.log("get the color: "+$.fn.getHexBackgroundColor("#"+selectedId,'background-color'));
		// var origin_source=parseInt(colorValue);
		// var origin_target=parseInt('#FF0000');


		// 取消上次延时未执行的方法
		clearTimeout(TimeFn);
		//执行延时
		TimeFn = setTimeout(function() {
			//do function在此处写单击事件要执行的代码
			console.log("singleclick " + "click is load id " + selectedId);
			var colorValue = $.fn.getHexBackgroundColor("#" + selectedId, 'background-color');
			// console.log("get the color: "+$.fn.getHexBackgroundColor("#"+selectedId,'background-color'));
			var targetColor = calculateColor('0xFF0000', '0x00FF00', colorValue, batteryCount, 0);
			$("#" + selectedId).css('background-color', targetColor);
			// $("#" + selectedId).text('some text');
			// $("#"+selectedId).animate({'background-color':'#FF0000'},10000);
			var currentNum=$("#"+selectedId).find("span").text();
			var toChangeNum=100.0*(currentNum/100.0*batteryCount+1)/batteryCount;
			if (toChangeNum>=100) {toChangeNum=100.00};
			$("#"+selectedId).find("span").text(toChangeNum.toFixed(2));
			console.log($("#"+selectedId).find("span").text());
		}, 350);

	});

	$(".shelf_block").dblclick(function(event) {
		/* Act on the event */

		clearTimeout(TimeFn);
		var colorValue = $.fn.getHexBackgroundColor("#" + $(this).attr('id'), 'background-color');
		// console.log("get the color: "+$.fn.getHexBackgroundColor("#"+selectedId,'background-color'));
		var targetColor = calculateColor('0xFF0000', '0x00FF00', colorValue, batteryCount, 1);
		$(this).css('background-color', targetColor);
		var currentNum=$(this).find("span").text();
			var toChangeNum=100.0*(currentNum/100.0*batteryCount-1)/batteryCount;
			if (toChangeNum<=0) {toChangeNum=0};
			$(this).find("span").text(toChangeNum.toFixed(2));
			console.log($(this).find("span").text());
		// $("#" + selectedId).text('some text');
		console.log("doubleclick " + "click is load id " + $(this).attr('id'));

	});



	//  $(".name1").live('mousedown', function(event) {
	//  	/* Act on the event */
	//  	console.log("click is load id "+ $(this).attr('id'));

	//  	console.log(typeof event.button + ','+event.which);
	//  	if(( event.button == 0) || (event.button == 1))
	// {
	//     console.log("Left Mouse Button Clicked");
	// }else if(event.which == 3) {
	//     console.log("Right Mouse Button Clicked");
	// }
	//  	// console.log("target id "+event.target.getAttribute("id"));

	//  });
	// document.getElementsByClassName("name1").onclick=function(event){
	// console.log("click is load");
	// console.log("click is load id "+event.srcElement.getAttribute("id"));

	// console.log("target id "+event.target.getAttribute("id"));
	// };
	console.log("function is load");
});

