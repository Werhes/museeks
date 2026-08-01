package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class l extends g5 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, k5 k5Var, int i) {
        super(k5Var);
        this.b = i;
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(k5 k5Var) {
        super(k5Var);
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((Set) this.c).contains(obj)) {
                    return;
                }
                ((Set) this.c).add(obj);
                this.a.accept((k5) obj);
                return;
            case 1:
                ((Consumer) ((q) this.c).t).accept(obj);
                this.a.accept((k5) obj);
                return;
            case 2:
                if (((Predicate) ((q) this.c).t).test(obj)) {
                    this.a.accept((k5) obj);
                    return;
                }
                return;
            case 3:
                this.a.accept((k5) ((Function) ((q) this.c).t).apply(obj));
                return;
            case 4:
                this.a.accept(((ToIntFunction) ((t0) this.c).t).applyAsInt(obj));
                return;
            case 5:
                this.a.accept(((ToLongFunction) ((e1) this.c).t).applyAsLong(obj));
                return;
            default:
                this.a.accept(((ToDoubleFunction) ((r) this.c).t).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public void h(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.h(-1L);
                return;
            case 1:
            default:
                super.h(j);
                return;
            case 2:
                this.a.h(-1L);
                return;
        }
    }
}
