package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Text;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Text implements InterfaceC15377e {
    public final String ad;
    public final int metrica;
    public final String vip;

    public /* synthetic */ Catalog2Text(int i, int i2, String str, String str2) {
        this(str, (i2 & 4) != 0 ? 0 : i, str2);
    }

    public Catalog2Text(String str, int i, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Text)) {
            return false;
        }
        Catalog2Text catalog2Text = (Catalog2Text) obj;
        return AbstractC7890e.billing(this.ad, catalog2Text.ad) && AbstractC7890e.billing(this.vip, catalog2Text.vip) && this.metrica == catalog2Text.metrica;
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAd() {
        return this.ad;
    }

    public final int hashCode() {
        return AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Text(id=");
        sb.append(this.ad);
        sb.append(", text=");
        sb.append(this.vip);
        sb.append(", collapsed_lines=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
