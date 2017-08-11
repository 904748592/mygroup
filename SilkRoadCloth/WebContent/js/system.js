$BODY = $('body');
$MENU_TOGGLE = $('#menu_toggle');
$SIDEBAR_MENU = $('#sidebar-menu'),
$SIDEBAR_FOOTER = $('.sidebar-footer');
$LEFT_COL = $('.left_col');
$RIGHT_COL = $('.right_col');
$NAV_MENU = $('.nav_menu');
$FOOTER = $('footer');
$li = $("li");
//左菜单下拉样式
$("#sidebar-menu").find('a').on('click', function(ev) {
	  console.log('clicked - sidebar_menu');
        var $li = $(this).parent();
        if ($li.is('.active')) {
            $li.removeClass('active active-sm');
            $('ul:first', $li).slideUp(function() {
                setContentHeight();
            });
        } else {
            // prevent closing menu if we are on child menu
            if (!$li.parent().is('.child_menu')) {
                $SIDEBAR_MENU.find('li').removeClass('active active-sm');
                $SIDEBAR_MENU.find('li ul').slideUp();
            }else
            {
				if ( $BODY.is( ".nav-sm" ) )
				{
					$SIDEBAR_MENU.find( "li" ).removeClass( "active active-sm" );
					$SIDEBAR_MENU.find( "li ul" ).slideUp();
				}
			}
            $li.addClass('active');

            $('ul:first', $li).slideDown(function() {
                setContentHeight();
            });
        }
});
//顶部个人菜单样式
$("html").on('click',function(){
	$(".top_bar").find('li').removeClass('open');
	$(this).children("a:first-child").attr('aria-expanded','false');
});
function topf(){
	var ev = arguments[0] || window.event;
	$a = $(".top_a1");
	$li = $a.parent();
	if ($li.is('.open')) {
		$li.removeClass('open');
		$a.attr('aria-expanded','false');
		ev.stopPropagation();
	}else{
		$li.addClass('open');
		$a.attr('aria-expanded','true');
		ev.stopPropagation();
	}
}
//设置初始高度和宽度
var setContentHeight = function () {
	// reset height
	$RIGHT_COL.css('min-height', $(window).height());

	var bodyHeight = $BODY.outerHeight(),
		footerHeight = $BODY.hasClass('footer_fixed') ? -10 : $FOOTER.height(),
		leftColHeight = $LEFT_COL.eq(1).height() + $SIDEBAR_FOOTER.height(),
		contentHeight = bodyHeight < leftColHeight ? leftColHeight : bodyHeight;

	// normalize content
	contentHeight -= $NAV_MENU.height() + footerHeight;

	$RIGHT_COL.css('min-height', contentHeight);
};

//弹窗遮罩层和窗口高度和宽度
function openBox(boxs){
	 $("#mask").show();
   boxs.show();
   //获取页面的可视区域高度和宽度
   var wWidth=$(document).width();
   var wHeight=$(document).height();
   $("#mask").css("height",wHeight+"px");
   $("#mask").css("width",wWidth+"px");
   //获取登陆框的宽和高
   var dHeight=boxs.height();
   var dWidth=boxs.width();
   //设置登陆框的left和top
   boxs.css("left",wWidth/2-dWidth/2+"px");
   boxs.css("top",wHeight/2-dHeight/2-40+"px");
}

function openNew(btn,boxs){
   btn.bind("click",function(){
       $("#mask").show();
       boxs.show();
       //获取页面的可视区域高度和宽度
       var wWidth=$(document).width();
       var wHeight=$(document).height();
       $("#mask").css("height",wHeight+"px");
       $("#mask").css("width",wWidth+"px");
       //获取登陆框的宽和高
       var dHeight=boxs.height();
       var dWidth=boxs.width();
       //设置登陆框的left和top
       boxs.css("left",wWidth/2-dWidth/2+"px");
       boxs.css("top",wHeight/2-dHeight/2-40+"px");
   })
}