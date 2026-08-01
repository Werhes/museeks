package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4821e extends AbstractC8718e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C4821e f10278e = new C4821e(0, new Object[0]);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f10279e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f10280e;

    public C4821e(int i, Object[] objArr) {
        super(2);
        this.f10280e = objArr;
        this.f10279e = i;
    }

    @Override // defpackage.AbstractC10054e
    public final int adcel() {
        return this.f10279e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0259e.billing(i, this.f10279e);
        Object obj = this.f10280e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10279e;
    }

    @Override // defpackage.AbstractC8718e, defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        Object[] objArr2 = this.f10280e;
        int i = this.f10279e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return 0;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] yandex() {
        return this.f10280e;
    }
}
