package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class x7 extends z7 implements Spliterator, Consumer {
    public Object f;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.z7
    public final Spliterator b(Spliterator spliterator) {
        return new z7(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        e7 e7Var = null;
        while (true) {
            y7 c = c();
            if (c == y7.NO_MORE) {
                return;
            }
            y7 y7Var = y7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != y7Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (e7Var == null) {
                e7Var = new e7(i);
            } else {
                e7Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(e7Var)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long a = a(j);
            for (int i2 = 0; i2 < a; i2++) {
                consumer.t(e7Var.b[i2]);
            }
        }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (c() != y7.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.t(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
