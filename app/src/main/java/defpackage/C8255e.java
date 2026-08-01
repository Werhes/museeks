package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8255e extends ViewOutlineProvider {
    public final float ad = 8.0f;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        VKXApplication.Companion companion = VKXApplication.f36531e;
        outline.setRoundRect(0, 0, width, height, VKXApplication.Companion.ad(this.ad));
    }
}
