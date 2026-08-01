package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class m6 extends s6 implements j$.util.t0 {
    public final /* synthetic */ n6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, int i, int i2, int i3, int i4) {
        super(n6Var, i, i2, i3, i4);
        this.g = n6Var;
    }

    @Override // j$.util.stream.s6
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i, i3);
        return new j$.util.j1(dArr, i, i3, 1040);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 c(int i, int i2, int i3, int i4) {
        return new m6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }
}
