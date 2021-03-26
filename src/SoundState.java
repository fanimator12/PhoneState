public class SoundState implements AlertState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new SoundState());
  }

  @Override public String alert()
  {
    return "DRIIIING";
  }
}
