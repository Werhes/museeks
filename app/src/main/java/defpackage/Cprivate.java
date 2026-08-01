package defpackage;

import java.util.Arrays;

/* renamed from: private, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cprivate extends Cdefault {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f36445e = new inmobi(20, Cprivate.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36446e;

    public Cprivate(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f36446e = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(23, z, this.f36446e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36446e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (!(cdefault instanceof Cprivate)) {
            return false;
        }
        return Arrays.equals(this.f36446e, ((Cprivate) cdefault).f36446e);
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36446e.length, z);
    }

    public final String subs() {
        StringBuilder sb;
        String substring;
        String ad = AbstractC1433e.ad(this.f36446e);
        if (ad.indexOf(45) >= 0 || ad.indexOf(43) >= 0) {
            int indexOf = ad.indexOf(45);
            if (indexOf < 0) {
                indexOf = ad.indexOf(43);
            }
            if (indexOf == ad.length() - 3) {
                ad = ad.concat("00");
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(ad.substring(0, 10));
                sb.append("00GMT");
                sb.append(ad.substring(10, 13));
                sb.append(":");
                substring = ad.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(ad.substring(0, 12));
                sb.append("GMT");
                sb.append(ad.substring(12, 15));
                sb.append(":");
                substring = ad.substring(15, 17);
            }
        } else if (ad.length() == 11) {
            sb = new StringBuilder();
            sb.append(ad.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(ad.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    public final String toString() {
        return AbstractC1433e.ad(this.f36446e);
    }
}
