package defpackage;

import java.util.Arrays;

/* renamed from: eؚؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1669e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f4593e = new inmobi(5, C1669e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f4594e;

    public C1669e(byte[] bArr) {
        this.f4594e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(27, z, this.f4594e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f4594e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C1669e) {
            return Arrays.equals(this.f4594e, ((C1669e) cdefault).f4594e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f4594e.length, z);
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f4594e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f4594e);
    }
}
