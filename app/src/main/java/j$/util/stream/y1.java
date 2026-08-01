package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class y1 implements DoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ y1(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, doubleConsumer);
        }
    }
}
