package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class l7 implements j5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ l7(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
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

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                return;
            default:
                ((r6) this.b).accept(j);
                return;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        switch (this.a) {
            case 0:
                s((Long) obj);
                return;
            default:
                s((Long) obj);
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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
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

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        switch (this.a) {
            case 0:
                u3.I(this, l);
                return;
            default:
                u3.I(this, l);
                return;
        }
    }
}
