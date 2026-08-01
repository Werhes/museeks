package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC15340e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11960e f30259e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f30260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30261e;

    public /* synthetic */ RunnableC15340e(C11960e c11960e, ArrayList arrayList, int i) {
        this.f30261e = i;
        this.f30259e = c11960e;
        this.f30260e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30261e) {
            case 0:
                ArrayList arrayList = this.f30260e;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C11960e c11960e = this.f30259e;
                    if (!hasNext) {
                        arrayList.clear();
                        c11960e.smaato.remove(arrayList);
                        return;
                    }
                    C4210e c4210e = (C4210e) it.next();
                    loadAd loadad = c4210e.ad;
                    int i = c4210e.vip;
                    int i2 = c4210e.metrica;
                    int i3 = c4210e.license;
                    int i4 = c4210e.appmetrica;
                    c11960e.getClass();
                    View view = loadad.ad;
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c11960e.Signature.add(loadad);
                    animate.setDuration(c11960e.appmetrica).setListener(new C15100e(c11960e, loadad, i5, view, i6, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f30260e;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C11960e c11960e2 = this.f30259e;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c11960e2.amazon.remove(arrayList2);
                        return;
                    }
                    C1539e c1539e = (C1539e) it2.next();
                    ArrayList arrayList3 = c11960e2.subscription;
                    long j = c11960e2.purchase;
                    loadAd loadad2 = c1539e.ad;
                    View view2 = loadad2 == null ? null : loadad2.ad;
                    loadAd loadad3 = c1539e.vip;
                    View view3 = loadad3 != null ? loadad3.ad : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(c1539e.ad);
                        duration.translationX(c1539e.appmetrica - c1539e.metrica);
                        duration.translationY(c1539e.purchase - c1539e.license);
                        duration.alpha(0.0f).setListener(new C12830e(c11960e2, c1539e, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c1539e.vip);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C12830e(c11960e2, c1539e, animate2, view3, 1)).start();
                    }
                }
            default:
                ArrayList arrayList4 = this.f30260e;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C11960e c11960e3 = this.f30259e;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c11960e3.advert.remove(arrayList4);
                        return;
                    }
                    loadAd loadad4 = (loadAd) it3.next();
                    c11960e3.getClass();
                    View view4 = loadad4.ad;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c11960e3.loadAd.add(loadad4);
                    animate3.alpha(1.0f).setDuration(c11960e3.metrica).setListener(new C0902e(c11960e3, loadad4, view4, animate3)).start();
                }
        }
    }
}
