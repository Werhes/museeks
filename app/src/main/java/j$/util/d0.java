package j$.util;

import j$.util.stream.k5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements DoubleConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ d0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(Double.valueOf(d));
                return;
            default:
                ((k5) this.b).accept(d);
                return;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
        }
    }
}
