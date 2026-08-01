package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class i4 extends q4 implements p4 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BiConsumer d;

    public i4(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = biConsumer2;
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        u3.D();
        throw null;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(int i) {
        u3.K();
        throw null;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(long j) {
        u3.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        this.c.accept(this.a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.d.accept(this.a, ((i4) p4Var).a);
    }
}
