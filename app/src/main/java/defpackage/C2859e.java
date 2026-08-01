package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2859e extends AbstractC10758e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient int f6823e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient Object[] f6824e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient AbstractC9434e f6825e;

    public C2859e(AbstractC9434e abstractC9434e, Object[] objArr, int i) {
        super(0);
        this.f6825e = abstractC9434e;
        this.f6824e = objArr;
        this.f6823e = i;
    }

    @Override // defpackage.AbstractC10054e
    public final int appmetrica(Object[] objArr) {
        AbstractC4354e abstractC4354e = this.f21179e;
        if (abstractC4354e == null) {
            abstractC4354e = new C17010e(this);
            this.f21179e = abstractC4354e;
        }
        return abstractC4354e.appmetrica(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6825e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC4354e abstractC4354e = this.f21179e;
        if (abstractC4354e == null) {
            abstractC4354e = new C17010e(this);
            this.f21179e = abstractC4354e;
        }
        return abstractC4354e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6823e;
    }
}
