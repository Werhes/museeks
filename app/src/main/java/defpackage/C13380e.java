package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13380e extends AbstractC2753e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13380e f26635e = new C13380e(0, new Object[0]);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f26636e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f26637e;

    public C13380e(int i, Object[] objArr) {
        super(1);
        this.f26637e = objArr;
        this.f26636e = i;
    }

    @Override // defpackage.AbstractC10054e
    public final int adcel() {
        return this.f26636e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0223e.smaato(i, this.f26636e);
        Object obj = this.f26637e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26636e;
    }

    @Override // defpackage.AbstractC2753e, defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        Object[] objArr2 = this.f26637e;
        int i = this.f26636e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return 0;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] yandex() {
        return this.f26637e;
    }
}
