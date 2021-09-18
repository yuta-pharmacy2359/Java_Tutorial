package pass;

class Object {}
class BasicStat extends Object {}
class Stat extends BasicStat {}
class AdvancedStat extends Stat {}

public class Pass20_3 {
	BasicStat bs = new AdvancedStat();
	// Stat st = new BasicStat();　コンパイルエラー
	Object obj = new AdvancedStat();
	// AdvancedStat as = new Object();　コンパイルエラー
	// if(var instanceof AdvancedStat) Stat st = var;　OK
	// if(var instanceof BasicStat) Stat st = var;　エラー
}
