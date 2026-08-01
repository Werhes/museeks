package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class f0 extends i0 implements i5 {
    public static final d0 c;
    public static final d0 d;

    static {
        y6 y6Var = y6.INT_VALUE;
        n nVar = new n(6);
        n nVar2 = new n(7);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new d0(true, y6Var, b0Var, nVar, nVar2);
        d = new d0(false, y6Var, b0Var, new n(6), new n(7));
    }

    @Override // j$.util.stream.i0, j$.util.stream.k5
    public final void accept(int i) {
        t(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Integer) this.b).intValue());
        }
        return null;
    }
}
