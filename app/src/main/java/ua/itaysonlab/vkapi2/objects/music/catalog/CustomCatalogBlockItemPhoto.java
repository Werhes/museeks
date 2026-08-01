package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC5756e;
import defpackage.C0735e;
import defpackage.C2922e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItemPhoto;", BuildConfig.FLAVOR, "Companion", "eؙؑۨ", "eؔۡۗ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomCatalogBlockItemPhoto {
    public static final C2922e Companion = new Object();
    public final int ad;
    public final String license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ CustomCatalogBlockItemPhoto(int i, int i2, int i3, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C0735e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = i3;
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
    }

    public CustomCatalogBlockItemPhoto(int i, int i2, String str, String str2) {
        this.ad = i;
        this.vip = str;
        this.metrica = i2;
        this.license = str2;
    }
}
