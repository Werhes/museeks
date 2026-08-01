package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16455e implements InterfaceC17873e {
    public final InterfaceC4082e ad;
    public final String appmetrica;
    public final boolean billing;
    public final C15695e license;
    public final int metrica;
    public final boolean purchase;
    public final C14542e vip;

    public C16455e(InterfaceC4082e interfaceC4082e, C14542e c14542e, int i, C15695e c15695e, String str, boolean z, boolean z2) {
        this.ad = interfaceC4082e;
        this.vip = c14542e;
        this.metrica = i;
        this.license = c15695e;
        this.appmetrica = str;
        this.purchase = z;
        this.billing = z2;
    }

    @Override // defpackage.InterfaceC17873e
    public final InterfaceC4082e amazon() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16455e)) {
            return false;
        }
        C16455e c16455e = (C16455e) obj;
        return AbstractC7890e.billing(this.ad, c16455e.ad) && AbstractC7890e.billing(this.vip, c16455e.vip) && this.metrica == c16455e.metrica && AbstractC7890e.billing(this.license, c16455e.license) && AbstractC7890e.billing(this.appmetrica, c16455e.appmetrica) && this.purchase == c16455e.purchase && this.billing == c16455e.billing;
    }

    public final int hashCode() {
        int mopub = AbstractC1786e.mopub(this.metrica, (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31, 31);
        C15695e c15695e = this.license;
        int hashCode = (mopub + (c15695e == null ? 0 : c15695e.hashCode())) * 31;
        String str = this.appmetrica;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC17873e
    public final C14542e license() {
        return this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.ad);
        sb.append(", request=");
        sb.append(this.vip);
        sb.append(", dataSource=");
        sb.append(AbstractC13501e.premium(this.metrica));
        sb.append(", memoryCacheKey=");
        sb.append(this.license);
        sb.append(", diskCacheKey=");
        sb.append(this.appmetrica);
        sb.append(", isSampled=");
        sb.append(this.purchase);
        sb.append(", isPlaceholderCached=");
        return AbstractC8703e.signatures(sb, this.billing, ")");
    }
}
