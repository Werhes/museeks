package bruhcollective.itaysonlab.libvkmusic.objects.auth;

import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/auth/VkConnectResponse;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VkConnectResponse {
    public final long ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ VkConnectResponse(int i, long j, String str, String str2) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? BuildConfig.FLAVOR : str, (i & 4) != 0 ? BuildConfig.FLAVOR : str2);
    }

    public VkConnectResponse(long j, String str, String str2) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
    }
}
