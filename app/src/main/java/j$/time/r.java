package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.a0;
import j$.util.stream.b0;
import j$.util.stream.b8;
import j$.util.stream.c0;
import j$.util.stream.i7;
import j$.util.stream.j1;
import j$.util.stream.k1;
import j$.util.stream.k5;
import j$.util.stream.k7;
import j$.util.stream.l1;
import j$.util.stream.m7;
import j$.util.stream.v6;
import j$.util.stream.w6;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final class r implements TemporalAccessor, Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    public /* synthetic */ r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long B(TemporalField temporalField) {
        throw new DateTimeException(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.a ? (ZoneId) this.b : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((Consumer) this.b).accept(new j$.util.p((Map.Entry) obj));
                return;
            case 8:
                ((k5) this.b).accept((k5) obj);
                return;
            default:
                ((List) this.b).add(obj);
                return;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof c0) {
            return b0.f((c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return a0.f((DoubleStream) apply);
        }
        j$.util.f.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof l1) {
            return k1.f((l1) apply);
        }
        if (apply instanceof LongStream) {
            return j1.f((LongStream) apply);
        }
        j$.util.f.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return v6.f((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof c0) {
            return b0.f((c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return a0.f((DoubleStream) apply);
        }
        if (apply instanceof l1) {
            return k1.f((l1) apply);
        }
        if (apply instanceof LongStream) {
            return j1.f((LongStream) apply);
        }
        j$.util.f.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean e(TemporalField temporalField) {
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).Q0(0);
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 11:
                i7 i7Var = (i7) this.b;
                return i7Var.d.tryAdvance(i7Var.e);
            case 12:
                k7 k7Var = (k7) this.b;
                return k7Var.d.tryAdvance(k7Var.e);
            case 13:
                m7 m7Var = (m7) this.b;
                return m7Var.d.tryAdvance(m7Var.e);
            default:
                b8 b8Var = (b8) this.b;
                return b8Var.d.tryAdvance(b8Var.e);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int i(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.s k(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    public Predicate negate() {
        return new r(2, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.u(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    public void u(w6 w6Var) {
        ((EnumMap) ((Map) this.b)).put((EnumMap) w6Var, (w6) 1);
    }
}
