package defpackage;

import java.util.Arrays;

/* renamed from: eُ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17568e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f34414e = new inmobi(23, C17568e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f34415e;

    public C17568e(byte[] bArr) {
        this.f34415e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(21, z, this.f34415e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f34415e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C17568e) {
            return Arrays.equals(this.f34415e, ((C17568e) cdefault).f34415e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f34415e.length, z);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f34415e);
    }
}
