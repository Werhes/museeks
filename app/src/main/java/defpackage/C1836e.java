package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1836e extends AbstractC10758e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient C4995e f4928e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient C12949e f4929e;

    public C1836e(C12949e c12949e, C4995e c4995e) {
        super(0);
        this.f4929e = c12949e;
        this.f4928e = c4995e;
    }

    @Override // defpackage.AbstractC10054e
    public final int appmetrica(Object[] objArr) {
        return this.f4928e.appmetrica(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4929e.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f4928e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4929e.f25803e;
    }
}
