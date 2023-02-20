package com.github.relativobr.supreme;

import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import org.bukkit.Material;

import com.github.relativobr.supreme.generators.GeneratorMob;
import com.github.relativobr.supreme.generators.SupremeCapacitor;
import com.github.relativobr.supreme.generators.SupremeGenerator;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SupremeItems {

    // Resources
    
    public static final SlimefunItemStack RESOURCE_CORE_POTATO = new SupremeItemStack("SUPREME_CORE_POTATO",
            "cf4624ebf7d419a11e43ed0c2038d32cd09ad1d7a6c6e20f6339cbcfe386fd1c", "&aSupreme Potato", "",
            "&7A super potato",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_APPLE = new SupremeItemStack("SUPREME_CORE_APPLE",
            "4abd703e5b8c88d4b1fcfa94a936a0d6a4f6aba44569663d3391d4883223c5", "&aSupreme Apple", "", "&7A super apple",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_BEETROOT = new SupremeItemStack("SUPREME_CORE_BEETROOT",
            "18f36ea228c4fd9afed5add6d0526de71b7ac0559eabfc2f60de6c4aa733f5", "&aSupreme Beetroot", "",
            "&7A super beetroot",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_WHEAT = new SupremeItemStack("SUPREME_CORE_WHEAT",
            "2c680149ad17e46fbbf7606b284cc83a03b1a67cd8a52717b44bfa3ad5914f14", "&aSupreme Wheat", "",
            "&7A super wheat", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SUGAR_CANE = new SupremeItemStack("SUPREME_CORE_SUGAR_CANE",
            "8624bacb5f1986e6477abce4ae7dca1820a5260b6233b55ba1d9ba936c84b", "&aSupreme Sugar Cane", "",
            "&7A super sugar cane", "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SWEET_BERRIES = new SupremeItemStack(
            "SUPREME_CORE_SWEET_BERRIES",
            "b4ec3fcd557269a1a0b9bfa8a02dae1a39fa0ee8ff40e0cb8a96479be04b6609", "&aSupreme Barries", "",
            "&7A super barries",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_MELON = new SupremeItemStack("SUPREME_CORE_MELON",
            "84df0bfe450f0b8623f3accbc0d606f72891a6cfa9667898251ae73ebdd2646a", "&aSupreme Melon", "",
            "&7A super melon", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_CARROT = new SupremeItemStack("SUPREME_CORE_CARROT",
            "4d3a6bd98ac1833c664c4909ff8d2dc62ce887bdcf3cc5b3848651ae5af6b", "&aSupreme Carrot", "",
            "&7A Supreme Carrot", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_PUMPKIN = new SupremeItemStack("SUPREME_CORE_PUMPKIN",
            "b41ad148e33c81dca3f1a6ce13aa70e4fe6bc2c79e87185d8d176bdda1c98a3", "&aSupreme Pumpkin", "",
            "&7A super pumpkin",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_PORKCHOP = new SupremeItemStack("SUPREME_CORE_PORKCHOP",
            "42e0bb88d8bd55d1f946461b3ee6c22f353ba74847ed2412856bb85cf9f63", "&aSupreme bacon", "", "&7A super bacon",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_BEEF = new SupremeItemStack("SUPREME_CORE_BEEF",
            "f660e91e1f5fc510b5f86520a5516a921f37657f965fdbb233dad8474029a96f", "&aSupreme beef", "", "&7A super beef",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_MUTTON = new SupremeItemStack("SUPREME_CORE_MUTTON",
            "f31f9ccc6b3e32ecf13b8a11ac29cd33d18c95fc73db8a66c5d657ccb8be70", "&aSupreme mutton", "",
            "&7A super mutton", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_CHICKEN = new SupremeItemStack("SUPREME_CORE_CHICKEN",
            "277695e697a2247377349fe8271d8e6b888aef354f8cc751f739c6b4c7f492d3", "&aSupreme chicken", "",
            "&7A super chicken",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SALMON = new SupremeItemStack("SUPREME_CORE_SALMON",
            "8aeb21a25e46806ce8537fbd6668281cf176ceafe95af90e94a5fd84924878", "&aSupreme salmon", "",
            "&7A super salmon", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_COD = new SupremeItemStack("SUPREME_CORE_COD",
            "7892d7dd6aadf35f86da27fb63da4edda211df96d2829f691462a4fb1cab0", "&aSupreme cod", "", "&7A super cod", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_STRING = new SupremeItemStack("SUPREME_CORE_STRING",
            "b5a1f7566f4b68227f90678100b3b09e2533731c2ce84dc2fdd1c851039f7a7", "&aSupreme lead", "", "&7A super lead",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SPIDER_EYE = new SupremeItemStack("SUPREME_CORE_SPIDER_EYE",
            "442cf8ce487b78fa203d56cf01491434b4c33e5d236802c6d69146a51435b03d", "&aSupreme eye", "", "&7A super eye",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_TEAR = new SupremeItemStack("SUPREME_CORE_TEAR",
            "78f77eeeef6ffb2f6818e57698794ae0351ab32ba234d621c22fe4ce8e1599d2", "&aSupreme tear", "", "&7A super tear",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_RED = new SupremeItemStack("SUPREME_CORE_RED",
            "a5d53ef428b369fd5cce94ce205d0d2d7b095fad676a9b383971ee1049e367ad", "&aSupreme Red", "", "&7A super red",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_YELLOW = new SupremeItemStack("SUPREME_CORE_YELLOW",
            "8a03a8a877de7a4d6b167633a96ae3983998fd9d9a4c5e3fa817d138e81e4499", "&aSupreme Yellow", "",
            "&7A super yellow",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_PURPLE = new SupremeItemStack("SUPREME_CORE_PURPLE",
            "b21f8f3e52fa21b45ff56f3f73dd21661ff257d97bd52ed958f2d757be89a961", "&aSupreme Purple", "",
            "&7A super purple",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_BLUE = new SupremeItemStack("SUPREME_CORE_BLUE",
            "5f1e18cd9f9d3822196f0ccf1a8e071d87bb32ab50df4d6cfed93a1a948835ca", "&aSupreme Blue", "", "&7A super blue",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_BLACK = new SupremeItemStack("SUPREME_CORE_BLACK",
            "3e1e5c81fb9d64b74996fd171489deadbb8cb772d52cf8b566e3bc102301044", "&aSupreme Black", "", "&7A super black",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_GREEN = new SupremeItemStack("SUPREME_CORE_GREEN",
            "db3bcc1a668fb3397507359674128a42c26f344974189ec322a33d13168428ea", "&aSupreme Green", "",
            "&7A super green", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_PINK = new SupremeItemStack("SUPREME_CORE_PINK",
            "2b5ad8ead60ca895c0d706cf3ad381be0540f28c5294d2b6e145675c963325cf", "&aSupreme pink", "", "&7A super pink",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_GRAY = new SupremeItemStack("SUPREME_CORE_GRAY",
            "145fd2c3736af4bd2811296661e0cb49bab2cfa65f5c9e598aa43bebfa1ea368", "&aSupreme Gray", "", "&7A super gray",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_CYAN = new SupremeItemStack("SUPREME_CORE_CYAN",
            "de73a8675ec1be13b1932627533212b1ded2b1773e54b06ea489a35d9744d615", "&aSupreme Cyan", "", "&7A super cyan",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_STONE = new SupremeItemStack("SUPREME_CORE_STONE",
            "454d9c488c3fbde5454e38619f9cc5b5ba8c6c0186f8aa1da60900fcbc3ea6", "&aSupreme cobblestone", "",
            "&7A super cobblestone", "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_GRANITE = new SupremeItemStack("SUPREME_CORE_GRANITE",
            "a0285bea3c8a02db139fa8ec5cc588615a98550725f8e676c93fdbc33b6b", "&aSupreme granite", "",
            "&7A super granite", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_DIORITE = new SupremeItemStack("SUPREME_CORE_DIORITE",
            "13fa5265a336abde301a9d59af4783e82a10dad0817716ead2962ab7c6d3dff", "&aSupreme diorite", "",
            "&7A super diorite",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_ANDESITE = new SupremeItemStack("SUPREME_CORE_ANDESITE",
            "adb7bf059a62d27b1e1e2f34394f3f38ed8cda45471f6f4d5b47c3912d181135", "&aSupreme andesite", "",
            "&7A super andesite", "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_GRAVEL = new SupremeItemStack("SUPREME_CORE_GRAVEL",
            "7788b61fcd46cad9235cc32ac57a54f708110329447bb24c0877886e3f4907f1", "&aSupreme gravel", "",
            "&7A super gravel",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SAND = new SupremeItemStack("SUPREME_CORE_SAND",
            "53398ab3cb696b34430be944b14afbd227fd87e99026bcfc8b7387a861bde", "&aSupreme sand", "", "&7A super sand", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_ENDSTONE = new SupremeItemStack("SUPREME_CORE_ENDSTONE",
            "19f21f5d883316fd65a9366f32a33013182e3381dec21c17c78355d9bf4f0", "&aSupreme endstone", "",
            "&7A super endstone",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_CLAY = new SupremeItemStack("SUPREME_CORE_CLAY",
            "67826829eab5ad62f0c11d9faafdc9954364871160dd839e1ab5a3b213a33", "&aSupreme clay", "", "&7A super clay", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SNOW = new SupremeItemStack("SUPREME_CORE_SNOW",
            "5dd6fe267a418dcc7f37a8f76855b5328b1303897b342a107cf162f14fe3d", "&aSupreme snow", "", "&7A super snow", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_OAK_LOG = new SupremeItemStack("SUPREME_CORE_OAK_LOG",
            "5c44262564ac5a0049a982558d087733b0ee2b5a2bf5fc5fdafe6e08f496174c", "&aCarvalho Supremo", "",
            "&7A super oak", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_SPRUCE_LOG = new SupremeItemStack("SUPREME_CORE_SPRUCE_LOG",
            "9f4af289825e127dac32208b1e0389a927ef405597b6c9a64cef03f21d9273b5", "&aPinheiro Supremo", "",
            "&7A super spruce",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_BIRCH_LOG = new SupremeItemStack("SUPREME_CORE_BIRCH_LOG",
            "a991f3b73ebb9dec91eddc8361ca2fecf5280d2c733eda9ecb695f83d1580", "&aBétula Supremo", "", "&7A super birch",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_JUNGLE_LOG = new SupremeItemStack("SUPREME_CORE_JUNGLE_LOG",
            "79ca3540621c1c79c32bf42438708ff1f5f7d0af9b14a074731107edfeb691c", "&aJungle Suprema", "",
            "&7A super jungle", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_ACACIA_LOG = new SupremeItemStack("SUPREME_CORE_ACACIA_LOG",
            "e6669fe2dbf78792a3e191622a8ed1f9eb803f8826c9b949d0dc15a51c59391", "&aAcácia Suprema", "",
            "&7A super acacia", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_DARK_OAK_LOG = new SupremeItemStack("SUPREME_CORE_DARK_OAK_LOG",
            "f77dc6e8b45adcf928f2c6139dfa2a361aa107b89c9ad35c347b677a07c79f5", "&aDark Supremo", "", "&7A super dark",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_CRIMSON_STEM = new SupremeItemStack("SUPREME_CORE_CRIMSON_STEM",
            "b28874497332731576eb1b5b35c877b619ed23622716afe7d2291a684aaaa013", "&aCrimson Supremo", "",
            "&7A super crimson",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_WARPED_STEM = new SupremeItemStack("SUPREME_CORE_WARPED_STEM",
            "e32d41daee6f61ca00e5ecf9dfdd6245af620f1ab6258e986da673c57e5312a6", "&aWarped Supremo", "",
            "&7A super warped",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_WITHER_ROSE = new SupremeItemStack("SUPREME_CORE_WITHER_ROSE",
            "9dba38e9fc67f72c458fdac8ecd7cabaed3eb83737143a0128350a1ab381e3e", "&aRosa Suprema", "", "&7A super rose",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_COAL = new SupremeItemStack("SUPREME_CORE_COAL",
            "d7f5766d2928dc0df1b3404c3bd073c9476d26c80573b0332e7cce73df15482a", "&aSupreme coal", "", "&7A super coal",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_IRON = new SupremeItemStack("SUPREME_CORE_IRON",
            "126b772329cf32f8643c4928626b6a325233ff61aa9c7725873a4bd66db3d692", "&aSupreme iron", "", "&7A super iron",
            "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_GOLD = new SupremeItemStack("SUPREME_CORE_GOLD",
            "54bf893fc6defad218f7836efefbe636f1c2cc1bb650c82fccd99f2c1ee6", "&aSupreme gold", "", "&7A super gold", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_REDSTONE = new SupremeItemStack("SUPREME_CORE_REDSTONE",
            "d08ee6edfa98db5eae9b9c9936e94489b2d4bbbd3d2b4b6b4885a32240613c", "&aSupreme redstone", "",
            "&7A super redstone",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_LAPIS = new SupremeItemStack("SUPREME_CORE_LAPIS",
            "55189b379a7880ff9a4bbd588adb4e1b7b9c3341de7d6d006d362ae5450da986", "&aSupreme lapis", "",
            "&7A super lapis", "",
            "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_DIAMOND = new SupremeItemStack("SUPREME_CORE_DIAMOND",
            "9631597dce4e4051e8d5a543641966ab54fbf25a0ed6047f11e6140d88bf48f", "&aSupreme diamond", "",
            "&7A super diamond",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_EMERALD = new SupremeItemStack("SUPREME_CORE_EMERALD",
            "bc0e6d9e242735481918c5fd14498bd760bb9f4ff6430ad4696b38e8a883da97", "&aSupreme emerald", "",
            "&7A super emerald",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_QUARTZ = new SupremeItemStack("SUPREME_CORE_QUARTZ",
            "d3b5001a67007a93ade6659175e9054a92976b087fc629f042bcd57e7757646a", "&aSupreme quartz", "",
            "&7A super quartz",
            "", "&3Supreme Core Components");

    public static final SlimefunItemStack RESOURCE_CORE_NETHERITE = new SupremeItemStack("SUPREME_CORE_NETHERITE",
            "27957f895d7bc53423a35aac59d584b41cc30e040269c955e451fe680a1cc049", "&aSupreme netherite", "",
            "&7A super netherite", "", "&3Supreme Core Components");

    public static final SlimefunItemStack CORE_OF_LIFE = new SupremeItemStack("SUPREME_CORE_OF_LIFE",
            "faff2eb498e5c6a04484f0c9f785b448479ab213df95ec91176a308a12add70", "&aCore of Life", "",
            "&7This core contains fragments of life", "&7that have been collected by the world.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CORE_OF_DEATH = new SupremeItemStack("SUPREME_CORE_OF_DEATH",
            "9e95293acbcd4f55faf5947bfc5135038b275a7ab81087341b9ec6e453e839", "&aCore of Death", "",
            "&7This core contains the souls of ", "&7various entities that have gone beyond.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CORE_OF_COLOR = new SupremeItemStack("SUPREME_CORE_OF_COLOR",
            "163bcaf6d2679d8d7d9bf6a474a48a77a8e91747a1084c09256ebc86cb74811", "&aCore of Color", "",
            "&7This core contains several colors", "&7that have been collected around the world.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CORE_OF_BLOCK = new SupremeItemStack("SUPREME_CORE_OF_BLOCK",
            "14d844fee24d5f27ddb669438528d83b684d901b75a6889fe7488dfc4cf7a1c", "&aCore of Block", "",
            "&7This core contains several blocks", "&7that have been collected around the world.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CORE_OF_NATURE = new SupremeItemStack("SUPREME_CORE_OF_NATURE",
            "32fa8f38c7b22096619c3a6d6498b405530e48d5d4f91e2aacea578844d5c67", "&aCore of Nature", "",
            "&7This core contains several natural", "&7that have been collected around the world.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CORE_OF_ALLOY = new SupremeItemStack("SUPREME_CORE_OF_ALLOY",
            "cbfb41f866e7e8e593659986c9d6e88cd37677b3f7bd44253e5871e66d1d424", "&aCore of Alloy", "",
            "&7This core contains several ores", "&7that have been collected around the world.", "",
            "&3Supreme Magical Components");

    public static final SlimefunItemStack CETRUS_LUX = new SupremeItemStack("SUPREME_CETRUS_LUX",
            "92cb6e51c461e7359526bea5e06209cddde7c6469a819f3405cf0a038c159502", "&aCetrus Lux", "",
            "&7A super lux scepter",
            "", "&3Supreme Magical Components");

    public static final SlimefunItemStack CETRUS_VENTUS = new SupremeItemStack("SUPREME_CETRUS_VENTUS",
            "b28f1c0c5092e12d33770df45c5845a9610886039b34abe93a16c5e942dfc8e4", "&aCetrus Ventus", "",
            "&7A super ventus scepter", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack CETRUS_LUMIUM = new SupremeItemStack("SUPREME_CETRUS_LUMIUM",
            "4b1cce22de19ed6727abc5e6c2d57864c871a44c956bbe2eb3960269b686b8b3", "&aCetrus Lumium", "",
            "&7A super lumium scepter", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack CETRUS_AQUA = new SupremeItemStack("SUPREME_CETRUS_AQUA",
            "36161daa3589ec9c8187459ac36fd4dd2646c040678d3bfacb72a2210c6c801c", "&aCetrus Aqua", "",
            "&7A super aqua scepter",
            "", "&3Supreme Magical Components");

    public static final SlimefunItemStack CETRUS_IGNIS = new SupremeItemStack("SUPREME_CETRUS_IGNIS",
            "e672959028f274b379d430f068f0f15a4f793eac12afb94ae0b4e50cf895df0f", "&aCetrus Ignis", "",
            "&7A super ignis scepter", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack ATTRIBUTE_MAGIC = new SupremeItemStack("SUPREME_ATTRIBUTE_MAGIC",
            "16d1c19b0dabdf7360fbd18df9dfd1c615da2f8d2c84fc4216565d9c5dd", "&aAttribute Magic", "",
            "&7A super magic attribute with special effects", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack ATTRIBUTE_BOMB = new SupremeItemStack("SUPREME_ATTRIBUTE_BOMB",
            "44253275e1b7757130a2d637d07f522fcc6686dc804346f0e71668d5ce6d5891", "&aAttribute Bomb", "",
            "&7A super bomb attribute with special effects", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack ATTRIBUTE_FORTUNE = new SupremeItemStack("SUPREME_ATTRIBUTE_FORTUNE",
            "81251d814bdea8fc4881aeb6e7d1f48a2edf9cdba9ab4e3fa7f7359c5b92", "&aAttribute Fortune", "",
            "&7A super fortune attribute with special effects", "", "&3Supreme Magical Components");

    public static final SlimefunItemStack ATTRIBUTE_IMPETUS = new SupremeItemStack("SUPREME_ATTRIBUTE_IMPETUS",
            "f2d27936be90709046d9b4eec4e2a67d6ed583e4cf94f53c0569431357423", "&aAttribute Impetus", "",
            "&7A super impetus attribute with special effects", "", "&3Supreme Magical Components");

    // Supreme Components

    public static final SlimefunItemStack SUPREME_NUGGET = new SupremeItemStack("SUPREME_SUPREME_NUGGET",
            "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&aNugget Supreme", "",
            "&7From the Quarry Nugget Supreme", "", "&3Supreme End-Game Components");

    public static final SlimefunItemStack SUPREME = new SupremeItemStack("SUPREME_SUPREME",
            "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&aSupreme", "", "&7The Supreme", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_BIT = new SupremeItemStack("SUPREME_THORNIUM_BIT",
            Material.IRON_NUGGET, "&aThornium Bit", "", "&7From the Quarry Thornium", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_DUST = new SupremeItemStack("SUPREME_THORNIUM_DUST",
            Material.GUNPOWDER, "&aThornium Dust", "", "&7From the Thornium Bit", "", "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_INGOT = new SupremeItemStack("SUPREME_THORNIUM_INGOT",
            Material.IRON_INGOT, "&aThornium Ingot", "", "&7From the Thornium Dust", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SupremeItemStack(
            "SUPREME_THORNIUM_BIT_SYNTHETIC",
            Material.GOLD_NUGGET, "&aThornium Bit Synthetic", "", "&7From the Thornium Bit", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SupremeItemStack(
            "SUPREME_THORNIUM_DUST_SYNTHETIC", Material.GLOWSTONE_DUST, "&aThornium Dust Synthetic", "",
            "&7From the Thornium Dust", "", "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SupremeItemStack(
            "SUPREME_THORNIUM_INGOT_SYNTHETIC", Material.GOLD_INGOT, "&aThornium Ingot Synthetic", "",
            "&7From the Thornium Ingot", "", "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_CARBONADO = new SupremeItemStack("SUPREME_THORNIUM_CARBONADO",
            Material.NETHERITE_INGOT, "&aThornium Carbonado", "", "&7From the Thornium Ingot", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack THORNIUM_ENERGIZED = new SupremeItemStack("SUPREME_THORNIUM_ENERGIZED",
            Material.NETHERITE_INGOT, "&aThornium Energized", "", "&7From the Thornium Ingot", "",
            "&3Supreme End-Game Components");

    public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SupremeItemStack("SUPREME_ALLOY_ZIRCONIUM",
            Material.IRON_INGOT, "&aAlloy Zirconium", "", "&3Supreme Components");

    public static final SlimefunItemStack ZIRCONIUM_PLATE = new SupremeItemStack("SUPREME_ZIRCONIUM_PLATE",
            Material.IRON_BLOCK, "&aZirconium Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_TITANIUM = new SupremeItemStack("SUPREME_ALLOY_TITANIUM",
            Material.IRON_INGOT, "&aAlloy Titanium", "", "&3Supreme Components");

    public static final SlimefunItemStack TITANIUM_PLATE = new SupremeItemStack("SUPREME_TITANIUM_PLATE",
            Material.IRON_BLOCK, "&aTitanium Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_IRIDIUM = new SupremeItemStack("SUPREME_ALLOY_IRIDIUM",
            Material.IRON_INGOT, "&aAlloy Iridium", "", "&3Supreme Components");

    public static final SlimefunItemStack IRIDIUM_PLATE = new SupremeItemStack("SUPREME_IRIDIUM_PLATE",
            Material.IRON_BLOCK, "&aIridium Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_AURUM = new SupremeItemStack("SUPREME_ALLOY_AURUM", Material.GOLD_INGOT,
            "&aAlloy Aurum", "", "&3Supreme Components");

    public static final SlimefunItemStack AURUM_PLATE = new SupremeItemStack("SUPREME_AURUM_PLATE", Material.GOLD_BLOCK,
            "&aAurum Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_MANGANESE = new SupremeItemStack("SUPREME_ALLOY_MANGANESE",
            Material.GOLD_INGOT, "&aAlloy Manganese", "", "&3Supreme Components");

    public static final SlimefunItemStack MANGANESE_PLATE = new SupremeItemStack("SUPREME_MANGANESE_PLATE",
            Material.GOLD_BLOCK, "&aManganese Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_PLATINUM = new SupremeItemStack("SUPREME_ALLOY_PLATINUM",
            Material.GOLD_INGOT, "&aAlloy Platinum", "", "&3Supreme Components");

    public static final SlimefunItemStack PLATINUM_PLATE = new SupremeItemStack("SUPREME_PLATINUM_PLATE",
            Material.GOLD_BLOCK, "&aPlatinum Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SupremeItemStack("SUPREME_ALLOY_ADAMANTIUM",
            Material.NETHERITE_INGOT, "&aAlloy Adamantium", "", "&3Supreme Components");

    public static final SlimefunItemStack ADAMANTIUM_PLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_PLATE",
            Material.NETHERITE_BLOCK, "&aAdamantium Plate", "", "&3Supreme Components");

    public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SupremeItemStack("SUPREME_SYNTHETIC_AMETHYST",
            Material.PURPLE_DYE, "&aSynthetic Amethyst", "", "&3Supreme Components");

    public static final SlimefunItemStack SYNTHETIC_RUBY = new SupremeItemStack("SUPREME_SYNTHETIC_RUBY",
            Material.PINK_DYE, "&aSynthetic Ruby", "", "&3Supreme Components");

    public static final SlimefunItemStack THORNERITE = new SupremeItemStack("SUPREME_THORNERITE",
            Material.NETHERITE_INGOT, "&aThornerite", "", "&3Supreme End-Game Components");

    public static final SlimefunItemStack INDUCTIVE_MACHINE = new SupremeItemStack("SUPREME_INDUCTIVE_MACHINE",
            Material.DEAD_FIRE_CORAL_BLOCK, "&aInductive Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack INDUCTOR_MACHINE = new SupremeItemStack("SUPREME_INDUCTOR_MACHINE",
            Material.FIRE_CORAL_BLOCK, "&aInductor Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack RUSTLESS_MACHINE = new SupremeItemStack("SUPREME_RUSTLESS_MACHINE",
            Material.DEAD_BRAIN_CORAL_BLOCK, "&aRustless Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack STAINLESS_MACHINE = new SupremeItemStack("SUPREME_STAINLESS_MACHINE",
            Material.BRAIN_CORAL_BLOCK, "&aStainless Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack CARRIAGE_MACHINE = new SupremeItemStack("SUPREME_CARRIAGE_MACHINE",
            Material.DEAD_HORN_CORAL_BLOCK, "&aCarriage Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack CONVEYANCE_MACHINE = new SupremeItemStack("SUPREME_CONVEYANCE_MACHINE",
            Material.HORN_CORAL_BLOCK, "&aConveyance Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SupremeItemStack("SUPREME_CRYSTALLIZER_MACHINE",
            Material.TUBE_CORAL_BLOCK, "&aCrystallizer Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack PETRIFIER_MACHINE = new SupremeItemStack("SUPREME_PETRIFIER_MACHINE",
            Material.DEAD_TUBE_CORAL_BLOCK, "&aPetrifier Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack BLEND_MACHINE = new SupremeItemStack("SUPREME_BLEND_MACHINE",
            Material.BUBBLE_CORAL_BLOCK, "&aBlend Machine", "", "&3Supreme Advanced Components");

    public static final SlimefunItemStack CENTER_CARD_SIMPLE = new SupremeItemStack("SUPREME_CENTER_CARD_SIMPLE",
            Material.MUSIC_DISC_11, "&aBasic Component for Card", "", "&fComponent for Machine to produce items", "",
            "&3Supreme Component");

    public static final SlimefunItemStack CENTER_CARD_ADVANCED = new SupremeItemStack("SUPREME_CENTER_CARD_ADVANCED",
            Material.MUSIC_DISC_PIGSTEP, "&aAdvanced Component for Card", "",
            "&fComponent for Machine to produce items", "",
            "&3Supreme Component");

    public static final SlimefunItemStack CENTER_CARD_ULTIMATE = new SupremeItemStack("SUPREME_CENTER_CARD_ULTIMATE",
            Material.MUSIC_DISC_MALL, "&aUltimate Component for Card", "", "&fComponent for Machine to produce items",
            "",
            "&3Supreme Component");

    public static final SlimefunItemStack DUST_NETHERITE = new SupremeItemStack("SUPREME_DUST_NETHERITE",
            Material.MELON_SEEDS, "&aNetherite Dust", "", "&3Supreme Component");

    public static final SlimefunItemStack DUST_GLOW_INK = new SupremeItemStack("SUPREME_DUST_GLOW_INK",
            Material.PUMPKIN_SEEDS, "&aGlow Ink Dust", "", "&3Supreme Component");

    public static final SlimefunItemStack DUST_AMETHYST = new SupremeItemStack("SUPREME_DUST_AMETHYST",
            Material.BEETROOT_SEEDS, "&aAmethyst Dust", "", "&3Supreme Component");

    public static final SlimefunItemStack EMPTY_MOBTECH = new SupremeItemStack("SUPREME_EMPTY_MOBTECH",
            Material.FIRE_CHARGE, "&aEmpty MobTech", "", "&3Supreme Component");

    public static final SlimefunItemStack GENE_BERSERK = new SupremeItemStack("SUPREME_GENE_BERSERK",
            Material.FIRE_CORAL,
            "&aBerserk Gene", "", "&3Supreme Component");

    public static final SlimefunItemStack GENE_INTELLIGENCE = new SupremeItemStack("SUPREME_GENE_INTELLIGENCE",
            Material.TUBE_CORAL, "&fIntelligence Gene", "", "&3Supreme Component");

    public static final SlimefunItemStack GENE_LUCK = new SupremeItemStack("SUPREME_GENE_LUCK", Material.HORN_CORAL,
            "&aLuck Gene", "", "&3Supreme Component");

    // Multiblocks

    public static final SlimefunItemStack CORE_FABRICATOR = new SupremeItemStack(
            "SUPREME_MULTIBLOCK_CORE",
            Material.SHROOMLIGHT,
            "&eCore Fabricator", "",
            "&7&oYou can craft core here!", "",
            "&aMultiBlock Machine");

    public static final SlimefunItemStack GEAR_FABRICATOR = new SupremeItemStack(
            "SUPREME_MULTIBLOCK_GEAR",
            Material.SMITHING_TABLE,
            "&eGear Fabricator", "",
            "&7&oYou can craft weapons, armor and tools here!", "",
            "&aMultiBlock Machine");

    public static final SlimefunItemStack MAGICAL_FABRICATOR = new SupremeItemStack(
            "SUPREME_MULTIBLOCK_MAGICAL",
            Material.CRYING_OBSIDIAN,
            "&eMagical Fabricator", "",
            "&7&oYou can craft magical here!", "",
            "&aMultiBlock Machine");

    // Capacitors

    public static final SlimefunItemStack AURUM_CAPACITOR = new SupremeItemStack("SUPREME_AURUM_CAPACITOR",
            "db2b1c052e84a4ad245a4d1ca5b10bd7f5249af0ca373f99174ce7990e597836", false,
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
            UtilEnergy.energyCapacity(SupremeCapacitor.AURUM_CAPACITY));

    public static final SlimefunItemStack TITANIUM_CAPACITOR = new SupremeItemStack("SUPREME_TITANIUM_CAPACITOR",
            "b30ad864b265ab178a03e27fc249a1e32941e007486febd0059e4e3b76c11958", false,
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
            UtilEnergy.energyCapacity(SupremeCapacitor.TITANIUM_CAPACITY));

    public static final SlimefunItemStack ADAMANTIUM_CAPACITOR = new SupremeItemStack("SUPREME_ADAMANTIUM_CAPACITOR",
            "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38", false,
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
            UtilEnergy.energyCapacity(SupremeCapacitor.ADAMANTIUM_CAPACITY));

    public static final SlimefunItemStack THORNIUM_CAPACITOR = new SupremeItemStack("SUPREME_THORNIUM_CAPACITOR",
            "9aab01a5d9512e3175bf3af2edbfd59419dc5662605c42c91730e711254efcc4", false,
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            UtilEnergy.energyCapacity(SupremeCapacitor.THORNIUM_CAPACITY));

    public static final SlimefunItemStack SUPREME_CAPACITOR = new SupremeItemStack("SUPREME_SUPREME_CAPACITOR",
            "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422", false,
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), UtilEnergy.energyCapacity(null));

    // Generators

    public static final SlimefunItemStack GENERATOR_MOB_BASIC = new SupremeItemStack("SUPREME_GENERATOR_MOB_BASIC",
            Material.COMPOSTER, false,
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(GeneratorMob.BASIC_GENERATOR_MOB_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(GeneratorMob.BASIC_GENERATOR_MOB_ENERGY)));

    public static final SlimefunItemStack GENERATOR_MOB_MEDIUM = new SupremeItemStack("SUPREME_GENERATOR_MOB_MEDIUM",
            Material.COMPOSTER, false,
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(GeneratorMob.MEDIUM_GENERATOR_MOB_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(GeneratorMob.MEDIUM_GENERATOR_MOB_ENERGY)));

    public static final SlimefunItemStack GENERATOR_MOB_ADVANCED = new SupremeItemStack(
            "SUPREME_GENERATOR_MOB_ADVANCED",
            Material.COMPOSTER, false,
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(GeneratorMob.ADVANCED_GENERATOR_MOB_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(GeneratorMob.ADVANCED_GENERATOR_MOB_ENERGY)));

    public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
            Material.ORANGE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_ENERGY)));

    public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
            Material.ORANGE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_ENERGY)));

    public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack(
            "SUPREME_BASIC_VENTUS_GENERATOR",
            Material.LIGHT_BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_ENERGY)));

    public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
            Material.LIGHT_BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_ENERGY)));

    public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
            Material.BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_ENERGY)));

    public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
            Material.BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_ENERGY)), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
            Material.WHITE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_ENERGY)));

    public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
            Material.WHITE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUX_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.LUX_ENERGY)));

    public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack(
            "SUPREME_BASIC_LUMIUM_GENERATOR",
            Material.BROWN_CONCRETE, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_ENERGY)));

    public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
            Material.BROWN_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_ENERGY)));

    public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
            Material.BLACK_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_ENERGY)));

    public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
            Material.PURPLE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_BUFFER)),
            UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_ENERGY)));

    // Machines

    public static final SlimefunItemStack ELECTRIC_CORE_MACHINE = new SupremeItemStack(
            "SUPREME_ELECTRIC_CORE_I",
            Material.SHROOMLIGHT,
            "&bElectric Core Machine", "",
            "&fCraft resource of core", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_II = new SupremeItemStack(
            "SUPREME_ELECTRIC_CORE_II",
            Material.SHROOMLIGHT,
            "&bElectric Core Machine II", "",
            "&fAdvanced craft resource of core", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_III = new SupremeItemStack(
            "SUPREME_ELECTRIC_CORE_III",
            Material.SHROOMLIGHT,
            "&bElectric Core Machine III", "",
            "&fAdvanced craft resource of core", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE = new SupremeItemStack(
            "SUPREME_ELECTRIC_GEAR_I",
            Material.SMITHING_TABLE,
            "&bElectric Gear Machine", "",
            "&fCraft tier of gear", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE_II = new SupremeItemStack(
            "SUPREME_ELECTRIC_GEAR_II",
            Material.SMITHING_TABLE,
            "&bElectric Gear Machine II", "",
            "&fAdvanced craft tier of gear", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE_III = new SupremeItemStack(
            "SUPREME_ELECTRIC_GEAR_III",
            Material.SMITHING_TABLE,
            "&bElectric Gear Machine III", "",
            "&fAdvanced craft tier of gear", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_MAGICAL_MACHINE = new SupremeItemStack(
            "SUPREME_ELECTRIC_MAGICAL_I",
            Material.CRYING_OBSIDIAN,
            "&bElectric Magical Machine", "",
            "&fCraft resource of magical", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_MAGICAL_MACHINE_II = new SupremeItemStack(
            "SUPREME_ELECTRIC_MAGICAL_II", Material.CRYING_OBSIDIAN,
            "&bElectric Magical Machine II", "",
            "&fAdvanced craft resource of magical", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_MAGICAL_MACHINE_III = new SupremeItemStack(
            "SUPREME_ELECTRIC_MAGICAL_III",
            Material.CRYING_OBSIDIAN,
            "&bElectric Magical Machine III", "",
            "&fAdvanced craft resource of magical", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack CHECK_INVENTORY = new SlimefunItemStack(
            "SUPREME_CHECK_INVENTORY",
            Material.REDSTONE_LAMP,
            "&bCheckInventory", "",
            "&fChecks if the nearby chest has the filter item",
            "&fall faces are being considered (find first)",
            "&fif found, this block will light up",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(0), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE = new SupremeItemStack(
            "SUPREME_ELECTRIC_CRAFTER_I",
            Material.CRAFTING_TABLE,
            "&bElectric Crafter", "",
            "&fCraft Items", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_II = new SupremeItemStack(
            "SUPREME_ELECTRIC_CRAFTER_II",
            Material.CRAFTING_TABLE,
            "&bElectric Crafter II", "",
            "&fAdvanced Craft Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_III = new SupremeItemStack(
            "SUPREME_ELECTRIC_CRAFTER_III", Material.CRAFTING_TABLE,
            "&bElectric Crafter III", "",
            "&fAdvanced Craft Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_INGOT_MACHINE = new SupremeItemStack(
            "SUPREME_FORGE_INGOT_I",
            Material.BLAST_FURNACE,
            "&bForge Ingot", "",
            "&fThis machine allows you to", "&fforge ingot resources.", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_INGOT_MACHINE_II = new SupremeItemStack(
            "SUPREME_FORGE_INGOT_II",
            Material.BLAST_FURNACE,
            "&bForge Ingot II", "",
            "&fThis machine allows you to", "&fforge ingot resources.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            LoreBuilder.powerBuffer(5000),
            LoreBuilder.powerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_INGOT_MACHINE_III = new SupremeItemStack(
            "SUPREME_FORGE_INGOT_III",
            Material.BLAST_FURNACE,
            "&bForge Ingot III", "",
            "&fThis machine allows you to", "&fforge ingot resources.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            LoreBuilder.powerBuffer(15000),
            LoreBuilder.powerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_MAGICAL_MACHINE = new SupremeItemStack(
            "SUPREME_FORGE_MAGICAL_I",
            Material.ENCHANTING_TABLE, "&bForge Magical", "", "&fThis machine allows you to",
            "&fforge magical resources.", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_MAGICAL_MACHINE_II = new SupremeItemStack(
            "SUPREME_FORGE_MAGICAL_II",
            Material.ENCHANTING_TABLE,
            "&bForge Magical II", "",
            "&fThis machine allows you to",
            "&fforge magical resources.", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            LoreBuilder.powerBuffer(5000),
            LoreBuilder.powerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FORGE_MAGICAL_MACHINE_III = new SupremeItemStack(
            "SUPREME_FORGE_MAGICAL_III",
            Material.ENCHANTING_TABLE,
            "&bForge Magical III", "",
            "&fThis machine allows you to",
            "&fforge magical resources.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            LoreBuilder.powerBuffer(15000),
            LoreBuilder.powerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FOUNDRY_MACHINE = new SupremeItemStack(
            "SUPREME_FOUNDRY_I",
            Material.GRINDSTONE,
            "&bFoundry", "", "&fFoundry and Synthesizer Items", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(1000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FOUNDRY_MACHINE_II = new SupremeItemStack(
            "SUPREME_FOUNDRY_II",
            Material.GRINDSTONE, "&bFoundry II", "", "&fAdvanced Foundry and Synthesizer Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(5000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack FOUNDRY_MACHINE_III = new SupremeItemStack(
            "SUPREME_FOUNDRY_III",
            Material.GRINDSTONE,
            "&bFoundry III", "",
            "&fAdvanced Foundry and Synthesizer Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(15000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack ITEM_CONVERTER_MACHINE = new SupremeItemStack(
            "SUPREME_ITEM_CONVERTER_MACHINE",
            Material.CARTOGRAPHY_TABLE,
            "&bItem Converter", "",
            "&fOriginal Converter Item by ID,",
            "&frestore values of name and meta item",
            "&fconverting to a new item",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1000),
            UtilEnergy.energyPowerPerSecond(0), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SupremeItemStack(
            "SUPREME_MAGIC_ALTAR_I",
            Material.SMOKER,
            "&bMagic Altar", "",
            "&fCraft Rune and Magical Items", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            UtilEnergy.energyPowerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SupremeItemStack(
            "SUPREME_MAGIC_ALTAR_II",
            Material.SMOKER,
            "&bMagic Altar II", "",
            "&fAdvanced Craft Rune and Magical Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            UtilEnergy.energyPowerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SupremeItemStack(
            "SUPREME_MAGIC_ALTAR_III",
            Material.SMOKER,
            "&bMagic Altar III", "",
            "&fAdvanced Craft Rune and Magical Items", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            UtilEnergy.energyPowerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_COLLECTOR_MACHINE = new SupremeItemStack(
            "SUPREME_MOB_COLLECTOR_MACHINE_I",
            Material.RESPAWN_ANCHOR,
            "&bMob Collector", "",
            "&fThis machine allows you to collect ",
            "&fitems from nearby mobs. (4 block)", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_II = new SupremeItemStack(
            "SUPREME_MOB_COLLECTOR_MACHINE_II",
            Material.RESPAWN_ANCHOR,
            "&bMob Collector II", "",
            "&fThis machine allows you to collect",
            "&f items from nearby mobs. (8 block)", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            LoreBuilder.powerBuffer(5000),
            LoreBuilder.powerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_III = new SupremeItemStack(
            "SUPREME_MOB_COLLECTOR_MACHINE_III",
            Material.RESPAWN_ANCHOR,
            "&bMob Collector III", "",
            "&fThis machine allows you to collect",
            "&f items from nearby mobs. (16 block)", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            LoreBuilder.powerBuffer(15000),
            LoreBuilder.powerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack STONE_QUARRY = new SupremeItemStack(
            "SUPREME_STONE_QUARRY",
            "139ac257f4e04adc6ab3e46fd3b28749e866faa9ce6a1d6d526e0e3864d9222",
            "&eStone Quarry", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(20),
            UtilEnergy.energyBuffer(10000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack COAL_QUARRY = new SupremeItemStack(
            "SUPREME_COAL_QUARRY",
            "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04",
            "&eCoal Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(20),
            UtilEnergy.energyBuffer(10000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack IRON_QUARRY = new SupremeItemStack(
            "SUPREME_IRON_QUARRY",
            "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0",
            "&eIron Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(20),
            UtilEnergy.energyBuffer(10000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack GOLD_QUARRY = new SupremeItemStack(
            "SUPREME_GOLD_QUARRY",
            "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43",
            "&eGold Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(20),
            UtilEnergy.energyBuffer(10000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack DIAMOND_QUARRY = new SupremeItemStack(
            "SUPREME_DIAMOND_QUARRY",
            "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6",
            "&eDiamond Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(10),
            UtilEnergy.energyBuffer(1000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack THORNIUM_QUARRY = new SupremeItemStack(
            "SUPREME_THORNIUM_QUARRY",
            "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0",
            "&eThornium Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(10),
            UtilEnergy.energyBuffer(1000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack SUPREME_NUGGETS_QUARRY = new SupremeItemStack(
            "SUPREME_SUPREME_NUGGETS_QUARRY",
            "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d",
            "&eNuggets of Supreme Quarry", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            UtilEnergy.energyPowerPerItem(10),
            UtilEnergy.energyBuffer(1000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE = new SupremeItemStack(
            "SUPREME_VIRTUAL_AQUARIUM_I",
            Material.DARK_PRISMARINE,
            "&bVirtual Aquarium", "",
            "&fThis machine allows you to collect ",
            "&f items that are collected at sea.", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_II = new SupremeItemStack(
            "SUPREME_VIRTUAL_AQUARIUM_II",
            Material.DARK_PRISMARINE,
            "&bVirtual Aquarium II", "",
            "&fThis machine allows you to collect",
            "&f items that are collected at sea.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            LoreBuilder.powerBuffer(5000),
            LoreBuilder.powerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_III = new SupremeItemStack(
            "SUPREME_VIRTUAL_AQUARIUM_III",
            Material.DARK_PRISMARINE,
            "&bVirtual Aquarium III", "",
            "&fThis machine allows you to collect",
            "&f items that are collected at sea.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            LoreBuilder.powerBuffer(15000),
            LoreBuilder.powerPerSecond(300), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE = new SupremeItemStack(
            "SUPREME_VIRTUAL_GARDEN_I",
            Material.STRIPPED_WARPED_HYPHAE,
            "&bVirtual Garden", "",
            "&fThis machine allows you to",
            "&fcultivate some resources.", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE_II = new SupremeItemStack(
            "SUPREME_VIRTUAL_GARDEN_II",
            Material.STRIPPED_WARPED_HYPHAE,
            "&bVirtual Garden II", "",
            "&fThis machine allows you to",
            "&fcultivate some resources.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(5),
            LoreBuilder.powerBuffer(5000),
            LoreBuilder.powerPerSecond(100), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE_III = new SupremeItemStack(
            "SUPREME_VIRTUAL_GARDEN_III",
            Material.STRIPPED_WARPED_HYPHAE,
            "&bVirtual Garden III", "",
            "&fThis machine allows you to",
            "&fcultivate some resources.", "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(15),
            LoreBuilder.powerBuffer(15000),
            LoreBuilder.powerPerSecond(300), "",
            "&3Supreme Machine");

    // MobTech

    public static final SlimefunItemStack TECH_ROBOTIC = new SupremeItemStack(
            "SUPREME_TECH_ROBOTIC",
            Material.POLISHED_BLACKSTONE,
            "&bTech Robotic", "",
            "&fUse beginner level robots ",
            "&fto progress to higher levels",
            "&fneed 64x to upgrade", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_ROBOTIC_II = new SupremeItemStack(
            "SUPREME_TECH_ROBOTIC_II",
            Material.POLISHED_BLACKSTONE,
            "&bTech Robotic II", "",
            "&fUse beginner level robots ",
            "&fto progress to higher levels",
            "&fneed 32x to upgrade", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_ROBOTIC_III = new SupremeItemStack(
            "SUPREME_TECH_ROBOTIC_III",
            Material.POLISHED_BLACKSTONE,
            "&bTech Robotic III", "",
            "&fUse beginner level robots ",
            "&fto progress to higher levels",
            "&fneed 16x to upgrade", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_MUTATION_I = new SupremeItemStack(
            "SUPREME_TECH_MUTATION_I",
            Material.SLIME_BLOCK,
            "&bTech Mutation", "",
            "&fUse generator mutation ",
            "&fto progress to higher levels", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_MUTATION_II = new SupremeItemStack(
            "SUPREME_TECH_MUTATION_II",
            Material.SLIME_BLOCK,
            "&bTech Mutation II", "",
            "&fUse generator mutation ",
            "&fto progress to higher levels", "",
            "&fChance factor multiplied by 2x", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_MUTATION_III = new SupremeItemStack(
            "SUPREME_TECH_MUTATION_III",
            Material.SLIME_BLOCK, "&bTech Mutation III", "",
            "&fUse generator mutation ",
            "&fto progress to higher levels", "",
            "&fChance factor multiplied by 4x", "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerSecond(500), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack TECH_GENERATOR = new SupremeItemStack(
            "SUPREME_TECH_GENERATOR",
            Material.LOOM,
            "&bTech Generator", "",
            "&fUsing power and bees/golem/zombie, ",
            "&fslowly generates materials.", "",
            LoreBuilder.radioactive(Radioactivity.LOW), "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            UtilEnergy.energyPowerPerTick(2000), "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_COLLECTOR_I = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_I",
            Material.IRON_SHOVEL, false, LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 500));

    public static final SlimefunItemStack MOB_COLLECTOR_II = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_II",
            Material.DIAMOND_SHOVEL, false, LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 5000));

    public static final SlimefunItemStack MOB_COLLECTOR_III = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_III",
            Material.NETHERITE_SHOVEL, false, LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 50000));

    public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_I = new SupremeItemStack(
            "MOB_TECH_COLLECTOR_MACHINE",
            Material.NETHER_GOLD_ORE,
            "&bMobTech Collector I",
            "",
            "&fThis machine allows you to collect ",
            "&fMobTech head nearby mobs. (3 block)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20),
            "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_II = new SupremeItemStack(
            "SUPREME_MOB_TECH_COLLECTOR_MACHINE_II",
            Material.NETHER_GOLD_ORE,
            "&bMobTech Collector II",
            "",
            "&fThis machine allows you to collect ",
            "&fMobTech head nearby mobs. (6 block)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20),
            "",
            "&3Supreme Machine");

    public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_III = new SupremeItemStack(
            "SUPREME_MOB_TECH_COLLECTOR_MACHINE_III",
            Material.NETHER_GOLD_ORE,
            "&bMobTech Collector III",
            "",
            "&fThis machine allows you to collect ",
            "&fMobTech head nearby mobs. (9 block)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer(1000),
            LoreBuilder.powerPerSecond(20),
            "",
            "&3Supreme Machine");

    /**
     * MUSIC_DISC_STRAD 1 branco MUSIC_DISC_13 2 amarelo/branco MUSIC_DISC_MELLOHI 3
     * rosa/branco
     * MUSIC_DISC_FAR 4 verdeclaro MUSIC_DISC_CAT 5 verde MUSIC_DISC_WARD 6
     * verde/verdeclaro
     * MUSIC_DISC_WAIT 7 azul
     */
    // cards basicos
    public static final SlimefunItemStack CARD_STONE = new SupremeItemStack("SUPREME_CARD_STONE",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Stone", "", "&fChange to Production Stone", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_GRANITE = new SupremeItemStack("SUPREME_CARD_GRANITE",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Granite", "", "&fChange to Production Granite", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_DIORITE = new SupremeItemStack("SUPREME_CARD_DIORITE",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Diorite", "", "&fChange to Production Diorite", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ANDESITE = new SupremeItemStack("SUPREME_CARD_ANDESITE",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Andesite", "", "&fChange to Production Andesite", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_GRAVEL = new SupremeItemStack("SUPREME_CARD_GRAVEL",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Gravel", "", "&fChange to Production Gravel", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SAND = new SupremeItemStack("SUPREME_CARD_SAND",
            Material.MUSIC_DISC_STRAD,
            "&bCard Machine Sand", "", "&fChange to Production Sand", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ENDSTONE = new SupremeItemStack("SUPREME_CARD_ENDSTONE",
            Material.MUSIC_DISC_STRAD, "&bCard Machine Endstone", "", "&fChange to Production Endstone", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_CLAY = new SupremeItemStack("SUPREME_CARD_CLAY",
            Material.MUSIC_DISC_STRAD,
            "&bCard Machine Clay", "", "&fChange to Production Clay", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SNOW = new SupremeItemStack("SUPREME_CARD_SNOW",
            Material.MUSIC_DISC_STRAD,
            "&bCard Machine Snow", "", "&fChange to Production Snow", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_COAL = new SupremeItemStack("SUPREME_CARD_COAL", Material.MUSIC_DISC_13,
            "&bCard Machine Coal", "", "&fChange to Production Coal", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_IRON = new SupremeItemStack("SUPREME_CARD_IRON", Material.MUSIC_DISC_13,
            "&bCard Machine Iron", "", "&fChange to Production Iron", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_COPPER = new SupremeItemStack("SUPREME_CARD_COPPER",
            Material.MUSIC_DISC_13, "&bCard Machine Copper", "", "&fChange to Production Copper", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_GOLD = new SupremeItemStack("SUPREME_CARD_GOLD", Material.MUSIC_DISC_13,
            "&bCard Machine Gold", "", "&fChange to Production Gold", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_QUARTZ = new SupremeItemStack("SUPREME_CARD_QUARTZ",
            Material.MUSIC_DISC_13, "&bCard Machine Quartz", "", "&fChange to Production Quartz", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SupremeItemStack("SUPREME_CARD_QUARTZ_BLOCK",
            Material.MUSIC_DISC_13, "&bCard Machine Quartz Block", "", "&fChange to Production Quartz Block", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_LAPIS = new SupremeItemStack("SUPREME_CARD_LAPIS",
            Material.MUSIC_DISC_13,
            "&bCard Machine Lapiz", "", "&fChange to Production Lapiz", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_REDSTONE = new SupremeItemStack("SUPREME_CARD_REDSTONE",
            Material.MUSIC_DISC_13, "&bCard Machine Redstone", "", "&fChange to Production Redstone", "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_DIAMOND = new SupremeItemStack("SUPREME_CARD_DIAMOND",
            Material.MUSIC_DISC_FAR, "&bCard Machine Diamond", "", "&fChange to Production Diamond", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_EMERALD = new SupremeItemStack("SUPREME_CARD_EMERALD",
            Material.MUSIC_DISC_FAR, "&bCard Machine Emerald", "", "&fChange to Production Emerald", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_NETHERITE = new SupremeItemStack("SUPREME_CARD_NETHERITE",
            Material.MUSIC_DISC_FAR, "&bCard Machine Netherite", "", "&fChange to Production Netherite", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_AMETHYST = new SupremeItemStack("SUPREME_CARD_AMETHYST",
            Material.MUSIC_DISC_FAR, "&bCard Machine Ametista", "", "&fChange to Production Ametista", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_IRON_DUST = new SupremeItemStack("SUPREME_CARD_IRON_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Iron Dust", "", "&fChange to Production Iron Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_LEAD_DUST = new SupremeItemStack("SUPREME_CARD_LEAD_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Lead Dust", "", "&fChange to Production Lead Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_GOLD_DUST = new SupremeItemStack("SUPREME_CARD_GOLD_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Gold Dust", "", "&fChange to Production Gold Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_COPPER_DUST = new SupremeItemStack("SUPREME_CARD_COPPER_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Copper Dust", "", "&fChange to Production Copper Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SupremeItemStack("SUPREME_CARD_MAGNESIUM_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Magnesium Dust", "", "&fChange to Production Magnesium Dust",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SupremeItemStack("SUPREME_CARD_ALUMINUM_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Aluminum Dust", "", "&fChange to Production Aluminum Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SILVER_DUST = new SupremeItemStack("SUPREME_CARD_SILVER_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Silver Dust", "", "&fChange to Production Silver Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_TIN_DUST = new SupremeItemStack("SUPREME_CARD_TIN_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Tin Dust", "", "&fChange to Production Tin Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ZINC_DUST = new SupremeItemStack("SUPREME_CARD_ZINC_DUST",
            Material.MUSIC_DISC_MELLOHI, "&bCard Machine Zinc Dust", "", "&fChange to Production Zinc Dust", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    /*
     * MUSIC_DISC_BLOCKS 8 laranja MUSIC_DISC_CHIRP 9 vemelho MUSIC_DISC_MALL 10
     * roxo MUSIC_DISC_STAL 11 preto
     */

    public static final SlimefunItemStack CARD_SOLDER_INGOT = new SupremeItemStack("SUPREME_CARD_SOLDER",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Solder Ingot", "", "&fChange to Production Solder Ingot", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_BILLON_INGOT = new SupremeItemStack("SUPREME_CARD_BILLON",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Billon Ingot", "", "&fChange to Production Billon Ingot", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_BRONZE_INGOT = new SupremeItemStack("SUPREME_CARD_BRONZE",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Bronze Ingot", "", "&fChange to Production Bronze Ingot", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_BRASS_INGOT = new SupremeItemStack("SUPREME_CARD_BRASS",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Brass Ingot", "", "&fChange to Production Brass Ingot", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SULFATE = new SupremeItemStack("SUPREME_CARD_SULFATE",
            Material.MUSIC_DISC_BLOCKS, "&bCard de Sulfate", "", "&fChange to Production Sulfate", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_CARBON = new SupremeItemStack("SUPREME_CARD_CARBON",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Carbon", "", "&fChange to Production Carbon", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SILICON = new SupremeItemStack("SUPREME_CARD_SILICON",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Silicon", "", "&fChange to Production Silicon", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_STEEL = new SupremeItemStack("SUPREME_CARD_STEEL",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Steel", "", "&fChange to Production Steel", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_NICKEL = new SupremeItemStack("SUPREME_CARD_NICKEL",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Nickel", "", "&fChange to Production Nickel", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_FERROSILICON = new SupremeItemStack("SUPREME_CARD_FERROSILICON",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Ferrosilicon", "", "&fChange to Production Ferrosilicon", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_DAMASCUS = new SupremeItemStack("SUPREME_CARD_DAMASCUS",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Damascus", "", "&fChange to Production Damascus", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_COBALT = new SupremeItemStack("SUPREME_CARD_COBALT",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Cobalt", "", "&fChange to Production Cobalt", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_DURALUMIN_INGOT = new SupremeItemStack("SUPREME_CARD_DURALUMIN",
            Material.MUSIC_DISC_BLOCKS, "&bCard Machine Duralumin Ingot", "", "&fChange to Production Duralumin Ingot",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ALUMINUM_BRONZE_INGOT = new SupremeItemStack(
            "SUPREME_CARD_ALUMINUM_BRONZE", Material.MUSIC_DISC_CHIRP, "&bCard Machine Aluminum Bronze Ingot", "",
            "&fChange to Production Aluminum Bronze Ingot", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ALUMINUM_BRASS_INGOT = new SupremeItemStack(
            "SUPREME_CARD_ALUMINUM_BRASS",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Aluminum Brass Ingot", "",
            "&fChange to Production Aluminum Brass Ingot", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_CORINTHIAN_BRONZE_INGOT = new SupremeItemStack(
            "SUPREME_CARD_CORINTHIAN_BRONZE", Material.MUSIC_DISC_CHIRP, "&bCard Machine Corinthian Bronze Ingot", "",
            "&fChange to Production Corinthian Bronze Ingot", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_GOLD24K = new SupremeItemStack("SUPREME_CARD_GOLD24K",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Gold 24k", "", "&fChange to Production Gold 24k", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_CARBON_PRESS = new SupremeItemStack("SUPREME_CARD_CARBON_PRESS",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Compressed Carbon", "",
            "&fChange to Production Compressed Carbon", "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_HARDENED_METAL_INGOT = new SupremeItemStack(
            "SUPREME_CARD_HARDENED_METAL",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Hardened Metal Ingot", "",
            "&fChange to Production Hardened Metal Ingot", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_REDSTONE_ALLOY = new SupremeItemStack("SUPREME_CARD_REDSTONE_ALLOY",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Redstone Alloy", "", "&fChange to Production Redstone Alloy", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_PLASTIC_SHEET = new SupremeItemStack("SUPREME_CARD_PLASTIC_SHEET",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Plastic Sheet", "", "&fChange to Production Plastic Sheet", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_BATTERY = new SupremeItemStack("SUPREME_CARD_BATTERY",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Battery", "", "&fChange to Production Battery", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_MAGNET = new SupremeItemStack("SUPREME_CARD_MAGNET",
            Material.MUSIC_DISC_CHIRP, "&bCard Machine Magnet", "", "&fChange to Production Magnet", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ELECTRO_MAGNET = new SupremeItemStack("SUPREME_CARD_ELECTRO_MAGNET",
            Material.MUSIC_DISC_MALL, "&bCard Machine Electro Magnet", "", "&fChange to Production Electro Magnet", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_ELECTRIC_MOTOR = new SupremeItemStack("SUPREME_CARD_ELECTRIC_MOTOR",
            Material.MUSIC_DISC_MALL, "&bCard Machine Electric Motor", "", "&fChange to Production Electric Motor", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_HEATING_COIL = new SupremeItemStack("SUPREME_CARD_HEATING_COIL",
            Material.MUSIC_DISC_MALL, "&bCard Machine Heating Coil", "", "&fChange to Production Heating Coil", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SYNTHETIC_SAPPHIRE = new SupremeItemStack(
            "SUPREME_CARD_SYNTHETIC_SAPPHIRE", Material.MUSIC_DISC_MALL, "&bCard Machine Synthetic Sapphire", "",
            "&fChange to Production Synthetic Sapphire", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SYNTHETIC_EMERALD = new SupremeItemStack(
            "SUPREME_CARD_SYNTHETIC_EMERALD",
            Material.MUSIC_DISC_MALL, "&bCard Machine Synthetic Emerald", "",
            "&fChange to Production Synthetic Emerald", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_SYNTHETIC_DIAMOND = new SupremeItemStack(
            "SUPREME_CARD_SYNTHETIC_DIAMOND",
            Material.MUSIC_DISC_MALL, "&bCard Machine Synthetic Diamond", "",
            "&fChange to Production Synthetic Diamond", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_CARBONADO = new SupremeItemStack("SUPREME_CARD_CARBONADO",
            Material.MUSIC_DISC_STAL, "&bCard Machine Carbonado", "", "&fChange to Production Carbonado", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_REINFORCED_ALLOY_INGOT = new SupremeItemStack(
            "SUPREME_CARD_REINFORCED_ALLOY", Material.MUSIC_DISC_STAL, "&bCard Machine Reinforced Alloy Ingot", "",
            "&fChange to Production Reinforced Alloy Ingot", "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");

    // Tools

    public static final SlimefunItemStack ADAMANTIUM_AXE = new SupremeItemStack("SUPREME_ADAMANTIUM_AXE",
            Material.DIAMOND_AXE);

    public static final SlimefunItemStack ADAMANTIUM_PICKAXE = new SupremeItemStack("SUPREME_ADAMANTIUM_PICKAXE",
            Material.DIAMOND_PICKAXE);

    public static final SlimefunItemStack ADAMANTIUM_SHOVEL = new SupremeItemStack("SUPREME_ADAMANTIUM_SHOVEL",
            Material.DIAMOND_SHOVEL);

    public static final SlimefunItemStack AURUM_AXE = new SupremeItemStack("SUPREME_AURUM_AXE", Material.DIAMOND_AXE);

    public static final SlimefunItemStack AURUM_PICKAXE = new SupremeItemStack("SUPREME_AURUM_PICKAXE",
            Material.DIAMOND_PICKAXE);

    public static final SlimefunItemStack AURUM_SHOVEL = new SupremeItemStack("SUPREME_AURUM_SHOVEL",
            Material.DIAMOND_SHOVEL);

    public static final SlimefunItemStack TITANIUM_AXE = new SupremeItemStack("SUPREME_TITANIUM_AXE",
            Material.DIAMOND_AXE);

    public static final SlimefunItemStack TITANIUM_PICKAXE = new SupremeItemStack("SUPREME_TITANIUM_PICKAXE",
            Material.DIAMOND_PICKAXE);

    public static final SlimefunItemStack TITANIUM_SHOVEL = new SupremeItemStack("SUPREME_TITANIUM_SHOVEL",
            Material.DIAMOND_SHOVEL);

    public static final SlimefunItemStack THORNIUM_AXE = new SupremeItemStack("SUPREME_AXE_THORNIUM",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_AXE_MAGIC = new SupremeItemStack("SUPREME_AXE_MAGIC",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_AXE_RARE = new SupremeItemStack("SUPREME_AXE_RARE",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_AXE_EPIC = new SupremeItemStack("SUPREME_AXE_EPIC",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_AXE_LEGENDARY = new SupremeItemStack("SUPREME_AXE_LEGENDARY",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_AXE_SUPREME = new SupremeItemStack("SUPREME_AXE_SUPREME",
            Material.NETHERITE_AXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE = new SupremeItemStack("SUPREME_PICKAXE_THORNIUM",
            Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE_MAGIC = new SupremeItemStack("SUPREME_PICKAXE_MAGIC",
            Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE_RARE = new SupremeItemStack("SUPREME_PICKAXE_RARE",
            Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE_EPIC = new SupremeItemStack("SUPREME_PICKAXE_EPIC",
            Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE_LEGENDARY = new SupremeItemStack(
            "SUPREME_PICKAXE_LEGENDARY", Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_PICKAXE_SUPREME = new SupremeItemStack("SUPREME_PICKAXE_SUPREME",
            Material.NETHERITE_PICKAXE);

    public static final SlimefunItemStack THORNIUM_SHOVEL = new SupremeItemStack("SUPREME_SHOVEL_THORNIUM",
            Material.NETHERITE_SHOVEL);

    public static final SlimefunItemStack THORNIUM_SHOVEL_MAGIC = new SupremeItemStack("SUPREME_SHOVEL_MAGIC",
            Material.NETHERITE_SHOVEL);

    public static final SlimefunItemStack THORNIUM_SHOVEL_RARE = new SupremeItemStack("SUPREME_SHOVEL_RARE",
            Material.NETHERITE_SHOVEL);

    public static final SlimefunItemStack THORNIUM_SHOVEL_EPIC = new SupremeItemStack("SUPREME_SHOVEL_EPIC",
            Material.NETHERITE_SHOVEL);

    public static final SlimefunItemStack THORNIUM_SHOVEL_LEGENDARY = new SupremeItemStack(
            "SUPREME_SHOVEL_LEGENDARY", Material.NETHERITE_SHOVEL);

    public static final SlimefunItemStack THORNIUM_SHOVEL_SUPREME = new SupremeItemStack("SUPREME_SHOVEL_SUPREME",
            Material.NETHERITE_SHOVEL);

    // Weapons

    public static final SlimefunItemStack ADAMANTIUM_SWORD = new SupremeItemStack("SUPREME_ADAMANTIUM_SWORD",
            Material.DIAMOND_SWORD);

    public static final SlimefunItemStack AURUM_SWORD = new SupremeItemStack("SUPREME_AURUM_SWORD",
            Material.DIAMOND_SWORD);

    public static final SlimefunItemStack TITANIUM_SWORD = new SupremeItemStack("SUPREME_TITANIUM_SWORD",
            Material.DIAMOND_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD = new SupremeItemStack("SUPREME_SWORD_THORNIUM",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD_MAGIC = new SupremeItemStack("SUPREME_SWORD_MAGIC",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD_RARE = new SupremeItemStack("SUPREME_SWORD_RARE",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD_EPIC = new SupremeItemStack("SUPREME_SWORD_EPIC",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY = new SupremeItemStack("SUPREME_SWORD_LEGENDARY",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SWORD_SUPREME = new SupremeItemStack("SUPREME_SWORD_SUPREME",
            Material.NETHERITE_SWORD);

    public static final SlimefunItemStack THORNIUM_SHIELD = new SupremeItemStack("SUPREME_SHIELD_THORNIUM",
            Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC = new SupremeItemStack("SUPREME_SHIELD_MAGIC",
            Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_SHIELD_RARE = new SupremeItemStack("SUPREME_SHIELD_RARE",
            Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_SHIELD_EPIC = new SupremeItemStack("SUPREME_SHIELD_EPIC",
            Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY = new SupremeItemStack(
            "SUPREME_SHIELD_LEGENDARY", Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME = new SupremeItemStack("SUPREME_SHIELD_SUPREME",
            Material.SHIELD);

    public static final SlimefunItemStack THORNIUM_BOW = new SupremeItemStack("SUPREME_BOW_THORNIUM", Material.BOW);

    public static final SlimefunItemStack THORNIUM_BOW_MAGIC = new SupremeItemStack("SUPREME_BOW_MAGIC", Material.BOW);

    public static final SlimefunItemStack THORNIUM_BOW_RARE = new SupremeItemStack("SUPREME_BOW_RARE", Material.BOW);

    public static final SlimefunItemStack THORNIUM_BOW_EPIC = new SupremeItemStack("SUPREME_BOW_EPIC", Material.BOW);

    public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY = new SupremeItemStack("SUPREME_BOW_LEGENDARY",
            Material.BOW);

    public static final SlimefunItemStack THORNIUM_BOW_SUPREME = new SupremeItemStack("SUPREME_BOW_SUPREME",
            Material.BOW);

    // Armor

    public static final SlimefunItemStack ADAMANTIUM_HELMET = new SupremeItemStack("SUPREME_ADAMANTIUM_HELMET",
            Material.DIAMOND_HELMET);

    public static final SlimefunItemStack ADAMANTIUM_CHESTPLATE = new SupremeItemStack(
            "SUPREME_ADAMANTIUM_CHESTPLATE", Material.DIAMOND_CHESTPLATE);

    public static final SlimefunItemStack ADAMANTIUM_LEGGINGS = new SupremeItemStack("SUPREME_ADAMANTIUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS);

    public static final SlimefunItemStack ADAMANTIUM_BOOTS = new SupremeItemStack("SUPREME_ADAMANTIUM_BOOTS",
            Material.DIAMOND_BOOTS, "&f&lAdamantium Boots", "&f&lA Boots of Adamantium", "",
            "&3Supreme Armor");

    public static final SlimefunItemStack AURUM_HELMET = new SupremeItemStack("SUPREME_AURUM_HELMET",
            Material.DIAMOND_HELMET);

    public static final SlimefunItemStack AURUM_CHESTPLATE = new SupremeItemStack("SUPREME_AURUM_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE);

    public static final SlimefunItemStack AURUM_LEGGINGS = new SupremeItemStack("SUPREME_AURUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS);

    public static final SlimefunItemStack AURUM_BOOTS = new SupremeItemStack("SUPREME_AURUM_BOOTS",
            Material.DIAMOND_BOOTS);

    public static final SlimefunItemStack TITANIUM_HELMET = new SupremeItemStack("SUPREME_TITANIUM_HELMET",
            Material.DIAMOND_HELMET);

    public static final SlimefunItemStack TITANIUM_CHESTPLATE = new SupremeItemStack("SUPREME_TITANIUM_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE);

    public static final SlimefunItemStack TITANIUM_LEGGINGS = new SupremeItemStack("SUPREME_TITANIUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS);

    public static final SlimefunItemStack TITANIUM_BOOTS = new SupremeItemStack("SUPREME_TITANIUM_BOOTS",
            Material.DIAMOND_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET = new SupremeItemStack("SUPREME_HELMET_THORNIUM",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE = new SupremeItemStack("SUPREME_CHESTPLATE_THORNIUM",
            Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS = new SupremeItemStack("SUPREME_LEGGINGS_THORNIUM",
            Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS = new SupremeItemStack("SUPREME_BOOTS_THORNIUM",
            Material.NETHERITE_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET_MAGIC = new SupremeItemStack("SUPREME_HELMET_MAGIC",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_MAGIC = new SupremeItemStack(
            "SUPREME_CHESTPLATE_MAGIC", Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS_MAGIC = new SupremeItemStack("SUPREME_LEGGINGS_MAGIC",
            Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS_MAGIC = new SupremeItemStack("SUPREME_BOOTS_MAGIC",
            Material.NETHERITE_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET_RARE = new SupremeItemStack("SUPREME_HELMET_RARE",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_RARE = new SupremeItemStack("SUPREME_CHESTPLATE_RARE",
            Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS_RARE = new SupremeItemStack("SUPREME_LEGGINGS_RARE",
            Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS_RARE = new SupremeItemStack("SUPREME_BOOTS_RARE",
            Material.NETHERITE_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET_EPIC = new SupremeItemStack("SUPREME_HELMET_EPIC",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_EPIC = new SupremeItemStack("SUPREME_CHESTPLATE_EPIC",
            Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS_EPIC = new SupremeItemStack("SUPREME_LEGGINGS_EPIC",
            Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS_EPIC = new SupremeItemStack("SUPREME_BOOTS_EPIC",
            Material.NETHERITE_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET_LEGENDARY = new SupremeItemStack(
            "SUPREME_HELMET_LEGENDARY",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_LEGENDARY = new SupremeItemStack(
            "SUPREME_CHESTPLATE_LEGENDARY", Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS_LEGENDARY = new SupremeItemStack(
            "SUPREME_LEGGINGS_LEGENDARY", Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS_LEGENDARY = new SupremeItemStack("SUPREME_BOOTS_LEGENDARY",
            Material.NETHERITE_BOOTS);

    public static final SlimefunItemStack THORNIUM_HELMET_SUPREME = new SupremeItemStack("SUPREME_HELMET_SUPREME",
            Material.NETHERITE_HELMET);

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_SUPREME = new SupremeItemStack(
            "SUPREME_CHESTPLATE_SUPREME", Material.NETHERITE_CHESTPLATE);

    public static final SlimefunItemStack THORNIUM_LEGGINGS_SUPREME = new SupremeItemStack(
            "SUPREME_LEGGINGS_SUPREME", Material.NETHERITE_LEGGINGS);

    public static final SlimefunItemStack THORNIUM_BOOTS_SUPREME = new SupremeItemStack("SUPREME_BOOTS_SUPREME",
            Material.NETHERITE_BOOTS);

}
