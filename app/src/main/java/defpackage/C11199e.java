package defpackage;

import java.util.NoSuchElementException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11199e implements InterfaceC2183e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22462e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f22463e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f22464e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f22465e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22466e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f22467e;

    public /* synthetic */ C11199e(int i) {
        this.f22466e = i;
    }

    public C11199e(C8365e c8365e) {
        this.f22466e = 4;
        this.f22467e = c8365e;
        this.f22464e = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.f22463e = 4;
        this.f22465e = -3;
        this.f22462e = -1;
    }

    public C11199e(C10566e c10566e, long j) {
        this.f22466e = 1;
        String str = c10566e.f20850e;
        C9831e c9831e = new C9831e((byte) 0, 3);
        c9831e.license = str;
        c9831e.vip = -1;
        c9831e.metrica = -1;
        this.f22467e = c9831e;
        this.f22464e = C12347e.billing(j);
        this.f22463e = C12347e.purchase(j);
        this.f22465e = -1;
        this.f22462e = -1;
        int billing = C12347e.billing(j);
        int purchase = C12347e.purchase(j);
        if (billing < 0 || billing > str.length()) {
            StringBuilder premium = AbstractC4653e.premium("start (", billing, ") offset is outside of text region ");
            premium.append(str.length());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (purchase < 0 || purchase > str.length()) {
            StringBuilder premium2 = AbstractC4653e.premium("end (", purchase, ") offset is outside of text region ");
            premium2.append(str.length());
            throw new IndexOutOfBoundsException(premium2.toString());
        }
        if (billing > purchase) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(billing, purchase, "Do not set reversed range: ", " > "));
        }
    }

    public C11199e(C18375e c18375e) {
        this.f22466e = 0;
        C1292e c1292e = c18375e.f36046e;
        this.f22467e = c1292e;
        c1292e.m571try(12);
        this.f22463e = c1292e.firebase() & 255;
        this.f22464e = c1292e.firebase();
    }

    public void ad(int i, int i2) {
        long metrica = AbstractC9262e.metrica(i, i2);
        ((C9831e) this.f22467e).m2682else(i, i2, BuildConfig.FLAVOR);
        long license = AbstractC17487e.license(AbstractC9262e.metrica(this.f22464e, this.f22463e), metrica);
        advert(C12347e.billing(license));
        mopub(C12347e.purchase(license));
        int i3 = this.f22465e;
        if (i3 != -1) {
            long license2 = AbstractC17487e.license(AbstractC9262e.metrica(i3, this.f22462e), metrica);
            if (C12347e.license(license2)) {
                this.f22465e = -1;
                this.f22462e = -1;
            } else {
                this.f22465e = C12347e.billing(license2);
                this.f22462e = C12347e.purchase(license2);
            }
        }
    }

    public void adcel(int i, int i2) {
        C9831e c9831e = (C9831e) this.f22467e;
        if (i < 0 || i > c9831e.m2700interface()) {
            StringBuilder premium = AbstractC4653e.premium("start (", i, ") offset is outside of text region ");
            premium.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 < 0 || i2 > c9831e.m2700interface()) {
            StringBuilder premium2 = AbstractC4653e.premium("end (", i2, ") offset is outside of text region ");
            premium2.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "Do not set reversed range: ", " > "));
        }
        advert(i);
        mopub(i2);
    }

    public void advert(int i) {
        if (!(i >= 0)) {
            AbstractC5525e.ad("Cannot set selectionStart to a negative value: " + i);
        }
        this.f22464e = i;
    }

    public C12347e appmetrica() {
        int i = this.f22465e;
        if (i != -1) {
            return new C12347e(AbstractC9262e.metrica(i, this.f22462e));
        }
        return null;
    }

    public long billing() {
        int i = this.f22465e;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f22467e;
        int i2 = this.f22464e;
        long j = jArr[i2];
        this.f22464e = this.f22462e & (i2 + 1);
        this.f22465e = i - 1;
        return j;
    }

    public char license(int i) {
        C9831e c9831e = (C9831e) this.f22467e;
        C3712e c3712e = (C3712e) c9831e.appmetrica;
        if (c3712e != null && i >= c9831e.vip) {
            int ad = c3712e.vip - c3712e.ad();
            int i2 = c9831e.vip;
            if (i >= ad + i2) {
                return ((String) c9831e.license).charAt(i - ((ad - c9831e.metrica) + i2));
            }
            int i3 = i - i2;
            int i4 = c3712e.license;
            return i3 < i4 ? c3712e.metrica[i3] : c3712e.metrica[(i3 - i4) + c3712e.appmetrica];
        }
        return ((String) c9831e.license).charAt(i);
    }

    @Override // defpackage.InterfaceC2183e
    public int metrica() {
        return this.f22464e;
    }

    public void mopub(int i) {
        if (!(i >= 0)) {
            AbstractC5525e.ad("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f22463e = i;
    }

    @Override // defpackage.InterfaceC2183e
    public int purchase() {
        C1292e c1292e = (C1292e) this.f22467e;
        int i = this.f22463e;
        if (i == 8) {
            return c1292e.ads();
        }
        if (i == 16) {
            return c1292e.m565goto();
        }
        int i2 = this.f22465e;
        this.f22465e = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f22462e & 15;
        }
        int ads = c1292e.ads();
        this.f22462e = ads;
        return (ads & 240) >> 4;
    }

    public void startapp(int i, int i2) {
        C9831e c9831e = (C9831e) this.f22467e;
        if (i < 0 || i > c9831e.m2700interface()) {
            StringBuilder premium = AbstractC4653e.premium("start (", i, ") offset is outside of text region ");
            premium.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 < 0 || i2 > c9831e.m2700interface()) {
            StringBuilder premium2 = AbstractC4653e.premium("end (", i2, ") offset is outside of text region ");
            premium2.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.f22465e = i;
        this.f22462e = i2;
    }

    public String toString() {
        switch (this.f22466e) {
            case 1:
                return ((C9831e) this.f22467e).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2183e
    public int vip() {
        return -1;
    }

    public void yandex(int i, int i2, String str) {
        C9831e c9831e = (C9831e) this.f22467e;
        if (i < 0 || i > c9831e.m2700interface()) {
            StringBuilder premium = AbstractC4653e.premium("start (", i, ") offset is outside of text region ");
            premium.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 < 0 || i2 > c9831e.m2700interface()) {
            StringBuilder premium2 = AbstractC4653e.premium("end (", i2, ") offset is outside of text region ");
            premium2.append(c9831e.m2700interface());
            throw new IndexOutOfBoundsException(premium2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "Do not set reversed range: ", " > "));
        }
        c9831e.m2682else(i, i2, str);
        advert(str.length() + i);
        mopub(str.length() + i);
        this.f22465e = -1;
        this.f22462e = -1;
    }
}
