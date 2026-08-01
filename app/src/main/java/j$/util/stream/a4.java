package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class a4 implements p4, h5 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    public a4(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (!this.a) {
            this.b = this.c.applyAsDouble(this.b, d);
        } else {
            this.a = false;
            this.b = d;
        }
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

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.a0.c : new j$.util.a0(this.b);
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        a4 a4Var = (a4) p4Var;
        if (a4Var.a) {
            return;
        }
        accept(a4Var.b);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
