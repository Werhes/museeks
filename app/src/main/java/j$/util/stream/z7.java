package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class z7 {
    public final Spliterator a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public z7(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public z7(Spliterator spliterator, z7 z7Var) {
        this.a = spliterator;
        this.b = z7Var.b;
        this.e = z7Var.e;
        this.d = z7Var.d;
        this.c = z7Var.c;
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long min;
        do {
            j2 = this.e.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.e.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    public abstract Spliterator b(Spliterator spliterator);

    public final y7 c() {
        return this.e.get() > 0 ? y7.MAYBE_MORE : this.b ? y7.UNLIMITED : y7.NO_MORE;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m4608trySplit() {
        return (j$.util.c1) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.t0 m4609trySplit() {
        return (j$.util.t0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.w0 m4610trySplit() {
        return (j$.util.w0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m4611trySplit() {
        return (j$.util.z0) trySplit();
    }
}
