package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class n3 extends q3 implements i5 {
    public final int[] h;

    public n3(Spliterator spliterator, u3 u3Var, int[] iArr) {
        super(spliterator, u3Var, iArr.length);
        this.h = iArr;
    }

    public n3(n3 n3Var, Spliterator spliterator, long j, long j2) {
        super(n3Var, spliterator, j, j2, n3Var.h.length);
        this.h = n3Var.h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j2) {
        return new n3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.q3, j$.util.stream.k5
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Integer num) {
        u3.G(this, num);
    }
}
