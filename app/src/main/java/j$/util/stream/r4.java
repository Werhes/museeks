package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class r4 extends v4 implements h5 {
    @Override // j$.util.stream.v4, j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        t((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.q4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.b += ((v4) p4Var).b;
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
