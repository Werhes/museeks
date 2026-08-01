package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class h7 implements h5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ h7(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                return;
            default:
                ((n6) this.b).accept(d);
                return;
        }
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                u3.K();
                throw null;
            default:
                u3.K();
                throw null;
        }
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                u3.L();
                throw null;
            default:
                u3.L();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        switch (this.a) {
            case 0:
                t((Double) obj);
                return;
            default:
                t((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
        }
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void h(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        switch (this.a) {
            case 0:
                u3.E(this, d);
                return;
            default:
                u3.E(this, d);
                return;
        }
    }
}
