package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.k5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ h0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(i));
                return;
            default:
                ((k5) this.b).accept(i);
                return;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer$CC.$default$andThen(this, intConsumer);
        }
    }
}
