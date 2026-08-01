package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8198e extends AbstractC13388e {
    public boolean appmetrica;
    public final C11109e license;

    public C8198e(C11109e c11109e, C8595e c8595e) {
        super(c8595e, c11109e.vip);
        this.license = c11109e;
        this.appmetrica = true;
    }

    @Override // defpackage.AbstractC13388e
    public final void ad() {
        C11887e c11887e;
        Function0 function0;
        C11109e c11109e = this.license;
        switch (c11109e.license) {
            case 1:
                ((AbstractC11130e) c11109e.appmetrica).mo2808e();
                return;
            case 2:
                AbstractC15958e abstractC15958e = (AbstractC15958e) c11109e.appmetrica;
                if (AbstractC15958e.m4045native(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC15958e);
                }
                if (AbstractC15958e.m4045native(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + abstractC15958e.yandex);
                }
                C10159e c10159e = abstractC15958e.yandex;
                if (c10159e != null) {
                    c10159e.subscription = false;
                    c10159e.license();
                    C10159e c10159e2 = abstractC15958e.yandex;
                    RunnableC2783e runnableC2783e = new RunnableC2783e(9, abstractC15958e);
                    if (c10159e2.Signature == null) {
                        c10159e2.Signature = new ArrayList();
                    }
                    c10159e2.Signature.add(runnableC2783e);
                    abstractC15958e.yandex.appmetrica(false, true);
                    abstractC15958e.startapp = true;
                    abstractC15958e.applovin(true);
                    abstractC15958e.crashlytics();
                    abstractC15958e.startapp = false;
                    abstractC15958e.yandex = null;
                    return;
                }
                return;
            case 6:
                C4850e c4850e = (C4850e) c11109e.appmetrica;
                C13391e c13391e = c4850e.vip;
                if (c13391e != null && (c11887e = (C11887e) c13391e.f26644e) != null && (function0 = c11887e.purchase) != null) {
                    function0.invoke();
                }
                c4850e.vip = null;
                return;
            default:
                return;
        }
    }

    public final void billing(boolean z) {
        this.appmetrica = z;
        purchase(z && this.license.vip);
    }

    @Override // defpackage.AbstractC13388e
    public final void license(C1558e c1558e) {
        int i;
        C0419e c0419e = new C0419e(c1558e);
        C11109e c11109e = this.license;
        switch (c11109e.license) {
            case 1:
                ((AbstractC11130e) c11109e.appmetrica).mo2810e();
                return;
            case 2:
                AbstractC15958e abstractC15958e = (AbstractC15958e) c11109e.appmetrica;
                if (AbstractC15958e.m4045native(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC15958e);
                }
                abstractC15958e.isVip();
                abstractC15958e.inmobi(new C2130e(abstractC15958e), false);
                return;
            case 6:
                C4850e c4850e = (C4850e) c11109e.appmetrica;
                int i2 = c0419e.license;
                if (i2 != 0) {
                    i = 1;
                    if (i2 == 1) {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                C8226e c8226e = new C8226e(c0419e.metrica, c0419e.ad, c0419e.vip, i);
                C11887e ad = AbstractC16082e.ad((Iterable) c4850e.ad);
                if (ad == null) {
                    return;
                }
                c4850e.vip = new C13391e(c8226e, ad, 15);
                Function1 function1 = ad.license;
                if (function1 != null) {
                    function1.invoke(c8226e);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC13388e
    public final void metrica(C1558e c1558e) {
        int i;
        C0419e c0419e = new C0419e(c1558e);
        C11109e c11109e = this.license;
        switch (c11109e.license) {
            case 1:
                ((AbstractC11130e) c11109e.appmetrica).mo2809e(c0419e);
                return;
            case 2:
                AbstractC15958e abstractC15958e = (AbstractC15958e) c11109e.appmetrica;
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC15958e);
                }
                if (abstractC15958e.yandex != null) {
                    Iterator it = abstractC15958e.purchase(new ArrayList(Collections.singletonList(abstractC15958e.yandex)), 0, 1).iterator();
                    while (it.hasNext()) {
                        C9290e c9290e = (C9290e) it.next();
                        c9290e.getClass();
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0419e.metrica);
                        }
                        ArrayList arrayList = c9290e.metrica;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            AbstractC13480e.inmobi(arrayList2, ((C14635e) it2.next()).mopub);
                        }
                        List m3575continue = AbstractC13480e.m3575continue(AbstractC13480e.m3582e(arrayList2));
                        int size = m3575continue.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((AbstractC11025e) m3575continue.get(i2)).metrica(c0419e);
                        }
                    }
                    Iterator it3 = abstractC15958e.amazon.iterator();
                    if (it3.hasNext()) {
                        throw AbstractC5087e.m1747goto(it3);
                    }
                    return;
                }
                return;
            case 6:
                C4850e c4850e = (C4850e) c11109e.appmetrica;
                int i3 = c0419e.license;
                if (i3 != 0) {
                    i = 1;
                    if (i3 == 1) {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                c4850e.billing(new C8226e(c0419e.metrica, c0419e.ad, c0419e.vip, i));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC13388e
    public final void vip() {
        C3779e c3779e;
        C1059e c1059e;
        C11109e c11109e = this.license;
        switch (c11109e.license) {
            case 0:
                ArrayList arrayList = ((AppActivity) c11109e.appmetrica).f36541e;
                AbstractC5004e abstractC5004e = (AbstractC5004e) AbstractC13480e.m3592native(arrayList.size() - 1, arrayList);
                if (abstractC5004e == null) {
                    c11109e.appmetrica(false);
                    return;
                }
                if (!(abstractC5004e instanceof C3779e) || (c1059e = (c3779e = (C3779e) abstractC5004e).f8384e) == null || c1059e.getFragmentStack().size() <= 1) {
                    abstractC5004e.adcel();
                    return;
                }
                C1059e c1059e2 = c3779e.f8384e;
                if (c1059e2 != null) {
                    c1059e2.purchase(true, true);
                    return;
                }
                return;
            case 1:
                ((AbstractC11130e) c11109e.appmetrica).mo2004e();
                return;
            case 2:
                AbstractC15958e abstractC15958e = (AbstractC15958e) c11109e.appmetrica;
                if (AbstractC15958e.m4045native(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC15958e);
                }
                C11109e c11109e2 = abstractC15958e.adcel;
                ArrayList arrayList2 = abstractC15958e.amazon;
                abstractC15958e.startapp = true;
                abstractC15958e.applovin(true);
                abstractC15958e.startapp = false;
                if (abstractC15958e.yandex == null) {
                    if (c11109e2.vip) {
                        if (AbstractC15958e.m4045native(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        abstractC15958e.m4048abstract();
                        return;
                    } else {
                        if (AbstractC15958e.m4045native(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        abstractC15958e.billing.vip().ad();
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC15958e.firebase(abstractC15958e.yandex));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = abstractC15958e.yandex.ad.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C7659e) it3.next()).vip;
                    if (abstractComponentCallbacksC17875e != null) {
                        abstractComponentCallbacksC17875e.f35070e = false;
                    }
                }
                Iterator it4 = abstractC15958e.purchase(new ArrayList(Collections.singletonList(abstractC15958e.yandex)), 0, 1).iterator();
                while (it4.hasNext()) {
                    C9290e c9290e = (C9290e) it4.next();
                    ArrayList arrayList3 = c9290e.metrica;
                    if (AbstractC15958e.m4045native(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    c9290e.adcel(arrayList3);
                    c9290e.metrica(arrayList3);
                }
                Iterator it5 = abstractC15958e.yandex.ad.iterator();
                while (it5.hasNext()) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((C7659e) it5.next()).vip;
                    if (abstractComponentCallbacksC17875e2 != null && abstractComponentCallbacksC17875e2.f35078e == null) {
                        abstractC15958e.billing(abstractComponentCallbacksC17875e2).mopub();
                    }
                }
                abstractC15958e.yandex = null;
                abstractC15958e.m4066synchronized();
                if (AbstractC15958e.m4045native(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c11109e2.vip + " for  FragmentManager " + abstractC15958e);
                    return;
                }
                return;
            case 3:
                AbstractActivityC17704e abstractActivityC17704e = (AbstractActivityC17704e) c11109e.appmetrica;
                if (abstractActivityC17704e.f34700e.getFragmentStack().size() > 1) {
                    abstractActivityC17704e.f34700e.purchase(true, true);
                    return;
                }
                return;
            case 4:
                ((C6703e) c11109e.appmetrica).ad();
                return;
            case 5:
                C15293e c15293e = (C15293e) c11109e.appmetrica;
                C13465e c13465e = c15293e.f30217e;
                if (c13465e != null) {
                    ((C12344e) c13465e.f26730e).Signature();
                }
                c15293e.m3926private();
                return;
            case 6:
                ((C4850e) c11109e.appmetrica).license();
                return;
            case 7:
                ((C14820e) c11109e.appmetrica).invoke(c11109e);
                return;
            default:
                C1615e c1615e = ((C9261e) c11109e.appmetrica).f18470e;
                c1615e.getClass();
                c1615e.smaato(null, BuildConfig.FLAVOR);
                return;
        }
    }
}
