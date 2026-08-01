package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَؘۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10620e {
    public static final C10620e billing;
    public final String ad;
    public final List appmetrica;
    public final List license;
    public final boolean metrica;
    public final String vip;
    public static final C4538e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {null, null, null, AbstractC18039e.appmetrica(2, new C0996e(16)), AbstractC18039e.appmetrica(2, new C0996e(17))};

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؖۨ, java.lang.Object] */
    static {
        List startapp = AbstractC6874e.startapp(32, 63, 125, 250, 500, 1000, 2000, 4000, 8000, Integer.valueOf(AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE));
        Double valueOf = Double.valueOf(0.0d);
        billing = new C10620e("flat", "Flat", true, startapp, AbstractC6874e.startapp(valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf));
    }

    public /* synthetic */ C10620e(int i, String str, String str2, boolean z, List list, List list2) {
        if (27 != (i & 27)) {
            AbstractC5756e.billing(i, 27, C0012e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        if ((i & 4) == 0) {
            this.metrica = false;
        } else {
            this.metrica = z;
        }
        this.license = list;
        this.appmetrica = list2;
    }

    public C10620e(String str, String str2, boolean z, List list, List list2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = z;
        this.license = list;
        this.appmetrica = list2;
    }

    public static C10620e ad(C10620e c10620e, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = c10620e.ad;
        }
        return new C10620e(str, str2, (i & 4) != 0 ? c10620e.metrica : false, c10620e.license, c10620e.appmetrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10620e)) {
            return false;
        }
        C10620e c10620e = (C10620e) obj;
        return AbstractC7890e.billing(this.ad, c10620e.ad) && AbstractC7890e.billing(this.vip, c10620e.vip) && this.metrica == c10620e.metrica && AbstractC7890e.billing(this.license, c10620e.license) && AbstractC7890e.billing(this.appmetrica, c10620e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC17861e.billing((AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + (this.metrica ? 1231 : 1237)) * 31, 31, this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DspStoredPreset(id=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", default=");
        sb.append(this.metrica);
        sb.append(", bands=");
        sb.append(this.license);
        sb.append(", gains=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
