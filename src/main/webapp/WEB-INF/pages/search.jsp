<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                <div class="col-md-6 formstyle">
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <div class="col-sm-6">
                                <p>Країна:</p>
                                <select class="form-control" id="Countryselector">
                                    <option>Єгипет</option>
                                    <option>Греція</option>
                                    <option>Туреччина</option>
                                </select>
                                </div>
                                <div class="col-sm-6">
                                <p>Регіон:</p>
                                <select class="form-control" id="Regionselector">
                                    <option>Дахаб</option>
                                    <option>Макаді Бей</option>
                                    <option>Марса Алам</option>
                                </select>
                                </div>
                                <div class="col-sm-6">
                                <p>Готель:</p>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">
                                            2*&nbsp  
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            3*&nbsp
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            4*&nbsp
                                    </label> 
                                    <label>
                                        <input type="checkbox" value="">
                                            5*&nbsp
                                    </label>
                                </div>
                                </div>
                                <div class="col-sm-6">
                                    <p>Харчування:</p>
                                    
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">
                                            HB&nbsp  
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            BB&nbsp
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            FB&nbsp
                                    </label>
                                    <br>
                                    <label>
                                        <input type="checkbox" value="">
                                            AI&nbsp
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            UAI&nbsp
                                    </label>
                                    <label>
                                        <input type="checkbox" value="">
                                            RO &nbsp
                                    </label>
                                </div>
                                </div>
                                <br>
                                <p>Розміщення в номері:</p>
                                <div class="col-sm-6">
                                    <p>Дорослі:</p>
                                    <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    </select>
                                </div>
                                <div class="col-sm-6">
                                    <p>Діти:</p>
                                    <select class="form-control">
                                    <option>0</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    </select>
                                </div>
                                <br>
                                <p>Дата вильоту:</p>
                                <div class="col-sm-6">
                                    <p>З:</p>
                                    <input type="text" class="form-control" >
                                </div>
                                <div class="col-sm-6">
                                    <p>По:</p>
                                    <input type="text" class="form-control" >
                                </div>
                                <div class="col-sm-6">
                                    <p>Кількість ночей:</p>
                                    <div class="col-sm-6">
                                    <p>Від:</p>
                                    <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>11</option>
                                    <option>12</option>
                                    <option>13</option>
                                    <option>14</option>
                                    <option>15</option>
                                    <option>16</option>
                                    <option>17</option>
                                    <option>18</option>
                                    <option>19</option>
                                    <option>20</option>
                                    <option>21</option>
                                    </select>
                                    </div>
                                
                                    <div class="col-sm-6">
                                    <p>До:</p>
                                    <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>11</option>
                                    <option>12</option>
                                    <option>13</option>
                                    <option>14</option>
                                    <option>15</option>
                                    <option>16</option>
                                    <option>17</option>
                                    <option>18</option>
                                    <option>19</option>
                                    <option>20</option>
                                    <option>21</option>
                                    </select>
                                    </div>
                                </div>
                                <p>Ціна(грн):</p>
                                <div class="col-sm-6" style="margin-bottom: 5px;">
                                    <div class="col-sm-6">
                                        <p>З:</p>
                                        <input type="text" class="form-control" >
                                    </div>
                                    <div class="col-sm-6">
                                        <p>До:</p>
                                        <input type="text" class="form-control" >
                                    </div>
                            </div>
                            
                            <button type="submit" class="btn btn-primary btn-lg">Пошук</button>
                        </form>
                </div>
        </div>
            <div class="col-sm-6" style="overflow: hiddden;">
                    <div id="carousel-example-generic" class="carousel slide mycarousel" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="img/egypt_carousel.jpg">
      <div class="carousel-caption" >
      </div>
      <p style="font-size:18px;">Єгипет славиться багатьма фестивалями і релігійними карнавалами, відомий також як мавлід (Mawlid). Як правило, вони пов'язані з конкретними коптськими чи суфійськими святими, але часто їх святкують всі єгиптяни, незалежно від віросповідання чи релігії.</p>
    </div>
    <div class="item">
      <img src="img/greece_carousel.jpg">
      <div class="carousel-caption">
      </div>
      <p style="font-size:18px;">Серед найбільш відомих та популярних туристичних центрів Греції: історико-культурних — Афіни, Дельфи, острів Корфу, Крит; центри пляжного відпочинку — півострів Халкідіки, острови-курорти Міконос, Санторіні, Парос і Крит; центри паломництва християн — Свята гора Афон, Метеорські монастирі, візантійські пам'ятки Салонік (Базиліка Святого Дімітрія, Базиліка Святої Софії та інші), занесені до переліку об'єктів світової спадщини ЮНЕСКО.</p>
    </div>
    <div class="item">
      <img src="img/turkey_carousel.jpg">
      <div class="carousel-caption">
      </div>
      <p style="font-size:18px;">Найпопулярніші курорти в Туреччині — Сіде, Белек, Мармарис, Анталія, Кемер, Аланія, Бодрум, Фетхіє.</p>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div><!--каруселька-->
</div><!--правий блок контенту>
    </div><!--блок "контент"-->

    
 
    
