package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15298e implements InterfaceC5039e, InterfaceC10998e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C5891e f30227e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C4891e f30228e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C16537e f30229e;

    public C15298e(C16537e c16537e) {
        this.f30229e = c16537e;
        Object appmetrica = c16537e.appmetrica("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = appmetrica instanceof Bundle ? (Bundle) appmetrica : null;
        if (bundle != null && this.f30227e == null) {
            C5891e c5891e = new C5891e(new C3560e(this, new C13465e(26, this)));
            this.f30227e = c5891e;
            c5891e.m2001try(bundle);
        }
        c16537e.purchase("androidx.savedstate.SavedStateRegistry", new C13465e(24, this));
    }

    @Override // defpackage.InterfaceC5039e
    public final Object appmetrica(String str) {
        return this.f30229e.appmetrica(str);
    }

    @Override // defpackage.InterfaceC5039e
    public final Map license() {
        return this.f30229e.license();
    }

    @Override // defpackage.InterfaceC5039e
    public final boolean metrica(Object obj) {
        return this.f30229e.metrica(obj);
    }

    @Override // defpackage.InterfaceC5039e
    public final InterfaceC10153e purchase(String str, Function0 function0) {
        return this.f30229e.purchase(str, function0);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        C4891e c4891e = this.f30228e;
        if (c4891e != null) {
            return c4891e;
        }
        C4891e c4891e2 = new C4891e(this, false);
        this.f30228e = c4891e2;
        return c4891e2;
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        C5891e c5891e = this.f30227e;
        if (c5891e == null) {
            C5891e c5891e2 = new C5891e(new C3560e(this, new C13465e(26, this)));
            this.f30227e = c5891e2;
            c5891e2.m2001try(null);
            c5891e = c5891e2;
        }
        return (C3168e) c5891e.f12439e;
    }
}
