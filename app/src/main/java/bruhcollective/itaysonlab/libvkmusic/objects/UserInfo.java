package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.C13664e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UserInfo;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserInfo {
    public final long ad;
    public final List appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public UserInfo(long j, String str, String str2, String str3, List list) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = list;
    }

    public /* synthetic */ UserInfo(long j, String str, String str2, String str3, List list, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? BuildConfig.FLAVOR : str, (i & 4) != 0 ? BuildConfig.FLAVOR : str2, (i & 8) != 0 ? BuildConfig.FLAVOR : str3, (i & 16) != 0 ? C13664e.f27089e : list);
    }
}
