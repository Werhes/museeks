package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17679e {
    public boolean appmetrica;
    public InterfaceC18180e license;
    public Interpolator metrica;
    public long vip = -1;
    public final C10374e purchase = new C10374e(this);
    public final ArrayList ad = new ArrayList();

    public final void ad() {
        if (this.appmetrica) {
            Iterator it = this.ad.iterator();
            while (it.hasNext()) {
                ((C14712e) it.next()).vip();
            }
            this.appmetrica = false;
        }
    }

    public final void vip() {
        View view;
        if (this.appmetrica) {
            return;
        }
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C14712e c14712e = (C14712e) it.next();
            long j = this.vip;
            if (j >= 0) {
                c14712e.metrica(j);
            }
            Interpolator interpolator = this.metrica;
            if (interpolator != null && (view = (View) c14712e.ad.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.license != null) {
                c14712e.license(this.purchase);
            }
            View view2 = (View) c14712e.ad.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.appmetrica = true;
    }
}
