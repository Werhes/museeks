package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC18039e;
import defpackage.AbstractC5756e;
import defpackage.AbstractC7890e;
import defpackage.C14136e;
import defpackage.C3194e;
import defpackage.C5945e;
import defpackage.InterfaceC3477e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/MainArtist;", BuildConfig.FLAVOR, "Companion", "eؙؕۜ", "eؘ۟۠", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainArtist {
    public static final C5945e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {null, null, null, AbstractC18039e.appmetrica(2, new C14136e(2)), null};
    public final String ad;
    public final boolean appmetrica;
    public final List license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ MainArtist(int i, String str, String str2, String str3, List list, boolean z) {
        if (5 != (i & 5)) {
            AbstractC5756e.billing(i, 5, C3194e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        this.metrica = str3;
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = list;
        }
        if ((i & 16) == 0) {
            this.appmetrica = false;
        } else {
            this.appmetrica = z;
        }
    }

    public MainArtist(String str, String str2, String str3, List list, boolean z) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = list;
        this.appmetrica = z;
    }

    public /* synthetic */ MainArtist(String str, String str2, String str3, List list, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MainArtist.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MainArtist mainArtist = (MainArtist) obj;
        return AbstractC7890e.billing(this.ad, mainArtist.ad) && AbstractC7890e.billing(this.metrica, mainArtist.metrica);
    }

    public final int hashCode() {
        String str = this.ad;
        return this.metrica.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }
}
