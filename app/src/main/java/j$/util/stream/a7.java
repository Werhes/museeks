package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class a7 extends d7 implements DoubleConsumer {
    public final double[] c;

    public a7(int i) {
        this.c = new double[i];
    }

    @Override // j$.util.stream.d7
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            doubleConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }
}
