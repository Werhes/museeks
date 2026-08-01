package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class n0 extends p0 implements j5 {
    public final LongConsumer b;

    public n0(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.p0, j$.util.stream.k5
    public final void accept(long j) {
        this.b.accept(j);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.d8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.E0(spliterator, this);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.d8
    public final /* bridge */ /* synthetic */ Object j(u3 u3Var, Spliterator spliterator) {
        a(u3Var, spliterator);
        return null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }
}
