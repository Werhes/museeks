package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18194e extends ContentFrameLayout {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C8158e f35611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18194e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e, C4411e c4411e) {
        super(c4411e, null);
        this.f35611e = layoutInflaterFactory2C8158e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f35611e.isVip(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = this.f35611e;
                layoutInflaterFactory2C8158e.signatures(layoutInflaterFactory2C8158e.subs(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC4628e.purchase(getContext(), i));
    }
}
