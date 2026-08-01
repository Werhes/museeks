package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2303e implements InterfaceC2196e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CameraExtensionCharacteristics f5820e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f5821e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f5822e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5823e;

    public C2303e(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        this.f5823e = str;
        this.f5821e = i;
        this.f5820e = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        AbstractC18039e.appmetrica(2, new C13963e(this, 0));
        AbstractC18039e.appmetrica(2, new C13963e(this, 1));
        this.f5822e = AbstractC18039e.appmetrica(2, new C13963e(this, 2));
        AbstractC18039e.appmetrica(2, new C13963e(this, 3));
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(CameraExtensionCharacteristics.class))) {
            return this.f5820e;
        }
        return null;
    }
}
