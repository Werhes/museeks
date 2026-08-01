package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17151e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33638e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f33639e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f33640e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f33641e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33642e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f33643e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C17151e(C3079e c3079e, C16701e c16701e, String str, C2751e c2751e, Function2 function2) {
        this.f33642e = 5;
        this.f33640e = c3079e;
        this.f33639e = c16701e;
        this.f33641e = str;
        this.f33638e = c2751e;
        this.f33643e = (C7460e) function2;
    }

    public /* synthetic */ C17151e(EnumC13413e enumC13413e, Function1 function1, InterfaceC3314e interfaceC3314e, InterfaceC16132e interfaceC16132e, Function0 function0) {
        this.f33642e = 4;
        this.f33640e = enumC13413e;
        this.f33639e = function1;
        this.f33643e = interfaceC3314e;
        this.f33641e = interfaceC16132e;
        this.f33638e = function0;
    }

    public /* synthetic */ C17151e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f33642e = i;
        this.f33640e = obj;
        this.f33639e = obj2;
        this.f33641e = obj3;
        this.f33638e = obj4;
        this.f33643e = obj5;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33642e;
        int i2 = 23;
        Object obj2 = this.f33643e;
        Object obj3 = this.f33638e;
        Object obj4 = this.f33641e;
        Object obj5 = this.f33639e;
        Object obj6 = this.f33640e;
        int i3 = 1;
        switch (i) {
            case 0:
                C13199e c13199e = (C13199e) obj6;
                c13199e.ad = ((C6127e) obj5).metrica((String) obj4, (C4094e) obj3, new C0211e(i3, (InterfaceC3314e) obj2));
                return new C6035e(1, c13199e);
            case 1:
                C14053e c14053e = (C14053e) obj;
                C10689e c10689e = ((C4367e) obj5).ad;
                c14053e.yandex = (C0398e) obj6;
                c14053e.startapp = (C16174e) obj4;
                c14053e.metrica = (C9675e) obj3;
                c14053e.license = (Function1) obj2;
                c14053e.appmetrica = c10689e != null ? c10689e.f21055e : null;
                c14053e.purchase = c10689e != null ? c10689e.f21053e : null;
                c14053e.billing = c10689e != null ? (InterfaceC11678e) AbstractC10432e.vip(c10689e, AbstractC11473e.pro) : null;
                return Unit.INSTANCE;
            case 2:
                C0764e c0764e = (C0764e) obj6;
                C16929e c16929e = (C16929e) obj5;
                C0764e c0764e2 = (C0764e) obj4;
                C2616e c2616e = (C2616e) obj3;
                C2616e c2616e2 = (C2616e) obj2;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(390096321, true, new C0428e(c0764e, 0)), 3);
                InterfaceC16132e interfaceC16132e = c0764e.f3119e;
                if (((C5267e) interfaceC16132e.getValue()).f11347e) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1932175844, true, new C0428e(c0764e, i3)), 3);
                    if (((C5267e) interfaceC16132e.getValue()).f11345e) {
                        List list = ((C5267e) interfaceC16132e.getValue()).f11346e;
                        c17213e.mopub(list.size(), null, new Cfor(list, i2, false), new C2892e(2039820996, true, new C4208e(i3, list, c16929e, c0764e2)));
                        if (((C5267e) interfaceC16132e.getValue()).f11346e.size() < 4) {
                            AbstractC5087e.premium(c17213e, null, null, new C2892e(845546898, true, new C17630e(c16929e, c0764e2, 9)), 3);
                        }
                    } else {
                        AbstractC5087e.premium(c17213e, null, null, new C2892e(-393133120, true, new C5061e(i3, c0764e, c2616e)), 3);
                        AbstractC5087e.premium(c17213e, null, null, AbstractC15920e.billing, 3);
                        AbstractC5087e.premium(c17213e, null, null, new C2892e(442251512, true, new C5061e(0, c0764e, c2616e2)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                C16213e c16213e = (C16213e) obj6;
                C4246e c4246e = (C4246e) obj5;
                C15096e c15096e = (C15096e) obj4;
                C11950e c11950e = (C11950e) obj3;
                C9302e c9302e = (C9302e) obj2;
                float floatValue = ((Float) obj).floatValue();
                C1181e m4145new = C16213e.m4145new(c16213e.yandex);
                if (m4145new != null) {
                    C17424e c17424e = (C17424e) c16213e.purchase;
                    long j = m4145new.vip;
                    long j2 = m4145new.ad;
                    ((C1756e) c17424e.f34142e).ad(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((C1756e) c17424e.f34141e).ad(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    C1181e ad = ((C1181e) c4246e.f9318e).ad(m4145new);
                    c4246e.f9318e = ad;
                    c15096e.f29883e = c11950e.startapp(c11950e.appmetrica(ad.ad));
                    c9302e.f18534e = !AbstractC16479e.ad(r3 - floatValue);
                }
                return Boolean.valueOf(m4145new != null);
            case 4:
                EnumC13413e enumC13413e = (EnumC13413e) obj6;
                Function1 function1 = (Function1) obj5;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj2;
                C17213e c17213e2 = (C17213e) obj;
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(388660726, true, new C8124e(i2, enumC13413e, function1, interfaceC3314e)), 3);
                AbstractC5087e.premium(c17213e2, null, null, AbstractC1284e.license, 3);
                c17213e2.mopub(EnumC13413e.f26665e.subs(), null, new C3801e(4), new C2892e(802480018, true, new C18401e(enumC13413e, function1, (InterfaceC16132e) obj4, interfaceC3314e)));
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(32761790, true, new C17630e((Function0) obj3, interfaceC3314e, 22)), 3);
                return Unit.INSTANCE;
            case 5:
                ((AbstractC4125e) obj).mopub((C3079e) obj6, new C17699e((C16701e) obj5, (String) obj4, (C2751e) obj3, (C7460e) obj2, null));
                return Unit.INSTANCE;
            case 6:
                InterfaceC6256e interfaceC6256e = (InterfaceC6256e) obj5;
                C0398e c0398e = (C0398e) obj4;
                C7911e c7911e = (C7911e) obj3;
                C18466e c18466e = (C18466e) obj2;
                C4017e c4017e = (C4017e) obj;
                c4017e.ad();
                float purchase = ((C10771e) obj6).metrica.purchase();
                if (purchase != 0.0f) {
                    long j3 = c0398e.vip;
                    int i4 = C12347e.metrica;
                    int billing = interfaceC6256e.billing((int) (j3 >> 32));
                    C0866e license = c7911e.license();
                    C0763e metrica = license != null ? license.ad.metrica(billing) : new C0763e(0.0f, 0.0f, 0.0f, 0.0f);
                    float floor = (float) Math.floor(c4017e.mo497instanceof(AbstractC9578e.ad));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2;
                    float f2 = metrica.ad + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (c4017e.f8940e.f28537e.m4560try() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    c4017e.f8940e.appmetrica(c18466e, (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(metrica.vip) & 4294967295L), (Float.floatToRawIntBits(floor2) << 32) | (4294967295L & Float.floatToRawIntBits(metrica.license)), floor, purchase);
                }
                return Unit.INSTANCE;
            default:
                C8921e c8921e = (C8921e) obj4;
                C7096e c7096e = (C7096e) obj3;
                C17872e c17872e = (C17872e) obj2;
                WebView webView = new WebView((Context) obj);
                ((Function1) obj6).invoke(webView);
                webView.setLayoutParams((FrameLayout.LayoutParams) obj5);
                Bundle bundle = c8921e.billing;
                if (bundle != null) {
                    webView.restoreState(bundle);
                }
                webView.setWebChromeClient(c7096e);
                webView.setWebViewClient(c17872e);
                c8921e.yandex.setValue(webView);
                return webView;
        }
    }
}
