package bruhcollective.itaysonlab.libvkmusic.methods.uma;

import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bruhcollective/itaysonlab/libvkmusic/methods/uma/UmaSearch$Preapi", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaSearch$Preapi {
    public final List ad;
    public final List appmetrica;
    public final List license;
    public final List metrica;
    public final List vip;

    public UmaSearch$Preapi(List list, List list2, List list3, List list4, List list5) {
        this.ad = list;
        this.vip = list2;
        this.metrica = list3;
        this.license = list4;
        this.appmetrica = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UmaSearch$Preapi(java.util.List r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            eْۨٝ r1 = defpackage.C13664e.f27089e
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r8 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r8 & 4
            if (r0 == 0) goto L11
            r5 = r1
        L11:
            r0 = r8 & 8
            if (r0 == 0) goto L16
            r6 = r1
        L16:
            r8 = r8 & 16
            if (r8 == 0) goto L21
            r8 = r1
        L1b:
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L23
        L21:
            r8 = r7
            goto L1b
        L23:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaSearch$Preapi)) {
            return false;
        }
        UmaSearch$Preapi umaSearch$Preapi = (UmaSearch$Preapi) obj;
        return AbstractC7890e.billing(this.ad, umaSearch$Preapi.ad) && AbstractC7890e.billing(this.vip, umaSearch$Preapi.vip) && AbstractC7890e.billing(this.metrica, umaSearch$Preapi.metrica) && AbstractC7890e.billing(this.license, umaSearch$Preapi.license) && AbstractC7890e.billing(this.appmetrica, umaSearch$Preapi.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preapi(myMusicTracks=");
        sb.append(this.ad);
        sb.append(", tracks=");
        sb.append(this.vip);
        sb.append(", albums=");
        sb.append(this.metrica);
        sb.append(", artists=");
        sb.append(this.license);
        sb.append(", playlist=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
