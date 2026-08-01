package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17281e extends AbstractC10489e {
    public RecyclerView ad;
    public C3356e appmetrica;
    public final /* synthetic */ int license;
    public final C9384e metrica = new C9384e(this);
    public C3356e purchase;
    public Scroller vip;

    public C17281e(int i) {
        this.license = i;
    }

    public static View appmetrica(adcel adcelVar, AbstractC6945e abstractC6945e) {
        int tapsense = adcelVar.tapsense();
        View view = null;
        if (tapsense == 0) {
            return null;
        }
        int advert = (abstractC6945e.advert() / 2) + abstractC6945e.mopub();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < tapsense; i2++) {
            View signatures = adcelVar.signatures(i2);
            int abs = Math.abs(((abstractC6945e.metrica(signatures) / 2) + abstractC6945e.appmetrica(signatures)) - advert);
            if (abs < i) {
                view = signatures;
                i = abs;
            }
        }
        return view;
    }

    public static int metrica(View view, AbstractC6945e abstractC6945e) {
        return ((abstractC6945e.metrica(view) / 2) + abstractC6945e.appmetrica(view)) - ((abstractC6945e.advert() / 2) + abstractC6945e.mopub());
    }

    public static View purchase(adcel adcelVar, AbstractC6945e abstractC6945e) {
        int tapsense = adcelVar.tapsense();
        View view = null;
        if (tapsense == 0) {
            return null;
        }
        int advert = (abstractC6945e.advert() / 2) + abstractC6945e.mopub();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < tapsense; i2++) {
            View signatures = adcelVar.signatures(i2);
            int abs = Math.abs(((abstractC6945e.metrica(signatures) / 2) + abstractC6945e.appmetrica(signatures)) - advert);
            if (abs < i) {
                view = signatures;
                i = abs;
            }
        }
        return view;
    }

    public final void ad(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.ad;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C9384e c9384e = this.metrica;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c9384e);
            this.ad.setOnFlingListener(null);
        }
        this.ad = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.ad.addOnScrollListener(c9384e);
            this.ad.setOnFlingListener(this);
            this.vip = new Scroller(this.ad.getContext(), new DecelerateInterpolator());
            advert();
        }
    }

    public AbstractC6945e adcel(adcel adcelVar) {
        C3356e c3356e = this.appmetrica;
        if (c3356e == null || ((adcel) c3356e.vip) != adcelVar) {
            this.appmetrica = new C3356e(adcelVar, 1);
        }
        return this.appmetrica;
    }

    public final void advert() {
        adcel layoutManager;
        View billing;
        RecyclerView recyclerView = this.ad;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (billing = billing(layoutManager)) == null) {
            return;
        }
        int[] vip = vip(layoutManager, billing);
        int i = vip[0];
        if (i == 0 && vip[1] == 0) {
            return;
        }
        this.ad.smoothScrollBy(i, vip[1]);
    }

    public final View billing(adcel adcelVar) {
        switch (this.license) {
            case 0:
                if (adcelVar.appmetrica()) {
                    return appmetrica(adcelVar, adcel(adcelVar));
                }
                if (adcelVar.license()) {
                    return appmetrica(adcelVar, yandex(adcelVar));
                }
                return null;
            default:
                if (adcelVar.appmetrica()) {
                    return purchase(adcelVar, mopub(adcelVar));
                }
                if (adcelVar.license()) {
                    return purchase(adcelVar, startapp(adcelVar));
                }
                return null;
        }
    }

    public int license(adcel adcelVar, AbstractC6945e abstractC6945e, int i, int i2) {
        this.vip.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.vip.getFinalX(), this.vip.getFinalY()};
        int tapsense = adcelVar.tapsense();
        float f = 1.0f;
        if (tapsense != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < tapsense; i5++) {
                View signatures = adcelVar.signatures(i5);
                int m145extends = adcel.m145extends(signatures);
                if (m145extends != -1) {
                    if (m145extends < i4) {
                        view = signatures;
                        i4 = m145extends;
                    }
                    if (m145extends > i3) {
                        view2 = signatures;
                        i3 = m145extends;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(abstractC6945e.vip(view), abstractC6945e.vip(view2)) - Math.min(abstractC6945e.appmetrica(view), abstractC6945e.appmetrica(view2));
                if (max != 0) {
                    f = (max * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    public AbstractC6945e mopub(adcel adcelVar) {
        C3356e c3356e = this.appmetrica;
        if (c3356e == null || ((adcel) c3356e.vip) != adcelVar) {
            this.appmetrica = new C3356e(adcelVar, 1);
        }
        return this.appmetrica;
    }

    public AbstractC6945e startapp(adcel adcelVar) {
        C3356e c3356e = this.purchase;
        if (c3356e == null || ((adcel) c3356e.vip) != adcelVar) {
            this.purchase = new C3356e(adcelVar, 0);
        }
        return this.purchase;
    }

    public final int[] vip(adcel adcelVar, View view) {
        switch (this.license) {
            case 0:
                int[] iArr = new int[2];
                if (adcelVar.license()) {
                    AbstractC6945e yandex = yandex(adcelVar);
                    iArr[0] = ((yandex.metrica(view) / 2) + yandex.appmetrica(view)) - ((yandex.advert() / 2) + yandex.mopub());
                } else {
                    iArr[0] = 0;
                }
                if (adcelVar.appmetrica()) {
                    AbstractC6945e adcel = adcel(adcelVar);
                    iArr[1] = ((adcel.metrica(view) / 2) + adcel.appmetrica(view)) - ((adcel.advert() / 2) + adcel.mopub());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (adcelVar.license()) {
                    iArr2[0] = metrica(view, startapp(adcelVar));
                } else {
                    iArr2[0] = 0;
                }
                if (adcelVar.appmetrica()) {
                    iArr2[1] = metrica(view, mopub(adcelVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public AbstractC6945e yandex(adcel adcelVar) {
        C3356e c3356e = this.purchase;
        if (c3356e == null || ((adcel) c3356e.vip) != adcelVar) {
            this.purchase = new C3356e(adcelVar, 0);
        }
        return this.purchase;
    }
}
