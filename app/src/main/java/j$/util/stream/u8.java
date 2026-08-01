package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class u8 extends w8 implements LongConsumer, j$.util.z0 {
    public long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, w8 w8Var, int i) {
        super(spliterator, w8Var);
        this.f = i;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.w8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new u8((j$.util.z0) spliterator, this, 0);
            default:
                return new u8((j$.util.z0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.w8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.m(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        do {
        } while (tryAdvance(longConsumer));
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.D(this, consumer);
    }

    @Override // j$.util.z0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.z0) spliterator).tryAdvance(longConsumer);
                }
                this.c = false;
                boolean tryAdvance = ((j$.util.z0) spliterator).tryAdvance((LongConsumer) this);
                if (tryAdvance && a()) {
                    LongPredicate longPredicate = null;
                    longPredicate.test(this.e);
                    throw null;
                }
                if (!tryAdvance) {
                    return tryAdvance;
                }
                longConsumer.accept(this.e);
                return tryAdvance;
            default:
                if (!this.c || !a() || !((j$.util.z0) this.a).tryAdvance((LongConsumer) this)) {
                    this.c = false;
                    return false;
                }
                LongPredicate longPredicate2 = null;
                longPredicate2.test(this.e);
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
    public j$.util.z0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.z0) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
