package defpackage;

import java.util.Arrays;

/* renamed from: eؙ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6699e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f13842e = new inmobi(11, C6699e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f13843e;

    public C6699e(byte[] bArr) {
        this.f13843e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(18, z, this.f13843e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f13843e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C6699e) {
            return Arrays.equals(this.f13843e, ((C6699e) cdefault).f13843e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f13843e.length, z);
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f13843e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f13843e);
    }
}
