package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class u7 extends w7 implements j$.util.w0, IntConsumer {
    public int f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.z7
    public final Spliterator b(Spliterator spliterator) {
        return new z7((j$.util.w0) spliterator, this);
    }

    @Override // j$.util.stream.w7
    public final void d(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.w7
    public final d7 e(int i) {
        return new b7(i);
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
