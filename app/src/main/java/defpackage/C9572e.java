package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9572e extends AbstractC8761e implements InterfaceC12198e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13774e f19006e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC13984e f19007e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f19008e;

    public C9572e(InterfaceC13984e interfaceC13984e, C13774e c13774e, boolean z) {
        super(C15072e.f29834e);
        this.f19007e = interfaceC13984e;
        this.f19006e = c13774e;
        this.f19008e = z;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC13984e adcel() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC7227e advert() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: class */
    public final AbstractC8761e mo2501class(boolean z) {
        return z == this.f19008e ? this : new C9572e(this.f19007e, this.f19006e, z);
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e crashlytics() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C9572e)) {
            return false;
        }
        C9572e c9572e = (C9572e) obj;
        return AbstractC7890e.billing(this.f19007e, c9572e.f19007e) && AbstractC7890e.billing(this.f19006e, c9572e.f19006e) && this.f19008e == c9572e.f19008e;
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e firebase(boolean z) {
        if (!z) {
            return this;
        }
        throw new Error("Definitely not null captured type is not supported yet: " + this);
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    @Override // defpackage.AbstractC8761e
    public final int hashCode() {
        InterfaceC13984e interfaceC13984e = this.f19007e;
        return ((this.f19006e.hashCode() + ((interfaceC13984e != null ? interfaceC13984e.hashCode() : 0) * 31)) * 31) + (this.f19008e ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: interface */
    public final AbstractC8761e mo2502interface() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean isPro() {
        return false;
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        return null;
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return this.f19008e;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean subs() {
        return false;
    }

    @Override // defpackage.AbstractC8761e
    public final String toString() {
        return this.f19006e.toString();
    }
}
