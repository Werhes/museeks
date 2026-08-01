package defpackage;

import java.util.Arrays;

/* renamed from: eؑۤۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0674e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f2939e = new inmobi(7, C0674e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f2940e;

    public C0674e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.f2940e = bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(25, z, this.f2940e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f2940e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C0674e) {
            return Arrays.equals(this.f2940e, ((C0674e) cdefault).f2940e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f2940e.length, z);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f2940e);
    }
}
