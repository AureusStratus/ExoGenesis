package Exogenesis.content;

import Exogenesis.content.ExoUnitTypes;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.Seq;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static arc.Core.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
public class ExoBlocks{
 public static Block
         genesisFactory;
public static void load(){

 genesisFactory = new UnitFactory("genesis-factory"){{
  requirements(Category.units, with(Items.copper, 50, Items.lead, 120, Items.silicon, 80));
  plans = Seq.with(
          new UnitPlan(ExoUnitTypes.lux, 60f * 15, with(Items.silicon, 10, Items.lead, 10)),
          new UnitPlan(ExoUnitTypes.orion, 60f * 15, with(Items.silicon, 10, Items.lead, 10))
  );
  size = 3;
  consumePower(1.2f);
 }};
}
}