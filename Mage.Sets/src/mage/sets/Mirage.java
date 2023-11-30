package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author North
 */
public final class Mirage extends ExpansionSet {

    private static final Mirage instance = new Mirage();

    public static Mirage getInstance() {
        return instance;
    }

    private Mirage() {
        super("Mirage", "MIR", ExpansionSet.buildDate(1996, 8, 21), SetType.EXPANSION);
        this.blockName = "Mirage";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Abyssal Hunter", 103, Rarity.RARE, mage.cards.a.AbyssalHunter.class));
        cards.add(new SetCardInfo("Afiya Grove", 205, Rarity.RARE, mage.cards.a.AfiyaGrove.class));
        cards.add(new SetCardInfo("Afterlife", 1, Rarity.UNCOMMON, mage.cards.a.Afterlife.class));
        cards.add(new SetCardInfo("Agility", 154, Rarity.COMMON, mage.cards.a.Agility.class));
        cards.add(new SetCardInfo("Alarum", 2, Rarity.COMMON, mage.cards.a.Alarum.class));
        cards.add(new SetCardInfo("Aleatory", 155, Rarity.UNCOMMON, mage.cards.a.Aleatory.class));
        cards.add(new SetCardInfo("Amber Prison", 292, Rarity.RARE, mage.cards.a.AmberPrison.class));
        cards.add(new SetCardInfo("Amulet of Unmaking", 293, Rarity.RARE, mage.cards.a.AmuletOfUnmaking.class));
        cards.add(new SetCardInfo("Ancestral Memories", 52, Rarity.RARE, mage.cards.a.AncestralMemories.class));
        cards.add(new SetCardInfo("Armor of Thorns", 206, Rarity.COMMON, mage.cards.a.ArmorOfThorns.class));
        cards.add(new SetCardInfo("Armorer Guildmage", 156, Rarity.COMMON, mage.cards.a.ArmorerGuildmage.class));
        cards.add(new SetCardInfo("Ashen Powder", 104, Rarity.RARE, mage.cards.a.AshenPowder.class));
        cards.add(new SetCardInfo("Asmira, Holy Avenger", 256, Rarity.RARE, mage.cards.a.AsmiraHolyAvenger.class));
        cards.add(new SetCardInfo("Auspicious Ancestor", 3, Rarity.RARE, mage.cards.a.AuspiciousAncestor.class));
        cards.add(new SetCardInfo("Azimaet Drake", 53, Rarity.COMMON, mage.cards.a.AzimaetDrake.class));
        cards.add(new SetCardInfo("Bad River", 324, Rarity.UNCOMMON, mage.cards.b.BadRiver.class));
        cards.add(new SetCardInfo("Barbed Foliage", 207, Rarity.UNCOMMON, mage.cards.b.BarbedFoliage.class));
        cards.add(new SetCardInfo("Barbed-Back Wurm", 105, Rarity.UNCOMMON, mage.cards.b.BarbedBackWurm.class));
        cards.add(new SetCardInfo("Basalt Golem", 294, Rarity.UNCOMMON, mage.cards.b.BasaltGolem.class));
        cards.add(new SetCardInfo("Bay Falcon", 54, Rarity.COMMON, mage.cards.b.BayFalcon.class));
        cards.add(new SetCardInfo("Bazaar of Wonders", 55, Rarity.RARE, mage.cards.b.BazaarOfWonders.class));
        cards.add(new SetCardInfo("Benevolent Unicorn", 4, Rarity.COMMON, mage.cards.b.BenevolentUnicorn.class));
        cards.add(new SetCardInfo("Benthic Djinn", 257, Rarity.RARE, mage.cards.b.BenthicDjinn.class));
        cards.add(new SetCardInfo("Binding Agony", 106, Rarity.COMMON, mage.cards.b.BindingAgony.class));
        cards.add(new SetCardInfo("Blighted Shaman", 107, Rarity.UNCOMMON, mage.cards.b.BlightedShaman.class));
        cards.add(new SetCardInfo("Blind Fury", 158, Rarity.UNCOMMON, mage.cards.b.BlindFury.class));
        cards.add(new SetCardInfo("Blinding Light", 5, Rarity.UNCOMMON, mage.cards.b.BlindingLight.class));
        cards.add(new SetCardInfo("Blistering Barrier", 159, Rarity.COMMON, mage.cards.b.BlisteringBarrier.class));
        cards.add(new SetCardInfo("Bone Harvest", 108, Rarity.COMMON, mage.cards.b.BoneHarvest.class));
        cards.add(new SetCardInfo("Bone Mask", 295, Rarity.RARE, mage.cards.b.BoneMask.class));
        cards.add(new SetCardInfo("Boomerang", 56, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Breathstealer", 109, Rarity.COMMON, mage.cards.b.Breathstealer.class));
        cards.add(new SetCardInfo("Brushwagg", 208, Rarity.RARE, mage.cards.b.Brushwagg.class));
        cards.add(new SetCardInfo("Builder's Bane", 160, Rarity.COMMON, mage.cards.b.BuildersBane.class));
        cards.add(new SetCardInfo("Burning Palm Efreet", 161, Rarity.UNCOMMON, mage.cards.b.BurningPalmEfreet.class));
        cards.add(new SetCardInfo("Burning Shield Askari", 162, Rarity.COMMON, mage.cards.b.BurningShieldAskari.class));
        cards.add(new SetCardInfo("Cadaverous Bloom", 258, Rarity.RARE, mage.cards.c.CadaverousBloom.class));
        cards.add(new SetCardInfo("Cadaverous Knight", 110, Rarity.COMMON, mage.cards.c.CadaverousKnight.class));
        cards.add(new SetCardInfo("Canopy Dragon", 209, Rarity.RARE, mage.cards.c.CanopyDragon.class));
        cards.add(new SetCardInfo("Carrion", 111, Rarity.RARE, mage.cards.c.Carrion.class));
        cards.add(new SetCardInfo("Catacomb Dragon", 112, Rarity.RARE, mage.cards.c.CatacombDragon.class));
        cards.add(new SetCardInfo("Celestial Dawn", 6, Rarity.RARE, mage.cards.c.CelestialDawn.class));
        cards.add(new SetCardInfo("Cerulean Wyvern", 57, Rarity.UNCOMMON, mage.cards.c.CeruleanWyvern.class));
        cards.add(new SetCardInfo("Chaos Charm", 163, Rarity.COMMON, mage.cards.c.ChaosCharm.class));
        cards.add(new SetCardInfo("Chaosphere", 164, Rarity.RARE, mage.cards.c.Chaosphere.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 296, Rarity.UNCOMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Chariot of the Sun", 297, Rarity.UNCOMMON, mage.cards.c.ChariotOfTheSun.class));
        cards.add(new SetCardInfo("Choking Sands", 113, Rarity.COMMON, mage.cards.c.ChokingSands.class));
        cards.add(new SetCardInfo("Cinder Cloud", 165, Rarity.UNCOMMON, mage.cards.c.CinderCloud.class));
        cards.add(new SetCardInfo("Civic Guildmage", 7, Rarity.COMMON, mage.cards.c.CivicGuildmage.class));
        cards.add(new SetCardInfo("Cloak of Invisibility", 58, Rarity.COMMON, mage.cards.c.CloakOfInvisibility.class));
        cards.add(new SetCardInfo("Consuming Ferocity", 166, Rarity.UNCOMMON, mage.cards.c.ConsumingFerocity.class));
        cards.add(new SetCardInfo("Coral Fighters", 59, Rarity.UNCOMMON, mage.cards.c.CoralFighters.class));
        cards.add(new SetCardInfo("Crash of Rhinos", 210, Rarity.COMMON, mage.cards.c.CrashOfRhinos.class));
        cards.add(new SetCardInfo("Crimson Hellkite", 167, Rarity.RARE, mage.cards.c.CrimsonHellkite.class));
        cards.add(new SetCardInfo("Crimson Roc", 168, Rarity.UNCOMMON, mage.cards.c.CrimsonRoc.class));
        cards.add(new SetCardInfo("Crypt Cobra", 114, Rarity.UNCOMMON, mage.cards.c.CryptCobra.class));
        cards.add(new SetCardInfo("Crystal Golem", 298, Rarity.UNCOMMON, mage.cards.c.CrystalGolem.class));
        cards.add(new SetCardInfo("Crystal Vein", 325, Rarity.UNCOMMON, mage.cards.c.CrystalVein.class));
        cards.add(new SetCardInfo("Cursed Totem", 299, Rarity.RARE, mage.cards.c.CursedTotem.class));
        cards.add(new SetCardInfo("Daring Apprentice", 60, Rarity.RARE, mage.cards.d.DaringApprentice.class));
        cards.add(new SetCardInfo("Dark Banishing", 115, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Dark Ritual", 116, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Dazzling Beauty", 8, Rarity.COMMON, mage.cards.d.DazzlingBeauty.class));
        cards.add(new SetCardInfo("Decomposition", 212, Rarity.UNCOMMON, mage.cards.d.Decomposition.class));
        cards.add(new SetCardInfo("Delirium", 260, Rarity.UNCOMMON, mage.cards.d.Delirium.class));
        cards.add(new SetCardInfo("Dirtwater Wraith", 117, Rarity.COMMON, mage.cards.d.DirtwaterWraith.class));
        cards.add(new SetCardInfo("Disempower", 9, Rarity.COMMON, mage.cards.d.Disempower.class));
        cards.add(new SetCardInfo("Disenchant", 10, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dissipate", 61, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Divine Offering", 11, Rarity.COMMON, mage.cards.d.DivineOffering.class));
        cards.add(new SetCardInfo("Divine Retribution", 12, Rarity.RARE, mage.cards.d.DivineRetribution.class));
        cards.add(new SetCardInfo("Drain Life", 118, Rarity.COMMON, mage.cards.d.DrainLife.class));
        cards.add(new SetCardInfo("Dread Specter", 119, Rarity.UNCOMMON, mage.cards.d.DreadSpecter.class));
        cards.add(new SetCardInfo("Dream Cache", 62, Rarity.COMMON, mage.cards.d.DreamCache.class));
        cards.add(new SetCardInfo("Dream Fighter", 63, Rarity.COMMON, mage.cards.d.DreamFighter.class));
        cards.add(new SetCardInfo("Dwarven Miner", 169, Rarity.UNCOMMON, mage.cards.d.DwarvenMiner.class));
        cards.add(new SetCardInfo("Dwarven Nomad", 170, Rarity.COMMON, mage.cards.d.DwarvenNomad.class));
        cards.add(new SetCardInfo("Early Harvest", 213, Rarity.RARE, mage.cards.e.EarlyHarvest.class));
        cards.add(new SetCardInfo("Ebony Charm", 120, Rarity.COMMON, mage.cards.e.EbonyCharm.class));
        cards.add(new SetCardInfo("Ekundu Griffin", 13, Rarity.COMMON, mage.cards.e.EkunduGriffin.class));
        cards.add(new SetCardInfo("Elixir of Vitality", 300, Rarity.UNCOMMON, mage.cards.e.ElixirOfVitality.class));
        cards.add(new SetCardInfo("Emberwilde Caliph", 262, Rarity.RARE, mage.cards.e.EmberwildeCaliph.class));
        cards.add(new SetCardInfo("Emberwilde Djinn", 172, Rarity.RARE, mage.cards.e.EmberwildeDjinn.class));
        cards.add(new SetCardInfo("Energy Bolt", 263, Rarity.RARE, mage.cards.e.EnergyBolt.class));
        cards.add(new SetCardInfo("Energy Vortex", 64, Rarity.RARE, mage.cards.e.EnergyVortex.class));
        cards.add(new SetCardInfo("Enfeeblement", 121, Rarity.COMMON, mage.cards.e.Enfeeblement.class));
        cards.add(new SetCardInfo("Enlightened Tutor", 14, Rarity.UNCOMMON, mage.cards.e.EnlightenedTutor.class));
        cards.add(new SetCardInfo("Ersatz Gnomes", 301, Rarity.UNCOMMON, mage.cards.e.ErsatzGnomes.class));
        cards.add(new SetCardInfo("Ether Well", 65, Rarity.UNCOMMON, mage.cards.e.EtherWell.class));
        cards.add(new SetCardInfo("Ethereal Champion", 15, Rarity.RARE, mage.cards.e.EtherealChampion.class));
        cards.add(new SetCardInfo("Fallow Earth", 214, Rarity.UNCOMMON, mage.cards.f.FallowEarth.class));
        cards.add(new SetCardInfo("Favorable Destiny", 16, Rarity.UNCOMMON, mage.cards.f.FavorableDestiny.class));
        cards.add(new SetCardInfo("Femeref Archers", 215, Rarity.UNCOMMON, mage.cards.f.FemerefArchers.class));
        cards.add(new SetCardInfo("Femeref Healer", 17, Rarity.COMMON, mage.cards.f.FemerefHealer.class));
        cards.add(new SetCardInfo("Femeref Knight", 18, Rarity.COMMON, mage.cards.f.FemerefKnight.class));
        cards.add(new SetCardInfo("Femeref Scouts", 19, Rarity.COMMON, mage.cards.f.FemerefScouts.class));
        cards.add(new SetCardInfo("Feral Shadow", 122, Rarity.COMMON, mage.cards.f.FeralShadow.class));
        cards.add(new SetCardInfo("Fetid Horror", 123, Rarity.COMMON, mage.cards.f.FetidHorror.class));
        cards.add(new SetCardInfo("Final Fortune", 173, Rarity.RARE, mage.cards.f.FinalFortune.class));
        cards.add(new SetCardInfo("Fire Diamond", 302, Rarity.UNCOMMON, mage.cards.f.FireDiamond.class));
        cards.add(new SetCardInfo("Firebreathing", 174, Rarity.COMMON, mage.cards.f.Firebreathing.class));
        cards.add(new SetCardInfo("Flame Elemental", 175, Rarity.UNCOMMON, mage.cards.f.FlameElemental.class));
        cards.add(new SetCardInfo("Flare", 176, Rarity.COMMON, mage.cards.f.Flare.class));
        cards.add(new SetCardInfo("Flash", 66, Rarity.RARE, mage.cards.f.Flash.class));
        cards.add(new SetCardInfo("Flood Plain", 326, Rarity.UNCOMMON, mage.cards.f.FloodPlain.class));
        cards.add(new SetCardInfo("Floodgate", 67, Rarity.UNCOMMON, mage.cards.f.Floodgate.class));
        cards.add(new SetCardInfo("Fog", 216, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Foratog", 217, Rarity.UNCOMMON, mage.cards.f.Foratog.class));
        cards.add(new SetCardInfo("Forbidden Crypt", 124, Rarity.RARE, mage.cards.f.ForbiddenCrypt.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forsaken Wastes", 125, Rarity.RARE, mage.cards.f.ForsakenWastes.class));
        cards.add(new SetCardInfo("Frenetic Efreet", 264, Rarity.RARE, mage.cards.f.FreneticEfreet.class));
        cards.add(new SetCardInfo("Giant Mantis", 218, Rarity.COMMON, mage.cards.g.GiantMantis.class));
        cards.add(new SetCardInfo("Gibbering Hyenas", 219, Rarity.COMMON, mage.cards.g.GibberingHyenas.class));
        cards.add(new SetCardInfo("Goblin Elite Infantry", 177, Rarity.COMMON, mage.cards.g.GoblinEliteInfantry.class));
        cards.add(new SetCardInfo("Goblin Scouts", 178, Rarity.UNCOMMON, mage.cards.g.GoblinScouts.class));
        cards.add(new SetCardInfo("Goblin Soothsayer", 179, Rarity.UNCOMMON, mage.cards.g.GoblinSoothsayer.class));
        cards.add(new SetCardInfo("Goblin Tinkerer", 180, Rarity.COMMON, mage.cards.g.GoblinTinkerer.class));
        cards.add(new SetCardInfo("Granger Guildmage", 220, Rarity.COMMON, mage.cards.g.GrangerGuildmage.class));
        cards.add(new SetCardInfo("Grasslands", 327, Rarity.UNCOMMON, mage.cards.g.Grasslands.class));
        cards.add(new SetCardInfo("Grave Servitude", 126, Rarity.COMMON, mage.cards.g.GraveServitude.class));
        cards.add(new SetCardInfo("Gravebane Zombie", 127, Rarity.COMMON, mage.cards.g.GravebaneZombie.class));
        cards.add(new SetCardInfo("Grim Feast", 265, Rarity.RARE, mage.cards.g.GrimFeast.class));
        cards.add(new SetCardInfo("Grinning Totem", 303, Rarity.RARE, mage.cards.g.GrinningTotem.class));
        cards.add(new SetCardInfo("Hakim, Loreweaver", 68, Rarity.RARE, mage.cards.h.HakimLoreweaver.class));
        cards.add(new SetCardInfo("Hall of Gemstone", 221, Rarity.RARE, mage.cards.h.HallOfGemstone.class));
        cards.add(new SetCardInfo("Hammer of Bogardan", 181, Rarity.RARE, mage.cards.h.HammerOfBogardan.class));
        cards.add(new SetCardInfo("Harbinger of Night", 128, Rarity.RARE, mage.cards.h.HarbingerOfNight.class));
        cards.add(new SetCardInfo("Harbor Guardian", 266, Rarity.UNCOMMON, mage.cards.h.HarborGuardian.class));
        cards.add(new SetCardInfo("Harmattan Efreet", 69, Rarity.UNCOMMON, mage.cards.h.HarmattanEfreet.class));
        cards.add(new SetCardInfo("Hazerider Drake", 268, Rarity.UNCOMMON, mage.cards.h.HazeriderDrake.class));
        cards.add(new SetCardInfo("Healing Salve", 20, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Hivis of the Scale", 182, Rarity.RARE, mage.cards.h.HivisOfTheScale.class));
        cards.add(new SetCardInfo("Horrible Hordes", 304, Rarity.UNCOMMON, mage.cards.h.HorribleHordes.class));
        cards.add(new SetCardInfo("Igneous Golem", 305, Rarity.UNCOMMON, mage.cards.i.IgneousGolem.class));
        cards.add(new SetCardInfo("Illicit Auction", 183, Rarity.RARE, mage.cards.i.IllicitAuction.class));
        cards.add(new SetCardInfo("Illumination", 21, Rarity.UNCOMMON, mage.cards.i.Illumination.class));
        cards.add(new SetCardInfo("Incinerate", 184, Rarity.COMMON, mage.cards.i.Incinerate.class));
        cards.add(new SetCardInfo("Infernal Contract", 129, Rarity.RARE, mage.cards.i.InfernalContract.class));
        cards.add(new SetCardInfo("Iron Tusk Elephant", 22, Rarity.UNCOMMON, mage.cards.i.IronTuskElephant.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivory Charm", 23, Rarity.COMMON, mage.cards.i.IvoryCharm.class));
        cards.add(new SetCardInfo("Jolrael's Centaur", 222, Rarity.COMMON, mage.cards.j.JolraelsCentaur.class));
        cards.add(new SetCardInfo("Jolt", 70, Rarity.COMMON, mage.cards.j.Jolt.class));
        cards.add(new SetCardInfo("Jungle Patrol", 223, Rarity.RARE, mage.cards.j.JunglePatrol.class));
        cards.add(new SetCardInfo("Jungle Troll", 269, Rarity.UNCOMMON, mage.cards.j.JungleTroll.class));
        cards.add(new SetCardInfo("Jungle Wurm", 224, Rarity.COMMON, mage.cards.j.JungleWurm.class));
        cards.add(new SetCardInfo("Kaervek's Hex", 130, Rarity.UNCOMMON, mage.cards.k.KaerveksHex.class));
        cards.add(new SetCardInfo("Kaervek's Purge", 270, Rarity.UNCOMMON, mage.cards.k.KaerveksPurge.class));
        cards.add(new SetCardInfo("Kaervek's Torch", 185, Rarity.COMMON, mage.cards.k.KaerveksTorch.class));
        cards.add(new SetCardInfo("Karoo Meerkat", 225, Rarity.UNCOMMON, mage.cards.k.KarooMeerkat.class));
        cards.add(new SetCardInfo("Kukemssa Pirates", 71, Rarity.RARE, mage.cards.k.KukemssaPirates.class));
        cards.add(new SetCardInfo("Kukemssa Serpent", 72, Rarity.COMMON, mage.cards.k.KukemssaSerpent.class));
        cards.add(new SetCardInfo("Lead Golem", 306, Rarity.UNCOMMON, mage.cards.l.LeadGolem.class));
        cards.add(new SetCardInfo("Leering Gargoyle", 271, Rarity.RARE, mage.cards.l.LeeringGargoyle.class));
        cards.add(new SetCardInfo("Lightning Reflexes", 186, Rarity.COMMON, mage.cards.l.LightningReflexes.class));
        cards.add(new SetCardInfo("Lion's Eye Diamond", 307, Rarity.RARE, mage.cards.l.LionsEyeDiamond.class));
        cards.add(new SetCardInfo("Locust Swarm", 226, Rarity.UNCOMMON, mage.cards.l.LocustSwarm.class));
        cards.add(new SetCardInfo("Lure of Prey", 227, Rarity.RARE, mage.cards.l.LureOfPrey.class));
        cards.add(new SetCardInfo("Malignant Growth", 272, Rarity.RARE, mage.cards.m.MalignantGrowth.class));
        cards.add(new SetCardInfo("Mana Prism", 308, Rarity.UNCOMMON, mage.cards.m.ManaPrism.class));
        cards.add(new SetCardInfo("Mangara's Tome", 309, Rarity.RARE, mage.cards.m.MangarasTome.class));
        cards.add(new SetCardInfo("Marble Diamond", 310, Rarity.UNCOMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Maro", 228, Rarity.RARE, mage.cards.m.Maro.class));
        cards.add(new SetCardInfo("Meddle", 73, Rarity.UNCOMMON, mage.cards.m.Meddle.class));
        cards.add(new SetCardInfo("Melesse Spirit", 27, Rarity.UNCOMMON, mage.cards.m.MelesseSpirit.class));
        cards.add(new SetCardInfo("Memory Lapse", 74, Rarity.COMMON, mage.cards.m.MemoryLapse.class));
        cards.add(new SetCardInfo("Merfolk Raiders", 75, Rarity.COMMON, mage.cards.m.MerfolkRaiders.class));
        cards.add(new SetCardInfo("Merfolk Seer", 76, Rarity.COMMON, mage.cards.m.MerfolkSeer.class));
        cards.add(new SetCardInfo("Mind Harness", 78, Rarity.UNCOMMON, mage.cards.m.MindHarness.class));
        cards.add(new SetCardInfo("Mire Shade", 131, Rarity.UNCOMMON, mage.cards.m.MireShade.class));
        cards.add(new SetCardInfo("Misers' Cage", 311, Rarity.RARE, mage.cards.m.MisersCage.class));
        cards.add(new SetCardInfo("Mist Dragon", 79, Rarity.RARE, mage.cards.m.MistDragon.class));
        cards.add(new SetCardInfo("Moss Diamond", 312, Rarity.UNCOMMON, mage.cards.m.MossDiamond.class));
        cards.add(new SetCardInfo("Mountain Valley", 328, Rarity.UNCOMMON, mage.cards.m.MountainValley.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mtenda Griffin", 28, Rarity.UNCOMMON, mage.cards.m.MtendaGriffin.class));
        cards.add(new SetCardInfo("Mtenda Herder", 29, Rarity.COMMON, mage.cards.m.MtendaHerder.class));
        cards.add(new SetCardInfo("Mtenda Lion", 230, Rarity.COMMON, mage.cards.m.MtendaLion.class));
        cards.add(new SetCardInfo("Mystical Tutor", 80, Rarity.UNCOMMON, mage.cards.m.MysticalTutor.class));
        cards.add(new SetCardInfo("Natural Balance", 231, Rarity.RARE, mage.cards.n.NaturalBalance.class));
        cards.add(new SetCardInfo("Nettletooth Djinn", 232, Rarity.UNCOMMON, mage.cards.n.NettletoothDjinn.class));
        cards.add(new SetCardInfo("Noble Elephant", 30, Rarity.COMMON, mage.cards.n.NobleElephant.class));
        cards.add(new SetCardInfo("Nocturnal Raid", 132, Rarity.UNCOMMON, mage.cards.n.NocturnalRaid.class));
        cards.add(new SetCardInfo("Null Chamber", 31, Rarity.RARE, mage.cards.n.NullChamber.class));
        cards.add(new SetCardInfo("Pacifism", 32, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Painful Memories", 133, Rarity.UNCOMMON, mage.cards.p.PainfulMemories.class));
        cards.add(new SetCardInfo("Patagia Golem", 313, Rarity.UNCOMMON, mage.cards.p.PatagiaGolem.class));
        cards.add(new SetCardInfo("Paupers' Cage", 314, Rarity.RARE, mage.cards.p.PaupersCage.class));
        cards.add(new SetCardInfo("Pearl Dragon", 33, Rarity.RARE, mage.cards.p.PearlDragon.class));
        cards.add(new SetCardInfo("Phyrexian Dreadnought", 315, Rarity.RARE, mage.cards.p.PhyrexianDreadnought.class));
        cards.add(new SetCardInfo("Phyrexian Purge", 273, Rarity.RARE, mage.cards.p.PhyrexianPurge.class));
        cards.add(new SetCardInfo("Phyrexian Tribute", 134, Rarity.RARE, mage.cards.p.PhyrexianTribute.class));
        cards.add(new SetCardInfo("Phyrexian Vault", 316, Rarity.UNCOMMON, mage.cards.p.PhyrexianVault.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Political Trickery", 81, Rarity.RARE, mage.cards.p.PoliticalTrickery.class));
        cards.add(new SetCardInfo("Polymorph", 82, Rarity.RARE, mage.cards.p.Polymorph.class));
        cards.add(new SetCardInfo("Power Sink", 83, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Preferred Selection", 233, Rarity.RARE, mage.cards.p.PreferredSelection.class));
        cards.add(new SetCardInfo("Prismatic Boon", 274, Rarity.UNCOMMON, mage.cards.p.PrismaticBoon.class));
        cards.add(new SetCardInfo("Prismatic Circle", 34, Rarity.COMMON, mage.cards.p.PrismaticCircle.class));
        cards.add(new SetCardInfo("Prismatic Lace", 84, Rarity.RARE, mage.cards.p.PrismaticLace.class));
        cards.add(new SetCardInfo("Psychic Transfer", 85, Rarity.RARE, mage.cards.p.PsychicTransfer.class));
        cards.add(new SetCardInfo("Purgatory", 275, Rarity.RARE, mage.cards.p.Purgatory.class));
        cards.add(new SetCardInfo("Purraj of Urborg", 135, Rarity.RARE, mage.cards.p.PurrajOfUrborg.class));
        cards.add(new SetCardInfo("Pyric Salamander", 187, Rarity.COMMON, mage.cards.p.PyricSalamander.class));
        cards.add(new SetCardInfo("Quirion Elves", 234, Rarity.COMMON, mage.cards.q.QuirionElves.class));
        cards.add(new SetCardInfo("Radiant Essence", 276, Rarity.UNCOMMON, mage.cards.r.RadiantEssence.class));
        cards.add(new SetCardInfo("Raging Spirit", 188, Rarity.COMMON, mage.cards.r.RagingSpirit.class));
        cards.add(new SetCardInfo("Rampant Growth", 235, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rashida Scalebane", 35, Rarity.RARE, mage.cards.r.RashidaScalebane.class));
        cards.add(new SetCardInfo("Ravenous Vampire", 136, Rarity.UNCOMMON, mage.cards.r.RavenousVampire.class));
        cards.add(new SetCardInfo("Ray of Command", 86, Rarity.COMMON, mage.cards.r.RayOfCommand.class));
        cards.add(new SetCardInfo("Razor Pendulum", 317, Rarity.RARE, mage.cards.r.RazorPendulum.class));
        cards.add(new SetCardInfo("Reality Ripple", "87+", Rarity.COMMON, mage.cards.r.RealityRipple.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reality Ripple", 87, Rarity.COMMON, mage.cards.r.RealityRipple.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reckless Embermage", 189, Rarity.RARE, mage.cards.r.RecklessEmbermage.class));
        cards.add(new SetCardInfo("Regeneration", 236, Rarity.COMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Reign of Chaos", 190, Rarity.UNCOMMON, mage.cards.r.ReignOfChaos.class));
        cards.add(new SetCardInfo("Reign of Terror", 137, Rarity.UNCOMMON, mage.cards.r.ReignOfTerror.class));
        cards.add(new SetCardInfo("Reparations", 278, Rarity.RARE, mage.cards.r.Reparations.class));
        cards.add(new SetCardInfo("Restless Dead", 138, Rarity.COMMON, mage.cards.r.RestlessDead.class));
        cards.add(new SetCardInfo("Ritual of Steel", 36, Rarity.COMMON, mage.cards.r.RitualOfSteel.class));
        cards.add(new SetCardInfo("Rock Basilisk", 279, Rarity.RARE, mage.cards.r.RockBasilisk.class));
        cards.add(new SetCardInfo("Rocky Tar Pit", 329, Rarity.UNCOMMON, mage.cards.r.RockyTarPit.class));
        cards.add(new SetCardInfo("Roots of Life", 237, Rarity.UNCOMMON, mage.cards.r.RootsOfLife.class));
        cards.add(new SetCardInfo("Sabertooth Cobra", 238, Rarity.COMMON, mage.cards.s.SabertoothCobra.class));
        cards.add(new SetCardInfo("Sacred Mesa", 37, Rarity.RARE, mage.cards.s.SacredMesa.class));
        cards.add(new SetCardInfo("Sandbar Crocodile", 88, Rarity.COMMON, mage.cards.s.SandbarCrocodile.class));
        cards.add(new SetCardInfo("Sandstorm", 239, Rarity.COMMON, mage.cards.s.Sandstorm.class));
        cards.add(new SetCardInfo("Sapphire Charm", 89, Rarity.COMMON, mage.cards.s.SapphireCharm.class));
        cards.add(new SetCardInfo("Savage Twister", 280, Rarity.UNCOMMON, mage.cards.s.SavageTwister.class));
        cards.add(new SetCardInfo("Sawback Manticore", 281, Rarity.RARE, mage.cards.s.SawbackManticore.class));
        cards.add(new SetCardInfo("Sea Scryer", 90, Rarity.COMMON, mage.cards.s.SeaScryer.class));
        cards.add(new SetCardInfo("Sealed Fate", 282, Rarity.UNCOMMON, mage.cards.s.SealedFate.class));
        cards.add(new SetCardInfo("Searing Spear Askari", 191, Rarity.COMMON, mage.cards.s.SearingSpearAskari.class));
        cards.add(new SetCardInfo("Seedling Charm", 240, Rarity.COMMON, mage.cards.s.SeedlingCharm.class));
        cards.add(new SetCardInfo("Seeds of Innocence", 241, Rarity.RARE, mage.cards.s.SeedsOfInnocence.class));
        cards.add(new SetCardInfo("Serene Heart", 242, Rarity.COMMON, mage.cards.s.SereneHeart.class));
        cards.add(new SetCardInfo("Sewer Rats", 139, Rarity.COMMON, mage.cards.s.SewerRats.class));
        cards.add(new SetCardInfo("Shadow Guildmage", 140, Rarity.COMMON, mage.cards.s.ShadowGuildmage.class));
        cards.add(new SetCardInfo("Shallow Grave", 141, Rarity.RARE, mage.cards.s.ShallowGrave.class));
        cards.add(new SetCardInfo("Shaper Guildmage", 91, Rarity.COMMON, mage.cards.s.ShaperGuildmage.class));
        cards.add(new SetCardInfo("Shauku's Minion", 283, Rarity.UNCOMMON, mage.cards.s.ShaukusMinion.class));
        cards.add(new SetCardInfo("Shauku, Endbringer", 142, Rarity.RARE, mage.cards.s.ShaukuEndbringer.class));
        cards.add(new SetCardInfo("Shimmer", 92, Rarity.RARE, mage.cards.s.Shimmer.class));
        cards.add(new SetCardInfo("Sidar Jabari", 39, Rarity.RARE, mage.cards.s.SidarJabari.class));
        cards.add(new SetCardInfo("Skulking Ghost", 143, Rarity.COMMON, mage.cards.s.SkulkingGhost.class));
        cards.add(new SetCardInfo("Sky Diamond", 319, Rarity.UNCOMMON, mage.cards.s.SkyDiamond.class));
        cards.add(new SetCardInfo("Soar", 93, Rarity.COMMON, mage.cards.s.Soar.class));
        cards.add(new SetCardInfo("Soul Echo", 40, Rarity.RARE, mage.cards.s.SoulEcho.class));
        cards.add(new SetCardInfo("Soul Rend", 144, Rarity.UNCOMMON, mage.cards.s.SoulRend.class));
        cards.add(new SetCardInfo("Soulshriek", 145, Rarity.COMMON, mage.cards.s.Soulshriek.class));
        cards.add(new SetCardInfo("Spatial Binding", 284, Rarity.UNCOMMON, mage.cards.s.SpatialBinding.class));
        cards.add(new SetCardInfo("Spectral Guardian", 41, Rarity.RARE, mage.cards.s.SpectralGuardian.class));
        cards.add(new SetCardInfo("Spirit of the Night", 146, Rarity.RARE, mage.cards.s.SpiritOfTheNight.class));
        cards.add(new SetCardInfo("Spitting Earth", 193, Rarity.COMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Stalking Tiger", 243, Rarity.COMMON, mage.cards.s.StalkingTiger.class));
        cards.add(new SetCardInfo("Stone Rain", 194, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Stupor", 147, Rarity.UNCOMMON, mage.cards.s.Stupor.class));
        cards.add(new SetCardInfo("Subterranean Spirit", 195, Rarity.RARE, mage.cards.s.SubterraneanSpirit.class));
        cards.add(new SetCardInfo("Sunweb", 42, Rarity.RARE, mage.cards.s.Sunweb.class));
        cards.add(new SetCardInfo("Superior Numbers", 244, Rarity.UNCOMMON, mage.cards.s.SuperiorNumbers.class));
        cards.add(new SetCardInfo("Suq'Ata Firewalker", 94, Rarity.UNCOMMON, mage.cards.s.SuqAtaFirewalker.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Talruum Minotaur", 196, Rarity.COMMON, mage.cards.t.TalruumMinotaur.class));
        cards.add(new SetCardInfo("Taniwha", 95, Rarity.RARE, mage.cards.t.Taniwha.class));
        cards.add(new SetCardInfo("Teeka's Dragon", 320, Rarity.RARE, mage.cards.t.TeekasDragon.class));
        cards.add(new SetCardInfo("Teferi's Curse", 96, Rarity.COMMON, mage.cards.t.TeferisCurse.class));
        cards.add(new SetCardInfo("Teferi's Drake", 97, Rarity.COMMON, mage.cards.t.TeferisDrake.class));
        cards.add(new SetCardInfo("Teferi's Imp", 98, Rarity.RARE, mage.cards.t.TeferisImp.class));
        cards.add(new SetCardInfo("Teferi's Isle", 330, Rarity.RARE, mage.cards.t.TeferisIsle.class));
        cards.add(new SetCardInfo("Telim'Tor", 197, Rarity.RARE, mage.cards.t.TelimTor.class));
        cards.add(new SetCardInfo("Telim'Tor's Darts", 321, Rarity.UNCOMMON, mage.cards.t.TelimTorsDarts.class));
        cards.add(new SetCardInfo("Telim'Tor's Edict", 198, Rarity.RARE, mage.cards.t.TelimTorsEdict.class));
        cards.add(new SetCardInfo("Teremko Griffin", 43, Rarity.COMMON, mage.cards.t.TeremkoGriffin.class));
        cards.add(new SetCardInfo("Thirst", 99, Rarity.COMMON, mage.cards.t.Thirst.class));
        cards.add(new SetCardInfo("Tidal Wave", 100, Rarity.UNCOMMON, mage.cards.t.TidalWave.class));
        cards.add(new SetCardInfo("Tombstone Stairwell", 149, Rarity.RARE, mage.cards.t.TombstoneStairwell.class));
        cards.add(new SetCardInfo("Tranquil Domain", 245, Rarity.COMMON, mage.cards.t.TranquilDomain.class));
        cards.add(new SetCardInfo("Tropical Storm", 246, Rarity.UNCOMMON, mage.cards.t.TropicalStorm.class));
        cards.add(new SetCardInfo("Uktabi Faerie", 247, Rarity.COMMON, mage.cards.u.UktabiFaerie.class));
        cards.add(new SetCardInfo("Uktabi Wildcats", 248, Rarity.RARE, mage.cards.u.UktabiWildcats.class));
        cards.add(new SetCardInfo("Unerring Sling", 322, Rarity.UNCOMMON, mage.cards.u.UnerringSling.class));
        cards.add(new SetCardInfo("Unfulfilled Desires", 285, Rarity.RARE, mage.cards.u.UnfulfilledDesires.class));
        cards.add(new SetCardInfo("Unseen Walker", 249, Rarity.UNCOMMON, mage.cards.u.UnseenWalker.class));
        cards.add(new SetCardInfo("Unyaro Bee Sting", 250, Rarity.UNCOMMON, mage.cards.u.UnyaroBeeSting.class));
        cards.add(new SetCardInfo("Unyaro Griffin", 44, Rarity.UNCOMMON, mage.cards.u.UnyaroGriffin.class));
        cards.add(new SetCardInfo("Urborg Panther", 150, Rarity.COMMON, mage.cards.u.UrborgPanther.class));
        cards.add(new SetCardInfo("Vaporous Djinn", 101, Rarity.UNCOMMON, mage.cards.v.VaporousDjinn.class));
        cards.add(new SetCardInfo("Ventifact Bottle", 323, Rarity.RARE, mage.cards.v.VentifactBottle.class));
        cards.add(new SetCardInfo("Viashino Warrior", 200, Rarity.COMMON, mage.cards.v.ViashinoWarrior.class));
        cards.add(new SetCardInfo("Vigilant Martyr", 45, Rarity.UNCOMMON, mage.cards.v.VigilantMartyr.class));
        cards.add(new SetCardInfo("Village Elder", 251, Rarity.COMMON, mage.cards.v.VillageElder.class));
        cards.add(new SetCardInfo("Vitalizing Cascade", 286, Rarity.UNCOMMON, mage.cards.v.VitalizingCascade.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 201, Rarity.RARE, mage.cards.v.VolcanicDragon.class));
        cards.add(new SetCardInfo("Volcanic Geyser", 202, Rarity.UNCOMMON, mage.cards.v.VolcanicGeyser.class));
        cards.add(new SetCardInfo("Waiting in the Weeds", 252, Rarity.RARE, mage.cards.w.WaitingInTheWeeds.class));
        cards.add(new SetCardInfo("Wall of Corpses", 151, Rarity.COMMON, mage.cards.w.WallOfCorpses.class));
        cards.add(new SetCardInfo("Wall of Resistance", 46, Rarity.COMMON, mage.cards.w.WallOfResistance.class));
        cards.add(new SetCardInfo("Wall of Roots", 253, Rarity.COMMON, mage.cards.w.WallOfRoots.class));
        cards.add(new SetCardInfo("Ward of Lights", 47, Rarity.COMMON, mage.cards.w.WardOfLights.class));
        cards.add(new SetCardInfo("Warping Wurm", 287, Rarity.RARE, mage.cards.w.WarpingWurm.class));
        cards.add(new SetCardInfo("Wave Elemental", 102, Rarity.UNCOMMON, mage.cards.w.WaveElemental.class));
        cards.add(new SetCardInfo("Wellspring", 288, Rarity.RARE, mage.cards.w.Wellspring.class));
        cards.add(new SetCardInfo("Wild Elephant", 254, Rarity.COMMON, mage.cards.w.WildElephant.class));
        cards.add(new SetCardInfo("Wildfire Emissary", 203, Rarity.UNCOMMON, mage.cards.w.WildfireEmissary.class));
        cards.add(new SetCardInfo("Windreaper Falcon", 289, Rarity.UNCOMMON, mage.cards.w.WindreaperFalcon.class));
        cards.add(new SetCardInfo("Withering Boon", 152, Rarity.UNCOMMON, mage.cards.w.WitheringBoon.class));
        cards.add(new SetCardInfo("Worldly Tutor", 255, Rarity.UNCOMMON, mage.cards.w.WorldlyTutor.class));
        cards.add(new SetCardInfo("Zebra Unicorn", 290, Rarity.UNCOMMON, mage.cards.z.ZebraUnicorn.class));
        cards.add(new SetCardInfo("Zhalfirin Commander", 49, Rarity.UNCOMMON, mage.cards.z.ZhalfirinCommander.class));
        cards.add(new SetCardInfo("Zhalfirin Knight", 50, Rarity.COMMON, mage.cards.z.ZhalfirinKnight.class));
        cards.add(new SetCardInfo("Zirilan of the Claw", 204, Rarity.RARE, mage.cards.z.ZirilanOfTheClaw.class));
        cards.add(new SetCardInfo("Zombie Mob", 153, Rarity.UNCOMMON, mage.cards.z.ZombieMob.class));
        cards.add(new SetCardInfo("Zuberi, Golden Feather", 51, Rarity.RARE, mage.cards.z.ZuberiGoldenFeather.class));
    }
}
