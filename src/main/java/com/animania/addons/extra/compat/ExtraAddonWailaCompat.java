package com.animania.addons.extra.compat;

import com.animania.addons.extra.common.block.BlockHamsterWheel;
import com.animania.addons.extra.common.entity.peafowl.EntityPeachickBase;
import com.animania.addons.extra.common.entity.peafowl.EntityPeacockBase;
import com.animania.addons.extra.common.entity.peafowl.EntityPeafowlBase;
import com.animania.addons.extra.common.entity.rodents.EntityFerretBase;
import com.animania.addons.extra.common.entity.rodents.EntityHamster;
import com.animania.addons.extra.common.entity.rodents.EntityHedgehogBase;
import com.animania.addons.extra.common.entity.rodents.rabbits.EntityRabbitBuckBase;
import com.animania.addons.extra.common.entity.rodents.rabbits.EntityRabbitDoeBase;
import com.animania.addons.extra.common.entity.rodents.rabbits.EntityRabbitKitBase;
import com.animania.addons.extra.compat.waila.WailaBlockHamsterWheelProvider;
import com.animania.addons.extra.compat.waila.WailaEntityPeafowlProvider;
import com.animania.addons.extra.compat.waila.WailaEntityRabbitDoeProvider;
import com.animania.addons.extra.compat.waila.WailaEntityRodentProvider;
import com.animania.compat.waila.provider.WailaEntityAnimalProviderBase;
import com.animania.compat.waila.provider.WailaEntityAnimalProviderChild;
import com.animania.compat.waila.provider.WailaEntityAnimalProviderMateable;

import mcp.mobius.waila.api.IWailaRegistrar;

public class ExtraAddonWailaCompat
{
	public static void registerWaila(IWailaRegistrar r)
	{
		r.registerBodyProvider(new WailaBlockHamsterWheelProvider(), BlockHamsterWheel.class);
		r.registerNBTProvider(new WailaBlockHamsterWheelProvider(), BlockHamsterWheel.class);

		// PEACOCKS
		regEntityInfoBase(r, EntityPeacockBase.class);
		regEntityInfoPeafowl(r, EntityPeafowlBase.class);
		regEntityInfoBase(r, EntityPeachickBase.class);

		// RODENTS
		regEntityInfoRodent(r, EntityFerretBase.class);
		regEntityInfoRodent(r, EntityHamster.class);
		regEntityInfoRodent(r, EntityHedgehogBase.class);

		// RABBITS
		regEntityInfoRabbitBuck(r, EntityRabbitBuckBase.class);
		regEntityInfoRabbitDoe(r, EntityRabbitDoeBase.class);
		regEntityInfoRabbitKit(r, EntityRabbitKitBase.class);
	}

	private static void regEntityInfoBase(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityAnimalProviderBase(), clazz);
		r.registerNBTProvider(new WailaEntityAnimalProviderBase(), clazz);
	}

	private static void regEntityInfoPeafowl(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityPeafowlProvider(), clazz);
		r.registerNBTProvider(new WailaEntityPeafowlProvider(), clazz);
	}

	private static void regEntityInfoRodent(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityRodentProvider(), clazz);
		r.registerNBTProvider(new WailaEntityRodentProvider(), clazz);
	}

	private static void regEntityInfoRabbitBuck(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityAnimalProviderMateable(), clazz);
		r.registerNBTProvider(new WailaEntityAnimalProviderMateable(), clazz);
	}

	private static void regEntityInfoRabbitDoe(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityRabbitDoeProvider(), clazz);
		r.registerNBTProvider(new WailaEntityRabbitDoeProvider(), clazz);
	}

	private static void regEntityInfoRabbitKit(IWailaRegistrar r, Class clazz)
	{
		r.registerBodyProvider(new WailaEntityAnimalProviderChild(), clazz);
		r.registerNBTProvider(new WailaEntityAnimalProviderChild(), clazz);
	}

}
