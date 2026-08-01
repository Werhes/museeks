package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7895e extends AbstractC2358e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7895e f15970e = new C7895e(0, new Object[0]);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f15971e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f15972e;

    public C7895e(int i, Object[] objArr) {
        this.f15971e = objArr;
        this.f15972e = i;
    }

    @Override // defpackage.AbstractC2358e, defpackage.AbstractC14048e
    public final int appmetrica(int i, Object[] objArr) {
        Object[] objArr2 = this.f15971e;
        int i2 = this.f15972e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC14048e
    public final int billing() {
        return this.f15972e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1596e.yandex(i, this.f15972e);
        Object obj = this.f15971e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15972e;
    }

    @Override // defpackage.AbstractC14048e
    public final Object[] startapp() {
        return this.f15971e;
    }

    @Override // defpackage.AbstractC14048e
    public final int yandex() {
        return 0;
    }
}
