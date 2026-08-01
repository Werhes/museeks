package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10824e {
    public static final C10824e license;
    public final int ad;
    public final AbstractC12614e metrica;
    public final int vip;

    /* JADX WARN: Type inference failed for: r1v1, types: [eّۗؐ, eؒۛٞ] */
    static {
        C10824e c10824e;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? abstractC12670e = new AbstractC12670e(4);
            for (int i = 1; i <= 10; i++) {
                abstractC12670e.metrica(Integer.valueOf(AbstractC9413e.signatures(i)));
            }
            c10824e = new C10824e(2, abstractC12670e.billing());
        } else {
            c10824e = new C10824e(2, 10);
        }
        license = c10824e;
    }

    public C10824e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = null;
    }

    public C10824e(int i, Set set) {
        this.ad = i;
        AbstractC12614e admob = AbstractC12614e.admob(set);
        this.metrica = admob;
        AbstractC7014e it = admob.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10824e)) {
            return false;
        }
        C10824e c10824e = (C10824e) obj;
        return this.ad == c10824e.ad && this.vip == c10824e.vip && Objects.equals(this.metrica, c10824e.metrica);
    }

    public final int hashCode() {
        int i = ((this.ad * 31) + this.vip) * 31;
        AbstractC12614e abstractC12614e = this.metrica;
        return i + (abstractC12614e == null ? 0 : abstractC12614e.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.ad + ", maxChannelCount=" + this.vip + ", channelMasks=" + this.metrica + "]";
    }
}
