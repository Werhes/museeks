package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6652e extends AbstractC10223e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f13724e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C18091e f13725e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C18091e f13726e;

    public C6652e(C18091e c18091e, C18091e c18091e2, int i) {
        this.f13724e = i;
        this.f13726e = c18091e2;
        this.f13725e = c18091e;
    }

    @Override // defpackage.AbstractC10223e
    public final void ad(C18091e c18091e) {
        C18091e c18091e2;
        C18091e c18091e3 = null;
        if (this.f13726e == c18091e && c18091e == this.f13725e) {
            this.f13725e = null;
            this.f13726e = null;
        }
        C18091e c18091e4 = this.f13726e;
        if (c18091e4 == c18091e) {
            switch (this.f13724e) {
                case 0:
                    c18091e2 = c18091e4.f35479e;
                    break;
                default:
                    c18091e2 = c18091e4.f35477e;
                    break;
            }
            this.f13726e = c18091e2;
        }
        C18091e c18091e5 = this.f13725e;
        if (c18091e5 == c18091e) {
            C18091e c18091e6 = this.f13726e;
            if (c18091e5 != c18091e6 && c18091e6 != null) {
                c18091e3 = vip(c18091e5);
            }
            this.f13725e = c18091e3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13725e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18091e c18091e = this.f13725e;
        C18091e c18091e2 = this.f13726e;
        this.f13725e = (c18091e == c18091e2 || c18091e2 == null) ? null : vip(c18091e);
        return c18091e;
    }

    public final C18091e vip(C18091e c18091e) {
        switch (this.f13724e) {
            case 0:
                return c18091e.f35477e;
            default:
                return c18091e.f35479e;
        }
    }
}
