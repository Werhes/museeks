package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5402e extends AbstractC8103e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient C10093e f11583e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient C13837e f11584e;

    public C5402e(C10093e c10093e, C13837e c13837e) {
        this.f11583e = c10093e;
        this.f11584e = c13837e;
    }

    @Override // defpackage.AbstractC14048e
    public final int appmetrica(int i, Object[] objArr) {
        return this.f11584e.appmetrica(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11583e.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11584e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
