package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14835e implements InterfaceC17083e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2616e f29371e = new C2616e(1.0f);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14826e f29372e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C8419e f29373e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f29374e;

    public C14835e(Context context) {
        this.f29374e = context;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C5107e.f10971e;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [eٍؗۥ, eٌٍۨ, java.lang.Object] */
    @Override // defpackage.InterfaceC17083e
    /* renamed from: new */
    public final float mo2509new() {
        InterfaceC5083e interfaceC5083e;
        InterfaceC0542e interfaceC0542e;
        if (this.f29373e == null) {
            Context context = this.f29374e;
            C0583e c0583e = AbstractC2830e.ad;
            synchronized (c0583e) {
                try {
                    Object billing = c0583e.billing(context);
                    interfaceC5083e = null;
                    if (billing == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C14137e ad = AbstractC12501e.ad(-1, 0, null, 6);
                        C10250e c10250e = new C10250e(new C6365e(contentResolver, uriFor, new C14373e(ad, AbstractC5756e.metrica(Looper.getMainLooper()), 1), ad, context, null));
                        C14826e vip = AbstractC9743e.vip();
                        ?? obj = new Object();
                        Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        C9831e ad2 = AbstractC14073e.ad(c10250e);
                        C1615e metrica = AbstractC9180e.metrica(valueOf);
                        AbstractC5336e.appmetrica(obj.equals(C10666e.ad) ? 1 : 4, (InterfaceC8850e) ad2.appmetrica, vip, new C1247e((InterfaceC9347e) obj, (InterfaceC1108e) ad2.license, metrica, valueOf, (InterfaceC5083e) null));
                        billing = new C14688e(metrica);
                        c0583e.amazon(context, billing);
                    }
                    interfaceC0542e = (InterfaceC0542e) billing;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f29371e.startapp(((Number) interfaceC0542e.getValue()).floatValue());
            C14826e c14826e = this.f29372e;
            if (c14826e == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.f29373e = AbstractC5336e.purchase(c14826e, null, 0, new C17806e(interfaceC0542e, this, interfaceC5083e, 18), 3);
        }
        return this.f29371e.purchase();
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }
}
