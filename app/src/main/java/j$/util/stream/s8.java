package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class s8 extends w8 implements DoubleConsumer, j$.util.t0 {
    public double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(Spliterator spliterator, w8 w8Var, int i) {
        super(spliterator, w8Var);
        this.f = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.w8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new s8((j$.util.t0) spliterator, this, 0);
            default:
                return new s8((j$.util.t0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        do {
        } while (tryAdvance(doubleConsumer));
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.t0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.t0) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.t0) spliterator).tryAdvance((DoubleConsumer) this);
                if (tryAdvance && a()) {
                    DoublePredicate doublePredicate = null;
                    doublePredicate.test(this.e);
                    throw null;
                }
                if (!tryAdvance) {
                    return tryAdvance;
                }
                doubleConsumer.accept(this.e);
                return tryAdvance;
            default:
                if (!this.c || !a() || !((j$.util.t0) this.a).tryAdvance((DoubleConsumer) this)) {
                    this.c = false;
                    return false;
                }
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(this.e);
                throw null;
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public j$.util.t0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.t0) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
