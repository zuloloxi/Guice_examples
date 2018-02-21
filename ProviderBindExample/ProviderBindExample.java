//package Test;
import com.google.inject.*;
import com.google.inject.name.*;

public class ProviderBindExample {
  public static class ProvModule extends AbstractModule {

    @Override
    protected void configure() {
      bind(Foo.class).toProvider(FooProvider.class);
      bind(Foo.class).annotatedWith(Names.named("singleton"))
          .toProvider(FooProvider.class)
          .in(Singleton.class);
    }
  }

  public static interface Foo { }

  public static class FooProvider implements Provider<Foo> {
    @Override
    public Foo get() {
      return new Foo() {};
    }
  }

  public static class SomeClass {
    @Inject public Provider<Foo> provider;
    @Inject @Named("singleton") public Provider<Foo> singletonProvider;
  }

  public static void main(String... args) {
    Injector inj = Guice.createInjector(new ProvModule());
    SomeClass s = inj.getInstance(SomeClass.class);
    System.out.println("Provider class = " + s.provider.getClass());
    System.out.println("Singleton provider class = " + s.singletonProvider.getClass());

    Foo first = s.provider.get();
    Foo second = s.provider.get();

    System.out.printf("regular scope: objects are %s%n", first == second ? "the same" : "different");

    first = s.singletonProvider.get();
    second = s.singletonProvider.get();

    System.out.printf("singleton scope: objects are %s%n", first == second ? "the same" : "different");
  }
}