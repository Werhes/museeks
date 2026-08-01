package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16634e extends AbstractC5004e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0916e f32662e;

    public AbstractC16634e() {
        super(false, false);
        this.f32662e = new C0916e();
    }

    @Override // defpackage.AbstractC5004e
    public final void appmetrica(int i, int i2) {
        this.f32662e.vip.startapp(i + i2);
    }

    @Override // defpackage.AbstractC5004e
    public final int billing() {
        return -2;
    }

    public abstract Object isVip(C5435e c5435e);

    @Override // defpackage.AbstractC5004e
    public final void remoteconfig(View view) {
        C4850e c4850e;
        C6194e ad;
        this.f32662e.metrica.setValue(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
        Activity activity = this.f10582e;
        AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
        C13391e c13391e = new C13391e(this.f10590e);
        if (appActivity == null || (ad = appActivity.ad()) == null) {
            c4850e = null;
        } else {
            c4850e = new C4850e();
            C11109e c11109e = new C11109e(c4850e);
            C8198e c8198e = new C8198e(c11109e, new C8595e(c11109e, null));
            c11109e.ad.add(c8198e);
            C11106e.adcel(ad.vip().metrica, c8198e);
        }
        Object isVip = isVip(new C5435e(c13391e, null, null, c4850e));
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C10990e.f21757e);
            composeView.setContent(new C2892e(435544803, true, new C7402e(this, isVip, 0)));
        }
    }

    @Override // defpackage.AbstractC5004e
    public final View smaato(ViewGroup viewGroup) {
        return new ComposeView(viewGroup.getContext(), null, 6);
    }

    public abstract void tapsense(Object obj, C13770e c13770e);
}
