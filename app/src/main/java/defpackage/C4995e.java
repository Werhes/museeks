package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4995e extends AbstractC4354e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient int f10570e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f10571e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f10572e;

    public C4995e(int i, int i2, Object[] objArr) {
        super(0);
        this.f10572e = objArr;
        this.f10571e = i;
        this.f10570e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4608e.appmetrica(i, this.f10570e);
        Object obj = this.f10572e[i + i + this.f10571e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10570e;
    }
}
