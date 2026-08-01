package defpackage;

import android.view.MotionEvent;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6977e extends ThemedViewPager {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f14293e;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14293e && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f14293e && super.onTouchEvent(motionEvent);
    }

    public final void setPagingEnabled(boolean z) {
        this.f14293e = z;
    }
}
