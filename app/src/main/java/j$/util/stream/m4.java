package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class m4 extends q4 implements p4, i5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ o d;

    public m4(Supplier supplier, ObjIntConsumer objIntConsumer, o oVar) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = oVar;
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        u3.D();
        throw null;
    }

    @Override // j$.util.stream.k5
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(long j) {
        u3.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Integer num) {
        u3.G(this, num);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.a = this.d.apply(this.a, ((m4) p4Var).a);
    }
}
