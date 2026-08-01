package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17294e extends AbstractC16117e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16166e f33932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17294e(C16166e c16166e) {
        super(1);
        this.f33932e = c16166e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33932e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f33932e.f31766e.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f33932e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14950e(this.f33932e, (byte) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        try {
            obj2 = ((C6834e) this.f33932e.f31764e).f14065e.remove(entry.getKey());
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        collection.size();
        collection.clear();
        return true;
    }

    @Override // defpackage.AbstractC16117e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC4107e.amazon(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // defpackage.AbstractC16117e, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                if (size < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(size, "expectedSize cannot be negative but was: "));
                }
                ceil = size + 1;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            C6834e c6834e = (C6834e) this.f33932e.f31764e;
            C11478e c11478e = c6834e.f15261e;
            if (c11478e == null) {
                c11478e = new C11478e(c6834e, c6834e.f14065e);
                c6834e.f15261e = c11478e;
            }
            return c11478e.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33932e.f31766e.size();
    }
}
