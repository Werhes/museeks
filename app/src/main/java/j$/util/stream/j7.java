package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j7 implements i5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ j7(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
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

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                return;
            default:
                ((p6) this.b).accept(i);
                return;
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
                l((Integer) obj);
                return;
            default:
                l((Integer) obj);
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer$CC.$default$andThen(this, intConsumer);
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

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Integer num) {
        switch (this.a) {
            case 0:
                u3.G(this, num);
                return;
            default:
                u3.G(this, num);
                return;
        }
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
