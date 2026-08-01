package defpackage;

import java.util.Arrays;

/* renamed from: eّۥٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12873e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f25719e = new inmobi(19, C12873e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f25720e;

    public C12873e(byte[] bArr) {
        this.f25720e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(20, z, this.f25720e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f25720e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C12873e) {
            return Arrays.equals(this.f25720e, ((C12873e) cdefault).f25720e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f25720e.length, z);
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f25720e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f25720e);
    }
}
