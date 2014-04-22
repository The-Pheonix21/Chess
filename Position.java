class Position {
	
	private int x;
	private int y;

	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int x() {
		return this.x;
	}

	public int y() {
		return this.y;
	}

	public void setX(int n) {
		this.x = n;
	}

	public void setY(int n) {
		this.y = n;
	}

	public boolean equals(Position p) {
		return p.x() = this.x && p.y() = this.y
	}

}
