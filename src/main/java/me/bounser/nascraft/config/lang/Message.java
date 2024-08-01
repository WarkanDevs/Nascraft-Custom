package me.bounser.nascraft.config.lang;

public enum Message {

    // GENERAL

    CURRENCY,
    SEPARATOR,

    BUY_MESSAGE,
    SELL_MESSAGE,

    PRICE,
    MATERIAL,
    DEFAULT_ITEM_FORMAT,
    DEFAULT_CATEGORY_FORMAT,

    NOT_ENOUGH_MONEY,
    NOT_ENOUGH_ITEMS,
    NOT_ENOUGH_SPACE,
    SHOP_CLOSED,

    // ERRORS

    NO_PERMISSION,
    WRONG_MATERIAL,
    WRONG_NUMBER_FORMAT,

    // COMMANDS

    CLICK_TO_CONFIRM,
    LIST_SEGMENT,

    // - SELL
    SELL_TITLE,
    SELL_CLOSE,
    SELL_BUTTON_NAME,
    SELL_BUTTON_LORE,
    SELL_REMOVE_ITEM,
    SELL_ACTION_MESSAGE,
    SELL_ITEM_NOT_ALLOWED,
    SELL_FULL,
    SELL_HELP_TITLE,
    SELL_HELP_LORE,

    // - SELLALL

    SELLALL_EVERYTHING_ERROR,
    SELLALL,
    SELLALL_ERROR_WITHOUT_ITEM,
    SELLALL_ERROR_WRONG_MATERIAL,
    SELLALL_ESTIMATED_VALUE,

    // - SELLHAND

    SELLHAND_INVALID,
    SELLHAND_ERROR_HAND,
    SELLHAND_ESTIMATED_VALUE,

    // - SELLWAND

    SELLWAND_ESTIMATED_VALUE,
    SELLWAND_SOLD,
    SELLWAND_SOLD_WITH_MULTIPLIER,
    SELLWAND_RAN_OUT,
    SELLWAND_NOTHING_TO_SELL,
    SELLWAND_COOLDOWN,
    SELLWAND_MINUTES,
    SELLWAND_SECONDS,
    SELLWAND_TOO_MUCH,

    // - ALERT

    ALERT_INVALID_USE,
    ALERT_NOT_LINKED,
    ALERT_IN_WATCHLIST,
    ALERT_INVALID_PRICE,
    ALERT_NOT_RECOGNIZED,
    ALERT_SETUP,

    // - ALERTS

    ALERTS_HEADER,
    ALERTS_LIST_SEGMENT,
    ALERTS_EMPTY,

    // LINK COMMAND

    LINK_ALREADY_LINKED,
    LINK_WRONG_USE,
    LINK_WRONG_FORMAT,
    LINK_NO_PROCESS_FOUND,
    LINK_SUCCESS,
    LINK_UNLINKED,
    LINK_DIRECT_MESSAGE,

    // DISCORD COMMAND

    DISCORDCMD_NOT_LINKED,
    DISCORDCMD_LINKED,

    // DISCORD INVENTORY

    DISINV_TITLE,
    DISINV_CANT_AFFORD_EXPANSION,
    DISINV_LOCKED_TITLE,
    DISINV_LOCKED_LORE,
    DISINV_INFO_TITLE,
    DISINV_INFO_LORE,
    DISINV_AMOUNT,
    DISINV_NO_SPACE,
    DISINV_INVALID,

    // DISCORD

    DISCORD_STATUS,

    DISCORD_LOG_TRADE_LINKED,
    DISCORD_LOG_TRADE_NOT_LINKED,
    DISCORD_LOG_BUY,
    DISCORD_LOG_SELL,
    DISCORD_LOG_LINKED,
    DISCORD_LOG_UNLINKED,


    DISCORD_MAIN_TITLE,
    DISCORD_MAIN_FOOTER,

    DISCORD_TOP_GAINERS,
    DISCORD_MOST_POPULAR,
    DISCORD_BIG_DIPPERS,

    DISCORD_BUY,
    DISCORD_SELL,
    DISCORD_OUTDATED,
    DISCORD_DAY_HIGH,
    DISCORD_DAY_LOW,
    DISCORD_HISTORICAL_HIGH,
    DISCORD_DAILY_VOLUME,
    DISCORD_POSITION,
    DISCORD_TREND,
    DISCORD_INVENTORY_VALUE,
    DISCORD_BUY_SLOT,
    DISCORD_SELL_ALL,
    DISCORD_CONFIRM,

    DISCORD_MARKET_PAUSED,

    DISCORD_DETAILED_GRAPH_OF,
    DISCORD_1_DAY,
    DISCORD_1_MONTH,
    DISCORD_1_YEAR,
    DISCORD_ALL,

    DISCORD_CPI_EVOLUTION,
    DISCORD_COMPARE_CPI,
    DISCORD_FLOWS,

    DISCORD_MATERIAL_TO_COMPARE,
    DISCORD_COMPARISON_TITLE,
    DISCORD_COMPARISON_LABEL,

    DISCORD_CPI_Y,
    DISCORD_CPI,
    DISCORD_CPI_VS_ITEM,
    DISCORD_FLOW_Y_1,
    DISCORD_FLOW_Y_2,
    DISCORD_FLOW_LEGEND_1,
    DISCORD_FLOW_LEGEND_2,

    DISCORD_ADVANCED_TOOLS,
    DISCORD_ADVANCED_GRAPHS,

    DISCORD_GRAPH_Y_LEFT,
    DISCORD_GRAPH_Y_RIGHT,

    DISCORD_BUTTON_1,
    DISCORD_BUTTON_2,
    DISCORD_BUTTON_3,
    DISCORD_BUTTON_4,
    DISCORD_BUTTON_5,
    DISCORD_BUTTON_6,
    DISCORD_BUTTON_7,

    DISCORD_WIKI,
    DISCORD_WIKI_1,
    DISCORD_WIKI_2,
    DISCORD_WIKI_3,
    DISCORD_WIKI_4,
    DISCORD_WIKI_5,
    DISCORD_WIKI_6,

    DISCORD_WIKI_INVENTORY,
    DISCORD_WIKI_BALANCE,
    DISCORD_WIKI_ALERTS,
    DISCORD_WIKI_DYNAMIC,
    DISCORD_WIKI_SESSIONS,
    DISCORD_WIKI_BROKERS,


    DISCORD_NOT_LINKED_SHORT,
    DISCORD_NOT_LINKED,
    DISCORD_INSUFFICIENT_BALANCE,
    DISCORD_WITHOUT_SPACE,

    DISCORD_ALERT_NAME,
    DISCORD_ALERTS_NAME,
    DISCORD_NO_ALERTS_SETUP,
    DISCORD_ALERT_HEADER,
    DISCORD_ALERT_SEGMENT,
    DISCORD_ADD_ALERT_BUTTON,
    DISCORD_REMOVE_ALERT_BUTTON,
    DISCORD_ADD_ALERT_ARGUMENT_MATERIAL,
    DISCORD_ADD_ALERT_ARGUMENT_PRICE,
    DISCORD_CREATE_ALERT,
    DISCORD_ALERT_AT_PRICE,
    DISCORD_ALERT_REMOVE_SELECT,
    DISCORD_ALERT_INVALID_MATERIAL,
    DISCORD_ALERT_INVALID_PRICE,
    DISCORD_ALERT_SUCCESS,
    DISCORD_ALERT_LIMIT_REACHED,
    DISCORD_ALERT_REACHED_SEGMENT,
    DISCORD_ALERT_ALREADY_LISTED,
    DISCORD_ALERT_NOT_IN_WATCHLIST,
    DISCORD_ALERT_REMOVED,

    DISCORD_LINK_DISCORDSRV,
    DISCORD_LINK_NATIVE,
    DISCORD_LINK_DISCORDSRV_EXTENSIVE,
    DISCORD_LINK_DISCORDSRV_ALREADY,
    DISCORD_LINK_NATIVE_EXTENSIVE,
    DISCORD_LINK_NATIVE_ALREADY,
    DISCORD_UNLINK_BUTTON,
    DISCORD_UNLINKED,
    DISCORD_ALREADY_UNLINKED,

    DISCORD_MARKET_CLOSED,

    DISCORD_SOLD_EVERYTHING,

    DISCORD_BUY_FEEDBACK,
    DISCORD_BUY_MORE_FEEDBACK,

    DISCORD_NOT_ENOUGH_ITEMS,

    DISCORD_SELL_FEEDBACK,
    DISCORD_SELL_MORE_FEEDBACK,

    DISCORD_NOT_ENOUGH_SLOT,
    DISCORD_ALREADY_MAX_SLOTS,
    DISCORD_SLOT_BOUGHT,
    DISCORD_TRADE_HISTORY_TITLE,

    DISCORD_BALANCE_TITLE,
    DISCORD_BALANCE_REPORT,
    DISCORD_PURSE,
    DISCORD_INVENTORY,

    DISCORD_MATERIAL_TO_OPERATE,
    DISCORD_MATERIAL_NOT_RECOGNIZED,

    DISCORD_NOT_ALLOWED_COMMAND,

    // ADVANCEDGUI

    ADVANCEDGUI_TITLE,
    ADVANCEDGUI_TOP_MOVERS,
    ADVANCEDGUI_SUBTOP,
    ADVANCEDGUI_BUY,
    ADVANCEDGUI_SELL,
    ADVANCEDGUI_PRICE,
    ADVANCEDGUI_AMOUNT_SELECTION,
    ADVANCEDGUI_TREND,


    MARKET_CMD_INVALID_USE,
    MARKET_CMD_INVALID_QUANTITY,
    MARKET_CMD_MAX_QUANTITY_REACHED,
    MARKET_CMD_INVALID_IDENTIFIER,
    MARKET_CMD_INVALID_OPTION,
    MARKET_CMD_INVALID_CATEGORY,

    GUI_MAIN_MENU_TITLE,

    GUI_ALERTS_NAME_LINKED,
    GUI_ALERTS_NAME_NOT_LINKED,
    GUI_ALERTS_LORE_LINKED,
    GUI_ALERTS_LORE_NOT_LINKED,

    GUI_INFORMATION_NAME,
    GUI_INFORMATION_LORE,

    GUI_DISCORD_NAME_LINKED,
    GUI_DISCORD_NAME_NOT_LINKED,
    GUI_DISCORD_LORE_LINKED,
    GUI_DISCORD_LORE_NOT_LINKED,

    GUI_FILLERS_NAME,

    GUI_CATEGORIES_LORE_SEGMENT,

    GUI_CATEGORY_BACK_NAME,

    GUI_CATEGORY_ITEM_LORE,
    GUI_POSITIVE_CHANGE,
    GUI_NO_CHANGE,
    GUI_NEGATIVE_CHANGE,

    GUI_BUYSELL_ITEM_LORE,
    GUI_BUYSELL_ALERTS_NAME_LINKED,
    GUI_BUYSELL_ALERTS_NAME_SETUP,
    GUI_BUYSELL_ALERTS_NAME_NOT_LINKED,
    GUI_BUYSELL_ALERTS_LORE_LINKED,
    GUI_BUYSELL_ALERTS_LORE_SETUP,
    GUI_BUYSELL_ALERTS_LORE_NOT_LINKED,
    GUI_BUYSELL_INFO_NAME,
    GUI_BUYSELL_INFO_LORE,

    GUI_BUYSELL_BUY_BUTTONS_NAME,
    GUI_BUYSELL_BUY_BUTTONS_LORE,

    GUI_BUYSELL_SELL_BUTTONS_NAME,
    GUI_BUYSELL_SELL_BUTTONS_LORE,

    GUI_ALERTS_TITLE,
    GUI_ALERTS_LORE,
    GUI_ALERTS_BACK_NAME,

    ANVIL_ALERT_TITLE,
    ANVIL_ALERT_TEXT,
    ANVIL_ALERT_INVALID_PRICE,
    ANVIL_ALERT_INVALID,
    ANVIL_ALERT_LIMIT_REACHED,
    ANVIL_ALERT_REPEATED,

}
