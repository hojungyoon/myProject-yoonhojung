package com.mypr.pms.handler;

import java.util.List;
import com.mypr.pms.domain.BodyBuilding;
import com.mypr.pms.domain.BodyCheck;
import com.mypr.pms.domain.Calisthenics;
import com.mypr.pms.domain.Cardio;

public abstract class AbstractMenuHandler implements MenuCommand {

  protected List<Calisthenics> calisList;
  protected List<BodyBuilding> bodyBuildingList;
  protected List<Cardio> cardioList;
  protected List<BodyCheck> bodyCheckList;

  public AbstractMenuHandler
  (List<Calisthenics> calisList, List<BodyBuilding> bodyBuildingList,
      List<Cardio> cardioList, List<BodyCheck> bodyCheckList)
  {
    this.calisList = calisList;
    this.bodyBuildingList = bodyBuildingList;
    this.cardioList = cardioList;
    this.bodyCheckList = bodyCheckList;
  }

}
