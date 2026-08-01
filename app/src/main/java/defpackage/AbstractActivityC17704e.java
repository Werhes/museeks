package defpackage;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC17704e extends AbstractActivityC1752e implements InterfaceC10956e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C1059e f34700e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public SparseArray f34701e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public int f34702e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C0415e f34703e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public SparseArray f34704e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C6965e f34705e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public C11109e f34706e;

    public final void ads(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        SparseArray sparseArray = this.f34701e;
        C6868e c6868e = (C6868e) sparseArray.get(i);
        if (c6868e != null) {
            sparseArray.remove(i);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                arrayList.add(new C8804e(iArr[i2]));
            }
            c6868e.ad(arrayList);
        }
    }

    public final void applovin() {
        super.onDestroy();
        AbstractC15933e.metrica.remove(this);
    }

    @Override // defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC3684e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 111 && keyEvent.getAction() == 1) {
            onBackPressed();
            return true;
        }
        this.f34700e.m461getCurrentFragment();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources, eؘؚٝ] */
    @Override // defpackage.AbstractActivityC1752e, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f34705e == null) {
            Resources resources = super.getResources();
            ?? resources2 = new Resources(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
            resources2.ad = resources;
            this.f34705e = resources2;
        }
        return this.f34705e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!Objects.equals(str, "layout_inflater")) {
            return super.getSystemService(str);
        }
        if (this.f34703e == null) {
            this.f34703e = new C0415e(this, (LayoutInflater) super.getSystemService(str));
        }
        return this.f34703e;
    }

    public final void inmobi(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f34704e.get(i) != null) {
            throw new ClassCastException();
        }
    }

    public final void isPro(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC15933e.metrica.add(this);
        AbstractC6959e.purchase();
        getWindow().setStatusBarColor(AbstractC15933e.ad(R.attr.windowBackground));
    }

    public abstract void isVip(AbstractC13859e abstractC13859e);

    @Override // defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        inmobi(i, i2, intent);
        Stack<AbstractC13859e> fragmentStack = this.f34700e.getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        fragmentStack.peek().getClass();
    }

    @Override // defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT < 29 || !AbstractC6959e.f14257e.getBoolean("enabled", true) || (configuration.uiMode & 48) == 0) {
            return;
        }
        AbstractC6959e.purchase();
    }

    @Override // defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, defpackage.AbstractActivityC3684e, android.app.Activity
    public void onCreate(Bundle bundle) {
        isPro(bundle);
        C1059e c1059e = new C1059e(this);
        this.f34700e = c1059e;
        c1059e.setNavigationListener(this);
        C1059e c1059e2 = this.f34700e;
        if (findViewById(R.id.content) != null) {
            setContentView(c1059e2);
        }
        this.f34706e = new C11109e(3, this);
        ad().ad(this.f34706e, this);
    }

    @Override // defpackage.AbstractActivityC1752e, android.app.Activity
    public void onDestroy() {
        applovin();
        Iterator<AbstractC13859e> it = this.f34700e.getFragmentStack().iterator();
        while (it.hasNext()) {
            it.next().applovin();
        }
        this.f34706e.license();
    }

    @Override // defpackage.AbstractActivityC1752e, android.app.Activity
    public void onPause() {
        super.onPause();
        C1059e c1059e = this.f34700e;
        if (c1059e != null) {
            Stack<AbstractC13859e> fragmentStack = c1059e.getFragmentStack();
            for (int max = Math.max(0, fragmentStack.size() - 2); max < fragmentStack.size(); max++) {
                fragmentStack.get(max).ads();
            }
        }
    }

    @Override // defpackage.AbstractActivityC1752e, defpackage.AbstractActivityC15824e, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ads(i, strArr, iArr);
        Stack<AbstractC13859e> fragmentStack = this.f34700e.getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        fragmentStack.peek().subs(i, strArr, iArr);
    }

    @Override // defpackage.AbstractActivityC1752e, android.app.Activity
    public void onResume() {
        super.onResume();
        C1059e c1059e = this.f34700e;
        if (c1059e != null) {
            Stack<AbstractC13859e> fragmentStack = c1059e.getFragmentStack();
            for (int max = Math.max(0, fragmentStack.size() - 2); max < fragmentStack.size(); max++) {
                fragmentStack.get(max).crashlytics();
            }
        }
    }

    public final void premium(List list, C6868e c6868e) {
        int i = this.f34702e;
        this.f34702e = i + 1;
        this.f34701e.put(i, c6868e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (checkPermission((String) it.next(), Process.myPid(), Process.myUid()) != 0) {
                requestPermissions((String[]) list.toArray(new String[0]), i);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C8804e(0));
        }
        c6868e.ad(arrayList);
    }

    public final void tapsense() {
        this.f34706e.appmetrica(this.f34700e.getFragmentStack().size() > 1);
    }
}
