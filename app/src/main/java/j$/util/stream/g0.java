package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class g0 extends i0 implements j5 {
    public static final d0 c;
    public static final d0 d;

    static {
        y6 y6Var = y6.LONG_VALUE;
        n nVar = new n(8);
        n nVar2 = new n(9);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new d0(true, y6Var, c0Var, nVar, nVar2);
        d = new d0(false, y6Var, c0Var, new n(8), new n(9));
    }

    @Override // j$.util.stream.i0, j$.util.stream.k5
    public final void accept(long j) {
        t(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Long) this.b).longValue());
        }
        return null;
    }
}
