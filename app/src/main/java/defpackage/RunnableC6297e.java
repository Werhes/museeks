package defpackage;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6297e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f13121e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13122e;

    public /* synthetic */ RunnableC6297e(AppActivity appActivity, int i) {
        this.f13122e = i;
        this.f13121e = appActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13122e;
        AppActivity appActivity = this.f13121e;
        switch (i) {
            case 0:
                C17641e c17641e = appActivity.f36540e;
                Intent intent = appActivity.getIntent();
                c17641e.getClass();
                C17641e.vip(intent);
                return;
            case 1:
                C10279e c10279e = appActivity.f36542e;
                AppActivity appActivity2 = c10279e.ad;
                AbstractC17680e.mopub((LinearLayout) appActivity2.f36547e.f10511e);
                AbstractC17680e.mopub((CoordinatorLayout) appActivity2.f36547e.f10516e);
                c10279e.appmetrica(EnumC16729e.f32799e, false);
                return;
            default:
                int i2 = AppActivity.f36539e;
                appActivity.f34700e.smaato(new C0963e((String) null, new C0568e(4)));
                return;
        }
    }
}
