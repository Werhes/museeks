package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import java.net.URLEncoder;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10018e extends AbstractC16234e {
    public final boolean license;

    public C10018e(String str, String str2) {
        super(VkConnectResponse.class, "/oauth/vkconnect/vk/token");
        this.license = true;
        C5170e c5170e = C5170e.f11063e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        startapp("device_id", c5170e.amazon());
        startapp("device_os", "android");
        startapp("uuid", URLEncoder.encode(str2, "UTF-8"));
        startapp("silent_token", URLEncoder.encode(str, "UTF-8"));
    }

    @Override // defpackage.AbstractC16234e
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.AbstractC16234e
    public final boolean yandex() {
        return this.license;
    }
}
