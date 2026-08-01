package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10649e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9093e f20969e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20970e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Iterator f20971e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f20972e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20973e;

    public C10649e(C8522e c8522e) {
        this.f20973e = 1;
        this.f20969e = c8522e;
        this.f20971e = c8522e.ad.iterator();
    }

    public C10649e(C12150e c12150e) {
        this.f20973e = 0;
        this.f20969e = c12150e;
        this.f20971e = c12150e.ad.iterator();
        this.f20970e = -1;
    }

    public void ad() {
        Object next;
        C12150e c12150e = (C12150e) this.f20969e;
        do {
            Iterator it = this.f20971e;
            if (!it.hasNext()) {
                this.f20970e = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c12150e.metrica.invoke(next)).booleanValue() != c12150e.vip);
        this.f20972e = next;
        this.f20970e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20973e) {
            case 0:
                if (this.f20970e == -1) {
                    ad();
                }
                return this.f20970e == 1;
            default:
                int i = this.f20970e;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return vip();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20973e) {
            case 0:
                if (this.f20970e == -1) {
                    ad();
                }
                if (this.f20970e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f20972e;
                this.f20972e = null;
                this.f20970e = -1;
                return obj;
            default:
                int i = this.f20970e;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !vip()) {
                    throw new NoSuchElementException();
                }
                this.f20970e = 0;
                return ((Iterator) this.f20972e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f20973e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public boolean vip() {
        Iterator it;
        Iterator it2 = (Iterator) this.f20972e;
        if (it2 != null && it2.hasNext()) {
            this.f20970e = 1;
            return true;
        }
        do {
            Iterator it3 = this.f20971e;
            if (!it3.hasNext()) {
                this.f20970e = 2;
                this.f20972e = null;
                return false;
            }
            Object next = it3.next();
            C8522e c8522e = (C8522e) this.f20969e;
            it = (Iterator) c8522e.metrica.invoke(c8522e.vip.invoke(next));
        } while (!it.hasNext());
        this.f20972e = it;
        this.f20970e = 1;
        return true;
    }
}
