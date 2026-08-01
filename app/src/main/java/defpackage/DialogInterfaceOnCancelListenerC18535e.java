package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC18535e extends AbstractComponentCallbacksC17875e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public Dialog f36330e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public boolean f36331e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public boolean f36332e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public final C12356e f36333e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC11029e f36334e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final DialogInterfaceOnCancelListenerC4144e f36335e;

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public boolean f36336e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public boolean f36337e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public int f36338e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public boolean f36339e;

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public boolean f36340e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public boolean f36341e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public int f36342e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public int f36343e;

    public DialogInterfaceOnCancelListenerC18535e() {
        new RunnableC12991e(6, this);
        this.f36335e = new DialogInterfaceOnCancelListenerC4144e(this);
        this.f36334e = new DialogInterfaceOnDismissListenerC11029e(this);
        this.f36342e = 0;
        this.f36343e = 0;
        this.f36341e = true;
        this.f36339e = true;
        this.f36338e = -1;
        this.f36333e = new C12356e(this);
        this.f36336e = false;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void Signature() {
        this.f35094e = true;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void ads(Bundle bundle) {
        Bundle bundle2;
        this.f35094e = true;
        if (this.f36330e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f36330e.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public void applovin() {
        this.f35094e = true;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: goto */
    public Dialog mo2472goto() {
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC6137e(subs(), this.f36343e);
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public void inmobi(Bundle bundle) {
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f36342e;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f36343e;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f36341e;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f36339e;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f36338e;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public void isPro() {
        this.f35094e = true;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            this.f36331e = false;
            dialog.show();
            View decorView = this.f36330e.getWindow().getDecorView();
            AbstractC0436e.startapp(decorView, this);
            AbstractC15143e.billing(decorView, this);
            AbstractC15428e.appmetrica(decorView, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // defpackage.AbstractComponentCallbacksC17875e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater isVip(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.isVip(r8)
            boolean r0 = r7.f36339e
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9c
            boolean r3 = r7.f36337e
            if (r3 == 0) goto L11
            goto L9c
        L11:
            if (r0 != 0) goto L14
            goto L73
        L14:
            boolean r0 = r7.f36336e
            if (r0 != 0) goto L73
            r0 = 0
            r3 = 1
            r7.f36337e = r3     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.mo2472goto()     // Catch: java.lang.Throwable -> L50
            r7.f36330e = r4     // Catch: java.lang.Throwable -> L50
            boolean r5 = r7.f36339e     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L6a
            int r5 = r7.f36342e     // Catch: java.lang.Throwable -> L50
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L50
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L50
        L3e:
            android.content.Context r4 = r7.startapp()     // Catch: java.lang.Throwable -> L50
            boolean r5 = defpackage.AbstractC0869e.premium(r4)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L52
            android.app.Dialog r5 = r7.f36330e     // Catch: java.lang.Throwable -> L50
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L50
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r8 = move-exception
            goto L70
        L52:
            android.app.Dialog r4 = r7.f36330e     // Catch: java.lang.Throwable -> L50
            boolean r5 = r7.f36341e     // Catch: java.lang.Throwable -> L50
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.f36330e     // Catch: java.lang.Throwable -> L50
            eٖٟؖ r5 = r7.f36335e     // Catch: java.lang.Throwable -> L50
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.f36330e     // Catch: java.lang.Throwable -> L50
            eُٖۚ r5 = r7.f36334e     // Catch: java.lang.Throwable -> L50
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L50
            r7.f36336e = r3     // Catch: java.lang.Throwable -> L50
            goto L6d
        L6a:
            r3 = 0
            r7.f36330e = r3     // Catch: java.lang.Throwable -> L50
        L6d:
            r7.f36337e = r0
            goto L73
        L70:
            r7.f36337e = r0
            throw r8
        L73:
            boolean r0 = defpackage.AbstractC15958e.m4045native(r2)
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8f:
            android.app.Dialog r0 = r7.f36330e
            if (r0 == 0) goto Ld7
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L9c:
            boolean r0 = defpackage.AbstractC15958e.m4045native(r2)
            if (r0 == 0) goto Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f36339e
            if (r2 != 0) goto Lc6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogInterfaceOnCancelListenerC18535e.isVip(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final AbstractC0815e metrica() {
        return new C3736e(this, new C16685e(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f36331e) {
            return;
        }
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f36332e) {
            return;
        }
        this.f36332e = true;
        this.f36340e = false;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f36330e.dismiss();
        }
        this.f36331e = true;
        if (this.f36338e >= 0) {
            AbstractC15958e mopub = mopub();
            int i = this.f36338e;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Bad id: "));
            }
            mopub.inmobi(new C0635e(mopub, i), true);
            this.f36338e = -1;
            return;
        }
        C10159e c10159e = new C10159e(mopub());
        c10159e.loadAd = true;
        AbstractC15958e abstractC15958e = this.f35112e;
        if (abstractC15958e == null || abstractC15958e == c10159e.admob) {
            c10159e.vip(new C7659e(3, this));
            c10159e.appmetrica(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void premium(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.premium(layoutInflater, viewGroup, bundle);
        if (this.f35098e != null || this.f36330e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f36330e.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public void remoteconfig(Bundle bundle) {
        super.remoteconfig(bundle);
        new Handler();
        this.f36339e = this.f35092e == 0;
        if (bundle != null) {
            this.f36342e = bundle.getInt("android:style", 0);
            this.f36343e = bundle.getInt("android:theme", 0);
            this.f36341e = bundle.getBoolean("android:cancelable", true);
            this.f36339e = bundle.getBoolean("android:showsDialog", this.f36339e);
            this.f36338e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void signatures() {
        this.f35094e = true;
        Dialog dialog = this.f36330e;
        if (dialog != null) {
            this.f36331e = true;
            dialog.setOnDismissListener(null);
            this.f36330e.dismiss();
            if (!this.f36332e) {
                onDismiss(this.f36330e);
            }
            this.f36330e = null;
            this.f36336e = false;
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void subscription(Context context) {
        super.subscription(context);
        this.f35106e.appmetrica(this.f36333e);
        if (this.f36340e) {
            return;
        }
        this.f36332e = false;
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final void tapsense() {
        this.f35094e = true;
        if (!this.f36340e && !this.f36332e) {
            this.f36332e = true;
        }
        this.f35106e.yandex(this.f36333e);
    }
}
