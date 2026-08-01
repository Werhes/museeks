package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13837e extends AbstractC2358e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f27404e = 1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f27405e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f27406e;

    public C13837e(int i, Object[] objArr) {
        this.f27405e = objArr;
        this.f27406e = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1596e.yandex(i, this.f27404e);
        Object obj = this.f27405e[i + i + this.f27406e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27404e;
    }
}
