package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class m0 extends p0 implements i5 {
    public final IntConsumer b;

    public m0(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.p0, j$.util.stream.k5
    public final void accept(int i) {
        this.b.accept(i);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.d8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.E0(spliterator, this);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.d8
    public final /* bridge */ /* synthetic */ Object j(u3 u3Var, Spliterator spliterator) {
        a(u3Var, spliterator);
        return null;
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Integer num) {
        u3.G(this, num);
    }
}
