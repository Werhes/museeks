package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class m3 extends q3 implements h5 {
    public final double[] h;

    public m3(Spliterator spliterator, u3 u3Var, double[] dArr) {
        super(spliterator, u3Var, dArr.length);
        this.h = dArr;
    }

    public m3(m3 m3Var, Spliterator spliterator, long j, long j2) {
        super(m3Var, spliterator, j, j2, m3Var.h.length);
        this.h = m3Var.h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j2) {
        return new m3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.q3, j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        t((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void t(Double d) {
        u3.E(this, d);
    }
}
