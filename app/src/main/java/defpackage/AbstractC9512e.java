package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9512e extends AbstractC16625e {

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f18867e = AbstractC14533e.startapp(Boolean.TRUE);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f18868e = AbstractC14533e.startapp(BuildConfig.FLAVOR);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C17651e f18869e = AbstractC12751e.ad();

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C0576e f18866e = AbstractC14533e.startapp(C10327e.f20377e);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C9456e f18865e = new C9456e(new C6765e(this, 1), new C6765e(this, 2), null, new C17302e(this, 1), false, false, null, 68);

    /* renamed from: return, reason: not valid java name */
    public static final Object m2583return(AbstractC9512e abstractC9512e, String str, AbstractC7185e abstractC7185e) {
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C6046e(abstractC9512e, str, (InterfaceC5083e) null, 0), abstractC7185e);
        return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
    }

    /* renamed from: else, reason: not valid java name */
    public abstract Object mo2584else(String str);

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        InterfaceC5673e billing;
        c13770e.m3676strictfp(-1822935307);
        if (Build.VERSION.SDK_INT >= 33) {
            c13770e.m3676strictfp(-1499067944);
            billing = AbstractC2270e.billing("android.permission.READ_MEDIA_AUDIO", c13770e);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(-1498977517);
            billing = AbstractC2270e.billing("android.permission.READ_EXTERNAL_STORAGE", c13770e);
            c13770e.Signature(false);
        }
        String str = (String) this.f18868e.getValue();
        InterfaceC8645e appmetrica = billing.appmetrica();
        boolean purchase = c13770e.purchase(billing) | c13770e.yandex(this);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C6626e(billing, this, null, 16);
            c13770e.m3682throws(m3681throw);
        }
        AbstractC17680e.appmetrica(str, appmetrica, (Function2) m3681throw, c13770e);
        AbstractC13348e.ad(null, AbstractC16653e.license(-1836938311, new C9718e(this, 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1760728444, new C8937e(billing, this, 8), c13770e), c13770e, 805306416, 253);
        c13770e.Signature(false);
    }

    /* renamed from: import, reason: not valid java name */
    public abstract void mo2585import(int i, int i2, C13770e c13770e);

    /* renamed from: instanceof, reason: not valid java name */
    public abstract void mo2586instanceof(InterfaceC15377e interfaceC15377e, C13770e c13770e);

    /* renamed from: synchronized, reason: not valid java name */
    public void mo2587synchronized(C13770e c13770e, int i) {
        c13770e.m3676strictfp(-343070938);
        c13770e.Signature(false);
    }

    /* renamed from: transient, reason: not valid java name */
    public abstract void mo2588transient(Function0 function0, C13770e c13770e, int i);
}
