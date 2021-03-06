<#import "/spring.ftl" as spring>
<#import "/blossom/utils/status.ftl" as state>
<#import "/blossom/utils/buttons.ftl" as buttons>
<#import "/blossom/utils/tabulation.ftl" as tabulation>

<div class="ibox-content">
  <div class="sk-spinner sk-spinner-wave">
    <div class="sk-rect1"></div>
    <div class="sk-rect2"></div>
    <div class="sk-rect3"></div>
    <div class="sk-rect4"></div>
    <div class="sk-rect5"></div>
  </div>
    <form class="form form-horizontal">
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.name"/></label>
            <div class="col-sm-10">
                <p class="form-control-static">${article.name!''}</p>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.summary"/></label>
            <div class="col-sm-10">
                <p class="form-control-static">${article.summary!''}</p>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.creationdate"/></label>
            <div class="col-sm-10">
                <p class="form-control-static">${article.creationDate?datetime}</p>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.modificationdate"/></label>
            <div class="col-sm-10">
                <p class="form-control-static">${article.modificationDate?datetime}</p>
            </div>
        </div>
        <div class="hr-line-dashed"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.status"/></label>
            <div class="col-sm-10">
                <p class="form-control-static"> <@state.label status=article.status/></p>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label"><@spring.message "articles.article.properties.content"/></label>
            <div class="col-sm-10">
                <p class="form-control-static">${article.content!''}</p>
            </div>
        </div>

    </form>
</div>

<div class="ibox-footer">
  <div class="text-right">
    <button class="btn btn-primary btn-view" onclick="edit_articleinformations(this);">
    <@spring.message "edit"/>
    </button>
  </div>
</div>

<script>
  var edit_articleinformations = function (button) {
    var targetSelector = '#'+$(button).closest(".tab-pane").attr('id');
    $(targetSelector + ' > .ibox-content').addClass("sk-loading");
    var edit = $(targetSelector).data("edit");
    $.get(edit).done(function (responseText, textStatus, jqXHR) {
      if (jqXHR.status === 200) {
        $(targetSelector).html(responseText);
      }
      $(targetSelector).removeClass("sk-loading");
    });
  };
</script>
