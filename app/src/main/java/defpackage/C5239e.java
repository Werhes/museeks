package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5239e extends AbstractC12614e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient Object[] f11145e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient AbstractC8507e f11146e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f11147e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f11148e;

    public C5239e(AbstractC8507e abstractC8507e, Object[] objArr, int i, int i2) {
        this.f11146e = abstractC8507e;
        this.f11145e = objArr;
        this.f11148e = i;
        this.f11147e = i2;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        return appmetrica().billing(i, objArr);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11146e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11147e;
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return appmetrica().listIterator(0);
    }

    @Override // defpackage.AbstractC12614e
    public final AbstractC17475e subscription() {
        return new C9935e(this);
    }
}
