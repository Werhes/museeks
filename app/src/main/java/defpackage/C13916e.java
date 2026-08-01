package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13916e implements InterfaceC2786e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final List f27627e = Collections.singletonList(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13825e f27628e;

    public C13916e(C13825e c13825e) {
        this.f27628e = c13825e;
    }

    @Override // defpackage.InterfaceC2786e
    public final float ad() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC2786e
    public final Rect adcel() {
        C9000e c9000e = (C9000e) this.f27628e.vip;
        Rect rect = (Rect) c9000e.metrica(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            return rect;
        }
        if (AbstractC9464e.admob()) {
            Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) C5060e.vip(c9000e.f18066e)) + '!');
        }
        return new Rect(0, 0, 4000, 3000);
    }

    @Override // defpackage.InterfaceC2786e
    public final InterfaceC1908e advert(InterfaceC7865e interfaceC7865e) {
        return AbstractC16565e.ad(Unit.INSTANCE);
    }

    @Override // defpackage.InterfaceC2786e
    public final float license() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC2786e
    public final InterfaceC1908e smaato(float f, InterfaceC7865e interfaceC7865e) {
        return AbstractC16565e.ad(Unit.INSTANCE);
    }
}
