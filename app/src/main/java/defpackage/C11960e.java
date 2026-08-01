package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11960e extends AbstractC2199e {
    public static TimeInterpolator remoteconfig;
    public ArrayList Signature;
    public ArrayList adcel;
    public ArrayList admob;
    public ArrayList advert;
    public ArrayList amazon;
    public boolean billing;
    public ArrayList loadAd;
    public ArrayList mopub;
    public ArrayList smaato;
    public ArrayList startapp;
    public ArrayList subscription;
    public ArrayList yandex;

    public static void yandex(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((loadAd) arrayList.get(size)).ad.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, eؓؒۜ] */
    @Override // defpackage.AbstractC2199e
    public final boolean ad(loadAd loadad, loadAd loadad2, C8876e c8876e, C8876e c8876e2) {
        int i;
        int i2;
        int i3 = c8876e.ad;
        int i4 = c8876e.vip;
        if (loadad2.admob()) {
            int i5 = c8876e.ad;
            i2 = c8876e.vip;
            i = i5;
        } else {
            i = c8876e2.ad;
            i2 = c8876e2.vip;
        }
        if (loadad == loadad2) {
            return billing(loadad, i3, i4, i, i2);
        }
        View view = loadad.ad;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        advert(loadad);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = loadad2.ad;
        advert(loadad2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.mopub;
        ?? obj = new Object();
        obj.ad = loadad;
        obj.vip = loadad2;
        obj.metrica = i3;
        obj.license = i4;
        obj.appmetrica = i;
        obj.purchase = i2;
        arrayList.add(obj);
        return true;
    }

    public final void adcel(ArrayList arrayList, loadAd loadad) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1539e c1539e = (C1539e) arrayList.get(size);
            if (mopub(c1539e, loadad) && c1539e.ad == null && c1539e.vip == null) {
                arrayList.remove(c1539e);
            }
        }
    }

    public final void advert(loadAd loadad) {
        if (remoteconfig == null) {
            remoteconfig = new ValueAnimator().getInterpolator();
        }
        loadad.ad.animate().setInterpolator(remoteconfig);
        license(loadad);
    }

    @Override // defpackage.AbstractC2199e
    public final void appmetrica() {
        ArrayList arrayList = this.amazon;
        ArrayList arrayList2 = this.advert;
        ArrayList arrayList3 = this.smaato;
        ArrayList arrayList4 = this.mopub;
        ArrayList arrayList5 = this.startapp;
        ArrayList arrayList6 = this.yandex;
        ArrayList arrayList7 = this.adcel;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C4210e c4210e = (C4210e) arrayList7.get(size);
            View view = c4210e.ad.ad;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            metrica(c4210e.ad);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            metrica((loadAd) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            loadAd loadad = (loadAd) arrayList5.get(size3);
            loadad.ad.setAlpha(1.0f);
            metrica(loadad);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1539e c1539e = (C1539e) arrayList4.get(size4);
            loadAd loadad2 = c1539e.ad;
            if (loadad2 != null) {
                mopub(c1539e, loadad2);
            }
            loadAd loadad3 = c1539e.vip;
            if (loadad3 != null) {
                mopub(c1539e, loadad3);
            }
        }
        arrayList4.clear();
        if (purchase()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C4210e c4210e2 = (C4210e) arrayList8.get(size6);
                    View view2 = c4210e2.ad.ad;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    metrica(c4210e2.ad);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    loadAd loadad4 = (loadAd) arrayList9.get(size8);
                    loadad4.ad.setAlpha(1.0f);
                    metrica(loadad4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1539e c1539e2 = (C1539e) arrayList10.get(size10);
                    loadAd loadad5 = c1539e2.ad;
                    if (loadad5 != null) {
                        mopub(c1539e2, loadad5);
                    }
                    loadAd loadad6 = c1539e2.vip;
                    if (loadad6 != null) {
                        mopub(c1539e2, loadad6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            yandex(this.admob);
            yandex(this.Signature);
            yandex(this.loadAd);
            yandex(this.subscription);
            ArrayList arrayList11 = this.vip;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, eؖٚۧ] */
    public final boolean billing(loadAd loadad, int i, int i2, int i3, int i4) {
        View view = loadad.ad;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        advert(loadad);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            metrica(loadad);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.adcel;
        ?? obj = new Object();
        obj.ad = loadad;
        obj.vip = translationX;
        obj.metrica = translationY;
        obj.license = i3;
        obj.appmetrica = i4;
        arrayList.add(obj);
        return true;
    }

    @Override // defpackage.AbstractC2199e
    public final void license(loadAd loadad) {
        ArrayList arrayList = this.advert;
        ArrayList arrayList2 = this.smaato;
        ArrayList arrayList3 = this.amazon;
        View view = loadad.ad;
        view.animate().cancel();
        ArrayList arrayList4 = this.adcel;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C4210e) arrayList4.get(size)).ad == loadad) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                metrica(loadad);
                arrayList4.remove(size);
            }
        }
        adcel(this.mopub, loadad);
        if (this.yandex.remove(loadad)) {
            view.setAlpha(1.0f);
            metrica(loadad);
        }
        if (this.startapp.remove(loadad)) {
            view.setAlpha(1.0f);
            metrica(loadad);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            adcel(arrayList5, loadad);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C4210e) arrayList6.get(size4)).ad == loadad) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    metrica(loadad);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(loadad)) {
                view.setAlpha(1.0f);
                metrica(loadad);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.admob.remove(loadad);
        this.loadAd.remove(loadad);
        this.subscription.remove(loadad);
        this.Signature.remove(loadad);
        startapp();
    }

    public final boolean mopub(C1539e c1539e, loadAd loadad) {
        if (c1539e.vip == loadad) {
            c1539e.vip = null;
        } else {
            if (c1539e.ad != loadad) {
                return false;
            }
            c1539e.ad = null;
        }
        View view = loadad.ad;
        View view2 = loadad.ad;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        metrica(loadad);
        return true;
    }

    @Override // defpackage.AbstractC2199e
    public final boolean purchase() {
        return (this.startapp.isEmpty() && this.mopub.isEmpty() && this.adcel.isEmpty() && this.yandex.isEmpty() && this.Signature.isEmpty() && this.admob.isEmpty() && this.loadAd.isEmpty() && this.subscription.isEmpty() && this.smaato.isEmpty() && this.advert.isEmpty() && this.amazon.isEmpty()) ? false : true;
    }

    public final void startapp() {
        if (purchase()) {
            return;
        }
        ArrayList arrayList = this.vip;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }
}
