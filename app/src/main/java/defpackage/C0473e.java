package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0473e extends AbstractC3362e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C0473e f2538e = new C0473e(0, new Object[0]);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f2539e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f2540e;

    public C0473e(int i, Object[] objArr) {
        this.f2539e = objArr;
        this.f2540e = i;
    }

    @Override // defpackage.AbstractC14292e
    public final Object[] adcel() {
        return this.f2539e;
    }

    @Override // defpackage.AbstractC3362e, defpackage.AbstractC14292e
    public final int appmetrica(Object[] objArr) {
        Object[] objArr2 = this.f2539e;
        int i = this.f2540e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC14292e
    public final int billing() {
        return this.f2540e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC11866e.smaato(i, this.f2540e);
        Object obj = this.f2539e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2540e;
    }

    @Override // defpackage.AbstractC14292e
    public final boolean startapp() {
        return false;
    }

    @Override // defpackage.AbstractC14292e
    public final int yandex() {
        return 0;
    }
}
