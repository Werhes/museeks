package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16200e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f31815e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f31816e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31817e;

    public /* synthetic */ C16200e(Object obj, Object obj2, int i) {
        this.f31817e = i;
        this.f31816e = obj;
        this.f31815e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int m1865interface;
        int i = this.f31817e;
        String str2 = BuildConfig.FLAVOR;
        int i2 = 10;
        int i3 = 0;
        Object obj = this.f31815e;
        Object obj2 = this.f31816e;
        switch (i) {
            case 0:
                C11388e c11388e = (C11388e) obj2;
                InterfaceC13858e interfaceC13858e = (InterfaceC13858e) obj;
                C17013e vip = c11388e.ad.vip();
                C4217e c4217e = (C4217e) c11388e.appmetrica.getValue();
                C2025e c2025e = new C2025e((byte) 0, 3);
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                int i4 = 0;
                while (i3 < vip.f33322e.length()) {
                    int codePointAt = Character.codePointAt(vip, i3);
                    int ad = interfaceC13858e.ad(i4, codePointAt);
                    int charCount = Character.charCount(codePointAt);
                    if (ad != codePointAt) {
                        c2025e.mopub(sb.length(), sb.length() + charCount, Character.charCount(ad));
                        z = true;
                    }
                    sb.appendCodePoint(ad);
                    i3 += charCount;
                    i4++;
                    z = z;
                }
                CharSequence sb2 = z ? sb.toString() : vip;
                if (sb2 == vip) {
                    return null;
                }
                long advert = C10659e.advert(vip.f33324e, c2025e, c4217e);
                C12347e c12347e = vip.f33321e;
                return new C16585e(new C17013e(sb2, advert, c12347e != null ? new C12347e(C10659e.advert(c12347e.ad, c2025e, c4217e)) : null, null, null, null, 56), c2025e);
            case 1:
                C13817e c13817e = (C13817e) obj2;
                Function1 function1 = (Function1) obj;
                int i5 = c13817e.appmetrica + 1;
                c13817e.appmetrica = i5;
                if (i5 > 10) {
                    c13817e.appmetrica = 0;
                    function1.invoke(2);
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function12 = (Function1) obj2;
                AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
                String str3 = audioStreamMix.ad;
                AudioStreamMix.Link link = audioStreamMix.license;
                if (link == null || (str = link.vip) == null) {
                    str = audioStreamMix.vip;
                }
                function12.invoke(new C12166e(new C18010e(6, str3, null, str, null)));
                return Unit.INSTANCE;
            case 3:
                ((C4031e) obj2).m1457volatile((AbstractC1792e) obj);
                return Unit.INSTANCE;
            case 4:
                C6399e c6399e = (C6399e) obj;
                String str4 = c6399e.f13274e;
                if (((ArrayList) obj2).isEmpty() || (m1865interface = AbstractC5304e.m1865interface(str4, '/', c6399e.f13270e.f31630e.length() + 3, 4)) == -1) {
                    return BuildConfig.FLAVOR;
                }
                int m1877this = AbstractC5304e.m1877this(str4, new char[]{'?', '#'}, m1865interface, false);
                return m1877this == -1 ? str4.substring(m1865interface) : str4.substring(m1865interface, m1877this);
            case 5:
                EnumC14893e enumC14893e = (EnumC14893e) obj2;
                View view = (View) obj;
                C16251e c16251e = C16251e.ad;
                boolean metrica = C16251e.metrica(enumC14893e);
                String str5 = enumC14893e.f29519e;
                if (metrica) {
                    C16251e.license = false;
                    c16251e.vip();
                } else {
                    Activity billing = C1059e.billing(view.getContext());
                    if (billing != null) {
                        C16251e.license = true;
                        int ad2 = AbstractC15933e.ad(R.attr.global_accent);
                        int i6 = AbstractC3898e.appmetrica(ad2) > 0.5d ? R.color.google_black : R.color.white;
                        C9825e c9825e = new C9825e(billing);
                        c9825e.metrica = 0.5f;
                        float f = RecyclerView.UNDEFINED_DURATION;
                        c9825e.ad = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                        c9825e.license = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(enumC14893e.f29520e);
                        if (str5.length() > 0) {
                            str2 = "\n\n".concat(str5);
                        }
                        sb3.append(str2);
                        c9825e.remoteconfig = sb3.toString();
                        c9825e.pro = billing.getColor(i6);
                        c9825e.signatures = 15.0f;
                        c9825e.tapsense = 8388611;
                        c9825e.f19395catch = 2;
                        c9825e.mopub = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, 10, Resources.getSystem().getDisplayMetrics()));
                        c9825e.amazon = 0.5f;
                        float f2 = 12;
                        c9825e.appmetrica = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                        c9825e.purchase = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                        c9825e.billing = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                        c9825e.yandex = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                        c9825e.subscription = TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics());
                        c9825e.admob = ad2;
                        c9825e.f19407super = 5;
                        c9825e.f19403native = (AbstractActivityC15824e) billing;
                        c9825e.f19402interface = true;
                        c9825e.firebase = false;
                        c9825e.f19392abstract = false;
                        c9825e.f19396class = true;
                        c9825e.isPro = true;
                        c9825e.ads = new C0032e(TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()));
                        c9825e.applovin = AbstractC3898e.startapp(-16777216, (int) (255 * 0.5f));
                        c9825e.f19400goto = false;
                        c9825e.f19404new = 2;
                        VKXApplication.Companion companion = VKXApplication.f36531e;
                        c9825e.premium = new C18130e(VKXApplication.Companion.ad(8.0f), VKXApplication.Companion.ad(8.0f));
                        c9825e.crashlytics = new C2450e(new C17197e(i2, enumC14893e));
                        new C6023e(billing, c9825e);
                        C6023e c6023e = new C6023e(billing, c9825e);
                        C14897e c14897e = new C14897e(view);
                        if (c6023e.vip(view)) {
                            view.post(new RunnableC4904e(4, c6023e, view, c14897e));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                ((C11268e) obj2).f590e.license(((C5272e) obj).metrica(), 1, null);
                return Unit.INSTANCE;
            default:
                C15820e c15820e = (C15820e) obj2;
                AbstractC16519e.ad(c15820e, c15820e.pro(), false, new C7195e(c15820e, (AudioTrack) obj, false ? 1 : 0, 18));
                return Unit.INSTANCE;
        }
    }
}
