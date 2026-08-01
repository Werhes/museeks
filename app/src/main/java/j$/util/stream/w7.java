package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class w7 extends z7 implements j$.util.c1 {
    public abstract void d(Object obj);

    public abstract d7 e(int i);

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        d7 d7Var = null;
        while (true) {
            y7 c = c();
            if (c == y7.NO_MORE) {
                return;
            }
            y7 y7Var = y7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != y7Var) {
                ((j$.util.c1) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (d7Var == null) {
                d7Var = e(i);
            } else {
                d7Var.b = 0;
            }
            long j = 0;
            while (((j$.util.c1) spliterator).tryAdvance(d7Var)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                d7Var.a(obj, a(j));
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.p(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.r(this, i);
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (c() != y7.NO_MORE && ((j$.util.c1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
