package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٝ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18243e {
    public static final C4485e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C18243e(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18243e)) {
            return false;
        }
        C18243e c18243e = (C18243e) obj;
        return AbstractC7890e.billing(this.ad, c18243e.ad) && AbstractC7890e.billing(this.vip, c18243e.vip);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC17861e.subscription("AudioBooksLegalNoticeDto(title=", this.ad, ", text=", this.vip, ")");
    }
}
