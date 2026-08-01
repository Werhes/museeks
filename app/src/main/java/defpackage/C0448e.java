package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؑٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448e {
    public static final C12319e Companion = new Object();
    public static final InterfaceC3477e[] adcel = {null, null, null, AbstractC18039e.appmetrica(2, new C14136e(5)), AbstractC18039e.appmetrica(2, new C14136e(6)), null, null, AbstractC18039e.appmetrica(2, new C14136e(7)), null};
    public final String ad;
    public final List appmetrica;
    public final String billing;
    public final List license;
    public final C11617e metrica;
    public final String purchase;
    public final String startapp;
    public final String vip;
    public final EnumC5502e yandex;

    public /* synthetic */ C0448e(int i, String str, String str2, C11617e c11617e, List list, List list2, String str3, String str4, EnumC5502e enumC5502e, String str5) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C10748e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = c11617e;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = list;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = list2;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = str4;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = enumC5502e;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0448e)) {
            return false;
        }
        C0448e c0448e = (C0448e) obj;
        return AbstractC7890e.billing(this.ad, c0448e.ad) && AbstractC7890e.billing(this.vip, c0448e.vip) && AbstractC7890e.billing(this.metrica, c0448e.metrica) && AbstractC7890e.billing(this.license, c0448e.license) && AbstractC7890e.billing(this.appmetrica, c0448e.appmetrica) && AbstractC7890e.billing(this.purchase, c0448e.purchase) && AbstractC7890e.billing(this.billing, c0448e.billing) && this.yandex == c0448e.yandex && AbstractC7890e.billing(this.startapp, c0448e.startapp);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C11617e c11617e = this.metrica;
        int hashCode3 = (hashCode2 + (c11617e == null ? 0 : c11617e.hashCode())) * 31;
        List list = this.license;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.appmetrica;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.purchase;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billing;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC5502e enumC5502e = this.yandex;
        int hashCode8 = (hashCode7 + (enumC5502e == null ? 0 : enumC5502e.hashCode())) * 31;
        String str4 = this.startapp;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("MediaPopupDto(title=", this.ad, ", id=", this.vip, ", button=");
        tapsense.append(this.metrica);
        tapsense.append(", buttons=");
        tapsense.append(this.license);
        tapsense.append(", icons=");
        tapsense.append(this.appmetrica);
        tapsense.append(", musicSubscriptionEvent=");
        tapsense.append(this.purchase);
        tapsense.append(", text=");
        tapsense.append(this.billing);
        tapsense.append(", imageMode=");
        tapsense.append(this.yandex);
        tapsense.append(", emojiIcons=");
        return AbstractC1786e.signatures(tapsense, this.startapp, ")");
    }
}
