package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9290e {
    public final ViewGroup ad;
    public boolean appmetrica;
    public boolean license;
    public boolean purchase;
    public final ArrayList vip = new ArrayList();
    public final ArrayList metrica = new ArrayList();

    public C9290e(ViewGroup viewGroup) {
        this.ad = viewGroup;
    }

    public static boolean startapp(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                C14635e c14635e = (C14635e) it.next();
                if (!c14635e.mopub.isEmpty()) {
                    ArrayList arrayList2 = c14635e.mopub;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC11025e abstractC11025e = (AbstractC11025e) it2.next();
                            abstractC11025e.getClass();
                            if (!(abstractC11025e instanceof C15250e)) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC13480e.inmobi(arrayList3, ((C14635e) it3.next()).mopub);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void ad(C14635e c14635e) {
        if (c14635e.startapp) {
            AbstractC1786e.yandex(c14635e.ad, c14635e.metrica.crashlytics(), this.ad);
            c14635e.startapp = false;
        }
    }

    public final void adcel(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14635e c14635e = (C14635e) list.get(i);
            C5221e c5221e = c14635e.advert;
            if (!c14635e.yandex) {
                c14635e.yandex = true;
                int i2 = c14635e.vip;
                if (i2 == 2) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                    View findFocus = abstractComponentCallbacksC17875e.f35098e.findFocus();
                    if (findFocus != null) {
                        abstractComponentCallbacksC17875e.appmetrica().mopub = findFocus;
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC17875e);
                        }
                    }
                    View crashlytics = c14635e.metrica.crashlytics();
                    if (crashlytics.getParent() == null) {
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "Adding fragment " + abstractComponentCallbacksC17875e + " view " + crashlytics + " to container in onStart");
                        }
                        c5221e.vip();
                        crashlytics.setAlpha(0.0f);
                    }
                    if (crashlytics.getAlpha() == 0.0f && crashlytics.getVisibility() == 0) {
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "Making view " + crashlytics + " INVISIBLE in onStart");
                        }
                        crashlytics.setVisibility(4);
                    }
                    C0190e c0190e = abstractComponentCallbacksC17875e.f35105e;
                    crashlytics.setAlpha(c0190e == null ? 1.0f : c0190e.adcel);
                    if (AbstractC15958e.m4045native(2)) {
                        StringBuilder sb = new StringBuilder("Setting view alpha to ");
                        C0190e c0190e2 = abstractComponentCallbacksC17875e.f35105e;
                        sb.append(c0190e2 != null ? c0190e2.adcel : 1.0f);
                        sb.append(" in onStart");
                        Log.v("FragmentManager", sb.toString());
                    }
                } else if (i2 == 3) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                    View crashlytics2 = abstractComponentCallbacksC17875e2.crashlytics();
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "Clearing focus " + crashlytics2.findFocus() + " on view " + crashlytics2 + " for Fragment " + abstractComponentCallbacksC17875e2);
                    }
                    crashlytics2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(arrayList, ((C14635e) it.next()).mopub);
        }
        List m3575continue = AbstractC13480e.m3575continue(AbstractC13480e.m3582e(arrayList));
        int size2 = m3575continue.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC11025e abstractC11025e = (AbstractC11025e) m3575continue.get(i3);
            if (!abstractC11025e.ad) {
                abstractC11025e.license(this.ad);
            }
            abstractC11025e.ad = true;
        }
    }

    public final void appmetrica() {
        boolean z;
        if (this.purchase) {
            return;
        }
        if (!this.ad.isAttachedToWindow()) {
            yandex();
            this.appmetrica = false;
            return;
        }
        synchronized (this.vip) {
            try {
                ArrayList arrayList = new ArrayList(this.metrica);
                this.metrica.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C14635e c14635e = (C14635e) it.next();
                    if (this.vip.isEmpty() || !c14635e.metrica.f35070e) {
                        z = false;
                    }
                    c14635e.billing = z;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C14635e c14635e2 = (C14635e) it2.next();
                    if (this.license) {
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + c14635e2);
                        }
                        c14635e2.vip();
                    } else {
                        if (AbstractC15958e.m4045native(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c14635e2);
                        }
                        c14635e2.ad(this.ad);
                    }
                    this.license = false;
                    if (!c14635e2.purchase) {
                        this.metrica.add(c14635e2);
                    }
                }
                if (!this.vip.isEmpty()) {
                    mopub();
                    ArrayList arrayList2 = new ArrayList(this.vip);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.vip.clear();
                    this.metrica.addAll(arrayList2);
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    vip(arrayList2, this.appmetrica);
                    boolean startapp = startapp(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((C14635e) it3.next()).metrica.f35070e) {
                            z2 = false;
                        }
                    }
                    if (!z2 || startapp) {
                        z = false;
                    }
                    this.license = z;
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + startapp + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        adcel(arrayList2);
                        metrica(arrayList2);
                    } else if (startapp) {
                        adcel(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            ad((C14635e) arrayList2.get(i));
                        }
                    }
                    this.appmetrica = false;
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C14635e billing(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        Object obj;
        Iterator it = this.metrica.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C14635e c14635e = (C14635e) obj;
            if (AbstractC7890e.billing(c14635e.metrica, abstractComponentCallbacksC17875e) && !c14635e.appmetrica) {
                break;
            }
        }
        return (C14635e) obj;
    }

    public final void license(int i, int i2, C5221e c5221e) {
        synchronized (this.vip) {
            try {
                C14635e purchase = purchase(c5221e.metrica);
                if (purchase == null) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                    if (!abstractComponentCallbacksC17875e.f35070e && !abstractComponentCallbacksC17875e.f35071e) {
                        purchase = null;
                    }
                    purchase = billing(abstractComponentCallbacksC17875e);
                }
                if (purchase != null) {
                    purchase.license(i, i2);
                    return;
                }
                C14635e c14635e = new C14635e(i, i2, c5221e);
                this.vip.add(c14635e);
                c14635e.license.add(new RunnableC17024e(this, c14635e, 1));
                c14635e.license.add(new RunnableC17024e(this, c14635e, 2));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(arrayList, ((C14635e) it.next()).mopub);
        }
        List m3575continue = AbstractC13480e.m3575continue(AbstractC13480e.m3582e(arrayList));
        int size = m3575continue.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11025e) m3575continue.get(i)).vip(this.ad);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ad((C14635e) list.get(i2));
        }
        List m3575continue2 = AbstractC13480e.m3575continue(list);
        int size3 = m3575continue2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C14635e c14635e = (C14635e) m3575continue2.get(i3);
            if (c14635e.mopub.isEmpty()) {
                c14635e.vip();
            }
        }
    }

    public final void mopub() {
        Iterator it = this.vip.iterator();
        while (it.hasNext()) {
            C14635e c14635e = (C14635e) it.next();
            int i = 2;
            if (c14635e.vip == 2) {
                int visibility = c14635e.metrica.crashlytics().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC1786e.admob(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                c14635e.license(i, 1);
            }
        }
    }

    public final C14635e purchase(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        Object obj;
        Iterator it = this.vip.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C14635e c14635e = (C14635e) obj;
            if (AbstractC7890e.billing(c14635e.metrica, abstractComponentCallbacksC17875e) && !c14635e.appmetrica) {
                break;
            }
        }
        return (C14635e) obj;
    }

    public final void vip(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C14635e c14635e = (C14635e) obj2;
            View view = c14635e.metrica.f35098e;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC1786e.admob(visibility, "Unknown visibility "));
                    }
                } else if (c14635e.ad != 2) {
                    break;
                }
            }
        }
        C14635e c14635e2 = (C14635e) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            C14635e c14635e3 = (C14635e) previous;
            View view2 = c14635e3.metrica.f35098e;
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(visibility2, "Unknown visibility "));
                }
            }
            if (c14635e3.ad == 2) {
                obj = previous;
                break;
            }
        }
        C14635e c14635e4 = (C14635e) obj;
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Executing operations from " + c14635e2 + " to " + c14635e4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C14635e) AbstractC13480e.m3570break(arrayList)).metrica;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0190e c0190e = ((C14635e) it2.next()).metrica.f35105e;
            C0190e c0190e2 = abstractComponentCallbacksC17875e.f35105e;
            c0190e.vip = c0190e2.vip;
            c0190e.metrica = c0190e2.metrica;
            c0190e.license = c0190e2.license;
            c0190e.appmetrica = c0190e2.appmetrica;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            C14635e c14635e5 = (C14635e) it3.next();
            arrayList2.add(new C2310e(c14635e5, z));
            if (!z ? c14635e5 == c14635e4 : c14635e5 == c14635e2) {
                z2 = true;
            }
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c14635e5.metrica;
            Cpackage cpackage = new Cpackage(7, c14635e5);
            if (c14635e5.ad == 2) {
                if (z) {
                    C0190e c0190e3 = abstractComponentCallbacksC17875e2.f35105e;
                } else {
                    abstractComponentCallbacksC17875e2.getClass();
                }
            } else if (z) {
                C0190e c0190e4 = abstractComponentCallbacksC17875e2.f35105e;
            } else {
                abstractComponentCallbacksC17875e2.getClass();
            }
            if (c14635e5.ad == 2) {
                if (z) {
                    C0190e c0190e5 = abstractComponentCallbacksC17875e2.f35105e;
                } else {
                    C0190e c0190e6 = abstractComponentCallbacksC17875e2.f35105e;
                }
            }
            if (z2) {
                if (z) {
                    C0190e c0190e7 = abstractComponentCallbacksC17875e2.f35105e;
                } else {
                    abstractComponentCallbacksC17875e2.getClass();
                }
            }
            arrayList3.add(cpackage);
            c14635e5.license.add(new RunnableC17024e(this, c14635e5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C2958e) next).m4626e()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((C2958e) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((C2958e) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            AbstractC13480e.inmobi(arrayList7, ((C14635e) ((C2310e) it7.next()).f36443e).mopub);
        }
        boolean isEmpty = arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z3 = false;
        while (it8.hasNext()) {
            C2310e c2310e = (C2310e) it8.next();
            Context context = this.ad.getContext();
            C14635e c14635e6 = (C14635e) c2310e.f36443e;
            C17424e m804e = c2310e.m804e(context);
            if (m804e != null) {
                if (((AnimatorSet) m804e.f34141e) == null) {
                    arrayList6.add(c2310e);
                } else {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = c14635e6.metrica;
                    if (c14635e6.mopub.isEmpty()) {
                        if (c14635e6.ad == 3) {
                            c14635e6.startapp = false;
                        }
                        c14635e6.adcel.add(new C15250e(c2310e));
                        z3 = true;
                    } else if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC17875e3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            C2310e c2310e2 = (C2310e) it9.next();
            C14635e c14635e7 = (C14635e) c2310e2.f36443e;
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e4 = c14635e7.metrica;
            if (isEmpty) {
                if (!z3) {
                    c14635e7.adcel.add(new C9784e(c2310e2));
                } else if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC17875e4 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC17875e4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void yandex() {
        String str;
        String str2;
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.ad.isAttachedToWindow();
        synchronized (this.vip) {
            try {
                mopub();
                adcel(this.vip);
                ArrayList arrayList = new ArrayList(this.metrica);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C14635e) it.next()).billing = false;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C14635e c14635e = (C14635e) it2.next();
                    if (AbstractC15958e.m4045native(2)) {
                        if (isAttachedToWindow) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = "Container " + this.ad + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + c14635e);
                    }
                    c14635e.ad(this.ad);
                }
                ArrayList arrayList2 = new ArrayList(this.vip);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((C14635e) it3.next()).billing = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C14635e c14635e2 = (C14635e) it4.next();
                    if (AbstractC15958e.m4045native(2)) {
                        if (isAttachedToWindow) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = "Container " + this.ad + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + c14635e2);
                    }
                    c14635e2.ad(this.ad);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
