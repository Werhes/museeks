package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6748e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13942e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13943e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f13944e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f13945e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f13946e;

    public C6748e(int i) {
        this.f13946e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6748e(C2271e c2271e, int i) {
        this(c2271e.f34352e);
        this.f13945e = i;
        switch (i) {
            case 1:
                this.f13942e = c2271e;
                this(c2271e.f34352e);
                return;
            default:
                this.f13942e = c2271e;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6748e(C17548e c17548e) {
        this(c17548e.f34401e);
        this.f13945e = 2;
        this.f13942e = c17548e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13944e < this.f13946e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object purchase;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13944e;
        switch (this.f13945e) {
            case 0:
                purchase = ((C2271e) this.f13942e).purchase(i);
                break;
            case 1:
                purchase = ((C2271e) this.f13942e).startapp(i);
                break;
            default:
                purchase = ((C17548e) this.f13942e).f34402e[i];
                break;
        }
        this.f13944e++;
        this.f13943e = true;
        return purchase;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13943e) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f13944e - 1;
        this.f13944e = i;
        switch (this.f13945e) {
            case 0:
                ((C2271e) this.f13942e).billing(i);
                break;
            case 1:
                ((C2271e) this.f13942e).billing(i);
                break;
            default:
                ((C17548e) this.f13942e).appmetrica(i);
                break;
        }
        this.f13946e--;
        this.f13943e = false;
    }
}
