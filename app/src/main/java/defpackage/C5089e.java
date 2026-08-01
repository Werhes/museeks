package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import bruhcollective.itaysonlab.libvkmusic.objects.UserInfo;
import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5089e {
    public final SharedPreferences ad;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public UserInfo metrica;
    public VkConnectResponse vip;

    public C5089e() {
        VkConnectResponse vkConnectResponse;
        Object obj;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        UserInfo userInfo = null;
        Object obj2 = null;
        SharedPreferences sharedPreferences = (vKXApplication == null ? null : vKXApplication).getSharedPreferences("LVMAccount", 0);
        this.ad = sharedPreferences;
        C14172e c14172e = VKXApplication.f36533e;
        AbstractC13345e ad = AbstractC16704e.ad(c14172e, AbstractC3820e.ad(VkConnectResponse.class));
        this.license = ad;
        this.appmetrica = AbstractC16704e.ad(c14172e, AbstractC3820e.ad(UserInfo.class));
        if (ad()) {
            try {
                obj = ad.metrica(new String(Base64.decode(sharedPreferences.getString("data0", BuildConfig.FLAVOR), 0), AbstractC5508e.ad));
            } catch (Exception unused) {
                obj = null;
            }
            vkConnectResponse = (VkConnectResponse) obj;
        } else {
            vkConnectResponse = null;
        }
        this.vip = vkConnectResponse == null ? new VkConnectResponse(7, 0L, null, null) : vkConnectResponse;
        if (ad()) {
            try {
                obj2 = this.appmetrica.metrica(new String(Base64.decode(this.ad.getString("data1", BuildConfig.FLAVOR), 0), AbstractC5508e.ad));
            } catch (Exception unused2) {
            }
            userInfo = (UserInfo) obj2;
        }
        this.metrica = userInfo == null ? new UserInfo(0L, null, null, null, null, 31) : userInfo;
    }

    public final boolean ad() {
        return this.ad.getBoolean("auth", false);
    }

    public final void metrica(VkConnectResponse vkConnectResponse) {
        this.vip = vkConnectResponse;
        String appmetrica = this.license.appmetrica(vkConnectResponse);
        SharedPreferences sharedPreferences = this.ad;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Charset charset = AbstractC5508e.ad;
        edit.putString("data0", new String(Base64.encode(appmetrica.getBytes(charset), 0), charset)).apply();
        sharedPreferences.edit().putBoolean("auth", true).putLong("authTime", System.currentTimeMillis()).apply();
    }

    public final void vip() {
        this.vip = new VkConnectResponse(7, 0L, null, null);
        this.metrica = new UserInfo(0L, null, null, null, null, 31);
        this.ad.edit().clear().apply();
    }
}
