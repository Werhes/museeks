package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class o6 extends s6 implements j$.util.w0 {
    public final /* synthetic */ p6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(p6 p6Var, int i, int i2, int i3, int i4) {
        super(p6Var, i, i2, i3, i4);
        this.g = p6Var;
    }

    @Override // j$.util.stream.s6
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 b(Object obj, int i, int i2) {
        int[] iArr = (int[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i, i3);
        return new j$.util.o1(iArr, i, i3, 1040);
    }

    @Override // j$.util.stream.s6
    public final j$.util.c1 c(int i, int i2, int i3, int i4) {
        return new o6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.C(this, consumer);
    }
}
