!function($){function _2(e){function n(e){var i=[];return e.addClass("menu"),i.push(e),e.hasClass("menu-content")||e.children("div").each(function(){var e=$(this).children("div");if(e.length){e.appendTo("body"),this.submenu=e;var t=n(e);i=i.concat(t)}}),i}function i(n){var i=$.parser.parseOptions(n[0],["width","height"]);n[0].originalHeight=i.height||0,n.hasClass("menu-content")?n[0].originalWidth=i.width||n._outerWidth():(n[0].originalWidth=i.width||0,n.children("div").each(function(){var n=$(this),i=$.extend({},$.parser.parseOptions(this,["name","iconCls","href",{separator:"boolean"}]),{disabled:!!n.attr("disabled")||void 0});if(i.separator&&n.addClass("menu-sep"),!n.hasClass("menu-sep")){n[0].itemName=i.name||"",n[0].itemHref=i.href||"";var t=n.addClass("menu-item").html();n.empty().append($('<div class="menu-text"></div>').html(t)),i.iconCls&&$('<div class="menu-icon"></div>').addClass(i.iconCls).appendTo(n),i.disabled&&_10(e,n[0],!0),n[0].submenu&&$('<div class="menu-rightarrow"></div>').appendTo(n),_11(e,n)}}),$('<div class="menu-line"></div>').prependTo(n)),_12(e,n),n.hasClass("menu-inline")||n.hide(),_13(e,n)}var t=$.data(e,"menu").options;$(e).addClass("menu-top"),t.inline?$(e).addClass("menu-inline"):$(e).appendTo("body"),$(e).bind("_resize",function(n,i){return($(this).hasClass("easyui-fluid")||i)&&$(e).menu("resize",e),!1});for(var o=n($(e)),s=0;s<o.length;s++)i(o[s])}function _12(e,n){var i=$.data(e,"menu").options,t=n.attr("style")||"";n.css({display:"block",left:-1e4,height:"auto",overflow:"hidden"}),n.find(".menu-item").each(function(){$(this)._outerHeight(i.itemHeight),$(this).find(".menu-text").css({height:i.itemHeight-2+"px",lineHeight:i.itemHeight-2+"px"})}),n.removeClass("menu-noline").addClass(i.noline?"menu-noline":"");var o=n[0].originalWidth||"auto";isNaN(parseInt(o))&&(o=0,n.find("div.menu-text").each(function(){o<$(this)._outerWidth()&&(o=$(this)._outerWidth())}),o+=40);var s=n.outerHeight(),u=n[0].originalHeight||"auto";if(isNaN(parseInt(u)))if(u=s,n.hasClass("menu-top")&&i.alignTo){var a=$(i.alignTo),d=a.offset().top-$(document).scrollTop(),r=$(window)._outerHeight()+$(document).scrollTop()-a.offset().top-a._outerHeight();u=Math.min(u,Math.max(d,r))}else u>$(window)._outerHeight()&&(u=$(window).height());n.attr("style",t),n._size({fit:n[0]==e&&i.fit,width:o,minWidth:i.minWidth,height:u}),n.css("overflow",n.outerHeight()<s?"auto":"hidden"),n.children("div.menu-line")._outerHeight(s-2)}function _13(e,n){if(!n.hasClass("menu-inline")){var i=$.data(e,"menu");n.unbind(".menu").bind("mouseenter.menu",function(){i.timer&&(clearTimeout(i.timer),i.timer=null)}).bind("mouseleave.menu",function(){i.options.hideOnUnhover&&(i.timer=setTimeout(function(){_1e(e,$(e).hasClass("menu-inline"))},i.options.duration))})}}function _11(e,n){n.hasClass("menu-item")&&(n.unbind(".menu"),n.bind("click.menu",function(){if(!$(this).hasClass("menu-item-disabled")){if(!this.submenu){_1e(e,$(e).hasClass("menu-inline"));var n=this.itemHref;n&&(location.href=n)}$(this).trigger("mouseenter");var i=$(e).menu("getItem",this);$.data(e,"menu").options.onClick.call(e,i)}}).bind("mouseenter.menu",function(i){if(n.siblings().each(function(){this.submenu&&_1(this.submenu),$(this).removeClass("menu-active")}),n.addClass("menu-active"),$(this).hasClass("menu-item-disabled"))return void n.addClass("menu-active-disabled");var t=n[0].submenu;t&&$(e).menu("show",{menu:t,parent:n})}).bind("mouseleave.menu",function(e){n.removeClass("menu-active menu-active-disabled");var i=n[0].submenu;i?e.pageX>=parseInt(i.css("left"))?n.addClass("menu-active"):_1(i):n.removeClass("menu-active")}))}function _1e(e,n){var i=$.data(e,"menu");return i&&$(e).is(":visible")&&(_1($(e)),n?$(e).show():i.options.onHide.call(e)),!1}function _28(e,n){function i(e,n){return e+u.outerHeight()>$(window)._outerHeight()+$(document).scrollTop()&&(e=n?$(n).offset().top-u._outerHeight():$(window)._outerHeight()+$(document).scrollTop()-u.outerHeight()),e<0&&(e=0),e}n=n||{};var t,o,s=$.data(e,"menu").options,u=$(n.menu||e);if($(e).menu("resize",u[0]),u.hasClass("menu-top")){if($.extend(s,n),t=s.left,o=s.top,s.alignTo){var a=$(s.alignTo);t=a.offset().left,o=a.offset().top+a._outerHeight(),"right"==s.align&&(t+=a.outerWidth()-u.outerWidth())}t+u.outerWidth()>$(window)._outerWidth()+$(document)._scrollLeft()&&(t=$(window)._outerWidth()+$(document).scrollLeft()-u.outerWidth()-5),t<0&&(t=0),o=i(o,s.alignTo)}else{var d=n.parent;t=d.offset().left+d.outerWidth()-2,t+u.outerWidth()+5>$(window)._outerWidth()+$(document).scrollLeft()&&(t=d.offset().left-u.outerWidth()+2),o=i(d.offset().top-3)}u.css(s.position.call(e,u[0],t,o)),u.show(0,function(){u[0].shadow||(u[0].shadow=$('<div class="menu-shadow"></div>').insertAfter(u)),u[0].shadow.css({display:u.hasClass("menu-inline")?"none":"block",zIndex:$.fn.menu.defaults.zIndex++,left:u.css("left"),top:u.css("top"),width:u.outerWidth(),height:u.outerHeight()}),u.css("z-index",$.fn.menu.defaults.zIndex++),u.hasClass("menu-top")&&s.onShow.call(e)})}function _1(e){function n(e){e.stop(!0,!0),e[0].shadow&&e[0].shadow.hide(),e.hide()}e&&e.length&&(n(e),e.find("div.menu-item").each(function(){this.submenu&&_1(this.submenu),$(this).removeClass("menu-active")}))}function _33(e,n){function i(s){s.children("div.menu-item").each(function(){var s=$(e).menu("getItem",this),u=o.empty().html(s.text).text();n==$.trim(u)?t=s:this.submenu&&!t&&i(this.submenu)})}var t=null,o=$("<div></div>");return i($(e)),o.remove(),t}function _10(e,n,i){var t=$(n);t.hasClass("menu-item")&&(i?(t.addClass("menu-item-disabled"),n.onclick&&(n.onclick1=n.onclick,n.onclick=null)):(t.removeClass("menu-item-disabled"),n.onclick1&&(n.onclick=n.onclick1,n.onclick1=null)))}function _3d(_3e,_3f){var _40=$.data(_3e,"menu").options,_41=$(_3e);if(_3f.parent){if(!_3f.parent.submenu){var _42=$('<div class="menu"><div class="menu-line"></div></div>').appendTo("body");_42.hide(),_3f.parent.submenu=_42,$('<div class="menu-rightarrow"></div>').appendTo(_3f.parent)}_41=_3f.parent.submenu}if(_3f.separator)var _43=$('<div class="menu-sep"></div>').appendTo(_41);else{var _43=$('<div class="menu-item"></div>').appendTo(_41);$('<div class="menu-text"></div>').html(_3f.text).appendTo(_43)}_3f.iconCls&&$('<div class="menu-icon"></div>').addClass(_3f.iconCls).appendTo(_43),_3f.id&&_43.attr("id",_3f.id),_3f.name&&(_43[0].itemName=_3f.name),_3f.href&&(_43[0].itemHref=_3f.href),_3f.onclick&&("string"==typeof _3f.onclick?_43.attr("onclick",_3f.onclick):_43[0].onclick=eval(_3f.onclick)),_3f.handler&&(_43[0].onclick=eval(_3f.handler)),_3f.disabled&&_10(_3e,_43[0],!0),_11(_3e,_43),_13(_3e,_41),_12(_3e,_41)}function _44(e,n){function i(e){if(e.submenu){e.submenu.children("div.menu-item").each(function(){i(this)});var n=e.submenu[0].shadow;n&&n.remove(),e.submenu.remove()}$(e).remove()}var t=$(n).parent();i(n),_12(e,t)}function _4a(e,n,i){var t=$(n).parent();i?$(n).show():$(n).hide(),_12(e,t)}function _4f(e){$(e).children("div.menu-item").each(function(){_44(e,this)}),e.shadow&&e.shadow.remove(),$(e).remove()}$(function(){$(document).unbind(".menu").bind("mousedown.menu",function(e){var n=$(e.target).closest("div.menu,div.combo-p");n.length||($("body>div.menu-top:visible").not(".menu-inline").menu("hide"),_1($("body>div.menu:visible").not(".menu-inline")))})}),$.fn.menu=function(e,n){return"string"==typeof e?$.fn.menu.methods[e](this,n):(e=e||{},this.each(function(){var n=$.data(this,"menu");n?$.extend(n.options,e):(n=$.data(this,"menu",{options:$.extend({},$.fn.menu.defaults,$.fn.menu.parseOptions(this),e)}),_2(this)),$(this).css({left:n.options.left,top:n.options.top})}))},$.fn.menu.methods={options:function(e){return $.data(e[0],"menu").options},show:function(e,n){return e.each(function(){_28(this,n)})},hide:function(e){return e.each(function(){_1e(this)})},destroy:function(e){return e.each(function(){_4f(this)})},setText:function(e,n){return e.each(function(){$(n.target).children("div.menu-text").html(n.text)})},setIcon:function(e,n){return e.each(function(){$(n.target).children("div.menu-icon").remove(),n.iconCls&&$('<div class="menu-icon"></div>').addClass(n.iconCls).appendTo(n.target)})},getItem:function(e,n){var i=$(n),t={target:n,id:i.attr("id"),text:$.trim(i.children("div.menu-text").html()),disabled:i.hasClass("menu-item-disabled"),name:n.itemName,href:n.itemHref,onclick:n.onclick},o=i.children("div.menu-icon");if(o.length){for(var s=[],u=o.attr("class").split(" "),a=0;a<u.length;a++)"menu-icon"!=u[a]&&s.push(u[a]);t.iconCls=s.join(" ")}return t},findItem:function(e,n){return _33(e[0],n)},appendItem:function(e,n){return e.each(function(){_3d(this,n)})},removeItem:function(e,n){return e.each(function(){_44(this,n)})},enableItem:function(e,n){return e.each(function(){_10(this,n,!1)})},disableItem:function(e,n){return e.each(function(){_10(this,n,!0)})},showItem:function(e,n){return e.each(function(){_4a(this,n,!0)})},hideItem:function(e,n){return e.each(function(){_4a(this,n,!1)})},resize:function(e,n){return e.each(function(){_12(this,$(n))})}},$.fn.menu.parseOptions=function(e){return $.extend({},$.parser.parseOptions(e,[{minWidth:"number",itemHeight:"number",duration:"number",hideOnUnhover:"boolean"},{fit:"boolean",inline:"boolean",noline:"boolean"}]))},$.fn.menu.defaults={zIndex:11e4,left:0,top:0,alignTo:null,align:"left",minWidth:120,itemHeight:22,duration:100,hideOnUnhover:!0,inline:!1,fit:!1,noline:!1,position:function(e,n,i){return{left:n,top:i}},onShow:function(){},onHide:function(){},onClick:function(e){}}}(jQuery);