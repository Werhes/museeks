package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class j2 implements f2 {
    public final Collection a;

    public j2(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.W(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void f(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.f2
    public final Object[] g(IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.a).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
    }
}
