package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class t7 extends w7 implements j$.util.t0, DoubleConsumer {
    public double f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.z7
    public final Spliterator b(Spliterator spliterator) {
        return new z7((j$.util.t0) spliterator, this);
    }

    @Override // j$.util.stream.w7
    public final void d(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.w7
    public final d7 e(int i) {
        return new a7(i);
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
