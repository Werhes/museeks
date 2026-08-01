package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۠ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9793e implements InterfaceC9610e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Map f19337e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Map f19338e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CaptureRequest f19339e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C9021e f19340e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Map f19341e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f19342e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC6545e f19343e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f19344e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayMap f19345e;

    public C9793e(InterfaceC6545e interfaceC6545e, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, C9021e c9021e, long j) {
        this.f19343e = interfaceC6545e;
        this.f19339e = captureRequest;
        this.f19338e = map;
        this.f19341e = map2;
        this.f19337e = map3;
        this.f19345e = arrayMap;
        this.f19344e = z;
        this.f19340e = c9021e;
        this.f19342e = j;
    }

    @Override // defpackage.InterfaceC0908e
    public final Object ad(C0738e c0738e, C18543e c18543e) {
        Object vip = vip(c0738e);
        return vip == null ? c18543e : vip;
    }

    @Override // defpackage.InterfaceC9610e
    /* renamed from: catch */
    public final long mo2622catch() {
        return this.f19342e;
    }

    @Override // defpackage.InterfaceC9610e
    public final C9021e license() {
        return this.f19340e;
    }

    @Override // defpackage.InterfaceC9610e
    /* renamed from: protected */
    public final boolean mo2623protected() {
        return this.f19344e;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        C12232e c12232e = AbstractC3820e.ad;
        if (interfaceC7227e.equals(c12232e.vip(CaptureRequest.class))) {
            return this.f19339e;
        }
        boolean equals = interfaceC7227e.equals(c12232e.vip(CameraCaptureSession.class));
        InterfaceC6545e interfaceC6545e = this.f19343e;
        if (equals) {
            Object mo754static = interfaceC6545e.mo754static(c12232e.vip(CameraCaptureSession.class));
            if (mo754static == null) {
                return null;
            }
            return mo754static;
        }
        if (!interfaceC7227e.equals(c12232e.vip(C4403e.billing()))) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Check failed.");
        }
        Object mo754static2 = interfaceC6545e.mo754static(c12232e.vip(C4403e.billing()));
        if (mo754static2 == null) {
            return null;
        }
        return mo754static2;
    }

    @Override // defpackage.InterfaceC9610e
    public final Map subs() {
        return this.f19345e;
    }

    @Override // defpackage.InterfaceC0908e
    public final Object vip(C0738e c0738e) {
        Map map = this.f19337e;
        if (map.containsKey(c0738e)) {
            return map.get(c0738e);
        }
        C9021e c9021e = this.f19340e;
        if (c9021e.metrica.containsKey(c0738e)) {
            return c9021e.metrica.get(c0738e);
        }
        Map map2 = this.f19341e;
        return map2.containsKey(c0738e) ? map2.get(c0738e) : this.f19338e.get(c0738e);
    }
}
