package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class o3 extends q3 implements j5 {
    public final long[] h;

    public o3(Spliterator spliterator, u3 u3Var, long[] jArr) {
        super(spliterator, u3Var, jArr.length);
        this.h = jArr;
    }

    public o3(o3 o3Var, Spliterator spliterator, long j, long j2) {
        super(o3Var, spliterator, j, j2, o3Var.h.length);
        this.h = o3Var.h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j2) {
        return new o3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.q3, j$.util.stream.k5
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }
}
