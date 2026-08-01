package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.glance.appwidget.AsyncRequestWorker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13350e {
    public static final C2892e ad = new C2892e(467429406, false, new C11832e(9));

    public static final void ad(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C0576e c0576e = new C0576e(null, C10990e.f21771e);
                c13770e.m3682throws(c0576e);
                m3681throw = c0576e;
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C1672e(interfaceC3314e, 24);
                c13770e.m3682throws(m3681throw2);
            }
            Function0 function0 = (Function0) m3681throw2;
            C15534e c15534e = AbstractC5132e.ad;
            C16711e vip = AbstractC17202e.vip(AbstractC0853e.vip, c13770e, 6);
            AbstractC1101e.vip(new C14815e[]{AbstractC2844e.vip.ad(AbstractC13328e.purchase(function0, c13770e, 2)), AbstractC2844e.ad.ad(vip)}, AbstractC16653e.license(1070596993, new C0773e(interfaceC12864e, interfaceC3314e, c2892e, vip, function0), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4430e(interfaceC12864e, c2892e, i, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eًٍَ, java.lang.Object] */
    public static final boolean appmetrica(Context context, Function1 function1) {
        if (!AbstractC3273e.ad.get() && (!AbstractC7890e.billing(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        C15470e firebase = C5801e.firebase();
        function1.invoke(firebase);
        C5801e c5801e = (C5801e) firebase.ad();
        C15899e billing = C15899e.billing(context);
        C18478e c18478e = new C18478e(AsyncRequestWorker.class);
        HashMap hashMap = new HashMap();
        try {
            int vip = c5801e.vip(null);
            byte[] bArr = new byte[vip];
            Logger logger = AbstractC16754e.metrica;
            C4771e c4771e = new C4771e(vip, bArr);
            c5801e.smaato(c4771e);
            if (c4771e.crashlytics() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            Byte[] bArr2 = new Byte[vip];
            for (int i = 0; i < vip; i++) {
                bArr2[i] = Byte.valueOf(bArr[i]);
            }
            hashMap.put("request", bArr2);
            C13198e c13198e = new C13198e(hashMap);
            C13198e.vip(c13198e);
            ((C13394e) c18478e.f36227e).appmetrica = c13198e;
            billing.metrica(c18478e.signatures());
            C18478e c18478e2 = new C18478e(AsyncRequestWorker.class);
            TimeUnit timeUnit = TimeUnit.DAYS;
            c18478e2.m4561volatile();
            C14830e c14830e = new C14830e();
            ?? obj = new Object();
            obj.ad = 1;
            obj.purchase = -1L;
            obj.billing = -1L;
            obj.yandex = new C14830e();
            obj.vip = true;
            int i2 = Build.VERSION.SDK_INT;
            obj.metrica = false;
            obj.ad = 1;
            obj.license = false;
            obj.appmetrica = false;
            if (i2 >= 24) {
                obj.yandex = c14830e;
                obj.purchase = -1L;
                obj.billing = -1L;
            }
            ((C13394e) c18478e2.f36227e).adcel = obj;
            new C6117e(billing, "updateRequestWorkerKeepEnabled", 2, Collections.singletonList(c18478e2.signatures())).mopub();
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + C5801e.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final boolean license(AbstractC16510e abstractC16510e) {
        if (abstractC16510e.yandex.mo812extends(InterfaceC12438e.f24886e)) {
            return abstractC16510e.yandex.mo844while() == EnumC12633e.f25350e;
        }
        AbstractC9464e.adcel("UseCaseUtil", abstractC16510e + " UseCase does not have capture type.");
        return false;
    }

    public static final int metrica(ArrayList arrayList, Function1 function1) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int mo842strictfp = ((InterfaceC12438e) function1.invoke((AbstractC16510e) it.next())).mo842strictfp();
            if (mo842strictfp != 0) {
                if (i2 != mo842strictfp && i2 != 0) {
                    AbstractC9464e.remoteconfig("UseCaseUtil", AbstractC8647e.inmobi(i2, mo842strictfp, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i2 = mo842strictfp;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int mo843try = ((InterfaceC12438e) function1.invoke((AbstractC16510e) it2.next())).mo843try();
            if (mo843try != 0) {
                if (i != mo843try && i != 0) {
                    AbstractC9464e.remoteconfig("UseCaseUtil", AbstractC8647e.inmobi(i, mo843try, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i = mo843try;
            }
        }
        if (i2 == 1 || i == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        return i == 2 ? 3 : 1;
    }

    public static final int purchase(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final void vip(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(155925518);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c13770e.adcel(AbstractC2844e.ad) != null;
            boolean z2 = c13770e.adcel(AbstractC2844e.vip) != null;
            if (z && z2) {
                c13770e.m3676strictfp(-1977187922);
                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, true);
                long j = c13770e.f27286case;
                int i3 = (int) ((j >>> 32) ^ j);
                InterfaceC3483e advert = c13770e.advert();
                InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e = C2721e.vip;
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                AbstractC2270e.purchase(c13770e, C2721e.mopub);
                AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                c2892e.invoke(c13770e, Integer.valueOf((i2 >> 3) & 14));
                c13770e.Signature(true);
                c13770e.Signature(false);
            } else if (z) {
                c13770e.m3676strictfp(-1976997706);
                AbstractC13328e.ad(i2 & 126, c2892e, c13770e, interfaceC12864e);
                c13770e.Signature(false);
            } else if (z2) {
                c13770e.m3676strictfp(-1976846922);
                AbstractC5132e.license(i2 & 126, c2892e, c13770e, interfaceC12864e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1976716505);
                ad(i2 & 126, c2892e, c13770e, interfaceC12864e);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4430e(interfaceC12864e, c2892e, i, 3);
        }
    }
}
