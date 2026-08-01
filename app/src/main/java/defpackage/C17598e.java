package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17598e extends AbstractC10223e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13615e f34484e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f34485e = true;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C18091e f34486e;

    public C17598e(C13615e c13615e) {
        this.f34484e = c13615e;
    }

    @Override // defpackage.AbstractC10223e
    public final void ad(C18091e c18091e) {
        C18091e c18091e2 = this.f34486e;
        if (c18091e == c18091e2) {
            C18091e c18091e3 = c18091e2.f35479e;
            this.f34486e = c18091e3;
            this.f34485e = c18091e3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f34485e) {
            return this.f34484e.f27010e != null;
        }
        C18091e c18091e = this.f34486e;
        return (c18091e == null || c18091e.f35477e == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f34485e) {
            this.f34485e = false;
            this.f34486e = this.f34484e.f27010e;
        } else {
            C18091e c18091e = this.f34486e;
            this.f34486e = c18091e != null ? c18091e.f35477e : null;
        }
        return this.f34486e;
    }
}
