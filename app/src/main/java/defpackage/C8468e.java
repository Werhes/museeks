package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8468e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f17239e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17240e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f17241e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f17242e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f17243e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f17244e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f17245e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17246e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f17247e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17248e;

    public /* synthetic */ C8468e(C4246e c4246e, C4246e c4246e2, C4246e c4246e3, Context context, RemoteViews remoteViews, C2158e c2158e, C4246e c4246e4, C4246e c4246e5, C4246e c4246e6, C6555e c6555e, C4246e c4246e7, C4246e c4246e8, C4246e c4246e9) {
        this.f17242e = c4246e;
        this.f17240e = c4246e2;
        this.f17244e = c4246e3;
        this.f17245e = remoteViews;
        this.f17241e = c2158e;
        this.f17239e = c4246e4;
        this.f17248e = c4246e6;
        this.f17247e = c4246e8;
        this.f17243e = c4246e9;
    }

    public /* synthetic */ C8468e(String str, InterfaceC2558e interfaceC2558e, C12781e c12781e, C12781e c12781e2, Function1 function1, Function1 function12, C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, int i) {
        this.f17242e = str;
        this.f17240e = interfaceC2558e;
        this.f17244e = c12781e;
        this.f17239e = c12781e2;
        this.f17248e = function1;
        this.f17247e = function12;
        this.f17243e = c2892e;
        this.f17245e = c2892e2;
        this.f17241e = interfaceC12864e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4293e c4293e;
        switch (this.f17246e) {
            case 0:
                C4246e c4246e = (C4246e) this.f17242e;
                C4246e c4246e2 = (C4246e) this.f17240e;
                C4246e c4246e3 = (C4246e) this.f17244e;
                RemoteViews remoteViews = (RemoteViews) this.f17245e;
                C2158e c2158e = (C2158e) this.f17241e;
                C4246e c4246e4 = (C4246e) this.f17239e;
                C4246e c4246e5 = (C4246e) this.f17248e;
                C4246e c4246e6 = (C4246e) this.f17247e;
                C4246e c4246e7 = (C4246e) this.f17243e;
                InterfaceC15276e interfaceC15276e = (InterfaceC15276e) obj2;
                if (interfaceC15276e instanceof C4289e) {
                    if (c4246e.f9318e != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    c4246e.f9318e = interfaceC15276e;
                } else if (interfaceC15276e instanceof C12005e) {
                    c4246e2.f9318e = interfaceC15276e;
                } else if (interfaceC15276e instanceof C8851e) {
                    c4246e3.f9318e = interfaceC15276e;
                } else if (interfaceC15276e instanceof InterfaceC6250e) {
                    InterfaceC6250e interfaceC6250e = (InterfaceC6250e) interfaceC15276e;
                    int i = c2158e.ad;
                    if (interfaceC6250e instanceof C0406e) {
                        remoteViews.setInt(i, "setBackgroundResource", ((C0406e) interfaceC6250e).ad.ad);
                    } else {
                        if (!(interfaceC6250e instanceof C8414e)) {
                            throw new C14803e(10);
                        }
                        int i2 = ((C8414e) interfaceC6250e).ad.ad;
                        if (Build.VERSION.SDK_INT >= 31) {
                            AbstractC11059e.license(remoteViews, i, "setBackgroundColor", i2);
                        } else {
                            remoteViews.setInt(i, "setBackgroundResource", i2);
                        }
                    }
                } else if (interfaceC15276e instanceof C4293e) {
                    C4293e c4293e2 = (C4293e) c4246e4.f9318e;
                    if (c4293e2 != null) {
                        C4293e c4293e3 = (C4293e) interfaceC15276e;
                        c4293e = new C4293e(c4293e2.ad.ad(c4293e3.ad), c4293e2.vip.ad(c4293e3.vip), c4293e2.metrica.ad(c4293e3.metrica), c4293e2.license.ad(c4293e3.license), c4293e2.appmetrica.ad(c4293e3.appmetrica), c4293e2.purchase.ad(c4293e3.purchase));
                    } else {
                        c4293e = (C4293e) interfaceC15276e;
                    }
                    c4246e4.f9318e = c4293e;
                } else if (interfaceC15276e instanceof C13917e) {
                    c4246e5.f9318e = ((C13917e) interfaceC15276e).ad;
                } else if (!(interfaceC15276e instanceof C0522e) && !(interfaceC15276e instanceof C14933e)) {
                    if (interfaceC15276e instanceof AbstractC8277e) {
                        c4246e6.f9318e = interfaceC15276e;
                    } else if (interfaceC15276e instanceof C9879e) {
                        c4246e7.f9318e = interfaceC15276e;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + interfaceC15276e + "', nothing done.");
                    }
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC12185e.metrica((String) this.f17242e, (InterfaceC2558e) this.f17240e, (C12781e) this.f17244e, (C12781e) this.f17239e, (Function1) this.f17248e, (Function1) this.f17247e, (C2892e) this.f17243e, (C2892e) this.f17245e, (InterfaceC12864e) this.f17241e, (C13770e) obj, AbstractC5190e.advert(114819073));
                return Unit.INSTANCE;
        }
    }
}
