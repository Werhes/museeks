package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class o4 implements p4, j5 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    public o4(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
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
    public final void accept(long j) {
        if (!this.a) {
            this.b = this.c.applyAsLong(this.b, j);
        } else {
            this.a = false;
            this.b = j;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.c0.c : new j$.util.c0(this.b);
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        o4 o4Var = (o4) p4Var;
        if (o4Var.a) {
            return;
        }
        accept(o4Var.b);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }
}
