package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.C1630e;
import defpackage.EnumC6410e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioSnippetEntry;", BuildConfig.FLAVOR, "eؙٕؔ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioSnippetEntry {
    public final String ad;
    public final String appmetrica;
    public final List billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;
    public final List yandex;

    public AudioSnippetEntry(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        Object obj;
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
        this.purchase = str6;
        this.billing = list;
        this.yandex = list2;
        C1630e c1630e = new C1630e(0, EnumC6410e.f13288e);
        while (true) {
            if (!c1630e.hasNext()) {
                obj = null;
                break;
            } else {
                obj = c1630e.next();
                if (((EnumC6410e) obj).f13290e.equals(this.ad)) {
                    break;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AudioSnippetEntry(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.util.List r10, int r11) {
        /*
            r2 = this;
            r0 = r11 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r0 = r11 & 4
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r11 & 8
            if (r0 == 0) goto L11
            r6 = r1
        L11:
            r0 = r11 & 16
            if (r0 == 0) goto L16
            r7 = r1
        L16:
            r0 = r11 & 32
            if (r0 == 0) goto L1b
            r8 = r1
        L1b:
            r0 = r11 & 64
            eْۨٝ r1 = defpackage.C13664e.f27089e
            if (r0 == 0) goto L22
            r9 = r1
        L22:
            r11 = r11 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L30
            r11 = r1
        L27:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L32
        L30:
            r11 = r10
            goto L27
        L32:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSnippetEntry)) {
            return false;
        }
        AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj;
        return AbstractC7890e.billing(this.ad, audioSnippetEntry.ad) && AbstractC7890e.billing(this.vip, audioSnippetEntry.vip) && AbstractC7890e.billing(this.metrica, audioSnippetEntry.metrica) && AbstractC7890e.billing(this.license, audioSnippetEntry.license) && AbstractC7890e.billing(this.appmetrica, audioSnippetEntry.appmetrica) && AbstractC7890e.billing(this.purchase, audioSnippetEntry.purchase) && AbstractC7890e.billing(this.billing, audioSnippetEntry.billing) && AbstractC7890e.billing(this.yandex, audioSnippetEntry.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license), 31, this.appmetrica), 31, this.purchase), 31, this.billing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSnippetEntry(type=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", text=");
        sb.append(this.metrica);
        sb.append(", nav_url=");
        sb.append(this.license);
        sb.append(", image=");
        sb.append(this.appmetrica);
        sb.append(", track_code=");
        sb.append(this.purchase);
        sb.append(", audios=");
        sb.append(this.billing);
        sb.append(", audio_ids=");
        return AbstractC1786e.tapsense(sb, this.yandex, ')');
    }
}
