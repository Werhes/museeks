package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1410e extends AbstractC17475e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1410e f4222e = new C1410e(0, new Object[0]);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f4223e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f4224e;

    public C1410e(int i, Object[] objArr) {
        this.f4223e = objArr;
        this.f4224e = i;
    }

    @Override // defpackage.AbstractC0281e
    public final int adcel() {
        return 0;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return false;
    }

    @Override // defpackage.AbstractC17475e, defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        Object[] objArr2 = this.f4223e;
        int i2 = this.f4224e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2301e.mopub(i, this.f4224e);
        Object obj = this.f4223e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4224e;
    }

    @Override // defpackage.AbstractC0281e
    public final int startapp() {
        return this.f4224e;
    }

    @Override // defpackage.AbstractC0281e
    public final Object[] yandex() {
        return this.f4223e;
    }
}
