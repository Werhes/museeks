package defpackage;

import android.view.ActionMode;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6035e implements InterfaceC9659e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C6035e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC9659e
    public final void ad() {
        C8419e c8419e;
        switch (this.ad) {
            case 0:
                ((Window) this.vip).clearFlags(128);
                return;
            case 1:
                C15172e c15172e = ((C13199e) this.vip).ad;
                if (c15172e == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                c15172e.license();
                return;
            case 2:
                DialogC4128e dialogC4128e = (DialogC4128e) this.vip;
                dialogC4128e.dismiss();
                dialogC4128e.f9095e.appmetrica();
                return;
            case 3:
                C5385e c5385e = (C5385e) this.vip;
                c5385e.appmetrica();
                c5385e.getClass();
                AbstractC0436e.startapp(c5385e, null);
                c5385e.f11525e.removeViewImmediate(c5385e);
                return;
            case 4:
                C0438e c0438e = (C0438e) this.vip;
                C13128e c13128e = c0438e.appmetrica;
                C2007e c2007e = c13128e.yandex;
                if (c2007e != null) {
                    c2007e.vip();
                }
                c13128e.ad();
                ActionMode actionMode = c0438e.yandex;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0438e.yandex = null;
                return;
            case 5:
                C8990e c8990e = (C8990e) ((C16711e) this.vip).metrica.getValue();
                if (c8990e != null) {
                    c8990e.close();
                    return;
                }
                return;
            case 6:
                C7765e c7765e = (C7765e) this.vip;
                C16679e c16679e = c7765e.purchase.ad;
                if (c16679e != null && (c8419e = c16679e.f32722e) != null) {
                    c8419e.Signature(null);
                    c16679e.f32722e = null;
                }
                c7765e.mopub = null;
                return;
            case 7:
                C13578e c13578e = ((C6540e) this.vip).license;
                if (c13578e != null) {
                    c13578e.ad(null);
                    return;
                }
                return;
            case 8:
                ((C14185e) this.vip).f28032e.invoke();
                return;
            case 9:
                ((C15860e) this.vip).loadAd();
                return;
            case 10:
                ((C3430e) this.vip).license = null;
                return;
            case 11:
                C7513e c7513e = (C7513e) this.vip;
                C5609e c5609e = c7513e.metrica;
                if (c5609e != null) {
                    c5609e.f11963e = false;
                }
                c7513e.metrica = null;
                return;
            case 12:
                ((C8258e) this.vip).purchase = true;
                return;
            case 13:
                DialogC5439e dialogC5439e = (DialogC5439e) this.vip;
                dialogC5439e.dismiss();
                dialogC5439e.f11705e.appmetrica();
                return;
            case 14:
                ((C8791e) this.vip).appmetrica = null;
                return;
            case 15:
                C4034e c4034e = (C4034e) this.vip;
                c4034e.startapp();
                c4034e.startapp.setValue(Boolean.FALSE);
                return;
            default:
                ((C18070e) this.vip).license();
                return;
        }
    }
}
