package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18096e implements InterfaceC16681e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f35483e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f35484e;

    public C18096e(String str, String str2) {
        this.f35483e = str;
        this.f35484e = str2;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return true;
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        return this.f35483e;
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return BuildConfig.FLAVOR.equals(this.f35484e);
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        String str = this.f35484e;
        return str == null ? AbstractC5689e.f12083e : str.getBytes(AbstractC4639e.vip);
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        return this.f35484e;
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        return this.f35484e;
    }
}
