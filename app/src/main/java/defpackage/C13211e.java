package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13211e extends AbstractC8103e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f26215e = 1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient C10093e f26216e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object[] f26217e;

    public C13211e(C10093e c10093e, Object[] objArr) {
        this.f26216e = c10093e;
        this.f26217e = objArr;
    }

    @Override // defpackage.AbstractC14048e
    public final int appmetrica(int i, Object[] objArr) {
        AbstractC2358e abstractC2358e = this.f16452e;
        if (abstractC2358e == null) {
            abstractC2358e = new C2304e(this);
            this.f16452e = abstractC2358e;
        }
        return abstractC2358e.appmetrica(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26216e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC2358e abstractC2358e = this.f16452e;
        if (abstractC2358e == null) {
            abstractC2358e = new C2304e(this);
            this.f16452e = abstractC2358e;
        }
        return abstractC2358e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26215e;
    }
}
