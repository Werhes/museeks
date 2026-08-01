package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class p1 extends r1 implements j5 {
    @Override // j$.util.stream.r1, j$.util.stream.k5
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }
}
