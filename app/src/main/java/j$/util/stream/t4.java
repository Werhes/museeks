package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class t4 extends v4 implements j5 {
    @Override // j$.util.stream.v4, j$.util.stream.k5
    public final void accept(long j) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.q4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.b += ((v4) p4Var).b;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }
}
