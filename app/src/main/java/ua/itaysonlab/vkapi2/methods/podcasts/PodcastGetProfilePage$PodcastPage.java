package ua.itaysonlab.vkapi2.methods.podcasts;

import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/podcasts/PodcastGetProfilePage$PodcastPage", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PodcastGetProfilePage$PodcastPage {
    public final PodcastGetProfilePage$PodcastPageInfo ad;
    public final VKResponseWithItems metrica;
    public final VKResponseWithItems vip;

    public PodcastGetProfilePage$PodcastPage(PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo, VKResponseWithItems vKResponseWithItems, VKResponseWithItems vKResponseWithItems2) {
        this.ad = podcastGetProfilePage$PodcastPageInfo;
        this.vip = vKResponseWithItems;
        this.metrica = vKResponseWithItems2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PodcastGetProfilePage$PodcastPage(ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPageInfo r17, ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r18, ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r19, int r20) {
        /*
            r16 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L19
            ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPageInfo r1 = new ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPageInfo
            r14 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L1b
        L19:
            r1 = r17
        L1b:
            r0 = r20 & 2
            if (r0 == 0) goto L2c
            ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r2 = new ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems
            r7 = 0
            r8 = 31
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L2e
        L2c:
            r2 = r18
        L2e:
            r0 = r20 & 4
            if (r0 == 0) goto L41
            ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r3 = new ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems
            r8 = 0
            r9 = 31
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L3e:
            r0 = r16
            goto L44
        L41:
            r3 = r19
            goto L3e
        L44:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPage.<init>(ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPageInfo, ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems, ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastGetProfilePage$PodcastPage)) {
            return false;
        }
        PodcastGetProfilePage$PodcastPage podcastGetProfilePage$PodcastPage = (PodcastGetProfilePage$PodcastPage) obj;
        return AbstractC7890e.billing(this.ad, podcastGetProfilePage$PodcastPage.ad) && AbstractC7890e.billing(this.vip, podcastGetProfilePage$PodcastPage.vip) && AbstractC7890e.billing(this.metrica, podcastGetProfilePage$PodcastPage.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PodcastPage(info=" + this.ad + ", popular=" + this.vip + ", recent=" + this.metrica + ')';
    }
}
