package ua.itaysonlab.vkapi2.objects.users;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/users/VKProfile;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKProfile implements InterfaceC15377e {
    public static final VKProfile yandex = new VKProfile(0, "Placeholder", BuildConfig.FLAVOR, null, null, null, null, 96);
    public long ad;
    public final String appmetrica;
    public final Boolean billing;
    public final String license;
    public final String metrica;
    public Boolean purchase;
    public final String vip;

    public VKProfile(long j, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = bool;
        this.billing = bool2;
    }

    public /* synthetic */ VKProfile(long j, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }

    public final String ad() {
        String str;
        String str2 = this.vip;
        if (str2 == null || (str = this.metrica) == null) {
            return this.appmetrica;
        }
        return str2 + ' ' + str;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        return String.valueOf(this.ad);
    }

    public final String toString() {
        return "VKProfile(id=" + this.ad + ", renderedName='" + ad() + "')";
    }
}
