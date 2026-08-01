package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1685e implements Iterator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f4617e;

    public C1685e(Iterator it) {
        this.f4617e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4617e.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C15547e((String) this.f4617e.next());
    }
}
