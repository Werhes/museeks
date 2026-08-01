package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14761e {
    public static final C10975e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {null, AbstractC18039e.appmetrica(2, new C14136e(22)), null, null, null};
    public final int ad;
    public final String appmetrica;
    public final String license;
    public final int metrica;
    public final EnumC14901e vip;

    public /* synthetic */ C14761e(int i, int i2, EnumC14901e enumC14901e, int i3, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C11144e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = enumC14901e;
        this.metrica = i3;
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14761e)) {
            return false;
        }
        C14761e c14761e = (C14761e) obj;
        return this.ad == c14761e.ad && this.vip == c14761e.vip && this.metrica == c14761e.metrica && AbstractC7890e.billing(this.license, c14761e.license) && AbstractC7890e.billing(this.appmetrica, c14761e.appmetrica);
    }

    public final int hashCode() {
        int hashCode = (((this.vip.hashCode() + (this.ad * 31)) * 31) + this.metrica) * 31;
        String str = this.license;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appmetrica;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoSizesDto(height=");
        sb.append(this.ad);
        sb.append(", type=");
        sb.append(this.vip);
        sb.append(", width=");
        sb.append(this.metrica);
        sb.append(", url=");
        sb.append(this.license);
        sb.append(", src=");
        return AbstractC1786e.signatures(sb, this.appmetrica, ")");
    }
}
