package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17940e implements DisplayManager.DisplayListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f35189e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35190e;

    public /* synthetic */ C17940e(int i, Object obj) {
        this.f35190e = i;
        this.f35189e = obj;
    }

    private final void ad(int i) {
    }

    private final void vip(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.f35190e) {
            case 0:
                C0477e c0477e = (C0477e) this.f35189e;
                synchronized (c0477e.metrica) {
                    c0477e.license = null;
                    c0477e.purchase = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f35190e) {
            case 0:
                C0477e c0477e = (C0477e) this.f35189e;
                synchronized (c0477e.metrica) {
                    c0477e.license = null;
                    c0477e.purchase = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                C8356e c8356e = (C8356e) this.f35189e;
                Display defaultDisplay = c8356e.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                c8356e.vip();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.f35190e) {
            case 0:
                C0477e c0477e = (C0477e) this.f35189e;
                synchronized (c0477e.metrica) {
                    c0477e.license = null;
                    c0477e.purchase = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                return;
        }
    }
}
