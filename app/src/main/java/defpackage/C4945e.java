package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؗٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4945e {
    public static final C0754e Companion = new Object();
    public final Boolean ad;
    public final Boolean appmetrica;
    public final Boolean billing;
    public final Boolean license;
    public final Boolean metrica;
    public final Boolean purchase;
    public final Boolean vip;

    public /* synthetic */ C4945e(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = bool;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = bool2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = bool3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = bool4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = bool5;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = bool6;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = bool7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4945e)) {
            return false;
        }
        C4945e c4945e = (C4945e) obj;
        return AbstractC7890e.billing(this.ad, c4945e.ad) && AbstractC7890e.billing(this.vip, c4945e.vip) && AbstractC7890e.billing(this.metrica, c4945e.metrica) && AbstractC7890e.billing(this.license, c4945e.license) && AbstractC7890e.billing(this.appmetrica, c4945e.appmetrica) && AbstractC7890e.billing(this.purchase, c4945e.purchase) && AbstractC7890e.billing(this.billing, c4945e.billing);
    }

    public final int hashCode() {
        Boolean bool = this.ad;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.vip;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.metrica;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.license;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.appmetrica;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.purchase;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.billing;
        return hashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        return "AudioPlaylistPermissionsDto(play=" + this.ad + ", share=" + this.vip + ", edit=" + this.metrica + ", follow=" + this.license + ", delete=" + this.appmetrica + ", boomDownload=" + this.purchase + ", saveAsCopy=" + this.billing + ")";
    }
}
