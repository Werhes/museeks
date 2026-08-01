package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class v4 extends q4 implements p4 {
    public long b;

    public /* synthetic */ void accept(double d) {
        u3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        u3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        u3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }
}
