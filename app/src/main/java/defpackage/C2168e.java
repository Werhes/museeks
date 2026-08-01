package defpackage;

import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2168e {
    public final C17519e ad = new C17519e(0);
    public final C2692e vip = new C2692e((Object) null);

    public final void ad(loadAd loadad, C8876e c8876e) {
        C17519e c17519e = this.ad;
        C1567e c1567e = (C1567e) c17519e.get(loadad);
        if (c1567e == null) {
            c1567e = C1567e.ad();
            c17519e.put(loadad, c1567e);
        }
        c1567e.metrica = c8876e;
        c1567e.ad |= 8;
    }

    public final void license(loadAd loadad) {
        C2692e c2692e = this.vip;
        int adcel = c2692e.adcel() - 1;
        while (true) {
            if (adcel < 0) {
                break;
            }
            if (loadad == c2692e.mopub(adcel)) {
                Object[] objArr = c2692e.f6572e;
                Object obj = objArr[adcel];
                Object obj2 = AbstractC15182e.ad;
                if (obj != obj2) {
                    objArr[adcel] = obj2;
                    c2692e.f6575e = true;
                }
            } else {
                adcel--;
            }
        }
        C1567e c1567e = (C1567e) this.ad.remove(loadad);
        if (c1567e != null) {
            c1567e.ad = 0;
            c1567e.vip = null;
            c1567e.metrica = null;
            C1567e.license.metrica(c1567e);
        }
    }

    public final void metrica(loadAd loadad) {
        C1567e c1567e = (C1567e) this.ad.get(loadad);
        if (c1567e == null) {
            return;
        }
        c1567e.ad &= -2;
    }

    public final C8876e vip(loadAd loadad, int i) {
        C1567e c1567e;
        C8876e c8876e;
        C17519e c17519e = this.ad;
        int license = c17519e.license(loadad);
        if (license >= 0 && (c1567e = (C1567e) c17519e.startapp(license)) != null) {
            int i2 = c1567e.ad;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c1567e.ad = i3;
                if (i == 4) {
                    c8876e = c1567e.vip;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c8876e = c1567e.metrica;
                }
                if ((i3 & 12) == 0) {
                    c17519e.billing(license);
                    c1567e.ad = 0;
                    c1567e.vip = null;
                    c1567e.metrica = null;
                    C1567e.license.metrica(c1567e);
                }
                return c8876e;
            }
        }
        return null;
    }
}
