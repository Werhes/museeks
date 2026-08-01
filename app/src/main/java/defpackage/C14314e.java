package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentResolver;
import android.os.Build;
import com.samsung.android.app.musiclibrary.ui.widget.TransitionView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14314e implements InterfaceC13619e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Activity f28306e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ContentResolver f28307e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f28308e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14373e f28309e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5008e f28310e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28311e;

    public C14314e(Activity activity, TransitionView transitionView) {
        this.f28306e = activity;
        int i = activity.getResources().getConfiguration().uiMode;
        this.f28308e = activity.getResources().getConfiguration().orientation == 2;
        this.f28307e = activity.getContentResolver();
        this.f28309e = new C14373e(this, transitionView.getHandler(), 0);
        C4052e c4052e = new C4052e(0);
        C0348e c0348e = new C0348e(activity);
        transitionView.setCurrentImageDrawable(c0348e);
        this.f28310e = new C5008e(transitionView, c0348e, c4052e);
        c0348e.ad = new C0609e(16, this);
        if (activity instanceof AbstractActivityC15824e) {
            ((AbstractActivityC15824e) activity).f8255e.ad(this);
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onDestroy(InterfaceC16400e interfaceC16400e) {
        C5008e c5008e = this.f28310e;
        if (c5008e != null) {
            C12177e c12177e = c5008e.purchase;
            ((ValueAnimator) c12177e.yandex()).cancel();
            ((ValueAnimator) c12177e.yandex()).removeAllListeners();
        }
        interfaceC16400e.vip().vip(this);
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onPause(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onResume(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStart(InterfaceC16400e interfaceC16400e) {
        C5008e c5008e = this.f28310e;
        if (c5008e == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C8419e c8419e = AbstractC5857e.f12387implements;
            InterfaceC5083e interfaceC5083e = null;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            AbstractC5857e.f12387implements = AbstractC5336e.purchase(C5162e.f11047e, null, 0, new C0948e(this, interfaceC5083e, 0), 3);
            return;
        }
        if (!c5008e.appmetrica) {
            c5008e.appmetrica = true;
            if (c5008e.license) {
                ((ValueAnimator) c5008e.purchase.yandex()).resume();
            }
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        C5008e c5008e = this.f28310e;
        if (c5008e == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (c5008e.appmetrica) {
                c5008e.appmetrica = false;
            }
        } else {
            C8419e c8419e = AbstractC5857e.f12387implements;
            InterfaceC5083e interfaceC5083e = null;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            AbstractC5857e.f12387implements = AbstractC5336e.purchase(C5162e.f11047e, null, 0, new C0948e(this, interfaceC5083e, 1), 3);
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void purchase() {
    }
}
