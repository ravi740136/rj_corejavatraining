package corejavatraining.streampipeline.io;

public class LowercaseFileReader extends BaseFileReader{

	public LowercaseFileReader(String filepath) {
		super(filepath);
	}

	@Override
	protected String processLines(String s) {
		// TODO Auto-generated method stub
		return s+" "+s;
	}
}
