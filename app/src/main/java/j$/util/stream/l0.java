package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class l0 extends p0 implements h5 {
    public final DoubleConsumer b;

    public l0(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.p0, j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.accept(d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        t((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.d8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.E0(spliterator, this);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.d8
    public final /* bridge */ /* synthetic */ Object j(u3 u3Var, Spliterator spliterator) {
        a(u3Var, spliterator);
        return null;
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
