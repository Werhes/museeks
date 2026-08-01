package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class s4 extends v4 implements i5 {
    @Override // j$.util.stream.v4, j$.util.stream.k5
    public final void accept(int i) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.q4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Integer num) {
        u3.G(this, num);
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.b += ((v4) p4Var).b;
    }
}
