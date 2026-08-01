package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946e extends AbstractC16234e {
    public final boolean appmetrica;
    public final boolean license;
    public final C6571e purchase;

    public C0946e(String str) {
        super(VkConnectResponse.class, "/oauth/token/");
        this.license = true;
        this.appmetrica = true;
        C5170e c5170e = C5170e.f11063e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.purchase = new C6571e("POST", AbstractC10064e.purchase(new C6571e("device_id", c5170e.amazon()), new C6571e("device_os", "android"), new C6571e("grant_type", "refresh_token"), new C6571e("refresh_token", str)));
    }

    @Override // defpackage.AbstractC16234e
    public final boolean billing() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC16234e
    public final C6571e license() {
        return this.purchase;
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
