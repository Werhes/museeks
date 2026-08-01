package defpackage;

import java.util.Arrays;

/* renamed from: eٍؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9169e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f18345e = new inmobi(15, C9169e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f18346e;

    public C9169e(byte[] bArr) {
        this.f18346e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(19, z, this.f18346e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f18346e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C9169e) {
            return Arrays.equals(this.f18346e, ((C9169e) cdefault).f18346e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f18346e.length, z);
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f18346e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f18346e);
    }
}
