package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12015e extends AbstractC4686e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient C1829e f24034e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient C2204e f24035e;

    public C12015e(C2204e c2204e, C1829e c1829e) {
        super(2);
        this.f24035e = c2204e;
        this.f24034e = c1829e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24035e.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f24034e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24035e.f5592e;
    }

    @Override // defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        return this.f24034e.smaato(objArr);
    }
}
