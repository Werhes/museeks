package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9456e extends AbstractC18491e {
    public final C0576e Signature;
    public final boolean adcel;
    public final C0576e advert;
    public final C0576e amazon;
    public final Function0 appmetrica;
    public final Function1 billing;
    public C11204e loadAd;
    public final Function0 mopub;
    public final Function0 purchase;
    public final C0576e smaato;
    public final boolean startapp;
    public final Function1 yandex;

    public C9456e(Function0 function0, Function0 function02, C9002e c9002e, Function1 function1, boolean z, boolean z2, C11119e c11119e, int i) {
        Function1 c7983e = (i & 4) != 0 ? new C7983e(6) : c9002e;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        Function0 c10673e = (i & 64) != 0 ? new C10673e(9) : c11119e;
        this.appmetrica = function0;
        this.purchase = function02;
        this.billing = c7983e;
        this.yandex = function1;
        this.startapp = z;
        this.adcel = z2;
        this.mopub = c10673e;
        Boolean bool = Boolean.FALSE;
        this.advert = AbstractC14533e.startapp(bool);
        this.smaato = AbstractC14533e.startapp(bool);
        this.amazon = AbstractC14533e.startapp(BuildConfig.FLAVOR);
        this.Signature = AbstractC14533e.startapp(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
    }

    public final void Signature(Function2 function2, C13770e c13770e, int i, int i2) {
        int i3;
        Function2 function22;
        Object c5176e;
        c13770e.m3671package(1988865583);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c13770e.yandex(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                function2 = AbstractC11267e.ad;
            }
            Function2 function23 = function2;
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C6260e();
                c13770e.m3682throws(m3681throw);
            }
            C6260e c6260e = (C6260e) m3681throw;
            InterfaceC16054e interfaceC16054e = (InterfaceC16054e) c13770e.adcel(AbstractC11473e.startapp);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw2;
            InterfaceC3314e metrica = AbstractC13281e.metrica(c15274e, c13770e, 6);
            Boolean bool = (Boolean) this.advert.getValue();
            bool.booleanValue();
            boolean yandex = c13770e.yandex(this) | c13770e.yandex(interfaceC16054e);
            Object m3681throw3 = c13770e.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            if (yandex || m3681throw3 == c5170e) {
                c5176e = new C5176e(this, interfaceC16054e, c6260e, interfaceC5083e, 8);
                c13770e.m3682throws(c5176e);
            } else {
                c5176e = m3681throw3;
            }
            AbstractC17680e.license(c13770e, bool, (Function2) c5176e);
            Boolean bool2 = (Boolean) this.smaato.getValue();
            bool2.booleanValue();
            boolean yandex2 = c13770e.yandex(this) | c13770e.yandex(interfaceC16054e);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex2 || m3681throw4 == c5170e) {
                m3681throw4 = new C10954e(this, interfaceC16054e, interfaceC5083e, 12);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.license(c13770e, bool2, (Function2) m3681throw4);
            Unit unit = Unit.INSTANCE;
            boolean yandex3 = c13770e.yandex(this) | c13770e.purchase(metrica);
            Object m3681throw5 = c13770e.m3681throw();
            if (yandex3 || m3681throw5 == c5170e) {
                m3681throw5 = new C7602e(this, metrica, interfaceC5083e, 1);
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw5);
            AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, AbstractC0608e.ad), AbstractC16653e.license(1015054703, new C6409e(this, c6260e, c15274e, function23, 18), c13770e), c13770e, 56);
            function22 = function23;
        } else {
            c13770e.m3659default();
            function22 = function2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2640e(this, function22, i, i2, 1);
        }
    }

    public final void admob(boolean z) {
        this.smaato.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.AbstractC18491e
    public final void advert(String str) {
    }

    public final void loadAd(EnumC12199e enumC12199e, C13770e c13770e, int i) {
        c13770e.m3671package(-1702304664);
        int i2 = (c13770e.license(enumC12199e.ordinal()) ? 4 : 2) | i | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            boolean yandex = c13770e.yandex(this) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C5565e(enumC12199e, this, 8);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC0014e.metrica((Function0) m3681throw, C0115e.f1276e, false, null, null, null, AbstractC16653e.license(-1563728374, new C13752e(enumC12199e, startapp, 10), c13770e), c13770e, 1572912, 60);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(this, enumC12199e, i, 13);
        }
    }

    @Override // defpackage.AbstractC18491e
    public final void mopub() {
        this.Signature.setValue(AbstractC17202e.license(AbstractC15933e.appmetrica.metrica));
    }

    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        C11204e ad = C11204e.ad(LayoutInflater.from(context), viewGroup);
        this.loadAd = ad;
        ad.f22468e.setContent(new C2892e(-2109107379, true, new C2739e(this, 0)));
        return ad.f22469e;
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        ComposeView composeView;
        C11204e c11204e = this.loadAd;
        if (c11204e == null || (composeView = c11204e.f22469e) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        composeView.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        C11204e c11204e = this.loadAd;
        if (c11204e != null) {
            return c11204e.f22469e;
        }
        return null;
    }
}
