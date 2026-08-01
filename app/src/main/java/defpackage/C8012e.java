package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8012e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ float f16258e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f16259e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3721e f16260e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f16261e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16262e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f16263e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16264e;

    public C8012e(boolean z, C3721e c3721e, int i, InterfaceC3314e interfaceC3314e, float f, boolean z2, InterfaceC3314e interfaceC3314e2) {
        this.f16262e = z;
        this.f16260e = c3721e;
        this.f16259e = i;
        this.f16261e = interfaceC3314e;
        this.f16258e = f;
        this.f16264e = z2;
        this.f16263e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((C15301e) obj).ad;
        if (!this.f16262e) {
            return Boolean.FALSE;
        }
        int adcel = AbstractC9835e.adcel(keyEvent);
        boolean z = false;
        if (adcel != 2) {
            if (adcel == 1) {
                long ad = AbstractC16852e.ad(keyEvent.getKeyCode());
                if (AbstractC13232e.ad(ad, AbstractC13232e.license) || AbstractC13232e.ad(ad, AbstractC13232e.appmetrica) || AbstractC13232e.ad(ad, AbstractC13232e.billing) || AbstractC13232e.ad(ad, AbstractC13232e.purchase) || AbstractC13232e.ad(ad, AbstractC13232e.tapsense) || AbstractC13232e.ad(ad, AbstractC13232e.isVip) || AbstractC13232e.ad(ad, AbstractC13232e.subs) || AbstractC13232e.ad(ad, AbstractC13232e.crashlytics)) {
                    Function0 function0 = (Function0) this.f16263e.getValue();
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        C3721e c3721e = this.f16260e;
        float f = c3721e.ad;
        float f2 = c3721e.vip;
        float abs = Math.abs(f2 - f);
        int i = this.f16259e;
        float f3 = abs / (i > 0 ? i + 1 : 100);
        long ad2 = AbstractC16852e.ad(keyEvent.getKeyCode());
        boolean ad3 = AbstractC13232e.ad(ad2, AbstractC13232e.license);
        float f4 = this.f16258e;
        InterfaceC3314e interfaceC3314e = this.f16261e;
        if (ad3) {
            ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf(f4 + f3), c3721e));
        } else if (AbstractC13232e.ad(ad2, AbstractC13232e.appmetrica)) {
            ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf(f4 - f3), c3721e));
        } else {
            boolean ad4 = AbstractC13232e.ad(ad2, AbstractC13232e.billing);
            boolean z2 = this.f16264e;
            if (ad4) {
                ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf(((z2 ? -1 : 1) * f3) + f4), c3721e));
            } else if (AbstractC13232e.ad(ad2, AbstractC13232e.purchase)) {
                ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf(f4 - ((z2 ? -1 : 1) * f3)), c3721e));
            } else if (AbstractC13232e.ad(ad2, AbstractC13232e.tapsense)) {
                ((Function1) interfaceC3314e.getValue()).invoke(Float.valueOf(f));
            } else if (AbstractC13232e.ad(ad2, AbstractC13232e.isVip)) {
                ((Function1) interfaceC3314e.getValue()).invoke(Float.valueOf(f2));
            } else {
                if (!AbstractC13232e.ad(ad2, AbstractC13232e.subs)) {
                    if (AbstractC13232e.ad(ad2, AbstractC13232e.crashlytics)) {
                        ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf((AbstractC3062e.metrica(r7 / 10, 1, 10) * f3) + f4), c3721e));
                    }
                    return Boolean.valueOf(z);
                }
                ((Function1) interfaceC3314e.getValue()).invoke(AbstractC3062e.purchase(Float.valueOf(f4 - (AbstractC3062e.metrica(r7 / 10, 1, 10) * f3)), c3721e));
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
