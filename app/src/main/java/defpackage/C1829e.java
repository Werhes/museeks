package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1829e extends AbstractC8718e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient int f4919e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f4920e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f4921e;

    public C1829e(int i, int i2, Object[] objArr) {
        super(2);
        this.f4921e = objArr;
        this.f4920e = i;
        this.f4919e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0259e.billing(i, this.f4919e);
        Object obj = this.f4921e[i + i + this.f4920e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4919e;
    }
}
