package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.d8;
import j$.util.stream.g7;
import j$.util.stream.n1;
import j$.util.stream.r1;
import j$.util.stream.s1;
import j$.util.stream.t1;
import j$.util.stream.u3;
import j$.util.stream.x6;
import j$.util.stream.y6;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, d8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public t(y6 y6Var, s1 s1Var, Supplier supplier) {
        this.a = 6;
        this.b = s1Var;
        this.c = supplier;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void t(Object obj) {
        switch (this.a) {
            case 3:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.t(obj);
                consumer2.t(obj);
                return;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
            case 6:
            default:
                g7 g7Var = (g7) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (g7Var.b.putIfAbsent(obj != null ? obj : g7.d, Boolean.TRUE) == null) {
                    consumer3.t(obj);
                    return;
                }
                return;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                return;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
            case 6:
            default:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    @Override // j$.util.stream.d8
    public Object f(j$.util.stream.a aVar, Spliterator spliterator) {
        r1 r1Var = (r1) ((Supplier) this.c).get();
        aVar.E0(spliterator, r1Var);
        return Boolean.valueOf(r1Var.b);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new n1((s1) this.b, (Predicate) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.d8
    public Object j(u3 u3Var, Spliterator spliterator) {
        return (Boolean) new t1(this, (j$.util.stream.a) u3Var, spliterator).invoke();
    }

    @Override // j$.util.stream.d8
    public int v() {
        return x6.u | x6.r;
    }
}
