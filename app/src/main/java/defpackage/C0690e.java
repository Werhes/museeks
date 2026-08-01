package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690e {
    public final C18516e ad;
    public final C2025e adcel;
    public int advert;
    public boolean amazon;
    public final int appmetrica;
    public int billing;
    public Object[] license;
    public final int metrica;
    public int mopub;
    public boolean purchase;
    public int smaato;
    public int startapp;
    public final int[] vip;
    public int yandex;

    public C0690e(C18516e c18516e) {
        this.ad = c18516e;
        this.vip = c18516e.f36309e;
        int i = c18516e.f36304e;
        this.metrica = i;
        this.license = c18516e.f36302e;
        this.appmetrica = c18516e.f36307e;
        this.yandex = i;
        this.startapp = -1;
        this.adcel = new C2025e((byte) 0, 2);
    }

    public final Object Signature(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.license[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final C3155e ad(int i) {
        ArrayList arrayList = this.ad.f36308e;
        int purchase = AbstractC2855e.purchase(arrayList, i, this.metrica);
        if (purchase >= 0) {
            return (C3155e) arrayList.get(purchase);
        }
        C3155e c3155e = new C3155e(i);
        arrayList.add(-(purchase + 1), c3155e);
        return c3155e;
    }

    public final boolean adcel(int i) {
        return (this.vip[(i * 5) + 1] & 134217728) != 0;
    }

    public final int admob(int i) {
        return this.vip[(i * 5) + 2];
    }

    public final boolean advert(int i) {
        return (this.vip[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object amazon(int i) {
        int i2 = i * 5;
        int[] iArr = this.vip;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.license[iArr[i2 + 4]] : C2987e.ad;
        }
        return null;
    }

    public final void appmetrica() {
        if (this.mopub == 0) {
            if (!(this.billing == this.yandex)) {
                AbstractC1889e.ad("endGroup() not called at the end of a group");
            }
            int i = (this.startapp * 5) + 2;
            int[] iArr = this.vip;
            int i2 = iArr[i];
            this.startapp = i2;
            int i3 = this.metrica;
            this.yandex = i2 < 0 ? i3 : AbstractC2855e.ad(iArr, i2) + i2;
            int license = this.adcel.license();
            if (license < 0) {
                this.advert = 0;
                this.smaato = 0;
            } else {
                this.advert = license;
                this.smaato = i2 >= i3 - 1 ? this.appmetrica : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final int billing() {
        int i = this.billing;
        if (i >= this.yandex) {
            return 0;
        }
        return this.vip[i * 5];
    }

    public final boolean license(int i) {
        return (this.vip[(i * 5) + 1] & 67108864) != 0;
    }

    public final int loadAd(int i) {
        return this.vip[(i * 5) + 1] & 67108863;
    }

    public final void metrica() {
        this.purchase = true;
        C18516e c18516e = this.ad;
        c18516e.getClass();
        if (this.ad != c18516e || c18516e.f36301e <= 0) {
            AbstractC1889e.ad("Unexpected reader close()");
        }
        c18516e.f36301e--;
        this.license = new Object[0];
    }

    public final boolean mopub(int i) {
        return (this.vip[(i * 5) + 1] & 536870912) != 0;
    }

    public final void pro() {
        if (!(this.mopub == 0)) {
            AbstractC1889e.ad("Cannot skip the enclosing group while in an empty region");
        }
        this.billing = this.yandex;
        this.advert = 0;
        this.smaato = 0;
    }

    public final Object purchase() {
        int i = this.billing;
        if (i < this.yandex) {
            return vip(this.vip, i);
        }
        return 0;
    }

    public final int remoteconfig() {
        if (!(this.mopub == 0)) {
            AbstractC1889e.ad("Cannot skip while in an empty region");
        }
        int i = this.billing;
        int[] iArr = this.vip;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.billing = AbstractC2855e.ad(iArr, i) + i;
        return i2;
    }

    public final void signatures() {
        if (this.mopub <= 0) {
            int i = this.startapp;
            int i2 = this.billing;
            int[] iArr = this.vip;
            if (!(iArr[(i2 * 5) + 2] == i)) {
                AbstractC6536e.ad("Invalid slot table detected");
            }
            int i3 = this.advert;
            int i4 = this.smaato;
            C2025e c2025e = this.adcel;
            if (i3 == 0 && i4 == 0) {
                c2025e.appmetrica(-1);
            } else {
                c2025e.appmetrica(i3);
            }
            this.startapp = i2;
            this.yandex = AbstractC2855e.ad(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.billing = i5;
            this.advert = AbstractC2855e.metrica(iArr, i2);
            this.smaato = i2 >= this.metrica - 1 ? this.appmetrica : iArr[(i5 * 5) + 4];
        }
    }

    public final Object smaato() {
        int i;
        if (this.mopub > 0 || (i = this.advert) >= this.smaato) {
            this.amazon = false;
            return C2987e.ad;
        }
        this.amazon = true;
        Object[] objArr = this.license;
        this.advert = i + 1;
        return objArr[i];
    }

    public final int startapp(int i) {
        return this.vip[i * 5];
    }

    public final void subscription(int i) {
        if (!(this.mopub == 0)) {
            AbstractC1889e.ad("Cannot reposition while in an empty region");
        }
        this.billing = i;
        int[] iArr = this.vip;
        int i2 = this.metrica;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.startapp) {
            this.startapp = i3;
            if (i3 < 0) {
                this.yandex = i2;
            } else {
                this.yandex = AbstractC2855e.ad(iArr, i3) + i3;
            }
            this.advert = 0;
            this.smaato = 0;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.billing);
        sb.append(", key=");
        sb.append(billing());
        sb.append(", parent=");
        sb.append(this.startapp);
        sb.append(", end=");
        return AbstractC1786e.pro(sb, this.yandex, ')');
    }

    public final Object vip(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.license[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C2987e.ad;
    }

    public final Object yandex(int i, int i2) {
        int[] iArr = this.vip;
        int metrica = AbstractC2855e.metrica(iArr, i);
        int i3 = i + 1;
        int i4 = metrica + i2;
        return i4 < (i3 < this.metrica ? iArr[(i3 * 5) + 4] : this.appmetrica) ? this.license[i4] : C2987e.ad;
    }
}
