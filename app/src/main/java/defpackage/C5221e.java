package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5221e {
    public final C18540e ad;
    public final AbstractComponentCallbacksC17875e metrica;
    public final C11106e vip;
    public boolean license = false;
    public int appmetrica = -1;

    public C5221e(C18540e c18540e, C11106e c11106e, AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        this.ad = c18540e;
        this.vip = c11106e;
        this.metrica = abstractComponentCallbacksC17875e;
    }

    public C5221e(C18540e c18540e, C11106e c11106e, AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, Bundle bundle) {
        this.ad = c18540e;
        this.vip = c11106e;
        this.metrica = abstractComponentCallbacksC17875e;
        abstractComponentCallbacksC17875e.f35072e = null;
        abstractComponentCallbacksC17875e.f35099e = null;
        abstractComponentCallbacksC17875e.f35097e = 0;
        abstractComponentCallbacksC17875e.f35083e = false;
        abstractComponentCallbacksC17875e.f35091e = false;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = abstractComponentCallbacksC17875e.f35110e;
        abstractComponentCallbacksC17875e.f35088e = abstractComponentCallbacksC17875e2 != null ? abstractComponentCallbacksC17875e2.f35068e : null;
        abstractComponentCallbacksC17875e.f35110e = null;
        abstractComponentCallbacksC17875e.f35080e = bundle;
        abstractComponentCallbacksC17875e.f35111e = bundle.getBundle("arguments");
    }

    public C5221e(C18540e c18540e, C11106e c11106e, ClassLoader classLoader, C11419e c11419e, Bundle bundle) {
        this.ad = c18540e;
        this.vip = c11106e;
        C7509e c7509e = (C7509e) bundle.getParcelable("state");
        AbstractComponentCallbacksC17875e ad = c11419e.ad(c7509e.f15317e);
        ad.f35068e = c7509e.f15311e;
        ad.f35075e = c7509e.f15308e;
        ad.f35085e = c7509e.f15315e;
        ad.f35082e = true;
        ad.f35104e = c7509e.f15305e;
        ad.f35092e = c7509e.f15319e;
        ad.f35089e = c7509e.f15318e;
        ad.f35087e = c7509e.f15313e;
        ad.f35071e = c7509e.f15316e;
        ad.f35096e = c7509e.f15309e;
        ad.f35090e = c7509e.f15314e;
        ad.f35077e = EnumC7785e.values()[c7509e.f15307e];
        ad.f35088e = c7509e.f15306e;
        ad.f35102e = c7509e.f15310e;
        ad.f35084e = c7509e.f15312e;
        this.metrica = ad;
        ad.f35080e = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        ad.m4466interface(bundle2);
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + ad);
        }
    }

    public final void Signature() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.f35093e.m4049break();
        abstractComponentCallbacksC17875e.f35093e.applovin(true);
        abstractComponentCallbacksC17875e.f35107e = 5;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.isPro();
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onStart()");
        }
        C4891e c4891e = abstractComponentCallbacksC17875e.f35086e;
        EnumC14621e enumC14621e = EnumC14621e.ON_START;
        c4891e.appmetrica(enumC14621e);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            abstractComponentCallbacksC17875e.f35081e.metrica(enumC14621e);
        }
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(5);
        this.ad.m4570extends(abstractComponentCallbacksC17875e, false);
    }

    public final void ad() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC17875e);
        }
        Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC17875e.f35093e.m4049break();
        abstractComponentCallbacksC17875e.f35107e = 3;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.Signature();
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onActivityCreated()");
        }
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC17875e);
        }
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            Bundle bundle2 = abstractComponentCallbacksC17875e.f35080e;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC17875e.f35072e;
            if (sparseArray != null) {
                abstractComponentCallbacksC17875e.f35098e.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC17875e.f35072e = null;
            }
            abstractComponentCallbacksC17875e.f35094e = false;
            abstractComponentCallbacksC17875e.ads(bundle3);
            if (!abstractComponentCallbacksC17875e.f35094e) {
                throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC17875e.f35098e != null) {
                abstractComponentCallbacksC17875e.f35081e.metrica(EnumC14621e.ON_CREATE);
            }
        }
        abstractComponentCallbacksC17875e.f35080e = null;
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(4);
        this.ad.ads(abstractComponentCallbacksC17875e, false);
    }

    public final void adcel() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (abstractComponentCallbacksC17875e.f35075e && abstractComponentCallbacksC17875e.f35083e && !abstractComponentCallbacksC17875e.f35076e) {
            if (AbstractC15958e.m4045native(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC17875e);
            }
            Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC17875e.premium(abstractComponentCallbacksC17875e.isVip(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC17875e.f35098e;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC17875e.f35098e.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC17875e);
                if (abstractComponentCallbacksC17875e.f35090e) {
                    abstractComponentCallbacksC17875e.f35098e.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC17875e.f35080e;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC17875e.f35093e.signatures(2);
                this.ad.m4588while(abstractComponentCallbacksC17875e, abstractComponentCallbacksC17875e.f35098e, false);
                abstractComponentCallbacksC17875e.f35107e = 2;
            }
        }
    }

    public final void admob() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC17875e);
        }
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        c1154e.f31424this = true;
        c1154e.f31423protected.billing = true;
        c1154e.signatures(4);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            abstractComponentCallbacksC17875e.f35081e.metrica(EnumC14621e.ON_STOP);
        }
        abstractComponentCallbacksC17875e.f35086e.appmetrica(EnumC14621e.ON_STOP);
        abstractComponentCallbacksC17875e.f35107e = 4;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.applovin();
        if (abstractComponentCallbacksC17875e.f35094e) {
            this.ad.m4585throw(abstractComponentCallbacksC17875e, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onStop()");
    }

    public final void advert() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.f35093e.signatures(5);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            abstractComponentCallbacksC17875e.f35081e.metrica(EnumC14621e.ON_PAUSE);
        }
        abstractComponentCallbacksC17875e.f35086e.appmetrica(EnumC14621e.ON_PAUSE);
        abstractComponentCallbacksC17875e.f35107e = 6;
        abstractComponentCallbacksC17875e.f35094e = true;
        this.ad.m4569class(abstractComponentCallbacksC17875e, false);
    }

    public final void amazon() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC17875e);
        }
        C0190e c0190e = abstractComponentCallbacksC17875e.f35105e;
        View view = c0190e == null ? null : c0190e.mopub;
        if (view != null) {
            if (view != abstractComponentCallbacksC17875e.f35098e) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC17875e.f35098e) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (AbstractC15958e.m4045native(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC17875e);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC17875e.f35098e.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC17875e.appmetrica().mopub = null;
        abstractComponentCallbacksC17875e.f35093e.m4049break();
        abstractComponentCallbacksC17875e.f35093e.applovin(true);
        abstractComponentCallbacksC17875e.f35107e = 7;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.f35094e = true;
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onResume()");
        }
        C4891e c4891e = abstractComponentCallbacksC17875e.f35086e;
        EnumC14621e enumC14621e = EnumC14621e.ON_RESUME;
        c4891e.appmetrica(enumC14621e);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            abstractComponentCallbacksC17875e.f35081e.metrica(enumC14621e);
        }
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(7);
        this.ad.m4584this(abstractComponentCallbacksC17875e, false);
        this.vip.m3006else(abstractComponentCallbacksC17875e.f35068e, null);
        abstractComponentCallbacksC17875e.f35080e = null;
        abstractComponentCallbacksC17875e.f35072e = null;
        abstractComponentCallbacksC17875e.f35099e = null;
    }

    public final void appmetrica() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC17875e);
        }
        Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC17875e.f35108e) {
            abstractComponentCallbacksC17875e.f35107e = 1;
            abstractComponentCallbacksC17875e.firebase();
            return;
        }
        C18540e c18540e = this.ad;
        c18540e.m4572goto(abstractComponentCallbacksC17875e, false);
        abstractComponentCallbacksC17875e.f35093e.m4049break();
        abstractComponentCallbacksC17875e.f35107e = 1;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.f35086e.ad(new C18149e(3, abstractComponentCallbacksC17875e));
        abstractComponentCallbacksC17875e.remoteconfig(bundle2);
        abstractComponentCallbacksC17875e.f35108e = true;
        if (abstractComponentCallbacksC17875e.f35094e) {
            abstractComponentCallbacksC17875e.f35086e.appmetrica(EnumC14621e.ON_CREATE);
            c18540e.subs(abstractComponentCallbacksC17875e, false);
        } else {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onCreate()");
        }
    }

    public final void billing() {
        AbstractComponentCallbacksC17875e isPro;
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC17875e);
        }
        boolean z = true;
        boolean z2 = abstractComponentCallbacksC17875e.f35071e && !abstractComponentCallbacksC17875e.loadAd();
        C11106e c11106e = this.vip;
        if (z2) {
            c11106e.m3006else(abstractComponentCallbacksC17875e.f35068e, null);
        }
        if (!z2) {
            C16301e c16301e = (C16301e) c11106e.f22006e;
            if (!((c16301e.vip.containsKey(abstractComponentCallbacksC17875e.f35068e) && c16301e.appmetrica) ? c16301e.purchase : true)) {
                String str = abstractComponentCallbacksC17875e.f35088e;
                if (str != null && (isPro = c11106e.isPro(str)) != null && isPro.f35087e) {
                    abstractComponentCallbacksC17875e.f35110e = isPro;
                }
                abstractComponentCallbacksC17875e.f35107e = 0;
                return;
            }
        }
        C2386e c2386e = abstractComponentCallbacksC17875e.f35074e;
        if (c2386e != null) {
            z = ((C16301e) c11106e.f22006e).purchase;
        } else {
            AbstractActivityC1752e abstractActivityC1752e = c2386e.f6096e;
            if (AbstractC0869e.premium(abstractActivityC1752e)) {
                z = true ^ abstractActivityC1752e.isChangingConfigurations();
            }
        }
        if (z2 || z) {
            ((C16301e) c11106e.f22006e).metrica(abstractComponentCallbacksC17875e, false);
        }
        abstractComponentCallbacksC17875e.f35093e.advert();
        abstractComponentCallbacksC17875e.f35086e.appmetrica(EnumC14621e.ON_DESTROY);
        abstractComponentCallbacksC17875e.f35107e = 0;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.f35108e = false;
        abstractComponentCallbacksC17875e.f35094e = true;
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onDestroy()");
        }
        this.ad.crashlytics(abstractComponentCallbacksC17875e, false);
        Iterator it = c11106e.firebase().iterator();
        while (it.hasNext()) {
            C5221e c5221e = (C5221e) it.next();
            if (c5221e != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                if (abstractComponentCallbacksC17875e.f35068e.equals(abstractComponentCallbacksC17875e2.f35088e)) {
                    abstractComponentCallbacksC17875e2.f35110e = abstractComponentCallbacksC17875e;
                    abstractComponentCallbacksC17875e2.f35088e = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC17875e.f35088e;
        if (str2 != null) {
            abstractComponentCallbacksC17875e.f35110e = c11106e.isPro(str2);
        }
        c11106e.m3016package(this);
    }

    public final int license() {
        C9290e c9290e;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (abstractComponentCallbacksC17875e.f35112e == null) {
            return abstractComponentCallbacksC17875e.f35107e;
        }
        int i = this.appmetrica;
        int ordinal = abstractComponentCallbacksC17875e.f35077e.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC17875e.f35075e) {
            if (abstractComponentCallbacksC17875e.f35083e) {
                i = Math.max(this.appmetrica, 2);
                View view = abstractComponentCallbacksC17875e.f35098e;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.appmetrica < 4 ? Math.min(i, abstractComponentCallbacksC17875e.f35107e) : Math.min(i, 1);
            }
        }
        if (abstractComponentCallbacksC17875e.f35085e && abstractComponentCallbacksC17875e.f35078e == null) {
            i = Math.min(i, 4);
        }
        if (!abstractComponentCallbacksC17875e.f35091e) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC17875e.f35078e;
        if (viewGroup != null) {
            abstractComponentCallbacksC17875e.mopub().m4055goto();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C9290e) {
                c9290e = (C9290e) tag;
            } else {
                c9290e = new C9290e(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c9290e);
            }
            C14635e purchase = c9290e.purchase(abstractComponentCallbacksC17875e);
            int i2 = purchase != null ? purchase.vip : 0;
            C14635e billing = c9290e.billing(abstractComponentCallbacksC17875e);
            r3 = billing != null ? billing.vip : 0;
            int i3 = i2 == 0 ? -1 : AbstractC8131e.ad[AbstractC8703e.m2467class(i2)];
            if (i3 != -1 && i3 != 1) {
                r3 = i2;
            }
        }
        if (r3 == 2) {
            i = Math.min(i, 6);
        } else if (r3 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC17875e.f35071e) {
            i = abstractComponentCallbacksC17875e.loadAd() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC17875e.f35095e && abstractComponentCallbacksC17875e.f35107e < 5) {
            i = Math.min(i, 4);
        }
        if (abstractComponentCallbacksC17875e.f35070e) {
            i = Math.max(i, 3);
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC17875e);
        }
        return i;
    }

    public final void loadAd() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (abstractComponentCallbacksC17875e.f35098e == null) {
            return;
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC17875e + " with view " + abstractComponentCallbacksC17875e.f35098e);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC17875e.f35098e.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC17875e.f35072e = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC17875e.f35081e.f2505e.m1999protected(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC17875e.f35099e = bundle;
    }

    public final void metrica() {
        C5221e c5221e;
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC17875e);
        }
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = abstractComponentCallbacksC17875e.f35110e;
        C11106e c11106e = this.vip;
        if (abstractComponentCallbacksC17875e2 != null) {
            c5221e = (C5221e) ((HashMap) c11106e.f22007e).get(abstractComponentCallbacksC17875e2.f35068e);
            if (c5221e == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC17875e + " declared target fragment " + abstractComponentCallbacksC17875e.f35110e + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC17875e.f35088e = abstractComponentCallbacksC17875e.f35110e.f35068e;
            abstractComponentCallbacksC17875e.f35110e = null;
        } else {
            String str = abstractComponentCallbacksC17875e.f35088e;
            if (str != null) {
                c5221e = (C5221e) ((HashMap) c11106e.f22007e).get(str);
                if (c5221e == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC17875e);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC1786e.signatures(sb, abstractComponentCallbacksC17875e.f35088e, " that does not belong to this FragmentManager!"));
                }
            } else {
                c5221e = null;
            }
        }
        if (c5221e != null) {
            c5221e.mopub();
        }
        AbstractC15958e abstractC15958e = abstractComponentCallbacksC17875e.f35112e;
        abstractComponentCallbacksC17875e.f35074e = abstractC15958e.isVip;
        abstractComponentCallbacksC17875e.f35101e = abstractC15958e.isPro;
        C18540e c18540e = this.ad;
        c18540e.m4574interface(abstractComponentCallbacksC17875e, false);
        ArrayList arrayList = abstractComponentCallbacksC17875e.f35103e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = ((C3080e) it.next()).ad;
            ((C3560e) abstractComponentCallbacksC17875e3.f35100e.f12440e).ad();
            AbstractC18129e.license(abstractComponentCallbacksC17875e3);
            Bundle bundle = abstractComponentCallbacksC17875e3.f35080e;
            abstractComponentCallbacksC17875e3.f35100e.m2001try(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC17875e.f35093e.vip(abstractComponentCallbacksC17875e.f35074e, abstractComponentCallbacksC17875e.metrica(), abstractComponentCallbacksC17875e);
        abstractComponentCallbacksC17875e.f35107e = 0;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.subscription(abstractComponentCallbacksC17875e.f35074e.f6096e);
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC17875e.f35112e.Signature.iterator();
        while (it2.hasNext()) {
            ((InterfaceC14374e) it2.next()).metrica();
        }
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(0);
        c18540e.premium(abstractComponentCallbacksC17875e, false);
    }

    public final void mopub() {
        ViewGroup viewGroup;
        C9290e c9290e;
        ViewGroup viewGroup2;
        C9290e c9290e2;
        ViewGroup viewGroup3;
        C9290e c9290e3;
        C11106e c11106e = this.vip;
        boolean z = this.license;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (z) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC17875e);
                return;
            }
            return;
        }
        try {
            this.license = true;
            boolean z2 = false;
            while (true) {
                int license = license();
                int i = abstractComponentCallbacksC17875e.f35107e;
                int i2 = 3;
                if (license == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC17875e.f35071e && !abstractComponentCallbacksC17875e.loadAd()) {
                        if (AbstractC15958e.m4045native(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC17875e);
                        }
                        ((C16301e) c11106e.f22006e).metrica(abstractComponentCallbacksC17875e, true);
                        c11106e.m3016package(this);
                        if (AbstractC15958e.m4045native(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC17875e);
                        }
                        abstractComponentCallbacksC17875e.smaato();
                    }
                    if (abstractComponentCallbacksC17875e.f35109e) {
                        if (abstractComponentCallbacksC17875e.f35098e != null && (viewGroup = abstractComponentCallbacksC17875e.f35078e) != null) {
                            abstractComponentCallbacksC17875e.mopub().m4055goto();
                            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                            if (tag instanceof C9290e) {
                                c9290e = (C9290e) tag;
                            } else {
                                c9290e = new C9290e(viewGroup);
                                viewGroup.setTag(R.id.special_effects_controller_view_tag, c9290e);
                            }
                            if (abstractComponentCallbacksC17875e.f35090e) {
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC17875e);
                                }
                                c9290e.license(3, 1, this);
                            } else {
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC17875e);
                                }
                                c9290e.license(2, 1, this);
                            }
                        }
                        AbstractC15958e abstractC15958e = abstractComponentCallbacksC17875e.f35112e;
                        if (abstractC15958e != null && abstractComponentCallbacksC17875e.f35091e && AbstractC15958e.m4043extends(abstractComponentCallbacksC17875e)) {
                            abstractC15958e.f31421interface = true;
                        }
                        abstractComponentCallbacksC17875e.f35109e = false;
                        abstractComponentCallbacksC17875e.f35093e.loadAd();
                    }
                    this.license = false;
                    return;
                }
                if (license <= i) {
                    switch (i - 1) {
                        case -1:
                            startapp();
                            break;
                        case 0:
                            billing();
                            break;
                        case 1:
                            yandex();
                            abstractComponentCallbacksC17875e.f35107e = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC17875e.f35083e = false;
                            abstractComponentCallbacksC17875e.f35107e = 2;
                            break;
                        case 3:
                            if (AbstractC15958e.m4045native(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC17875e);
                            }
                            if (abstractComponentCallbacksC17875e.f35098e != null && abstractComponentCallbacksC17875e.f35072e == null) {
                                loadAd();
                            }
                            if (abstractComponentCallbacksC17875e.f35098e != null && (viewGroup2 = abstractComponentCallbacksC17875e.f35078e) != null) {
                                abstractComponentCallbacksC17875e.mopub().m4055goto();
                                Object tag2 = viewGroup2.getTag(R.id.special_effects_controller_view_tag);
                                if (tag2 instanceof C9290e) {
                                    c9290e2 = (C9290e) tag2;
                                } else {
                                    c9290e2 = new C9290e(viewGroup2);
                                    viewGroup2.setTag(R.id.special_effects_controller_view_tag, c9290e2);
                                }
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC17875e);
                                }
                                c9290e2.license(1, 3, this);
                            }
                            abstractComponentCallbacksC17875e.f35107e = 3;
                            break;
                        case 4:
                            admob();
                            break;
                        case 5:
                            abstractComponentCallbacksC17875e.f35107e = 5;
                            break;
                        case 6:
                            advert();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            metrica();
                            break;
                        case 1:
                            appmetrica();
                            break;
                        case 2:
                            adcel();
                            purchase();
                            break;
                        case 3:
                            ad();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC17875e.f35098e != null && (viewGroup3 = abstractComponentCallbacksC17875e.f35078e) != null) {
                                abstractComponentCallbacksC17875e.mopub().m4055goto();
                                Object tag3 = viewGroup3.getTag(R.id.special_effects_controller_view_tag);
                                if (tag3 instanceof C9290e) {
                                    c9290e3 = (C9290e) tag3;
                                } else {
                                    c9290e3 = new C9290e(viewGroup3);
                                    viewGroup3.setTag(R.id.special_effects_controller_view_tag, c9290e3);
                                }
                                int visibility = abstractComponentCallbacksC17875e.f35098e.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC17875e);
                                }
                                c9290e3.license(i2, 2, this);
                            }
                            abstractComponentCallbacksC17875e.f35107e = 4;
                            break;
                        case 5:
                            Signature();
                            break;
                        case 6:
                            abstractComponentCallbacksC17875e.f35107e = 6;
                            break;
                        case 7:
                            amazon();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.license = false;
            throw th;
        }
    }

    public final void purchase() {
        String str;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (abstractComponentCallbacksC17875e.f35075e) {
            return;
        }
        int i = 3;
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC17875e);
        }
        Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater isVip = abstractComponentCallbacksC17875e.isVip(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC17875e.f35078e;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = abstractComponentCallbacksC17875e.f35092e;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC17875e + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC17875e.f35112e.inmobi.amazon(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC17875e.f35082e && !abstractComponentCallbacksC17875e.f35085e) {
                        try {
                            str = abstractComponentCallbacksC17875e.subs().getResources().getResourceName(abstractComponentCallbacksC17875e.f35092e);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC17875e.f35092e) + " (" + str + ") for fragment " + abstractComponentCallbacksC17875e);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4935e c4935e = AbstractC11220e.ad;
                    AbstractC11220e.vip(new C6964e(abstractComponentCallbacksC17875e, "Attempting to add fragment " + abstractComponentCallbacksC17875e + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC11220e.ad(abstractComponentCallbacksC17875e).getClass();
                }
            }
        }
        abstractComponentCallbacksC17875e.f35078e = viewGroup;
        abstractComponentCallbacksC17875e.premium(isVip, viewGroup, bundle2);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            if (AbstractC15958e.m4045native(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC17875e);
            }
            abstractComponentCallbacksC17875e.f35098e.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC17875e.f35098e.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC17875e);
            if (viewGroup != null) {
                vip();
            }
            if (abstractComponentCallbacksC17875e.f35090e) {
                abstractComponentCallbacksC17875e.f35098e.setVisibility(8);
            }
            if (abstractComponentCallbacksC17875e.f35098e.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC17875e.f35098e;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                view.requestApplyInsets();
            } else {
                View view2 = abstractComponentCallbacksC17875e.f35098e;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544e(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC17875e.f35080e;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC17875e.f35093e.signatures(2);
            this.ad.m4588while(abstractComponentCallbacksC17875e, abstractComponentCallbacksC17875e.f35098e, false);
            int visibility = abstractComponentCallbacksC17875e.f35098e.getVisibility();
            abstractComponentCallbacksC17875e.appmetrica().adcel = abstractComponentCallbacksC17875e.f35098e.getAlpha();
            if (abstractComponentCallbacksC17875e.f35078e != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC17875e.f35098e.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC17875e.appmetrica().mopub = findFocus;
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC17875e);
                    }
                }
                abstractComponentCallbacksC17875e.f35098e.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC17875e.f35107e = 2;
    }

    public final void smaato(ClassLoader classLoader) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC17875e.f35080e.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC17875e.f35080e.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC17875e.f35072e = abstractComponentCallbacksC17875e.f35080e.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC17875e.f35099e = abstractComponentCallbacksC17875e.f35080e.getBundle("viewRegistryState");
            C7509e c7509e = (C7509e) abstractComponentCallbacksC17875e.f35080e.getParcelable("state");
            if (c7509e != null) {
                abstractComponentCallbacksC17875e.f35088e = c7509e.f15306e;
                abstractComponentCallbacksC17875e.f35102e = c7509e.f15310e;
                abstractComponentCallbacksC17875e.f35084e = c7509e.f15312e;
            }
            if (abstractComponentCallbacksC17875e.f35084e) {
                return;
            }
            abstractComponentCallbacksC17875e.f35095e = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC17875e, e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [eٖؓۢ, eؒٚٗ] */
    public final void startapp() {
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.f35107e = -1;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.tapsense();
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onDetach()");
        }
        C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
        if (!c1154e.f31422native) {
            c1154e.advert();
            abstractComponentCallbacksC17875e.f35093e = new AbstractC15958e();
        }
        this.ad.firebase(abstractComponentCallbacksC17875e, false);
        abstractComponentCallbacksC17875e.f35107e = -1;
        abstractComponentCallbacksC17875e.f35074e = null;
        abstractComponentCallbacksC17875e.f35101e = null;
        abstractComponentCallbacksC17875e.f35112e = null;
        if (!abstractComponentCallbacksC17875e.f35071e || abstractComponentCallbacksC17875e.loadAd()) {
            C16301e c16301e = (C16301e) this.vip.f22006e;
            if (!((c16301e.vip.containsKey(abstractComponentCallbacksC17875e.f35068e) && c16301e.appmetrica) ? c16301e.purchase : true)) {
                return;
            }
        }
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.smaato();
    }

    public final void vip() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e;
        View view;
        View view2;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = this.metrica;
        View view3 = abstractComponentCallbacksC17875e2.f35078e;
        while (true) {
            abstractComponentCallbacksC17875e = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = tag instanceof AbstractComponentCallbacksC17875e ? (AbstractComponentCallbacksC17875e) tag : null;
            if (abstractComponentCallbacksC17875e3 != null) {
                abstractComponentCallbacksC17875e = abstractComponentCallbacksC17875e3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e4 = abstractComponentCallbacksC17875e2.f35101e;
        if (abstractComponentCallbacksC17875e != null && !abstractComponentCallbacksC17875e.equals(abstractComponentCallbacksC17875e4)) {
            int i = abstractComponentCallbacksC17875e2.f35092e;
            C4935e c4935e = AbstractC11220e.ad;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC17875e2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC17875e);
            sb.append(" via container with ID ");
            AbstractC11220e.vip(new C6964e(abstractComponentCallbacksC17875e2, AbstractC17861e.smaato(i, " without using parent's childFragmentManager", sb)));
            AbstractC11220e.ad(abstractComponentCallbacksC17875e2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.vip.f22008e;
        ViewGroup viewGroup = abstractComponentCallbacksC17875e2.f35078e;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC17875e2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e5 = (AbstractComponentCallbacksC17875e) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC17875e5.f35078e == viewGroup && (view = abstractComponentCallbacksC17875e5.f35098e) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e6 = (AbstractComponentCallbacksC17875e) arrayList.get(i3);
                    if (abstractComponentCallbacksC17875e6.f35078e == viewGroup && (view2 = abstractComponentCallbacksC17875e6.f35098e) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC17875e2.f35078e.addView(abstractComponentCallbacksC17875e2.f35098e, i2);
    }

    public final void yandex() {
        View view;
        boolean m4045native = AbstractC15958e.m4045native(3);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.metrica;
        if (m4045native) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC17875e);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC17875e.f35078e;
        if (viewGroup != null && (view = abstractComponentCallbacksC17875e.f35098e) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC17875e.f35093e.signatures(1);
        if (abstractComponentCallbacksC17875e.f35098e != null) {
            C0455e c0455e = abstractComponentCallbacksC17875e.f35081e;
            c0455e.appmetrica();
            if (c0455e.f2508e.license.ad(EnumC7785e.f15777e)) {
                abstractComponentCallbacksC17875e.f35081e.metrica(EnumC14621e.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC17875e.f35107e = 1;
        abstractComponentCallbacksC17875e.f35094e = false;
        abstractComponentCallbacksC17875e.signatures();
        if (!abstractComponentCallbacksC17875e.f35094e) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC17875e + " did not call through to super.onDestroyView()");
        }
        C11106e c11106e = new C11106e(abstractComponentCallbacksC17875e.billing(), C12905e.metrica, C8567e.vip);
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C12905e.class);
        String license = vip.license();
        if (license == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C14338e c14338e = ((C12905e) c11106e.m2999abstract(vip, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(license))).vip;
        if (c14338e.f28363e > 0) {
            c14338e.appmetrica(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC17875e.f35076e = false;
        this.ad.m4587try(abstractComponentCallbacksC17875e, false);
        abstractComponentCallbacksC17875e.f35078e = null;
        abstractComponentCallbacksC17875e.f35098e = null;
        abstractComponentCallbacksC17875e.f35081e = null;
        abstractComponentCallbacksC17875e.f35106e.startapp(null);
        abstractComponentCallbacksC17875e.f35083e = false;
    }
}
