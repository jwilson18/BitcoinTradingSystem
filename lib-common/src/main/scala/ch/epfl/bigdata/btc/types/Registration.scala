package ch.epfl.bigdata.btc.types

import ch.epfl.bigdata.btc.types.Market._

object Registration {
	case class MarketPairRegistrationOHLC(market: Market, c: CurrencyPair, tickSize: Int, tickCount: Int)
	case class MarketPairRegistrationTransaction(market: Market, c: CurrencyPair)
	case class TwitterRegistrationFull()
	
	case class MarketPair(market: Market, c: CurrencyPair)
}