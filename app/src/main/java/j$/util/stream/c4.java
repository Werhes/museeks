package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class c4 extends q4 implements p4, h5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ o d;

    public c4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, o oVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = oVar;
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(this.a, d);
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
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        t((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
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
        this.a = this.d.apply(this.a, ((c4) p4Var).a);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
