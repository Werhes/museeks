package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4300e implements Iterator, InterfaceC5083e, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Iterator f9401e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f9402e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC5083e f9403e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f9404e;

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return C2693e.f6576e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        AbstractC2003e.purchase(obj);
        this.f9404e = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f9404e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw vip();
                }
                if (this.f9401e.hasNext()) {
                    this.f9404e = 2;
                    return true;
                }
                this.f9401e = null;
            }
            this.f9404e = 5;
            InterfaceC5083e interfaceC5083e = this.f9403e;
            this.f9403e = null;
            interfaceC5083e.billing(Unit.INSTANCE);
        }
    }

    public final void metrica(InterfaceC5083e interfaceC5083e, Object obj) {
        this.f9402e = obj;
        this.f9404e = 3;
        this.f9403e = interfaceC5083e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9404e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f9404e = 1;
            return this.f9401e.next();
        }
        if (i != 3) {
            throw vip();
        }
        this.f9404e = 0;
        Object obj = this.f9402e;
        this.f9402e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final RuntimeException vip() {
        int i = this.f9404e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9404e);
    }
}
