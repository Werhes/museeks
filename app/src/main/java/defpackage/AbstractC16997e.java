package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16997e extends AbstractC5004e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0916e f33299e;

    public AbstractC16997e(boolean z, int i) {
        super((i & 1) != 0 ? false : z, (i & 2) == 0);
        this.f33299e = new C0916e();
    }

    @Override // defpackage.AbstractC5004e
    public final void appmetrica(int i, int i2) {
        this.f33299e.vip.startapp(i + i2);
    }

    @Override // defpackage.AbstractC5004e
    public final int billing() {
        return -2;
    }

    @Override // defpackage.AbstractC5004e
    public final void remoteconfig(View view) {
        AppActivity appActivity = (AppActivity) this.f10582e;
        this.f33299e.metrica.setValue(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C10990e.f21757e);
            composeView.setContent(new C2892e(1543482085, true, new C16071e(this, appActivity)));
        }
    }

    @Override // defpackage.AbstractC5004e
    public final View smaato(ViewGroup viewGroup) {
        return new ComposeView(viewGroup.getContext(), null, 6);
    }

    public abstract void tapsense(C13770e c13770e, int i);
}
