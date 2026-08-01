package j$.util;

import j$.util.stream.k5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ l0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(Long.valueOf(j));
                return;
            default:
                ((k5) this.b).accept(j);
                return;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }
}
