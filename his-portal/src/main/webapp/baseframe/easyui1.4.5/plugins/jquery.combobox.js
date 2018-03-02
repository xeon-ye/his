!function(o){function t(t,e){var i=o.data(t,"combobox");return o.easyui.indexOfArray(i.data,i.options.valueField,e)}function e(t,e){var i=o.data(t,"combobox").options,n=o(t).combo("panel"),a=i.finder.getEl(t,e);if(a.length)if(a.position().top<=0){var r=n.scrollTop()+a.position().top;n.scrollTop(r)}else if(a.position().top+a.outerHeight()>n.height()){var r=n.scrollTop()+a.position().top+a.outerHeight()-n.height();n.scrollTop(r)}n.triggerHandler("scroll")}function i(t,e){var i=o.data(t,"combobox").options,a=o(t).combobox("panel"),r=a.children("div.combobox-item-hover");r.length||(r=a.children("div.combobox-item-selected")),r.removeClass("combobox-item-hover");var s="div.combobox-item:visible:not(.combobox-item-disabled):first",l="div.combobox-item:visible:not(.combobox-item-disabled):last";if(r.length?"next"==e?(r=r.nextAll(s),r.length||(r=a.children(s))):(r=r.prevAll(s),r.length||(r=a.children(l))):r=a.children("next"==e?s:l),r.length){r.addClass("combobox-item-hover");var c=i.finder.getRow(t,r);c&&(o(t).combobox("scrollTo",c[i.valueField]),i.selectOnNavigation&&n(t,c[i.valueField]))}}function n(t,e,i){var n=o.data(t,"combobox").options,a=o(t).combo("getValues");o.inArray(e+"",a)==-1&&(n.multiple?a.push(e):a=[e],r(t,a,i),n.onSelect.call(t,n.finder.getRow(t,e)))}function a(t,e){var i=o.data(t,"combobox").options,n=o(t).combo("getValues"),a=o.inArray(e+"",n);a>=0&&(n.splice(a,1),r(t,n),i.onUnselect.call(t,i.finder.getRow(t,e)))}function r(t,e,i){var n=o.data(t,"combobox").options,a=o(t).combo("panel");o.isArray(e)||(e=e.split(n.separator)),n.multiple||(e=e.length?[e[0]]:[""]),a.find("div.combobox-item-selected").removeClass("combobox-item-selected");for(var r=null,s=[],l=[],c=0;c<e.length;c++){var b=e[c],d=b;n.finder.getEl(t,b).addClass("combobox-item-selected");var u=n.finder.getRow(t,b);u&&(d=u[n.textField],r=u),s.push(b),l.push(d)}if(i||o(t).combo("setText",l.join(n.separator)),n.showItemIcon){var m=o(t).combobox("textbox");m.removeClass("textbox-bgicon "+n.textboxIconCls),r&&r.iconCls&&(m.addClass("textbox-bgicon "+r.iconCls),n.textboxIconCls=r.iconCls)}o(t).combo("setValues",s),a.triggerHandler("scroll")}function s(t,e,i){var n=o.data(t,"combobox"),a=n.options;n.data=a.loadFilter.call(t,e),a.view.render.call(a.view,t,o(t).combo("panel"),n.data);var s=o(t).combobox("getValues");o.easyui.forEach(n.data,!1,function(t){t.selected&&o.easyui.addArrayItem(s,t[a.valueField]+"")}),a.multiple?r(t,s,i):r(t,s.length?[s[s.length-1]]:[],i),a.onLoadSuccess.call(t,e)}function l(t,e,i,n){var a=o.data(t,"combobox").options;e&&(a.url=e),i=o.extend({},a.queryParams,i||{}),0!=a.onBeforeLoad.call(t,i)&&a.loader.call(t,i,function(o){s(t,o,n)},function(){a.onLoadError.apply(this,arguments)})}function c(t,e){function i(o){r(t,s.multiple?e?o:[]:o,!0)}var a=o.data(t,"combobox"),s=a.options,c=s.multiple?e.split(s.separator):[e];if("remote"==s.mode)i(c),l(t,null,{q:e},!0);else{var b=o(t).combo("panel");b.find("div.combobox-item-selected,div.combobox-item-hover").removeClass("combobox-item-selected combobox-item-hover"),b.find("div.combobox-item,div.combobox-group").hide();var d=a.data,u=[];o.map(c,function(e){e=o.trim(e);for(var i=e,a=void 0,r=0;r<d.length;r++){var l=d[r];if(s.filter.call(t,e,l)){var c=l[s.valueField],b=l[s.textField],m=l[s.groupField];s.finder.getEl(t,c).show();b.toLowerCase()==e.toLowerCase()&&(i=c,n(t,c,!0)),s.groupField&&a!=m&&(s.finder.getGroupEl(t,m).show(),a=m)}}u.push(i)}),i(u)}}function b(e){var i=o(e),n=i.combobox("options"),a=i.combobox("panel"),r=a.children("div.combobox-item-hover");if(r.length){var s=n.finder.getRow(e,r),l=s[n.valueField];n.multiple&&r.hasClass("combobox-item-selected")?i.combobox("unselect",l):i.combobox("select",l)}var c=[];o.map(i.combobox("getValues"),function(o){t(e,o)>=0&&c.push(o)}),i.combobox("setValues",c),n.multiple||i.combobox("hidePanel")}function d(t){var e=o.data(t,"combobox"),i=e.options;o(t).addClass("combobox-f"),o(t).combo(o.extend({},i,{onShowPanel:function(){o(this).combo("panel").find("div.combobox-item:hidden,div.combobox-group:hidden").show(),r(this,o(this).combobox("getValues"),!0),o(this).combobox("scrollTo",o(this).combobox("getValue")),i.onShowPanel.call(this)}})),o(t).combo("panel").unbind().bind("mouseover",function(t){o(this).children("div.combobox-item-hover").removeClass("combobox-item-hover");var e=o(t.target).closest("div.combobox-item");e.hasClass("combobox-item-disabled")||e.addClass("combobox-item-hover"),t.stopPropagation()}).bind("mouseout",function(t){o(t.target).closest("div.combobox-item").removeClass("combobox-item-hover"),t.stopPropagation()}).bind("click",function(t){var e=o(this).panel("options").comboTarget,r=o(t.target).closest("div.combobox-item");if(r.length&&!r.hasClass("combobox-item-disabled")){var s=i.finder.getRow(e,r);if(s){var l=s[i.valueField];i.multiple?r.hasClass("combobox-item-selected")?a(e,l):n(e,l):(n(e,l),o(e).combo("hidePanel")),t.stopPropagation()}}}).bind("scroll",function(){if("sticky"==i.groupPosition){var t=o(this).panel("options").comboTarget,n=o(this).children(".combobox-stick");n.length||(n=o('<div class="combobox-stick"></div>').appendTo(this)),n.hide(),o(this).children(".combobox-group:visible").each(function(){var a=o(this),r=i.finder.getGroup(t,a),s=e.data[r.startIndex+r.count-1],l=i.finder.getEl(t,s[i.valueField]);if(a.position().top<0&&l.position().top>0)return n.show().html(a.html()),!1})}})}o.fn.combobox=function(t,e){if("string"==typeof t){var i=o.fn.combobox.methods[t];return i?i(this,e):this.combo(t,e)}return t=t||{},this.each(function(){var e=o.data(this,"combobox");if(e?o.extend(e.options,t):e=o.data(this,"combobox",{options:o.extend({},o.fn.combobox.defaults,o.fn.combobox.parseOptions(this),t),data:[]}),d(this),e.options.data)s(this,e.options.data);else{var i=o.fn.combobox.parseData(this);i.length&&s(this,i)}l(this)})},o.fn.combobox.methods={options:function(t){var e=t.combo("options");return o.extend(o.data(t[0],"combobox").options,{width:e.width,height:e.height,originalValue:e.originalValue,disabled:e.disabled,readonly:e.readonly})},cloneFrom:function(t,e){return t.each(function(){o(this).combo("cloneFrom",e),o.data(this,"combobox",o(e).data("combobox")),o(this).addClass("combobox-f").attr("comboboxName",o(this).attr("textboxName"))})},getData:function(t){return o.data(t[0],"combobox").data},setValues:function(o,t){return o.each(function(){r(this,t)})},setValue:function(t,e){return t.each(function(){r(this,o.isArray(e)?e:[e])})},clear:function(t){return t.each(function(){o(this).combo("clear");var t=o(this).combo("panel");t.find("div.combobox-item-selected").removeClass("combobox-item-selected")})},reset:function(t){return t.each(function(){var t=o(this).combobox("options");t.multiple?o(this).combobox("setValues",t.originalValue):o(this).combobox("setValue",t.originalValue)})},loadData:function(o,t){return o.each(function(){s(this,t)})},reload:function(t,e){return t.each(function(){if("string"==typeof e)l(this,e);else{if(e){var t=o(this).combobox("options");t.queryParams=e}l(this)}})},select:function(o,t){return o.each(function(){n(this,t)})},unselect:function(o,t){return o.each(function(){a(this,t)})},scrollTo:function(o,t){return o.each(function(){e(this,t)})}},o.fn.combobox.parseOptions=function(t){o(t);return o.extend({},o.fn.combo.parseOptions(t),o.parser.parseOptions(t,["valueField","textField","groupField","groupPosition","mode","method","url",{showItemIcon:"boolean"}]))},o.fn.combobox.parseData=function(t){function e(t,e){var a=o(t),r={};r[n.valueField]=void 0!=a.attr("value")?a.attr("value"):a.text(),r[n.textField]=a.text(),r.selected=a.is(":selected"),r.disabled=a.is(":disabled"),e&&(n.groupField=n.groupField||"group",r[n.groupField]=e),i.push(r)}var i=[],n=o(t).combobox("options");return o(t).children().each(function(){if("optgroup"==this.tagName.toLowerCase()){var t=o(this).attr("label");o(this).children().each(function(){e(this,t)})}else e(this)}),i};var u=0,m={render:function(t,e,i){var n=o.data(t,"combobox"),a=n.options;u++,n.itemIdPrefix="_easyui_combobox_i"+u,n.groupIdPrefix="_easyui_combobox_g"+u,n.groups=[];for(var r=[],s=void 0,l=0;l<i.length;l++){var c=i[l],b=(c[a.valueField]+"",c[a.textField]),d=c[a.groupField];d?s!=d?(s=d,n.groups.push({value:d,startIndex:l,count:1}),r.push('<div id="'+(n.groupIdPrefix+"_"+(n.groups.length-1))+'" class="combobox-group">'),r.push(a.groupFormatter?a.groupFormatter.call(t,d):d),r.push("</div>")):n.groups[n.groups.length-1].count++:s=void 0;var m="combobox-item"+(c.disabled?" combobox-item-disabled":"")+(d?" combobox-gitem":"");r.push('<div id="'+(n.itemIdPrefix+"_"+l)+'" class="'+m+'">'),a.showItemIcon&&c.iconCls&&r.push('<span class="combobox-icon '+c.iconCls+'"></span>'),r.push(a.formatter?a.formatter.call(t,c):b),r.push("</div>")}o(e).html(r.join(""))}};o.fn.combobox.defaults=o.extend({},o.fn.combo.defaults,{valueField:"value",textField:"text",groupPosition:"static",groupField:null,groupFormatter:function(o){return o},mode:"local",method:"post",url:null,data:null,queryParams:{},showItemIcon:!1,view:m,keyHandler:{up:function(o){i(this,"prev"),o.preventDefault()},down:function(o){i(this,"next"),o.preventDefault()},left:function(o){},right:function(o){},enter:function(o){b(this)},query:function(o,t){c(this,o)}},filter:function(t,e){var i=o(this).combobox("options");return e[i.textField].toLowerCase().indexOf(t.toLowerCase())>=0},formatter:function(t){var e=o(this).combobox("options");return t[e.textField]},loader:function(t,e,i){var n=o(this).combobox("options");return!!n.url&&void o.ajax({type:n.method,url:n.url,data:t,dataType:"json",success:function(o){e(o)},error:function(){i.apply(this,arguments)}})},loadFilter:function(o){return o},finder:{getEl:function(e,i){var n=t(e,i),a=o.data(e,"combobox").itemIdPrefix+"_"+n;return o("#"+a)},getGroupEl:function(t,e){var i=o.data(t,"combobox"),n=o.easyui.indexOfArray(i.groups,"value",e),a=i.groupIdPrefix+"_"+n;return o("#"+a)},getGroup:function(t,e){var i=o.data(t,"combobox"),n=e.attr("id").substr(i.groupIdPrefix.length+1);return i.groups[parseInt(n)]},getRow:function(e,i){var n=o.data(e,"combobox"),a=i instanceof o?i.attr("id").substr(n.itemIdPrefix.length+1):t(e,i);return n.data[parseInt(a)]}},onBeforeLoad:function(o){},onLoadSuccess:function(){},onLoadError:function(){},onSelect:function(o){},onUnselect:function(o){}})}(jQuery);