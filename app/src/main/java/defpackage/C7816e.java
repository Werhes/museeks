package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7816e extends AbstractC17475e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f15823e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f15824e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f15825e;

    public C7816e(int i, int i2, Object[] objArr) {
        this.f15824e = objArr;
        this.f15825e = i;
        this.f15823e = i2;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2301e.mopub(i, this.f15823e);
        Object obj = this.f15824e[(i * 2) + this.f15825e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15823e;
    }
}
