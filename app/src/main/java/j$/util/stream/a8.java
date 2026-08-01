package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a8 implements k5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ a8(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                u3.D();
                throw null;
            default:
                u3.D();
                throw null;
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
    public final void t(Object obj) {
        switch (this.a) {
            case 0:
                ((u6) this.b).t(obj);
                return;
            default:
                this.b.t(obj);
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
}
