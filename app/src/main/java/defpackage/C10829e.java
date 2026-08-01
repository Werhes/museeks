package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10829e implements Iterable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f21465e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f21466e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21467e = 1;

    public C10829e(C0381e c0381e, String str) {
        this.f21466e = str;
        this.f21465e = c0381e;
    }

    public C10829e(List list, List list2) {
        this.f21466e = list;
        this.f21465e = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f21467e) {
            case 0:
                return new C11322e(((List) this.f21466e).iterator(), ((List) this.f21465e).iterator());
            default:
                C0381e c0381e = (C0381e) this.f21465e;
                return ((C6594e) c0381e.appmetrica).m2224import(c0381e, (String) this.f21466e);
        }
    }

    public String toString() {
        switch (this.f21467e) {
            case 1:
                C7364e c7364e = new C7364e(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                c7364e.ad(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
