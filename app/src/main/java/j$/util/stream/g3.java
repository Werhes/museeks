package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class g3 extends i3 implements j$.util.c1 {
    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator != null) {
                ((j$.util.c1) spliterator).forEachRemaining(obj);
                return;
            }
            Deque b = b();
            while (true) {
                e2 e2Var = (e2) i3.a(b);
                if (e2Var == null) {
                    this.a = null;
                    return;
                }
                e2Var.d(obj);
            }
        }
        do {
        } while (tryAdvance(obj));
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

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        e2 e2Var;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.c1) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (e2Var = (e2) i3.a(this.e)) != null) {
                j$.util.c1 spliterator = e2Var.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
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
