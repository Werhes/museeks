package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11911e implements InterfaceC7172e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f23857e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9610e f23858e;

    public C11911e(InterfaceC9610e interfaceC9610e, long j) {
        this.f23858e = interfaceC9610e;
        this.f23857e = j;
    }

    @Override // defpackage.InterfaceC7172e
    public final int ads() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11911e) {
            C11911e c11911e = (C11911e) obj;
            return AbstractC7890e.billing(this.f23858e, c11911e.f23858e) && this.f23857e == c11911e.f23857e;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f23858e.hashCode() * 31) + 1237) * 31;
        long j = this.f23857e;
        return (((int) (j ^ (j >>> 32))) + hashCode) * 31;
    }

    @Override // defpackage.InterfaceC7172e
    public final boolean isVip() {
        return false;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        return null;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.f23858e + ", wasImageCaptured=false, frameNumber=" + ((Object) C5125e.ad(this.f23857e)) + ", reason=0)";
    }
}
