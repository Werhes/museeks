package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17090e implements DisplayManager.DisplayListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final DisplayManager f33451e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Choreographer f33453e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile long f33450e = -9223372036854775807L;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile long f33452e = -9223372036854775807L;

    public AbstractC17090e(Choreographer choreographer, DisplayManager displayManager) {
        this.f33453e = choreographer;
        this.f33451e = displayManager;
    }

    public abstract void ad();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public abstract void vip();
}
