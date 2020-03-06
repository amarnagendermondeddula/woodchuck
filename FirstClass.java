import java.util.logging.Logger;
import java.util.logging.Level;

/*
 *  Author: AmarNagenderMondeddula
 *
 *  Story line:
 *  Marine private 1st Class "WoodChuck String Logger"
 *  tries something different and becomes a programmer
 *  A lover of poems and a poet at heart
 *  tries something that rhymes, something in art
 *  Due for retirement, in one final act
 *  he does recursion, a first class act.
 */
final class FirstClass {

	private class Act {

		int veryFewChucks = 0;
		int manyManychucks = 10;
		String _woodChuck = "chucks wood ";
		String _chucksWood = "wood chuck ";

		private Logger woodChuck = Logger.getLogger("FirstClass");

		private Act() {
			this.woodChuck(_chucksWood);
		}

		String woodChuck(String chucksWood) {
			chucksWood += (veryFewChucks % 2 == 0) ? this._woodChuck : this._chucksWood;

			this.woodChuck.log(Level.SEVERE, chucksWood);

			while (veryFewChucks++ < manyManychucks) {
				this.woodChuck(chucksWood);
			}
			return chucksWood;
		}
	}

	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		Act act = firstClass.new Act();
	}
}