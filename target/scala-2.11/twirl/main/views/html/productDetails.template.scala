
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productDetails_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object productDetails_Scope1 {
import helper._

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template13[List[models.Category],models.users.User,Long,Long,String,Long,models.Product,List[models.productsAdditions.Comment],List[models.Size],Form[productsAdditions.Comment],Form[models.Size],models.Size,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, id: Long, catId: Long, filter: String, sId: Long, prod: models.Product, cList: List[models.productsAdditions.Comment], sList: List[models.Size], commentForm: Form[productsAdditions.Comment], sizeForm: Form[models.Size], size: models.Size, temp: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.321*/("""
"""),_display_(/*3.2*/main("productDetails", user,  categories, catId, filter)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
				"""),format.raw/*4.5*/("""<div class="col-sm-12 padding-right">
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
								<img src="/assets/images/productImages/"""),_display_(/*8.49*/(prod.getId)),format.raw/*8.61*/(""".jpg" alt="" />
								
							</div>
							<div id="similar-product" class="carousel slide" data-ride="carousel">
								
								  

								  <!-- Controls -->
								  <a class="left item-control" href="#similar-product" data-slide="prev">
									<i class="fa fa-angle-left"></i>
								  </a>
								  <a class="right item-control" href="#similar-product" data-slide="next">
									<i class="fa fa-angle-right"></i>
								  </a>
							</div>
							

						</div>
						<div class="col-sm-7">
							<div class="product-information"><!--/product-information-->
								
								<h2>"""),_display_(/*29.14*/prod/*29.18*/.getName),format.raw/*29.26*/("""</h2>
								
								
								<span>
									<span>€"""),_display_(/*33.18*/prod/*33.22*/.getPrice),format.raw/*33.31*/("""</span>
									
									<button type="button" class="btn btn-fefault cart">
										<a href=""""),_display_(/*36.21*/routes/*36.27*/.ShoppingCtrl.addToBasket(id, catId, filter, sId)),format.raw/*36.76*/("""" ><i class="fa fa-shopping-cart"></i>Add to cart</a>
									</button>
								</span>
								

						<div class="form-group col-sm-8">
							<label for="usr">Size:</label>
							<select class="form-control" id="sel1">
		
		"""),_display_(/*45.4*/form(action = routes.HomeController.productDetails(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*45.130*/ {_display_(Seq[Any](format.raw/*45.132*/("""
   							"""),_display_(/*46.12*/select(
								sizeForm("myDropdownId"),
								options = options(temp),
								'_label -> "This is my dropdown label",
								'_showConstraints -> false
							)),format.raw/*51.9*/("""
		""")))}),format.raw/*52.4*/("""
 						"""),format.raw/*53.8*/("""</select>
						
			
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
							</div>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->

						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*67.10*/for(c <- cList) yield /*67.25*/ {_display_(Seq[Any](format.raw/*67.27*/("""
									"""),format.raw/*68.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*70.53*/user/*70.57*/.getfName()),format.raw/*70.68*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
									</ul>
									<p> """),_display_(/*74.15*/c/*74.16*/.getContent),format.raw/*74.27*/("""</p>
									</div>
								""")))}),format.raw/*76.10*/("""
								"""),format.raw/*77.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*81.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*81.128*/ {_display_(Seq[Any](format.raw/*81.130*/("""
									"""),_display_(/*82.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*82.108*/("""
										"""),format.raw/*83.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*84.11*/("""


							"""),format.raw/*87.8*/("""</div>
						</div>
					
					
				</div>
""")))}),format.raw/*92.2*/("""
"""))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,id:Long,catId:Long,filter:String,sId:Long,prod:models.Product,cList:List[models.productsAdditions.Comment],sList:List[models.Size],commentForm:Form[productsAdditions.Comment],sizeForm:Form[models.Size],size:models.Size,temp:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,sizeForm,size,temp)

  def f:((List[models.Category],models.users.User,Long,Long,String,Long,models.Product,List[models.productsAdditions.Comment],List[models.Size],Form[productsAdditions.Comment],Form[models.Size],models.Size,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,sizeForm,size,temp) => apply(categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,sizeForm,size,temp)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 13:27:40 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/productDetails.scala.html
                  HASH: 95fced12ccd20059c1e008ada9d6b1d9dd685fbc
                  MATRIX: 1019->18|1434->337|1461->339|1525->395|1564->397|1595->402|1827->608|1859->620|2487->1221|2500->1225|2529->1233|2612->1289|2625->1293|2655->1302|2781->1401|2796->1407|2866->1456|3122->1686|3258->1812|3299->1814|3338->1826|3524->1992|3558->1996|3593->2004|3968->2352|3999->2367|4039->2369|4077->2379|4204->2479|4217->2483|4249->2494|4465->2683|4475->2684|4507->2695|4568->2725|4604->2734|4676->2779|4803->2896|4844->2898|4882->2909|5001->3006|5040->3017|5158->3104|5195->3114|5269->3158
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|62->29|62->29|62->29|66->33|66->33|66->33|69->36|69->36|69->36|78->45|78->45|78->45|79->46|84->51|85->52|86->53|100->67|100->67|100->67|101->68|103->70|103->70|103->70|107->74|107->74|107->74|109->76|110->77|114->81|114->81|114->81|115->82|115->82|116->83|117->84|120->87|125->92
                  -- GENERATED --
              */
          