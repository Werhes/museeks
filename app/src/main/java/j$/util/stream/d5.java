package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public abstract class d5 implements h5 {
    public final k5 a;

    public d5(k5 k5Var) {
        this.a = (k5) Objects.requireNonNull(k5Var);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.k5
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.k5
    public void h(long j) {
        this.a.h(j);
    }

    @Override // j$.util.stream.k5
    public boolean m() {
        return this.a.m();
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
