package androidversioninfo;

public class AndVerinfo {
		private String alpahBet;
		private String versionNameEng;
		private String versionNameKor;
		private double version;
		private int year;
		
		public AndVerinfo() {
			super();
		}

		public AndVerinfo(String alpahBet, String versionNameEng, String versionNameKor, double version, int year) {
			super();
			this.alpahBet = alpahBet;
			this.versionNameEng = versionNameEng;
			this.versionNameKor = versionNameKor;
			this.version = version;
			this.year = year;
		}

		public String getAlpahBet() {
			return alpahBet;
		}

		public void setAlpahBet(String alpahBet) {
			this.alpahBet = alpahBet;
		}

		public String getVersionNameEng() {
			return versionNameEng;
		}

		public void setVersionNameEng(String versionNameEng) {
			this.versionNameEng = versionNameEng;
		}

		public String getVersionNameKor() {
			return versionNameKor;
		}

		public void setVersionNameKor(String versionNameKor) {
			this.versionNameKor = versionNameKor;
		}

		public double getVersion() {
			return version;
		}

		public void setVersion(double version) {
			this.version = version;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
}
