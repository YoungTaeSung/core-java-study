package java5.enhanced.enumtype;

public enum PolyOptions {
	LOW {
		@Override
		void doOperation() {	
		}
	},
	MIDDLE {
		@Override
		void doOperation() {
		}
	},
	HIGH {
		@Override
		void doOperation() {
		}
	};
	abstract void doOperation();
}
