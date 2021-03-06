/*
    Copyright (C) 2018-2019 Init Studios. All rights reserved.

    This document is the property of Init Studios.
    It is considered confidential and proprietary.

    This document may not be reproduced or transmitted in any form,
    in whole or in part, without the express written permission of
    Init Studios.
 */

package com.initstudios.initiative.util;

import com.initstudios.initiative.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class InitiativeConfig
{
   private static final String CATEGORY_GENERAL = "general";
   private static final String CATEGORY_DIMENSIONS = "dimensions";


   public static void readCfg()
   {
      Configuration cfg = CommonProxy.config;
      try {
         cfg.load();
         initGeneralConfig(cfg);
         initDimensionConfig(cfg);
      } catch (Exception e) {
         LoggingUtil.initiativeLogger.log(Level.ERROR, "Problem loading Initiative Mod config file! D:", e);
      } finally {
         if (cfg.hasChanged()) {
            cfg.save();
         }
      }
   }

   private static void initGeneralConfig(Configuration config)
   {
      config.addCustomCategoryComment(CATEGORY_GENERAL, "Initiative Mod - General Configuration");
   }

   private static void initDimensionConfig(Configuration config)
   {
      config.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Initiative Mod - Dimension Configuration");
   }
}
