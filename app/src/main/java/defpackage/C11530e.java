package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11530e extends AbstractC4354e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C11530e f23170e = new C11530e(0, new Object[0]);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f23171e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f23172e;

    public C11530e(int i, Object[] objArr) {
        super(0);
        this.f23172e = objArr;
        this.f23171e = i;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] advert() {
        return this.f23172e;
    }

    @Override // defpackage.AbstractC4354e, defpackage.AbstractC10054e
    public final int appmetrica(Object[] objArr) {
        Object[] objArr2 = this.f23172e;
        int i = this.f23171e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10054e
    public final int billing() {
        return this.f23171e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4608e.appmetrica(i, this.f23171e);
        Object obj = this.f23172e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23171e;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return 0;
    }
}
