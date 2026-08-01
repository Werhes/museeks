package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC18039e;
import defpackage.AbstractC5756e;
import defpackage.AbstractC7890e;
import defpackage.C11689e;
import defpackage.C12653e;
import defpackage.C1765e;
import defpackage.InterfaceC3477e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCover;", BuildConfig.FLAVOR, "Companion", "eِؓۥ", "eّٟۘ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCover {
    public static final C12653e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C11689e(7))};
    public final List ad;

    public /* synthetic */ PodcastCover(int i, List list) {
        if (1 == (i & 1)) {
            this.ad = list;
        } else {
            AbstractC5756e.billing(i, 1, C1765e.ad.appmetrica());
            throw null;
        }
    }

    public PodcastCover(List list) {
        this.ad = list;
    }

    public final String ad(String str) {
        String str2;
        Object obj;
        Iterator it = this.ad.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC7890e.billing(((PodcastCoverSize) obj).vip, str)) {
                break;
            }
        }
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) obj;
        if (podcastCoverSize != null) {
            String str3 = podcastCoverSize.metrica;
            if (str3.length() == 0) {
                str3 = podcastCoverSize.license;
            }
            str2 = str3;
        }
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }
}
