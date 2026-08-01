package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11551e extends AbstractC4686e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient Object[] f23192e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final transient int f23193e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient AbstractC9434e f23194e;

    public C11551e(AbstractC9434e abstractC9434e, Object[] objArr, int i) {
        super(2);
        this.f23194e = abstractC9434e;
        this.f23192e = objArr;
        this.f23193e = i;
    }

    public final AbstractC8718e admob() {
        return new C7733e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f23194e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC8718e abstractC8718e = this.f10069e;
        if (abstractC8718e == null) {
            abstractC8718e = admob();
            this.f10069e = abstractC8718e;
        }
        return abstractC8718e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23193e;
    }

    @Override // defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        AbstractC8718e abstractC8718e = this.f10069e;
        if (abstractC8718e == null) {
            abstractC8718e = admob();
            this.f10069e = abstractC8718e;
        }
        return abstractC8718e.smaato(objArr);
    }
}
