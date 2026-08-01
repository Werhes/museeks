package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class p0 implements d8, e8 {
    public final boolean a;

    public p0(boolean z) {
        this.a = z;
    }

    public final void a(u3 u3Var, Spliterator spliterator) {
        if (this.a) {
            new q0(u3Var, spliterator, this).invoke();
        } else {
            new r0(u3Var, spliterator, u3Var.F0(this)).invoke();
        }
    }

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
    public final /* synthetic */ void h(long j) {
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.d8
    public final int v() {
        if (this.a) {
            return 0;
        }
        return x6.r;
    }
}
