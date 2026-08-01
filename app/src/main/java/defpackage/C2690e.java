package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690e extends View {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13689e f6566e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Window f6567e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC16666e f6568e;

    private float getBrightness() {
        Window window = this.f6567e;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC9464e.adcel("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f6567e == null) {
            AbstractC9464e.adcel("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            AbstractC9464e.adcel("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f6567e.getAttributes();
        attributes.screenBrightness = f;
        this.f6567e.setAttributes(attributes);
        AbstractC9464e.yandex("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(InterfaceC14003e interfaceC14003e) {
        AbstractC16666e abstractC16666e = this.f6568e;
        if (abstractC16666e == null) {
            AbstractC9464e.yandex("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        EnumC6335e enumC6335e = EnumC6335e.f13177e;
        C5783e c5783e = new C5783e(enumC6335e, interfaceC14003e);
        C5783e yandex = abstractC16666e.yandex();
        abstractC16666e.crashlytics.put(enumC6335e, c5783e);
        C5783e yandex2 = abstractC16666e.yandex();
        if (yandex2 == null || yandex2.equals(yandex)) {
            return;
        }
        abstractC16666e.Signature();
    }

    public InterfaceC14003e getScreenFlash() {
        return this.f6566e;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC16666e abstractC16666e) {
        AbstractC13062e.metrica();
        AbstractC16666e abstractC16666e2 = this.f6568e;
        if (abstractC16666e2 != null && abstractC16666e2 != abstractC16666e) {
            setScreenFlashUiInfo(null);
        }
        this.f6568e = abstractC16666e;
        if (abstractC16666e == null) {
            return;
        }
        AbstractC13062e.metrica();
        if (abstractC16666e.license.m1344native() == 3 && this.f6567e == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC13062e.metrica();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f6567e);
        AbstractC9464e.yandex("ScreenFlashView", sb.toString());
        if (this.f6567e != window) {
            this.f6566e = window == null ? null : new C13689e(this);
        }
        this.f6567e = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
