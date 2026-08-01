package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class q6 extends s6 implements j$.util.z0 {
    public final /* synthetic */ r6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(r6 r6Var, int i, int i2, int i3, int i4) {
        super(r6Var, i, i2, i3, i4);
        this.g = r6Var;
    }

    @Override // j$.util.stream.s6
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i, i3);
        return new j$.util.q1(jArr, i, i3, 1040);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 c(int i, int i2, int i3, int i4) {
        return new q6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.D(this, consumer);
    }
}
