package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class b8 extends z6 {
    @Override // j$.util.stream.z6
    public final void d() {
        u6 u6Var = new u6();
        this.h = u6Var;
        Objects.requireNonNull(u6Var);
        this.e = this.b.F0(new a8(u6Var, 0));
        this.f = new j$.time.r(14, this);
    }

    @Override // j$.util.stream.z6
    public final z6 e(Spliterator spliterator) {
        return new z6(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        a8 a8Var = new a8(consumer, 1);
        this.b.E0(this.d, a8Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a = a();
        if (!a) {
            return a;
        }
        u6 u6Var = (u6) this.h;
        long j = this.g;
        if (u6Var.c != 0) {
            if (j >= u6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= u6Var.c; i++) {
                long j2 = u6Var.d[i];
                Object[] objArr = u6Var.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= u6Var.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = u6Var.e[(int) j];
        consumer.t(obj);
        return a;
    }
}
