package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.C6400e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCoverSize;", BuildConfig.FLAVOR, "Companion", "eؙؖؖ", "eؙٔٓ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCoverSize {
    public static final C6400e Companion = new Object();
    public final int ad;
    public final int appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public PodcastCoverSize(int i, int i2, String str, String str2, String str3) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = i2;
    }

    public /* synthetic */ PodcastCoverSize(int i, int i2, String str, String str2, String str3, int i3) {
        if ((i & 1) == 0) {
            this.ad = 0;
        } else {
            this.ad = i2;
        }
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str2;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str3;
        }
        if ((i & 16) == 0) {
            this.appmetrica = 0;
        } else {
            this.appmetrica = i3;
        }
    }
}
