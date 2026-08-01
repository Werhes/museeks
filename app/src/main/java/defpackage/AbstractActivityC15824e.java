package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۤٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC15824e extends AbstractActivityC3684e implements InterfaceC0816e, InterfaceC3475e, InterfaceC10998e, InterfaceC15119e, InterfaceC12760e, InterfaceC5922e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C13462e f31237e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31238e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31239e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0909e f31240e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31241e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31242e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f31243e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2580e f31244e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f31245e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31246e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31247e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AtomicInteger f31248e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f31249e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C5363e f31250e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C5891e f31251e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C6127e f31252e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5363e f31253e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ExecutorC18015e f31254e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5363e f31255e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؔٔٓ] */
    public AbstractActivityC15824e() {
        ?? obj = new Object();
        obj.ad = new CopyOnWriteArraySet();
        this.f31244e = obj;
        this.f31240e = new C0909e((Runnable) new RunnableC1413e(this, 0));
        C3560e c3560e = new C3560e(this, new C13465e(26, this));
        C5891e c5891e = new C5891e(c3560e);
        this.f31251e = c5891e;
        this.f31254e = new ExecutorC18015e(this);
        this.f31253e = new C5363e(new C2075e(this, 1));
        this.f31248e = new AtomicInteger();
        this.f31252e = new C6127e(this);
        this.f31241e = new CopyOnWriteArrayList();
        this.f31249e = new CopyOnWriteArrayList();
        this.f31239e = new CopyOnWriteArrayList();
        this.f31238e = new CopyOnWriteArrayList();
        this.f31242e = new CopyOnWriteArrayList();
        this.f31246e = new CopyOnWriteArrayList();
        this.f31247e = new CopyOnWriteArrayList();
        this.f31250e = new C5363e(new C2075e(this, 2));
        C4891e c4891e = this.f8255e;
        if (c4891e == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        c4891e.ad(new InterfaceC12179e(this) { // from class: eٓؓۨ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractActivityC15824e f27228e;

            {
                this.f27228e = this;
            }

            @Override // defpackage.InterfaceC12179e
            public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
                Window window;
                View peekDecorView;
                switch (i) {
                    case 0:
                        AbstractActivityC15824e abstractActivityC15824e = this.f27228e;
                        if (enumC14621e != EnumC14621e.ON_STOP || (window = abstractActivityC15824e.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        AbstractActivityC15824e abstractActivityC15824e2 = this.f27228e;
                        if (enumC14621e == EnumC14621e.ON_DESTROY) {
                            abstractActivityC15824e2.f31244e.vip = null;
                            if (!abstractActivityC15824e2.isChangingConfigurations()) {
                                abstractActivityC15824e2.billing().ad();
                            }
                            ExecutorC18015e executorC18015e = abstractActivityC15824e2.f31254e;
                            AbstractActivityC15824e abstractActivityC15824e3 = executorC18015e.f35339e;
                            abstractActivityC15824e3.getWindow().getDecorView().removeCallbacks(executorC18015e);
                            abstractActivityC15824e3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC18015e);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        this.f8255e.ad(new InterfaceC12179e(this) { // from class: eٓؓۨ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractActivityC15824e f27228e;

            {
                this.f27228e = this;
            }

            @Override // defpackage.InterfaceC12179e
            public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
                Window window;
                View peekDecorView;
                switch (i2) {
                    case 0:
                        AbstractActivityC15824e abstractActivityC15824e = this.f27228e;
                        if (enumC14621e != EnumC14621e.ON_STOP || (window = abstractActivityC15824e.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        AbstractActivityC15824e abstractActivityC15824e2 = this.f27228e;
                        if (enumC14621e == EnumC14621e.ON_DESTROY) {
                            abstractActivityC15824e2.f31244e.vip = null;
                            if (!abstractActivityC15824e2.isChangingConfigurations()) {
                                abstractActivityC15824e2.billing().ad();
                            }
                            ExecutorC18015e executorC18015e = abstractActivityC15824e2.f31254e;
                            AbstractActivityC15824e abstractActivityC15824e3 = executorC18015e.f35339e;
                            abstractActivityC15824e3.getWindow().getDecorView().removeCallbacks(executorC18015e);
                            abstractActivityC15824e3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC18015e);
                            return;
                        }
                        return;
                }
            }
        });
        this.f8255e.ad(new C18149e(i2, this));
        c3560e.ad();
        AbstractC18129e.license(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f8255e.ad(new C6777e(this));
        }
        ((C3168e) c5891e.f12439e).m1261e("android:support:activity-result", new C14574e(1, this));
        advert(new C12409e(this, 0));
        new C5363e(new C2075e(this, 3));
        this.f31255e = new C5363e(new C2075e(this, 4));
    }

    public static void adcel(AbstractActivityC15824e abstractActivityC15824e) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!AbstractC7890e.billing(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!AbstractC7890e.billing(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void startapp(C6194e c6194e, AbstractActivityC15824e abstractActivityC15824e, EnumC14621e enumC14621e) {
        if (enumC14621e == EnumC14621e.ON_CREATE) {
            c6194e.metrica(abstractActivityC15824e.getOnBackInvokedDispatcher());
        }
    }

    @Override // defpackage.InterfaceC15119e
    public final C6194e ad() {
        return (C6194e) this.f31255e.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        smaato();
        this.f31254e.ad(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final void advert(InterfaceC7805e interfaceC7805e) {
        C2580e c2580e = this.f31244e;
        if (((AbstractActivityC15824e) c2580e.vip) != null) {
            interfaceC7805e.ad();
        }
        ((CopyOnWriteArraySet) c2580e.ad).add(interfaceC7805e);
    }

    public final C15172e amazon(final InterfaceC17091e interfaceC17091e, final C4094e c4094e) {
        final String str = "activity_rq#" + this.f31248e.getAndIncrement();
        final C6127e c6127e = this.f31252e;
        LinkedHashMap linkedHashMap = c6127e.metrica;
        C4891e c4891e = this.f8255e;
        if (c4891e.license.ad(EnumC7785e.f15779e)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c4891e.license + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        c6127e.license(str);
        C7758e c7758e = (C7758e) linkedHashMap.get(str);
        if (c7758e == null) {
            c7758e = new C7758e(c4891e);
        }
        InterfaceC12179e interfaceC12179e = new InterfaceC12179e() { // from class: eًٍؖ
            @Override // defpackage.InterfaceC12179e
            public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
                EnumC14621e enumC14621e2 = EnumC14621e.ON_START;
                C6127e c6127e2 = C6127e.this;
                String str2 = str;
                if (enumC14621e2 != enumC14621e) {
                    if (EnumC14621e.ON_STOP == enumC14621e) {
                        c6127e2.appmetrica.remove(str2);
                        return;
                    } else {
                        if (EnumC14621e.ON_DESTROY == enumC14621e) {
                            c6127e2.appmetrica(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = c6127e2.appmetrica;
                Bundle bundle = c6127e2.billing;
                LinkedHashMap linkedHashMap3 = c6127e2.purchase;
                InterfaceC17091e interfaceC17091e2 = interfaceC17091e;
                C4094e c4094e2 = c4094e;
                linkedHashMap2.put(str2, new C14633e(interfaceC17091e2, c4094e2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC17091e2.purchase(obj);
                }
                C13381e c13381e = (C13381e) AbstractC9528e.amazon(str2, bundle);
                if (c13381e != null) {
                    bundle.remove(str2);
                    interfaceC17091e2.purchase(c4094e2.adcel(c13381e.f26638e, c13381e.f26639e));
                }
            }
        };
        c7758e.ad.ad(interfaceC12179e);
        c7758e.vip.add(interfaceC12179e);
        linkedHashMap.put(str, c7758e);
        return new C15172e(c6127e, str, c4094e, 0);
    }

    @Override // defpackage.InterfaceC5922e
    public final C6127e appmetrica() {
        return this.f31252e;
    }

    @Override // defpackage.InterfaceC0816e
    public final C13462e billing() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f31237e == null) {
            C1953e c1953e = (C1953e) getLastNonConfigurationInstance();
            if (c1953e != null) {
                this.f31237e = c1953e.ad;
            }
            if (this.f31237e == null) {
                this.f31237e = new C13462e();
            }
        }
        return this.f31237e;
    }

    @Override // defpackage.InterfaceC3475e
    public final C8229e license() {
        C8229e c8229e = new C8229e(0);
        if (getApplication() != null) {
            c8229e.ad(C1219e.f3858e, getApplication());
        }
        c8229e.ad(AbstractC18129e.ad, this);
        c8229e.ad(AbstractC18129e.vip, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c8229e.ad(AbstractC18129e.metrica, extras);
        }
        return c8229e;
    }

    @Override // defpackage.InterfaceC12760e
    public final C11106e metrica() {
        return ad().vip().metrica;
    }

    public final void mopub(InterfaceC0867e interfaceC0867e) {
        this.f31241e.add(interfaceC0867e);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f31252e.ad(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C7891e) this.f31250e.getValue()).ad();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f31241e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.AbstractActivityC3684e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31251e.m2001try(bundle);
        C2580e c2580e = this.f31244e;
        c2580e.vip = this;
        Iterator it = ((CopyOnWriteArraySet) c2580e.ad).iterator();
        while (it.hasNext()) {
            ((InterfaceC7805e) it.next()).ad();
        }
        super.onCreate(bundle);
        int i = FragmentC17355e.f34058e;
        AbstractC17368e.vip(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f31240e.f3322e).iterator();
        while (it.hasNext()) {
            ((C17982e) it.next()).ad.mopub();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f31240e.m424native();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f31245e) {
            return;
        }
        Iterator it = this.f31238e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(new C6948e(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f31245e = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f31245e = false;
            Iterator it = this.f31238e.iterator();
            while (it.hasNext()) {
                ((InterfaceC0867e) it.next()).accept(new C6948e(z));
            }
        } catch (Throwable th) {
            this.f31245e = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f31239e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f31240e.f3322e).iterator();
        while (it.hasNext()) {
            ((C17982e) it.next()).ad.admob();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f31243e) {
            return;
        }
        Iterator it = this.f31242e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(new C0089e(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f31243e = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f31243e = false;
            Iterator it = this.f31242e.iterator();
            while (it.hasNext()) {
                ((InterfaceC0867e) it.next()).accept(new C0089e(z));
            }
        } catch (Throwable th) {
            this.f31243e = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        C14595e vip = AbstractC0879e.vip(pictureInPictureUiState);
        Iterator it = this.f31246e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(vip);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f31240e.f3322e).iterator();
        while (it.hasNext()) {
            ((C17982e) it.next()).ad.pro();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f31252e.ad(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٜؓ۠, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1953e c1953e;
        C13462e c13462e = this.f31237e;
        if (c13462e == null && (c1953e = (C1953e) getLastNonConfigurationInstance()) != null) {
            c13462e = c1953e.ad;
        }
        if (c13462e == null) {
            return null;
        }
        ?? obj = new Object();
        obj.ad = c13462e;
        return obj;
    }

    @Override // defpackage.AbstractActivityC3684e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C4891e c4891e = this.f8255e;
        if (c4891e != null) {
            c4891e.license("setCurrentState");
            c4891e.purchase(EnumC7785e.f15777e);
        }
        super.onSaveInstanceState(bundle);
        this.f31251e.m1999protected(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f31249e.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f31247e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC12246e.billing()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((C12059e) this.f31253e.getValue()).ad();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        smaato();
        this.f31254e.ad(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        smaato();
        this.f31254e.ad(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        smaato();
        this.f31254e.ad(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public final void smaato() {
        AbstractC0436e.startapp(getWindow().getDecorView(), this);
        AbstractC15143e.billing(getWindow().getDecorView(), this);
        AbstractC15428e.appmetrica(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f8255e;
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        return (C3168e) this.f31251e.f12439e;
    }
}
