package play.modules.ebean;

import com.avaje.ebean.enhance.agent.ClassBytesReader;
import com.avaje.ebean.enhance.agent.Transformer;
import com.avaje.ebean.enhance.asm.ClassWriter;

import java.util.Set;

public class PlayAwareTransformer extends Transformer {

  
  public PlayAwareTransformer(ClassBytesReader r, String agentArgs)
  {
    super(r, agentArgs, (Set)null);
  }

}
