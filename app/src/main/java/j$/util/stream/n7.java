package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class n7 extends q7 implements j$.util.t0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.s7, j$.util.Spliterator] */
    @Override // j$.util.stream.s7
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new s7((j$.util.t0) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.q7
    public final Object b() {
        return new y1(1);
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
