package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class f4 implements p4 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

    public f4(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
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
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.z.b : new j$.util.z(this.b);
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        f4 f4Var = (f4) p4Var;
        if (f4Var.a) {
            return;
        }
        t(f4Var.b);
    }
}
