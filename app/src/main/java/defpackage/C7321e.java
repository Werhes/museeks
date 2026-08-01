package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٞؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7321e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f14991e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Iterator f14992e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14993e;

    public C7321e(C1630e c1630e) {
        this.f14993e = 1;
        this.f14991e = new ArrayList();
        this.f14992e = c1630e;
    }

    public C7321e(C2167e c2167e) {
        this.f14993e = 0;
        this.f14991e = c2167e;
        this.f14992e = c2167e.ad.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14993e) {
            case 0:
                return this.f14992e.hasNext();
            default:
                return this.f14992e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14993e) {
            case 0:
                return ((C2167e) this.f14991e).vip.invoke(this.f14992e.next());
            default:
                Object next = this.f14992e.next();
                ArrayList arrayList = (ArrayList) this.f14991e;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C1630e c1630e = viewGroup != null ? new C1630e(7, viewGroup) : null;
                if (c1630e == null || !c1630e.hasNext()) {
                    while (!this.f14992e.hasNext() && !arrayList.isEmpty()) {
                        this.f14992e = (Iterator) AbstractC13480e.m3570break(arrayList);
                        AbstractC13480e.m3595private(arrayList);
                    }
                } else {
                    arrayList.add(this.f14992e);
                    this.f14992e = c1630e;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14993e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
