package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12514e extends AbstractC8031e implements InterfaceC2367e {

    /* renamed from: class, reason: not valid java name */
    public final Integer f25054class;
    public final C2532e crashlytics;
    public final Bundle firebase;
    public final boolean subs;

    public C12514e(Context context, Looper looper, C2532e c2532e, Bundle bundle, InterfaceC11335e interfaceC11335e, InterfaceC11914e interfaceC11914e) {
        super(context, looper, 44, c2532e, interfaceC11335e, interfaceC11914e);
        this.subs = true;
        this.crashlytics = c2532e;
        this.firebase = bundle;
        this.f25054class = (Integer) c2532e.f6389e;
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle advert() {
        C2532e c2532e = this.crashlytics;
        boolean equals = this.metrica.getPackageName().equals((String) c2532e.f6385e);
        Bundle bundle = this.firebase;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c2532e.f6385e);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0357e ? (C0357e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final boolean metrica() {
        return this.subs;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 12451000;
    }
}
