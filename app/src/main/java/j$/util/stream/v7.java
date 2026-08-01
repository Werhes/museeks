package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class v7 extends w7 implements j$.util.z0, LongConsumer {
    public long f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.z7
    public final Spliterator b(Spliterator spliterator) {
        return new z7((j$.util.z0) spliterator, this);
    }

    @Override // j$.util.stream.w7
    public final void d(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.w7
    public final d7 e(int i) {
        return new c7(i);
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
