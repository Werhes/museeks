package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class t8 extends w8 implements IntConsumer, j$.util.w0 {
    public int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(Spliterator spliterator, w8 w8Var, int i) {
        super(spliterator, w8Var);
        this.f = i;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.w8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new t8((j$.util.w0) spliterator, this, 0);
            default:
                return new t8((j$.util.w0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        do {
        } while (tryAdvance(intConsumer));
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.C(this, consumer);
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.w0) spliterator).tryAdvance(intConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.w0) spliterator).tryAdvance((IntConsumer) this);
                if (tryAdvance && a()) {
                    IntPredicate intPredicate = null;
                    intPredicate.test(this.e);
                    throw null;
                }
                if (!tryAdvance) {
                    return tryAdvance;
                }
                intConsumer.accept(this.e);
                return tryAdvance;
            default:
                if (!this.c || !a() || !((j$.util.w0) this.a).tryAdvance((IntConsumer) this)) {
                    this.c = false;
                    return false;
                }
                IntPredicate intPredicate2 = null;
                intPredicate2.test(this.e);
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
    public j$.util.w0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.w0) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
