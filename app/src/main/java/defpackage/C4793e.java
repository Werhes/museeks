package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4793e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8004e f10220e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10221e;

    public /* synthetic */ C4793e(C8004e c8004e, int i) {
        this.f10221e = i;
        this.f10220e = c8004e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10221e) {
            case 0:
                this.f10220e.m2514goto(new C0267e());
                return Unit.INSTANCE;
            case 1:
                this.f10220e.m2514goto(new C0267e());
                return Unit.INSTANCE;
            case 2:
                C8004e c8004e = this.f10220e;
                new C17180e(R.string.auth2_skip_auth_title, R.string.auth2_skip_auth_text, R.string.auth2_skip_auth_action, null, null, new C4793e(c8004e, 3), null, 360).signatures(c8004e.pro());
                return Unit.INSTANCE;
            default:
                AppActivity appActivity = (AppActivity) this.f10220e.pro();
                appActivity.getClass();
                C7947e.ad.getClass();
                C7947e.purchase.applovin(C7947e.vip[1], Boolean.TRUE);
                C6703e c6703e = appActivity.f36546e;
                c6703e.metrica();
                c6703e.metrica.yandex();
                AbstractC17680e.amazon((LinearLayout) appActivity.f36547e.f10511e);
                AbstractC17680e.amazon((CoordinatorLayout) appActivity.f36547e.f10516e);
                appActivity.f36542e.license(C2576e.f6436e);
                ((NextDockView) appActivity.f36547e.f10519e).vip(String.valueOf(5), (r3 & 2) != 0, true);
                return Unit.INSTANCE;
        }
    }
}
