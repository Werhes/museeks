package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC17875e implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC16400e, InterfaceC0816e, InterfaceC3475e, InterfaceC10998e {

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public static final Object f35067e = new Object();

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public String f35069e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f35070e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f35071e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public SparseArray f35072e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C2386e f35074e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f35075e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f35076e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public EnumC7785e f35077e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public ViewGroup f35078e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Bundle f35080e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public C0455e f35081e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f35082e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f35083e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f35085e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public C4891e f35086e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f35087e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public String f35089e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public boolean f35090e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f35091e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public int f35092e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public boolean f35094e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f35095e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f35096e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f35097e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public View f35098e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Bundle f35099e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public C5891e f35100e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public AbstractComponentCallbacksC17875e f35101e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f35102e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final ArrayList f35103e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public int f35104e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public C0190e f35105e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final C1326e f35106e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean f35108e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public boolean f35109e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AbstractComponentCallbacksC17875e f35110e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Bundle f35111e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public AbstractC15958e f35112e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final C3080e f35113e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f35107e = -1;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f35068e = UUID.randomUUID().toString();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f35088e = null;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Boolean f35073e = null;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C1154e f35093e = new AbstractC15958e();

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final boolean f35079e = true;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public boolean f35084e = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [eٖؓۢ, eؒٚٗ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [eٍ۟ۤ, eؒۛ٘] */
    public AbstractComponentCallbacksC17875e() {
        new RunnableC12991e(11, this);
        this.f35077e = EnumC7785e.f15776e;
        this.f35106e = new AbstractC9790e();
        new AtomicInteger();
        this.f35103e = new ArrayList();
        this.f35113e = new C3080e(this);
        advert();
    }

    public void Signature() {
        this.f35094e = true;
    }

    public final int adcel() {
        EnumC7785e enumC7785e = this.f35077e;
        return (enumC7785e == EnumC7785e.f15778e || this.f35101e == null) ? enumC7785e.ordinal() : Math.min(enumC7785e.ordinal(), this.f35101e.adcel());
    }

    public void admob(int i, int i2, Intent intent) {
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void ads(Bundle bundle) {
        this.f35094e = true;
    }

    public final void advert() {
        this.f35086e = new C4891e(this, true);
        this.f35100e = new C5891e(new C3560e(this, new C13465e(26, this)));
        ArrayList arrayList = this.f35103e;
        C3080e c3080e = this.f35113e;
        if (arrayList.contains(c3080e)) {
            return;
        }
        if (this.f35107e < 0) {
            arrayList.add(c3080e);
            return;
        }
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c3080e.ad;
        ((C3560e) abstractComponentCallbacksC17875e.f35100e.f12440e).ad();
        AbstractC18129e.license(abstractComponentCallbacksC17875e);
        Bundle bundle = abstractComponentCallbacksC17875e.f35080e;
        abstractComponentCallbacksC17875e.f35100e.m2001try(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final boolean amazon() {
        if (this.f35090e) {
            return true;
        }
        AbstractC15958e abstractC15958e = this.f35112e;
        if (abstractC15958e != null) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.f35101e;
            abstractC15958e.getClass();
            if (abstractComponentCallbacksC17875e == null ? false : abstractComponentCallbacksC17875e.amazon()) {
                return true;
            }
        }
        return false;
    }

    public void applovin() {
        this.f35094e = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eًؑۖ, java.lang.Object] */
    public final C0190e appmetrica() {
        if (this.f35105e == null) {
            ?? obj = new Object();
            Object obj2 = f35067e;
            obj.billing = obj2;
            obj.yandex = obj2;
            obj.startapp = obj2;
            obj.adcel = 1.0f;
            obj.mopub = null;
            this.f35105e = obj;
        }
        return this.f35105e;
    }

    @Override // defpackage.InterfaceC0816e
    public final C13462e billing() {
        if (this.f35112e == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (adcel() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f35112e.f31423protected.license;
        C13462e c13462e = (C13462e) hashMap.get(this.f35068e);
        if (c13462e != null) {
            return c13462e;
        }
        C13462e c13462e2 = new C13462e();
        hashMap.put(this.f35068e, c13462e2);
        return c13462e2;
    }

    /* renamed from: class, reason: not valid java name */
    public final void m4465class(int i, int i2, int i3, int i4) {
        if (this.f35105e == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        appmetrica().vip = i;
        appmetrica().metrica = i2;
        appmetrica().license = i3;
        appmetrica().appmetrica = i4;
    }

    public final View crashlytics() {
        View view = this.f35098e;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void firebase() {
        Bundle bundle;
        Bundle bundle2 = this.f35080e;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f35093e.m4054final(bundle);
        C1154e c1154e = this.f35093e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(1);
    }

    public abstract void inmobi(Bundle bundle);

    /* renamed from: interface, reason: not valid java name */
    public final void m4466interface(Bundle bundle) {
        AbstractC15958e abstractC15958e = this.f35112e;
        if (abstractC15958e != null && (abstractC15958e.f31420goto || abstractC15958e.f31424this)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f35111e = bundle;
    }

    public void isPro() {
        this.f35094e = true;
    }

    public LayoutInflater isVip(Bundle bundle) {
        C2386e c2386e = this.f35074e;
        if (c2386e == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1752e abstractActivityC1752e = c2386e.f6093e;
        LayoutInflater cloneInContext = abstractActivityC1752e.getLayoutInflater().cloneInContext(abstractActivityC1752e);
        cloneInContext.setFactory2(this.f35093e.purchase);
        return cloneInContext;
    }

    @Override // defpackage.InterfaceC3475e
    public final C8229e license() {
        Application application;
        Context applicationContext = subs().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + subs().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C8229e c8229e = new C8229e(0);
        if (application != null) {
            c8229e.ad(C1219e.f3858e, application);
        }
        c8229e.ad(AbstractC18129e.ad, this);
        c8229e.ad(AbstractC18129e.vip, this);
        Bundle bundle = this.f35111e;
        if (bundle != null) {
            c8229e.ad(AbstractC18129e.metrica, bundle);
        }
        return c8229e;
    }

    public final boolean loadAd() {
        return this.f35097e > 0;
    }

    public AbstractC0815e metrica() {
        return new C16685e(this);
    }

    public final AbstractC15958e mopub() {
        AbstractC15958e abstractC15958e = this.f35112e;
        if (abstractC15958e != null) {
            return abstractC15958e;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f35094e = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C2386e c2386e = this.f35074e;
        AbstractActivityC1752e abstractActivityC1752e = c2386e == null ? null : c2386e.f6097e;
        if (abstractActivityC1752e != null) {
            abstractActivityC1752e.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f35094e = true;
    }

    public void premium(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f35093e.m4049break();
        this.f35076e = true;
        this.f35081e = new C0455e(this, billing(), new RunnableC2783e(8, this));
        View pro = pro(layoutInflater, viewGroup);
        this.f35098e = pro;
        if (pro == null) {
            if (this.f35081e.f2508e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f35081e = null;
            return;
        }
        this.f35081e.appmetrica();
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f35098e + " for Fragment " + this);
        }
        AbstractC0436e.startapp(this.f35098e, this.f35081e);
        AbstractC15143e.billing(this.f35098e, this.f35081e);
        AbstractC15428e.appmetrica(this.f35098e, this.f35081e);
        this.f35106e.startapp(this.f35081e);
    }

    public View pro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final AbstractC15958e purchase() {
        if (this.f35074e != null) {
            return this.f35093e;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void remoteconfig(Bundle bundle) {
        this.f35094e = true;
        firebase();
        C1154e c1154e = this.f35093e;
        if (c1154e.tapsense >= 1) {
            return;
        }
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(1);
    }

    public void signatures() {
        this.f35094e = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eٖؓۢ, eؒٚٗ] */
    public final void smaato() {
        advert();
        this.f35069e = this.f35068e;
        this.f35068e = UUID.randomUUID().toString();
        this.f35091e = false;
        this.f35071e = false;
        this.f35075e = false;
        this.f35083e = false;
        this.f35082e = false;
        this.f35097e = 0;
        this.f35112e = null;
        this.f35093e = new AbstractC15958e();
        this.f35074e = null;
        this.f35104e = 0;
        this.f35092e = 0;
        this.f35089e = null;
        this.f35090e = false;
        this.f35096e = false;
    }

    public final Context startapp() {
        C2386e c2386e = this.f35074e;
        if (c2386e == null) {
            return null;
        }
        return c2386e.f6096e;
    }

    public final Context subs() {
        Context startapp = startapp();
        if (startapp != null) {
            return startapp;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void subscription(Context context) {
        this.f35094e = true;
        C2386e c2386e = this.f35074e;
        if ((c2386e == null ? null : c2386e.f6097e) != null) {
            this.f35094e = true;
        }
    }

    public void tapsense() {
        this.f35094e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f35068e);
        if (this.f35104e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f35104e));
        }
        if (this.f35089e != null) {
            sb.append(" tag=");
            sb.append(this.f35089e);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f35086e;
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        return (C3168e) this.f35100e.f12439e;
    }
}
