package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2655e extends AbstractC13532e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f6524e;

    public C2655e(byte[] bArr) {
        bArr.getClass();
        this.f6524e = bArr;
    }

    @Override // defpackage.AbstractC13532e
    public final int Signature(int i, int i2, int i3) {
        int crashlytics = crashlytics() + i2;
        AbstractC18380e.ad.getClass();
        return C16728e.signatures(i, crashlytics, i3 + crashlytics, this.f6524e);
    }

    @Override // defpackage.AbstractC13532e
    public void adcel(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f6524e, i, bArr, i2, i3);
    }

    @Override // defpackage.AbstractC13532e
    public final AbstractC13532e admob(int i, int i2) {
        int isVip = AbstractC13532e.isVip(i, i2, startapp());
        if (isVip == 0) {
            return AbstractC13532e.f26826e;
        }
        return new C3846e(this.f6524e, crashlytics() + i, isVip);
    }

    @Override // defpackage.AbstractC13532e
    public final int advert() {
        return 0;
    }

    @Override // defpackage.AbstractC13532e
    public byte appmetrica(int i) {
        return this.f6524e[i];
    }

    @Override // defpackage.AbstractC13532e
    public byte billing(int i) {
        return this.f6524e[i];
    }

    public int crashlytics() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC13532e) && startapp() == ((AbstractC13532e) obj).startapp()) {
            if (startapp() == 0) {
                return true;
            }
            if (!(obj instanceof C2655e)) {
                return obj.equals(this);
            }
            C2655e c2655e = (C2655e) obj;
            int i = this.f26827e;
            int i2 = c2655e.f26827e;
            if (i == 0 || i2 == 0 || i == i2) {
                return firebase(c2655e, 0, startapp());
            }
        }
        return false;
    }

    public final boolean firebase(C2655e c2655e, int i, int i2) {
        if (i2 > c2655e.startapp()) {
            throw new IllegalArgumentException("Length too large: " + i2 + startapp());
        }
        if (i + i2 > c2655e.startapp()) {
            int startapp = c2655e.startapp();
            StringBuilder pro = AbstractC17861e.pro(i, i2, "Ran off end of other: ", ", ", ", ");
            pro.append(startapp);
            throw new IllegalArgumentException(pro.toString());
        }
        byte[] bArr = c2655e.f6524e;
        int crashlytics = crashlytics() + i2;
        int crashlytics2 = crashlytics();
        int crashlytics3 = c2655e.crashlytics() + i;
        while (crashlytics2 < crashlytics) {
            if (this.f6524e[crashlytics2] != bArr[crashlytics3]) {
                return false;
            }
            crashlytics2++;
            crashlytics3++;
        }
        return true;
    }

    @Override // defpackage.AbstractC13532e
    public final int loadAd(int i, int i2, int i3) {
        int crashlytics = crashlytics() + i2;
        Charset charset = AbstractC12312e.ad;
        for (int i4 = crashlytics; i4 < crashlytics + i3; i4++) {
            i = (i * 31) + this.f6524e[i4];
        }
        return i;
    }

    @Override // defpackage.AbstractC13532e
    public final void remoteconfig(C5633e c5633e) {
        c5633e.mopub(crashlytics(), startapp(), this.f6524e);
    }

    @Override // defpackage.AbstractC13532e
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC13532e
    public int startapp() {
        return this.f6524e.length;
    }

    @Override // defpackage.AbstractC13532e
    public final String subscription(Charset charset) {
        return new String(this.f6524e, crashlytics(), startapp(), charset);
    }

    @Override // defpackage.AbstractC13532e
    public final boolean tapsense() {
        int crashlytics = crashlytics();
        int startapp = startapp() + crashlytics;
        AbstractC18380e.ad.getClass();
        return C16728e.signatures(0, crashlytics, startapp, this.f6524e) == 0;
    }
}
