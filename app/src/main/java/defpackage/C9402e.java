package defpackage;

import android.R;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9402e {
    public static final C9402e ad = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.widget.PopupWindow$OnDismissListener, java.lang.Object] */
    public static void ad(AppActivity appActivity, C15076e c15076e) {
        String str = c15076e.vip;
        String str2 = c15076e.metrica;
        Integer num = c15076e.ad;
        C6571e c6571e = c15076e.license;
        C10985e c10985e = c6571e != null ? new C10985e(Integer.valueOf(c15076e.billing), c6571e.f13544e, c6571e.f13543e) : null;
        C10985e c10985e2 = c15076e.appmetrica;
        C18478e c18478e = new C18478e(appActivity, new C3274e(str, str2, num, c10985e, c10985e2 != null ? new C10985e(c10985e2.f21742e, c10985e2.f21741e, c10985e2.f21740e) : null, c15076e.purchase));
        ComposeView composeView = new ComposeView(appActivity, null, 6);
        composeView.setViewCompositionStrategy(C10990e.f21757e);
        composeView.setContent(new C2892e(-1208591237, true, new C4043e(c18478e, 0)));
        FrameLayout frameLayout = new FrameLayout(appActivity);
        frameLayout.setId(R.id.content);
        AbstractC0436e.startapp(frameLayout, appActivity);
        AbstractC15428e.appmetrica(frameLayout, appActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(composeView);
        PopupWindow popupWindow = new PopupWindow(frameLayout, -1, -2);
        c18478e.f36229e = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = (PopupWindow) c18478e.f36229e;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(false);
        }
        PopupWindow popupWindow3 = (PopupWindow) c18478e.f36229e;
        if (popupWindow3 != 0) {
            popupWindow3.setOnDismissListener(new Object());
        }
        appActivity.getWindow().getDecorView().post(new RunnableC17584e(20, c18478e));
    }
}
