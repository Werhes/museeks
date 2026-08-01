package defpackage;

import java.util.Arrays;

/* renamed from: eَٝۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10409e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f20578e = new inmobi(24, C10409e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f20579e;

    public C10409e(byte[] bArr) {
        this.f20579e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(26, z, this.f20579e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f20579e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C10409e) {
            return Arrays.equals(this.f20579e, ((C10409e) cdefault).f20579e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f20579e.length, z);
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f20579e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f20579e);
    }
}
