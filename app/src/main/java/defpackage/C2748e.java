package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2748e extends AbstractC8592e implements List {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1837e f6652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2748e(AbstractC1837e abstractC1837e, Object obj, List list, AbstractC8592e abstractC8592e) {
        super(abstractC1837e, obj, list, abstractC8592e);
        this.f6652e = abstractC1837e;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        billing();
        boolean isEmpty = this.f17413e.isEmpty();
        ((List) this.f17413e).add(i, obj);
        this.f6652e.f4931e++;
        if (isEmpty) {
            appmetrica();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f17413e).addAll(i, collection);
        if (addAll) {
            this.f6652e.f4931e += this.f17413e.size() - size;
            if (size == 0) {
                appmetrica();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        billing();
        return ((List) this.f17413e).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        billing();
        return ((List) this.f17413e).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        billing();
        return ((List) this.f17413e).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        billing();
        return new C12762e(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        billing();
        return new C12762e(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        billing();
        Object remove = ((List) this.f17413e).remove(i);
        AbstractC1837e abstractC1837e = this.f6652e;
        abstractC1837e.f4931e--;
        yandex();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        billing();
        return ((List) this.f17413e).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        billing();
        List subList = ((List) this.f17413e).subList(i, i2);
        AbstractC8592e abstractC8592e = this.f17412e;
        if (abstractC8592e == null) {
            abstractC8592e = this;
        }
        boolean z = subList instanceof RandomAccess;
        AbstractC1837e abstractC1837e = this.f6652e;
        Object obj = this.f17415e;
        return z ? new C2748e(abstractC1837e, obj, subList, abstractC8592e) : new C2748e(abstractC1837e, obj, subList, abstractC8592e);
    }
}
