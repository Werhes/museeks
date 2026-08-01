package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC4653e;
import defpackage.AbstractC5304e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC8647e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaCover;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaCover {
    public final String ad;
    public final String license;
    public final String metrica;
    public final String vip;

    public UmaCover(String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        ad(1);
        ad(2);
        this.license = ad(4);
    }

    public final String ad(int i) {
        int pro = AbstractC8647e.pro(i);
        String str = this.metrica;
        if (AbstractC5304e.inmobi(str, "?", false)) {
            return str + "&mw=" + pro;
        }
        return str + "?mw=" + pro;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaCover)) {
            return false;
        }
        UmaCover umaCover = (UmaCover) obj;
        return AbstractC7890e.billing(this.ad, umaCover.ad) && AbstractC7890e.billing(this.vip, umaCover.vip) && AbstractC7890e.billing(this.metrica, umaCover.metrica);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        return this.metrica.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaCover(avgColor=");
        sb.append(this.ad);
        sb.append(", accentColor=");
        sb.append(this.vip);
        sb.append(", url=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
