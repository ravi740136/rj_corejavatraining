package corejavatraining.streampipeline.io;

public class UppercaseFileReader extends BaseFileReader{

	public UppercaseFileReader(String filepath) {
		super(filepath);
	}

	@Override
	protected String processLines(String s) {
		// TODO Auto-generated method stub
		return s.toUpperCase();
	}
}
