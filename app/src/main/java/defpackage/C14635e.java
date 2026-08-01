package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14635e {
    public int ad;
    public final ArrayList adcel;
    public final C5221e advert;
    public boolean appmetrica;
    public boolean billing;
    public final ArrayList license;
    public final AbstractComponentCallbacksC17875e metrica;
    public final ArrayList mopub;
    public boolean purchase;
    public boolean startapp;
    public int vip;
    public boolean yandex;

    public C14635e(int i, int i2, C5221e c5221e) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
        this.ad = i;
        this.vip = i2;
        this.metrica = abstractComponentCallbacksC17875e;
        this.license = new ArrayList();
        this.startapp = true;
        ArrayList arrayList = new ArrayList();
        this.adcel = arrayList;
        this.mopub = arrayList;
        this.advert = c5221e;
    }

    public final void ad(ViewGroup viewGroup) {
        this.yandex = false;
        if (this.appmetrica) {
            return;
        }
        this.appmetrica = true;
        if (this.adcel.isEmpty()) {
            vip();
            return;
        }
        for (AbstractC11025e abstractC11025e : AbstractC13480e.m3575continue(this.mopub)) {
            if (!abstractC11025e.vip) {
                abstractC11025e.ad(viewGroup);
            }
            abstractC11025e.vip = true;
        }
    }

    public final void license(int i, int i2) {
        int m2467class = AbstractC8703e.m2467class(i2);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m2467class == 0) {
            if (this.ad != 1) {
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC17875e + " mFinalState = " + AbstractC1786e.premium(this.ad) + " -> " + AbstractC1786e.premium(i) + '.');
                }
                this.ad = i;
                return;
            }
            return;
        }
        if (m2467class == 1) {
            if (this.ad == 1) {
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC17875e + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC1786e.ads(this.vip) + " to ADDING.");
                }
                this.ad = 2;
                this.vip = 2;
                this.startapp = true;
                return;
            }
            return;
        }
        if (m2467class != 2) {
            return;
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC17875e + " mFinalState = " + AbstractC1786e.premium(this.ad) + " -> REMOVED. mLifecycleImpact  = " + AbstractC1786e.ads(this.vip) + " to REMOVING.");
        }
        this.ad = 1;
        this.vip = 3;
        this.startapp = true;
    }

    public final void metrica(AbstractC11025e abstractC11025e) {
        ArrayList arrayList = this.adcel;
        if (arrayList.remove(abstractC11025e) && arrayList.isEmpty()) {
            vip();
        }
    }

    public final String toString() {
        StringBuilder applovin = AbstractC8703e.applovin("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        applovin.append(AbstractC1786e.premium(this.ad));
        applovin.append(" lifecycleImpact = ");
        applovin.append(AbstractC1786e.ads(this.vip));
        applovin.append(" fragment = ");
        applovin.append(this.metrica);
        applovin.append('}');
        return applovin.toString();
    }

    public final void vip() {
        this.yandex = false;
        if (!this.purchase) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.purchase = true;
            Iterator it = this.license.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.metrica.f35070e = false;
        this.advert.mopub();
    }
}
