package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15302e implements InterfaceC9659e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C15302e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // defpackage.InterfaceC9659e
    public final void ad() {
        int i = this.ad;
        Object obj = this.metrica;
        Object obj2 = this.vip;
        switch (i) {
            case 0:
                ((C7184e) obj2).vip((C5906e) obj);
                return;
            case 1:
                ((C11334e) obj2).ad.unregisterContentObserver((C10274e) obj);
                return;
            case 2:
                ((C17719e) obj2).ad.smaato((C4298e) obj);
                return;
            case 3:
                ((C6017e) obj2).f12672e.advert(obj);
                return;
            case 4:
                ((AbstractC0003e) obj2).vip((InterfaceC12179e) obj);
                return;
            case 5:
                ((C7184e) obj2).vip((C10381e) obj);
                return;
            case 6:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj2;
                C17612e c17612e = (C17612e) interfaceC3314e.getValue();
                if (c17612e != null) {
                    C1867e c1867e = new C1867e(c17612e);
                    C15274e c15274e = (C15274e) obj;
                    if (c15274e != null) {
                        c15274e.vip(c1867e);
                    }
                    interfaceC3314e.setValue(null);
                    return;
                }
                return;
            case 7:
                ((C2809e) obj2).metrica.remove((Function1) obj);
                return;
            case 8:
                ((C13119e) obj2).adcel.remove((C13119e) obj);
                return;
            case 9:
                C13119e c13119e = (C13119e) obj2;
                c13119e.getClass();
                C2919e c2919e = (C2919e) ((C15037e) obj).vip.getValue();
                if (c2919e != null) {
                    c13119e.startapp.remove(c2919e.f6906e);
                    return;
                }
                return;
            case 10:
                ((C13119e) obj2).startapp.remove((C11117e) obj);
                return;
            default:
                C8845e c8845e = (C8845e) obj2;
                View view = (View) obj;
                int i2 = c8845e.signatures - 1;
                c8845e.signatures = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    AbstractC4387e.metrica(view, null);
                    AbstractC2016e.subscription(view, null);
                    view.removeOnAttachStateChangeListener(c8845e.tapsense);
                    return;
                }
                return;
        }
    }
}
