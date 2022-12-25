package play.modules.ebean;

import com.avaje.ebean.event.BeanPostLoad;

/**
 * Since module version 1.0.7?? :)
 *
 * Ebean 6.3.1 moved <code>{@link com.avaje.ebean.event.BeanPersistController}.postLoad()</code> to it's own {@link BeanPostLoad} interface
 * See: https://github.com/ebean-orm/ebean/issues/363
 */
public class EbeanPostLoader implements BeanPostLoad {
  @Override
  public boolean isRegisterFor(Class<?> cls) {
    return EbeanSupport.class.isAssignableFrom(cls);
  }

  @Override
  public void postLoad(Object bean) {
    ((EbeanSupport) bean).afterLoad();
  }

}
