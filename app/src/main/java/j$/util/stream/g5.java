package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class g5 implements k5 {
    public final k5 a;

    public g5(k5 k5Var) {
        this.a = (k5) Objects.requireNonNull(k5Var);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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
}
