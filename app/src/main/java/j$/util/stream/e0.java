package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class e0 extends i0 implements h5 {
    public static final d0 c;
    public static final d0 d;

    static {
        y6 y6Var = y6.DOUBLE_VALUE;
        n nVar = new n(4);
        n nVar2 = new n(5);
        j$.util.a0 a0Var = j$.util.a0.c;
        c = new d0(true, y6Var, a0Var, nVar, nVar2);
        d = new d0(false, y6Var, a0Var, new n(4), new n(5));
    }

    @Override // j$.util.stream.i0, j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        t(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.a0(((Double) this.b).doubleValue());
        }
        return null;
    }
}
