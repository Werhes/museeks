package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* loaded from: classes2.dex */
public abstract class i3 implements Spliterator {
    public f2 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public Deque e;

    public i3(f2 f2Var) {
        this.a = f2Var;
    }

    public static f2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            f2 f2Var = (f2) arrayDeque.pollFirst();
            if (f2Var == null) {
                return null;
            }
            if (f2Var.i() != 0) {
                for (int i = f2Var.i() - 1; i >= 0; i--) {
                    arrayDeque.addFirst(f2Var.a(i));
                }
            } else if (f2Var.count() > 0) {
                return f2Var;
            }
        }
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int i = this.a.i();
        while (true) {
            i--;
            if (i < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(i));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        Deque b = b();
        this.e = b;
        f2 a = a(b);
        if (a != null) {
            this.d = a.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.i(); i++) {
            j += this.a.a(i).count();
        }
        return j;
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
    public final Spliterator trySplit() {
        f2 f2Var = this.a;
        if (f2Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < f2Var.i() - 1) {
            f2 f2Var2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return f2Var2.a(i).spliterator();
        }
        f2 a = this.a.a(this.b);
        this.a = a;
        if (a.i() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        f2 f2Var3 = this.a;
        this.b = 1;
        return f2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }
}
